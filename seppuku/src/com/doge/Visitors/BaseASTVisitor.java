package com.doge.Visitors;
import com.doge.AST.*;

/**
 * Created by Søren on 25-03-2015.
 */
public class BaseASTVisitor<T> implements IASTVisitor<T> {

    @Override public T VisitAssignmentNode(AssignmentNode node) { return visit(node.getExpression()); }

    @Override public T VisitAST(AST node) { return visitChildren(node); }

    @Override public T VisitCollectionCoordinateNode(CollectionCoordinateNode node) {
        if(node.getCoordinates()[0] != null){
            visit(node.getCoordinates()[0]);
            visit(node.getCoordinates()[1]);
        }
        return null;
    }

    @Override public T VisitConditionalExpressionNode(ConditionalExpressionNode node) {
        if(node.getLValue() != null){
        visit(node.getLValue());
        }
        if(node.getRValue() != null){
            visit(node.getRValue());
        }
        return null;
    }

    @Override public T VisitConditionalNode(ConditionalNode node) {
        if(node.getConditionalExpression() != null){
            visit(node.getConditionalExpression());
        }
        if(node.getBody() != null){
            visit(node.getBody());
        }
        if(!node.getElseIfs().isEmpty()){
            for(ConditionalNode conditionalNode : node.getElseIfs()){
                visit(conditionalNode);
            }
        }
        if(node.getElseBody() != null){
            visit(node.getElseBody());
        }

        return visitChildren(node);
    }

    @Override public T VisitConstantExpressionNode(ConstantExpressionNode node) { return null; }


    @Override public T VisitDeclarationNode(DeclarationNode node) {
        if(node.getExpression() != null){
            return visit(node.getExpression());
        }
        return null;
    }

    @Override public T VisitExpressionNode(ExpressionNode node) {
        if(node.getLValue() != null){
            visit(node.getLValue());
        }
        if(node.getRValue() != null){
            visit(node.getRValue());
        }
        return null;
    }

    @Override public T VisitForLoopNode(ForLoopNode node) {
        if (node.getCondition() != null) {
            visit(node.getCondition());
        }
        if(node.getInitialize() != null){
            visit(node.getInitialize());
        }
        if(node.getUpdate() != null){
            visit(node.getUpdate());
        }
        if(node.getBody() != null){
            visit(node.getBody());
        }
        return null;
    }

    @Override public T VisitFunctionCallNode(FunctionCallNode node) {
        if(!node.getArgumentList().isEmpty()){
            for(ExpressionNode expression : node.getArgumentList()){
                visit(expression);
            }
        }
        return null;
    }

    @Override public T VisitImportNode(ImportNode node) { return visitChildren(node); }

    @Override public T VisitMatrixValNode(MatrixValNode node) {
        if(!node.getRows().isEmpty()){
            for(VectorValNode vectornode : node.getRows()) {
                visit(vectornode);
            }
        }
        return null;
    }

    @Override public T VisitStatementNode(StatementNode node) { return visitChildren(node); }

    @Override public T VisitTopNode(TopNode node) { return visitChildren(node); }

    @Override public T VisitVariableExpressionNode(VariableExpressionNode node) { return visitChildren(node); }

    @Override public T VisitVectorValNode(VectorValNode node) {
        if(!node.getValues().isEmpty()) {
            for (ExpressionNode expression : node.getValues()) {
                visit(expression);
            }
        }
        return null;
    }

    @Override public T VisitFunctionReturnNode(FunctionReturnNode node) { return visit(node.getExpression()); }

    @Override public T VisitWhileLoopNode(WhileLoopNode node) {
        if(node.getCondNode() != null) {
            visit(node.getCondNode());
        }
        if(node.getBody() != null) {
            return visit(node.getBody());
        }
        return null;
    }

    @Override public T VisitFunctionDclNode(FunctionDclNode node) {
        if(node.getFunctionReturn() != null){
            visit(node.getFunctionReturn());
        }
        if(node.getFunctionBody() != null){
        return visit(node.getFunctionBody());
        }
        return null;
    }

    @Override public T visit(AST node){return node.accept(this);}

    //This is a mirror of the visitChildren method created by ANTLR.
    @Override public T visitChildren(AST node){
        T result = null;
        int n = node.getChildCount();
        for (int i = 0; i < n ; i++) {
            AST child = node.getChild(i);
            result = child.accept(this);
        }

        return result;
    }
}
