package com.doge.Visitors;

import com.doge.AST.*;
import com.doge.types.*;

import java.util.ArrayList;

/**
 * Pretty printing which prints the AST out as the code it was before parsing.
 */
public class PrettyPrint extends BaseASTVisitor<String> {
    private StringBuilder printer;

    public PrettyPrint(StringBuilder printer) {
        this.printer = printer;
    }


    @Override
    public String VisitAssignmentNode(AssignmentNode node){

        //printer.append(node.getVariable().getId() + " " + node.getAssignmentOperator() + " " + visit(node.getExpression()) + ";\n");
        return node.getVariable().getId() + " " + node.getAssignmentOperator() + " " + visit(node.getExpression()) + ";\n";
        //return null;
    }

    @Override
    public String VisitDeclarationNode(DeclarationNode node){
        if (node.getVariable().isComplex()) {
            StringBuilder complexDecl = new StringBuilder();
            complexDecl.append(TypeParser.cTypeFromValueType(node.getVariable().getValueType()) + " " + node.getVariable().getId());
            switch (node.getVariable().getValueType()) {
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
            //printer.append(complexDecl.toString() + " = " + visit(node.getExpression()) + ";\n");
            return complexDecl.toString() + " = " + visit(node.getExpression()) + ";";
        }
        //printer.append(node.getVariable().toCcode() + " = " + visit(node.getExpression()) + ";\n");
        return node.getVariable().toCcode() + " = " + visit(node.getExpression()) + ";";

    }


    //bruges i VisitConditionalNode & VisitWhileLoopNode & VisitForLoopNode
    private String statementBody(ArrayList<BaseASTNode> statements){
        StringBuilder body = new StringBuilder();
        for(BaseASTNode stmt : statements){
            body.append(visit(stmt) + "\n");
        }
        return body.toString();
    }

    @Override
    public String VisitConditionalNode(ConditionalNode node) {
        printer.append("if(" + visit(node.getConditionalExpression()) + ") {\n");
        for (BaseASTNode stmt : node.getBody().getChildren()){
            printer.append(visit(stmt) + "\n");
        }
        printer.append("}\n");
        if (node.getElseIfs() != null){
            for(ConditionalNode elif : node.getElseIfs()) {
                printer.append(" else " + visit(elif));
            }
        }
        if (node.getElseBody() != null) {
            printer.append(" else {\n" + statementBody(node.getElseBody().getChildren()) + "}\n");
        }
        return null;
    }

    @Override
    public String VisitWhileLoopNode(WhileLoopNode node) {
        //printer.append("while(" + visit(node.getCondNode()) + "){\n" + statementBody(node.getBody().getChildren()) + "}\n");
        return "while(" + visit(node.getCondNode()) + "){\n" + statementBody(node.getBody().getChildren()) + "}\n";

    }

    @Override
    public String VisitForLoopNode(ForLoopNode node) {
        printer.append("for(");
        if (node.getInitialize() != null)
            printer.append(visit(node.getInitialize()) + " ");
        else
            printer.append("; ");
        if (node.getCondition() != null)
            printer.append(visit(node.getCondition()));
        printer.append("; ");
        if (node.getUpdate() != null)
            printer.append(visit(node.getUpdate()));
        printer.append(") {\n");
        printer.append(statementBody(node.getBody().getChildren()));
        printer.append("}\n");

        return null;
    }

    @Override
    public String VisitConditionalExpressionNode(ConditionalExpressionNode node) {
        return visit(node.getLValue()) + " " + node.getOperatorType() + " " + visit(node.getRValue());
    }

    @Override
    public String VisitExpressionNode(ExpressionNode node){
        if (node.getRValue() != null){
            return visit(node.getLValue()) + " " + node.getOperatorType() + " " + visit(node.getRValue());
        }
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

    // Bruges i VisitVectorValNode
    private String commaSepExprList(ArrayList<ExpressionNode> items){
        StringBuilder list = new StringBuilder();
        int i = 1;
        for (ExpressionNode val : items) {
            list.append(visit(val));
            if (i++ != items.size())
                list.append(", ");
        }
        return list.toString();
    }

    @Override
    public String VisitVectorValNode(VectorValNode node) {
        return "{ " + commaSepExprList(node.getValues()) + " }";
    }

    @Override
    public String VisitFunctionReturnNode(FunctionReturnNode node) {
        return "return " + visit(node.getExpression()) + ";";
    }

    // bruges i VisitFunctionCallNode & VisitVariableExpressionNode
    private String functionWithArgs(Variable func){
        StringBuilder funcVar = new StringBuilder();
        funcVar.append(func.getId() + "(");
        if (func.getArguments() != null)
            funcVar.append(commaSepExprList(func.getArguments()));
        funcVar.append(")");
        return funcVar.toString();
    }

    /* Skal det med printfunction med her?
    @Override
    public String VisitFunctionCallNode(FunctionCallNode node) {
        if (node.getVariable().getId() == "print") {
            return printFunction(node.getVariable()) + ";";
        }
        return functionWithArgs(node.getVariable()) + ";";
    } */

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

}





