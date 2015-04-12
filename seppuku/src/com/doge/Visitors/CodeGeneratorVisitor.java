package com.doge.Visitors;

import com.doge.AST.*;
import com.doge.types.TypeParser;
import com.doge.types.ValueType;

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
        outputCode.append("#include<stdio.h>\n");
        outputCode.append("#include<stdint.h>\n");

        /*
        Not needed when funcDecls come before main...
        //make prototypes
        outputCode.append("//--= PROTOTYPES =--\n");
        for (FunctionDclNode funcDecl : node.getFunctionDeclarations()) {
            outputCode.append(funcDecl.getVariable().toCcode() + "(");
            int i = 1;
            for(Variable arg : funcDecl.getParameters()) {
                outputCode.append(arg.toCcode());
                if (i++ != funcDecl.getParameterCount())
                    outputCode.append(", ");
            }
            outputCode.append(");\n");
        }*/

        //functions
        outputCode.append("\n\n/*--= CUSTOM FUNCTIONS/METHODS =--*/\n");
        for (FunctionDclNode func : node.getFunctionDeclarations()){
            outputCode.append("\n" + func.getVariable().toCcode() + "(");
            int i = 1;
            for(Variable arg : func.getParameters()) {
                outputCode.append(arg.toCcode());
                if (i++ != func.getParameterCount())
                    outputCode.append(", ");
            }
            outputCode.append("){\n");
            indentationLevel++;
            if (func.getFunctionBody() != null)
                for (AST stmt : func.getFunctionBody().getChildren()){
                    outputCode.append(indent(visit(stmt) + ";\n"));
                }
            if (func.getFunctionReturn() != null)
                outputCode.append(indent(visit(func.getFunctionReturn()) + ";\n"));
            indentationLevel--;
            outputCode.append("}\n");
        }

        //main method
        outputCode.append("\n\n/*--= MAIN METHOD =--*/\n");
        outputCode.append("int main(){\n");
        indentationLevel++;
        for (AST stmt : node.getStatements().getChildren()){
            outputCode.append(indent(visit(stmt) + ";\n"));
        }
        outputCode.append(indent("return 0;\n}\n"));
        indentationLevel--;

        return null;
    }

    @Override
    public String VisitDeclarationNode(DeclarationNode node) {
        if (node.getVariable().isComplex()){
            StringBuilder complexDecl = new StringBuilder();
            complexDecl.append(TypeParser.cTypeFromValueType(node.getVariable().getValueType()));
            switch (node.getVariable().getValueType()){
                case MATRIX_INT16:
                case MATRIX_INT:
                case MATRIX_INT64:
                case MATRIX_FLOAT16:
                case MATRIX_FLOAT:
                case MATRIX_FLOAT64:
                case MATRIX_BOOLEAN:
                    complexDecl.append("[" + node.getVariable().getSize()[0] + "]" +
                                       "[" + node.getVariable().getSize()[1] + "] ");
                    break;
                case VECTOR_INT16:
                case VECTOR_INT:
                case VECTOR_INT64:
                case VECTOR_FLOAT16:
                case VECTOR_FLOAT:
                case VECTOR_FLOAT64:
                case VECTOR_BOOLEAN:
                    complexDecl.append("[" + node.getVariable().getSize()[0] + "] ");
                    break;
            }
            complexDecl.append(node.getVariable().getId());
            return complexDecl.toString() + " = " + visit(node.getExpression());
        }
        return node.getVariable().toCcode() + " = " + visit(node.getExpression());
    }

    @Override
    public String VisitAssignmentNode(AssignmentNode node) {
        return node.getVariable().getId() + " " + node.getAssignmentOperator() + " " + visit(node.getExpression());
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
        StringBuilder vector = new StringBuilder();
        vector.append("{ ");
        int i = 1;
        for (ExpressionNode val : node.getValues()){
            vector.append(visit(val));
            if (i++ != node.getValues().size())
                vector.append(", ");
        }
        vector.append(" }");
        return vector.toString();
    }

    @Override
    public String VisitFunctionReturnNode(FunctionReturnNode node) {
        return "return " + visit(node.getExpression());
    }

    @Override
    public String VisitVariableExpressionNode(VariableExpressionNode node) {
        if (node.getVariable().isFunction()) {
            StringBuilder funcVar = new StringBuilder();
            funcVar.append(node.getVariable().getId() + "(");
            int i = 1;
            for (ExpressionNode arg : node.getVariable().getArguments()){
                funcVar.append(visit(arg));
                if(i++ != node.getVariable().getArguments().size())
                    funcVar.append(", ");
            }
            funcVar.append(")");
            return funcVar.toString();
        }
        return node.getVariable().getId();
    }

    @Override
    public String VisitConstantExpressionNode(ConstantExpressionNode node) {
        return node.getValue().toString();
    }

    private String indent(String txt){
        StringBuilder indentation = new StringBuilder();
        for (int i = 0; i < this.indentationLevel; i++){
            indentation.append("    ");
        }
        return indentation + txt;
    }

}
