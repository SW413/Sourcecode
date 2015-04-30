package com.doge.Visitors;

import com.doge.AST.*;
import com.doge.types.TypeChecker;
import com.doge.types.TypeParser;

import java.util.ArrayList;

/**
 * Created by Mathias on 11-04-2015.
 */
public class CodeGeneratorVisitor extends BaseASTVisitor<String> {
    private StringBuilder outputCode;
    private int indentationLevel = 0;

    public CodeGeneratorVisitor(StringBuilder outputCode) {
        this.outputCode = outputCode;
    }

    @Override
    public String VisitTopNode(TopNode node) {
        outputCode.append("#include \"simpleCL.h\"\n" +
                "#define true 1\n" +
                "#define false 0\n");

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
                outputCode.append(arg.toCcode());
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
        if (node.getVariable().isComplex()) {
            StringBuilder complexDecl = new StringBuilder();
            complexDecl.append(TypeParser.OpenCL_TypeFromValueType(node.getVariable().getValueType()) + " ");
            if (node.getExpression() != null) {
                complexDecl.append(node.getVariable().getId());
                switch (TypeChecker.MatrixOrVector(node.getVariable())) {
                    case MATRIX:
                        complexDecl.append("[" + node.getVariable().getSize()[0] + "*" +
                                node.getVariable().getSize()[1] + "] ");
                        break;
                    case VECTOR:
                        complexDecl.append("[" + node.getVariable().getSize()[0] + "] ");
                        break;
                }
                return complexDecl.toString() + " = " + visit(node.getExpression()) + ";";
            }else{
                String dynRows, dynCols, typeSize;
                dynRows = visit(node.getVariable().getDynamicSize()[0]);
                dynCols = visit(node.getVariable().getDynamicSize()[1]);
                typeSize = "sizeof(" + TypeParser.OpenCL_TypeFromValueType(node.getVariable().getValueType()) + ")";
                complexDecl.append("*" + node.getVariable().getId());
                complexDecl.append(" = " +
                        "malloc(" + dynRows + " * " + dynCols + " * " +
                        typeSize + ");\n");
                complexDecl.append(indent("memset( " +
                        node.getVariable().getId() +
                        ", " +
                        "0, " +
                        typeSize +
                        " * " +
                        dynRows +
                        " * " +
                        dynCols +
                        ");"));
                return complexDecl.toString();
            }
        }
        return node.getVariable().toOpenCLcode() + " = " + visit(node.getExpression()) + ";";
    }

    @Override
    public String VisitAssignmentNode(AssignmentNode node) {
        if (node.getExpression() == null)
            return node.getVariable().getId() + node.getAssignmentOperator() + ";";
        return node.getVariable().getId() + " " + node.getAssignmentOperator() + " " + visit(node.getExpression()) + ";";
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
        if (node.getRValue() != null)
            return visit(node.getLValue()) + " " + node.getOperatorType() + " " + visit(node.getRValue());
        return visit(node.getLValue()) + node.getOperatorType();
    }

    @Override
    public String VisitMatrixValNode(MatrixValNode node) {
        StringBuilder matrix = new StringBuilder();
        matrix.append("{ ");
        int i = 1;
        for (VectorValNode row : node.getRows()) {
            matrix.append(visit(row));
            if (i++ != node.getRows().size())
                matrix.append(", ");
        }
        matrix.append(" }");
        return matrix.toString();
    }

    @Override
    public String VisitVectorValNode(VectorValNode node) {
        return "{ " + commaSepExprList(node.getValues()) + " }";
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
        if (node.getVariable().isFunction()) {
            return functionWithArgs(node.getVariable());
        }
        return node.getVariable().getId();
    }

    @Override
    public String VisitConstantExpressionNode(ConstantExpressionNode node) {
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
                    if (arg.getClass().getSuperclass() == ExpressionNode.class) {
                        switch (((ExpressionNode) arg).getValueType()) {
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
                                break;
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
}
