package com.doge.CodeGeneration.Visitors;

import com.doge.ContextualAnalysis.AST.*;
import com.doge.ContextualAnalysis.Visitors.BaseASTVisitor;
import com.doge.MiscComponents.FileHandling;
import com.doge.MiscComponents.Types.TypeChecker;
import com.doge.MiscComponents.Types.TypeParser;
import com.doge.MiscComponents.Types.ValueType;

import java.io.File;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Mathias on 11-04-2015.
 */
public class CodeGeneratorVisitor extends BaseASTVisitor<String> {
    private StringBuilder outputCode;
    private int indentationLevel = 0;
    private FileHandling filesNstuff = new FileHandling();

    private Stack<Variable> resultVarStack = new Stack<Variable>();
    private Stack<Variable> aStack = new Stack<Variable>();
    private Stack<Variable> bStack = new Stack<Variable>();
    private int unique = 0;

    public CodeGeneratorVisitor(StringBuilder outputCode) {
        this.outputCode = outputCode;
    }

    @Override
    public String VisitTopNode(TopNode node) {
        outputCode.append(filesNstuff.ImportStringFromResource("codesnippets/preprocessor.c"));

        //make prototypes
        outputCode.append("\n\n/*--= PROTOTYPES =--*/\n");
        for (FunctionDclNode funcDecl : node.getFunctionDeclarations()) {
            outputCode.append(funcDecl.getVariable().toOpenCLcode() + "(");
            int i = 1;
            for (Variable arg : funcDecl.getParameters()) {
                outputCode.append(arg.toOpenCLcode());
                if (i++ != funcDecl.getParameterCount())
                    outputCode.append(", ");
            }
            outputCode.append(");\n");
        }


        //main method
        outputCode.append("\n\n/*--= MAIN METHOD =--*/\n");
        outputCode.append("int main(){\n");
        indentationLevel++;

        outputCode.append(filesNstuff.ImportStringFromResource("codesnippets/simpleCLsetup.c") + "\n\n");


        for (BaseASTNode stmt : node.getStatements().getChildren()) {
            outputCode.append(indent(visit(stmt) + "\n"));
        }
        outputCode.append(indent("return 0;\n}\n"));
        indentationLevel--;

        //functions
        outputCode.append("\n\n/*--= CUSTOM FUNCTIONS =--*/\n");
        for (FunctionDclNode func : node.getFunctionDeclarations()) {
            outputCode.append(func.getVariable().toOpenCLcode() + "(");
            int i = 1;
            for (Variable arg : func.getParameters()) {
                outputCode.append(arg.toOpenCLcode());
                if (i++ != func.getParameterCount())
                    outputCode.append(", ");
            }
            outputCode.append("){\n");
            indentationLevel++;
            if (func.getFunctionBody() != null)
                for (BaseASTNode stmt : func.getFunctionBody().getChildren()) {
                    outputCode.append(indent(visit(stmt) + "\n"));
                }
            if (func.getFunctionReturn() != null)
                outputCode.append(indent(visit(func.getFunctionReturn()) + "\n"));
            indentationLevel--;
            outputCode.append("}\n");
        }

        return null;
    }

    @Override
    public String VisitDeclarationNode(DeclarationNode node) {
        String expr = "";
        String complexType = "";
        if (node.getExpression() != null){
            resultVarStack.push(node.getVariable());
            expr = visit(node.getExpression());
            resultVarStack.pop();
        }

        if (node.getVariable().isComplex()) {
            switch (TypeChecker.MatrixOrVector(node.getVariable())) {
                case MATRIX:
                    complexType = makeMatrix(
                            node.getVariable().getSize() != null ?
                                    Integer.toString(node.getVariable().getSize()[0]) : visit(node.getVariable().getDynamicSize()[0]),
                            node.getVariable().getSize() != null ?
                                    Integer.toString(node.getVariable().getSize()[1]) : visit(node.getVariable().getDynamicSize()[1]));
                    break;
                case VECTOR:
                    complexType = makeVector(
                            node.getVariable().getSize() != null ?
                                    Integer.toString(node.getVariable().getSize()[0]) : visit(node.getVariable().getDynamicSize()[0]));
                    break;
            }
            complexType = complexType.replaceAll("§ID§", node.getVariable().getId());
            complexType = complexType.replaceAll("§SIMPLETYPE§",
                    (TypeParser.OpenCL_TypeFromValueType(TypeChecker.ComplexToSimple(node.getVariable().getValueType()))));
        }

        if (expr.indexOf("sclManageArgsLaunchKernel(hardware, software, global_size, local_size") >= 0){
            return (complexType.length() > 0 ? complexType : node.getVariable().toCcode() + ";\n") + expr;
        }

        return node.getVariable().toCcode() + " = " + expr + ";";
    }

    @Override
    public String VisitAssignmentNode(AssignmentNode node) {
        if (node.getExpression() == null) {
            return node.getVariable().getId() + node.getAssignmentOperator() + ";";
        }
        if (node.getVariable().getEntrance() != null) {
                return applyBoundsCheck(node.getVariable(), complexEntrance(node.getVariable()) + " " + node.getAssignmentOperator() + " " + visit(node.getExpression()) + ";");
        }
        resultVarStack.push(node.getVariable());
        String expression = visit(node.getExpression());
        resultVarStack.pop();
        if (expression.indexOf("sclManageArgsLaunchKernel(hardware, software, global_size, local_size") >= 0){
           return expression;
        }

        return node.getVariable().getId() + " " + node.getAssignmentOperator() + " " + expression + ";";
    }

    @Override
    public String VisitConditionalNode(ConditionalNode node) {
        StringBuilder conditional = new StringBuilder();
        conditional.append("if(" + visit(node.getConditionalExpression()) + ") {\n");
        indentationLevel++;
        for (BaseASTNode stmt : node.getBody().getChildren()) {
            conditional.append(indent(visit(stmt) + "\n"));
        }
        indentationLevel--;
        conditional.append(indent("}"));
        if (node.getElseIfs() != null) {
            for (ConditionalNode elif : node.getElseIfs()) {
                conditional.append(" else " + visit(elif));
            }
        }
        if (node.getElseBody() != null) {
            conditional.append(" else {\n");
            conditional.append(statementBody(node.getElseBody().getChildren()));
            conditional.append(indent("}"));
        }
        return conditional.toString();
    }

    @Override
    public String VisitWhileLoopNode(WhileLoopNode node) {
        StringBuilder whileLoop = new StringBuilder();
        whileLoop.append("while(" + visit(node.getCondNode()) + ") {\n");
        whileLoop.append(statementBody(node.getBody().getChildren()));
        whileLoop.append(indent("}\n"));

        return whileLoop.toString();
    }

    @Override
    public String VisitForLoopNode(ForLoopNode node) {
        StringBuilder forLoop = new StringBuilder();
        forLoop.append("for(");
        if (node.getInitialize() != null)
            forLoop.append(visit(node.getInitialize()) + " ");
        else
            forLoop.append("; ");
        if (node.getCondition() != null)
            forLoop.append(visit(node.getCondition()));
        forLoop.append("; ");
        if (node.getUpdate() != null)
            forLoop.append(visit(node.getUpdate()));
        forLoop.append(") {\n");
        forLoop.append(statementBody(node.getBody().getChildren()));
        forLoop.append(indent("}\n"));

        return forLoop.toString();
    }

    @Override
    public String VisitConditionalExpressionNode(ConditionalExpressionNode node) {
        if (node.getOperatorType() == null) {
            if (node.getLValue().getClass() == ConstantExpressionNode.class)
                return visit(node.getLValue());
            return "(" + visit(node.getLValue()) + ")";
        } else {
            return visit(node.getLValue()) + " " + node.getOperatorType() + " " + visit(node.getRValue());
        }
    }

    @Override
    public String VisitExpressionNode(ExpressionNode node) {
        StringBuilder expression = new StringBuilder();
        if (resultVarStack.size() > 0) {
            if (node.getLValue().getClass() == VariableExpressionNode.class || node.getLValue().getClass() == ConstantExpressionNode.class) {
                aStack.push(null);
                visit(node.getLValue());
            } else {
                aStack.push(resultVarStack.peek());
                expression.append(visit(node.getLValue()));
            }
            if (node.getRValue() == null) {
                bStack.push(new Variable(null, ""));
            } else if (node.getRValue().getClass() == VariableExpressionNode.class || node.getRValue().getClass() == ConstantExpressionNode.class) {
                bStack.push(null);
                visit(node.getRValue());
            } else {
                aStack.push(resultVarStack.peek());
                expression.append(visit(node.getRValue()));
            }

            switch (node.getOperatorType()) {
                case ADD:
                    if (!aStack.peek().isComplex() ^ !bStack.peek().isComplex()) {
                        expression.append(matrixKernel(
                                "matrixAddScalar",
                                aStack.peek().isComplex() ? aStack.pop().getId() : bStack.pop().getId(),
                                bStack.peek().isComplex() ? aStack.pop().getId() : bStack.pop().getId(),
                                resultVarStack.peek().getId(),
                                TypeParser.cTypeFromValueType(TypeChecker.ComplexToSimple(resultVarStack.peek().getValueType()))));
                    } else {
                        expression.append(matrixKernel(
                                "matrixAdd",
                                aStack.pop().getId(),
                                bStack.pop().getId(),
                                resultVarStack.peek().getId(),
                                TypeParser.cTypeFromValueType(TypeChecker.ComplexToSimple(resultVarStack.peek().getValueType()))));
                    }
                    break;
                case SUB:
                    if (!aStack.peek().isComplex() ^ !bStack.peek().isComplex()) {
                        expression.append(matrixKernel(
                                "matrixSubScalar",
                                aStack.peek().isComplex() ? aStack.pop().getId() : bStack.pop().getId(),
                                bStack.peek().isComplex() ? aStack.pop().getId() : bStack.pop().getId(),
                                resultVarStack.peek().getId(),
                                TypeParser.cTypeFromValueType(TypeChecker.ComplexToSimple(resultVarStack.peek().getValueType()))));
                    } else {
                        expression.append(matrixKernel(
                                "matrixSub",
                                aStack.pop().getId(),
                                bStack.pop().getId(),
                                resultVarStack.peek().getId(),
                                TypeParser.cTypeFromValueType(TypeChecker.ComplexToSimple(resultVarStack.peek().getValueType()))));
                    }
                    break;
                case MUL:
                    if (!aStack.peek().isComplex() ^ !bStack.peek().isComplex()) {
                        expression.append(matrixKernel(
                                "matrixMulScalar",
                                aStack.peek().isComplex() ? aStack.pop().getId() : bStack.pop().getId(),
                                bStack.peek().isComplex() ? aStack.pop().getId() : bStack.pop().getId(),
                                resultVarStack.peek().getId(),
                                TypeParser.cTypeFromValueType(TypeChecker.ComplexToSimple(resultVarStack.peek().getValueType()))));
                    } else if (TypeChecker.MatrixOrVector(aStack.peek().getValueType()) == ValueType.VECTOR &&
                            TypeChecker.MatrixOrVector(bStack.peek().getValueType()) == ValueType.VECTOR){
                        expression.append(matrixKernel(
                                "vectorDotProduct",
                                aStack.pop().getId(),
                                bStack.pop().getId(),
                                resultVarStack.peek().getId(),
                                TypeParser.cTypeFromValueType(TypeChecker.ComplexToSimple(resultVarStack.peek().getValueType()))));
                    } else {
                        expression.append(matrixKernel(
                                "matrixMul",
                                aStack.pop().getId(),
                                bStack.pop().getId(),
                                resultVarStack.peek().getId(),
                                TypeParser.cTypeFromValueType(resultVarStack.peek().getValueType())));
                    }
                    break;
                case TRANSPOSE:
                    expression.append(matrixKernel(
                            "matrixTranspose",
                            aStack.pop().getId(),
                            bStack.pop().getId(),
                            resultVarStack.peek().getId(),
                            TypeParser.cTypeFromValueType(TypeChecker.ComplexToSimple(resultVarStack.peek().getValueType()))));
                    break;
                case MULENTRY:
                    expression.append(applySameSizeCheck(aStack.peek(), bStack.peek(),matrixKernel(
                            "matrixIndexMul",
                            aStack.pop().getId(),
                            bStack.pop().getId(),
                            resultVarStack.peek().getId(),
                            TypeParser.cTypeFromValueType(TypeChecker.ComplexToSimple(resultVarStack.peek().getValueType())))));
                    break;
            }

            return expression.toString();
        }


        if (node.getRValue() != null)
            return visit(node.getLValue()) + " " + node.getOperatorType() + " " + visit(node.getRValue());
        return visit(node.getLValue()) + node.getOperatorType();
    }

    @Override
    public String VisitMatrixValNode(MatrixValNode node) {
        resultVarStack.push(null);
        StringBuilder innerExpr = new StringBuilder();
        int size = 0;
        innerExpr.append("{ ");
        int i = 1;
        for (VectorValNode row : node.getRows()) {
            size += row.getValues().size();
            innerExpr.append(visit(row));
            if (i++ != node.getRows().size())
                innerExpr.append(", ");
        }
        innerExpr.append(" }");
        resultVarStack.pop();

        return makeFillArray(resultVarStack.peek().getId(),
                TypeParser.cTypeFromValueType(TypeChecker.ComplexToSimple(resultVarStack.peek().getValueType())),
                Integer.toString(size),
                innerExpr.toString()) +
                ";\n" +
                makeFillLoop(resultVarStack.peek().getId(), TypeParser.cTypeFromValueType(TypeChecker.ComplexToSimple(resultVarStack.peek().getValueType())));
    }

    @Override
    public String VisitVectorValNode(VectorValNode node) {
        if (resultVarStack.peek() == null)
            return commaSepExprList(node.getValues());
        return makeFillArray(resultVarStack.peek().getId(),
                TypeParser.cTypeFromValueType(TypeChecker.ComplexToSimple(resultVarStack.peek().getValueType())),
                Integer.toString(node.getValues().size()),
                "{ " + commaSepExprList(node.getValues()) + " }") +
                ";\n" +
                makeFillLoop(resultVarStack.peek().getId(), TypeParser.cTypeFromValueType(TypeChecker.ComplexToSimple(resultVarStack.peek().getValueType())));
    }

    @Override
    public String VisitFunctionReturnNode(FunctionReturnNode node) {
        return "return " + visit(node.getExpression()) + ";";
    }

    @Override
    public String VisitFunctionCallNode(FunctionCallNode node) {
        if (node.getVariable().getId() == "print") {
            return printFunction(node.getVariable()) + ";";
        }
        return functionWithArgs(node.getVariable()) + ";";
    }

    @Override
    public String VisitVariableExpressionNode(VariableExpressionNode node) {
        if (aStack.size() > 0 && aStack.peek() == null){
            aStack.pop();
            aStack.push(node.getVariable());
        } else if (bStack.size() > 0 && bStack.peek() == null) {
            bStack.pop();
            bStack.push(node.getVariable());
        }

        if (node.getVariable().isFunction()) {
            if (node.getVariable().getId().equals("cols")) {
                return visit(node.getVariable().getArgument(0)) + ".cols ";
            } else if (node.getVariable().getId().equals("rows")) {
                return visit(node.getVariable().getArgument(0)) + ".rows ";
            }
            return functionWithArgs(node.getVariable());
        }else if (node.getVariable().getEntrance() != null){
            return complexEntrance(node.getVariable());
        }
        return node.getVariable().getId();
    }

    @Override
    public String VisitConstantExpressionNode(ConstantExpressionNode node) {
        if (aStack.size() > 0 && aStack.peek() == null){
            aStack.pop();
            aStack.push(new Variable(node.getValueType(), node.getValue().toString()));
        } else if (bStack.size() > 0 && bStack.peek() == null) {
            bStack.pop();
            bStack.push(new Variable(node.getValueType(), node.getValue().toString()));
        }
        return node.getValue().toString();
    }

    private String indent(String txt) {
        StringBuilder indentation = new StringBuilder();
        for (int i = 0; i < this.indentationLevel; i++) {
            indentation.append("    ");
        }
        return indentation + txt;
    }

    private String functionWithArgs(Variable func) {
        StringBuilder funcVar = new StringBuilder();
        funcVar.append(func.getId() + "(");
        if (func.getArguments() != null)
            funcVar.append(commaSepExprList(func.getArguments()));
        funcVar.append(")");
        return funcVar.toString();
    }

    private String commaSepExprList(ArrayList<ExpressionNode> items) {
        StringBuilder list = new StringBuilder();
        int i = 1;
        for (ExpressionNode val : items) {
            list.append(visit(val));
            if (i++ != items.size())
                list.append(", ");
        }
        return list.toString();
    }

    private String statementBody(ArrayList<BaseASTNode> statements) {
        StringBuilder body = new StringBuilder();
        indentationLevel++;
        for (BaseASTNode stmt : statements) {
            body.append(indent(visit(stmt) + "\n"));
        }
        indentationLevel--;

        return body.toString();
    }

    private String printFunction(Variable func) {
        StringBuilder formatString = new StringBuilder();
        StringBuilder printArgs = new StringBuilder();
        if (func.getPrintArguments() != null && func.getPrintArguments().size() > 0) {
            for (Object arg : func.getPrintArguments()) {
                if (arg != null && arg.getClass() != null) {
                    if (arg.getClass().getSuperclass() == ExpressionNode.class || arg.getClass() == ExpressionNode.class) {
                        ValueType type = ((ExpressionNode) arg).getValueType();
                        switch (type) {
                            case BOOLEAN:
                                formatString.append("%s ");
                                printArgs.append(visit((ExpressionNode) arg) + "? \"true\" : \"false\", ");
                                break;
                            case INT16:
                            case INT:
                                formatString.append("%d ");
                                printArgs.append(visit((ExpressionNode) arg) + ", ");
                                break;
                            case INT64:
                                formatString.append("%lld ");
                                printArgs.append(visit((ExpressionNode) arg) + ", ");
                                break;
                            case FLOAT16:
                            case FLOAT:
                            case FLOAT64:
                                formatString.append("%f ");
                                printArgs.append(visit((ExpressionNode) arg) + ", ");
                                break;
                            default:
                                //TODO can only print int matrices...
                                String complexPrint = filesNstuff.ImportStringFromResource("codesnippets/printMatrix.c");

                                complexPrint = complexPrint.replaceAll("§ID§", visit((ExpressionNode) arg));
                                complexPrint = complexPrint.replaceAll("§SIMPLETYPE§",
                                        TypeParser.cTypeFromValueType(TypeChecker.ComplexToSimple(((ExpressionNode) arg).getValueType())));
                                switch (TypeChecker.ComplexToSimple(((ExpressionNode) arg).getValueType())){
                                    case FLOAT: case FLOAT16: case FLOAT64:
                                        complexPrint = complexPrint.replaceAll("§FORMATSTRING§", "%6.2f");
                                        break;
                                    case INT:
                                        complexPrint = complexPrint.replaceAll("§FORMATSTRING§", "%4d");
                                        break;
                                    case INT16:
                                        complexPrint = complexPrint.replaceAll("§FORMATSTRING§", "%3h");
                                        break;
                                    case INT64:
                                        complexPrint = complexPrint.replaceAll("§FORMATSTRING§", "%5l");
                                        break;

                                }
                                complexPrint = complexPrint.replaceAll("\\n", "\n" + indent(""));
                                complexPrint = complexPrint.substring(0, complexPrint.length()-2).trim();
                                return complexPrint;
                        }
                    } else {
                        formatString.append("%s");
                        printArgs.append(arg + ", ");
                    }
                }
            }
        }

        formatString.append("%s");
        printArgs.append("\"\\n\"");

        return "printf(\"" + formatString.toString() + "\", " + printArgs.toString() + ")";
    }

    private String matrixKernel(String kernelName, String aID, String bID, String resID, String simpleType) {


        String kernel = filesNstuff.ImportStringFromResource("kernels/" + kernelName + ".cl");
        kernel = kernel.replaceAll("§MATRIXTYPE§", simpleType);
        filesNstuff.WriteToFile(new File("../../../codeout/" + kernelName + ".cl"), kernel);

        String argsNlauch = filesNstuff.ImportStringFromResource("kernelLaunch/" + kernelName + ".c");

        argsNlauch = argsNlauch.replaceAll("§MATRIX_A§", aID);
        argsNlauch = argsNlauch.replaceAll("§MATRIX_B§", bID);
        argsNlauch = argsNlauch.replaceAll("§MATRIX_RES§", resID);
        argsNlauch = argsNlauch.replaceAll("§MATRIXTYPE§", simpleType);
        argsNlauch = argsNlauch.replaceAll("§NUM§", Integer.toString(this.unique++));

        argsNlauch = argsNlauch.replaceAll("\\n", "\n" + indent(""));

        return argsNlauch;
    }

    private String makeMatrix(String rows, String cols) {
        String matrix = filesNstuff.ImportStringFromResource("codesnippets/makeMatrix.c");
        matrix = matrix.replaceAll("§ROWS§", rows);
        matrix = matrix.replaceAll("§COLS§", cols);
        matrix = matrix.replaceAll("\\n", "\n" + indent(""));

        return matrix;
    }

    private String makeVector(String rows) {
        return makeMatrix(rows, "1");
    }

    private String complexEntrance(Variable variable){
        return filesNstuff.ImportStringFromResource("codesnippets/complexEntrance.c")
                .replaceAll("§SIMPLETYPE§",
                        (TypeParser.cTypeFromValueType(TypeChecker.ComplexToSimple(variable.getValueType()))))
                .replaceAll("§ID§", variable.getId())
                .replaceAll("§ROW§", visit(variable.getEntrance().getCoordinates()[0]))
                .replaceAll("§COL§",
                variable.getEntrance().getCoordinates()[1] != null ?
                        visit(variable.getEntrance().getCoordinates()[1]) :
                        "0")
                .replaceAll("\\n", "");
    }

    private String applyBoundsCheck(Variable variable, String code){
        return filesNstuff.ImportStringFromResource("codesnippets/matrixOutOfBounds.c")
                .replaceAll("§ROW§", visit(variable.getEntrance().getCoordinates()[0]))
                .replaceAll("§COL§",
                        variable.getEntrance().getCoordinates()[1] != null ?
                                visit(variable.getEntrance().getCoordinates()[1]) :
                                "0")
                .replaceAll("§MATRIX§", variable.getId())
                .replaceAll("§CODE§", code)
                .replaceAll("\\n", "\n" + indent(""));
    }

    private String applySameSizeCheck(Variable matrixA, Variable matrixB, String code){
        return filesNstuff.ImportStringFromResource("codesnippets/matrixSameSizeCheck.c")
                .replaceAll("§MATRIX_A§", matrixA.getId())
                .replaceAll("§MATRIX_B§", matrixB.getId())
                .replaceAll("§CODE§", code)
                .replaceAll("\\n", "\n" + indent(""));
    }

    private String makeFillArray(String id, String simpletype, String size, String expression){
        return simpletype + " " + id + "_fillArray[ " + size + " ] = " + expression;
    }

    private String makeFillLoop(String id, String simpleType){
        return indent("").concat(filesNstuff.ImportStringFromResource("codesnippets/complexFillLoop.c")
                .replaceAll("§ID§", id)
                .replaceAll("§NUM§", Integer.toString(this.unique++))
                .replaceAll("§SIMPLETYPE§", simpleType)
                .replaceAll("\\n", "\n" + indent("")));
    }
}
