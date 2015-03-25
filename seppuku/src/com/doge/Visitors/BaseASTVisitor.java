package com.doge.Visitors;
import com.doge.AST.*;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.RuleNode;

/**
 * Created by Søren on 25-03-2015.
 */
public class BaseASTVisitor<T> implements IASTVisitor<T> {
    @Override public T VisitAssignmentNode(AssignmentNode node) { return visitChildren(node); }
    @Override public T VisitAST(AST node) { return visitChildren(node); }
    @Override public T VisitCollectionCoordinateNode(CollectionCoordinateNode node) { return visitChildren(node); }
    @Override public T VisitConditionalExpressionNode(ConditionalExpressionNode node) { return visitChildren(node); }
    @Override public T VisitConditionalNode(ConditionalNode node) { return visitChildren(node); }
    @Override public T VisitConstantExpressionNode(ConstantExpressionNode node) { return visitChildren(node); }
    @Override public T VisitControlBlockNode(ControlBlockNode node) { return visitChildren(node); }
    @Override public T VisitDeclarationNode(DeclarationNode node) { return visitChildren(node); }
    @Override public T VisitExpressionNode(ExpressionNode node) { return visitChildren(node); }
    @Override public T VisitForLoopNode(ForLoopNode node) { return visitChildren(node); }
    @Override public T VisitFunctionCallNode(FunctionCallNode node) { return visitChildren(node); }
    @Override public T VisitFunctionDclNode(FunctionDclNode node) { return visitChildren(node); }
    @Override public T VisitFunctionReturnNode(FunctionReturnNode node) { return visitChildren(node); }
    @Override public T VisitImportNode(ImportNode node) { return visitChildren(node); }
    @Override public T VisitMatrixValNode(MatrixValNode node) { return visitChildren(node); }
    @Override public T VisitStatementNode(StatementNode node) { return visitChildren(node); }
    @Override public T VisitTopNode(TopNode node) { return visitChildren(node); }
    @Override public T VisitVariableExpressionNode(VariableExpressionNode node) { return visitChildren(node); }
    @Override public T VisitVectorValNode(VectorValNode node) { return visitChildren(node); }
    @Override public T VisitWhileLoopNode(WhileLoopNode node) { return visitChildren(node); }

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
