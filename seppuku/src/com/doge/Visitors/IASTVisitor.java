package com.doge.Visitors;

import com.doge.AST.*;
import com.doge.Exceptions.ReDeclarationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.RuleNode;

/**
 * Created by Søren on 25-03-2015.
 */
public interface IASTVisitor<T>  {

    T visit(AST node);

    T visitChildren(AST node);

    T VisitAssignmentNode(AssignmentNode node);

    T VisitAST(AST node);

    T VisitCollectionCoordinateNode(CollectionCoordinateNode node);

    T VisitConditionalExpressionNode(ConditionalExpressionNode node);

    T VisitConditionalNode(ConditionalNode node);

    T VisitConstantExpressionNode(ConstantExpressionNode node);

    T VisitDeclarationNode(DeclarationNode node);

    T VisitExpressionNode(ExpressionNode node);

    T VisitForLoopNode(ForLoopNode node);

    T VisitFunctionCallNode(FunctionCallNode node);

    T VisitFunctionDclNode(FunctionDclNode node);

    T VisitFunctionReturnNode(FunctionReturnNode node);

    T VisitImportNode(ImportNode node);

    T VisitMatrixValNode(MatrixValNode node);

    T VisitStatementNode(StatementNode node);

    T VisitTopNode(TopNode node);

    T VisitVariableExpressionNode(VariableExpressionNode node);

    T VisitVectorValNode(VectorValNode node);

    T VisitWhileLoopNode(WhileLoopNode node);
}
