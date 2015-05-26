package com.doge.SyntaxAnalysis.Visitors;

import com.doge.ContextualAnalysis.AST.*;

/**
 * Created by Søren on 25-03-2015.
 */
public interface IASTVisitor<T>  {

    T visit(BaseASTNode node);

    T visitChildren(BaseASTNode node);

    T VisitAssignmentNode(AssignmentNode node);

    T VisitAST(BaseASTNode node);

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
