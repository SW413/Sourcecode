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
    public String VisitTopNode(TopNode node) {
        for (FunctionDclNode funcDcl : node.getFunctionDeclarations()){
            printer.append(visit(funcDcl) + "\n");
        }
        for (BaseASTNode stmt : node.getStatements().getChildren()){
            printer.append(visit(stmt) + "\n");
        }
        return null;
    }

    @Override
    public String VisitAssignmentNode(AssignmentNode node){
        return node.getVariable().getId() + " " + node.getAssignmentOperator() + " " + visit(node.getExpression()) + ";";
    }

    @Override
    public String VisitDeclarationNode(DeclarationNode node){
        return node.getVariable().getValueType() + " " + node.getVariable().getId() + " = " + visit(node.getExpression()) + ";";
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
        StringBuilder cond = new StringBuilder();
        cond.append("if(" + visit(node.getConditionalExpression()) + ") {\n");
        cond.append(statementBody(node.getBody().getChildren()));
        cond.append("}");
        if (node.getElseIfs() != null && node.getElseIfs().size()> 0){
            for(ConditionalNode elif : node.getElseIfs()) {
                cond.append(" else " + visit(elif));
            }
        }
        if (node.getElseBody() != null) {
            cond.append(" else {\n" + statementBody(node.getElseBody().getChildren()) + "}\n");
        }
        return cond.toString();
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
            return "TEST";//functionWithArgs(node.getVariable());
        }
        return node.getVariable().getId();
    }

    @Override
    public String VisitConstantExpressionNode(ConstantExpressionNode node) {
        return node.getValue().toString();
    }

}





