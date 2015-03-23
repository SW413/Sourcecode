// Generated from ourLang.g4 by ANTLR 4.5
package com.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ourLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ourLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ourLangParser#topLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevel(ourLangParser.TopLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ourLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#importing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImporting(ourLangParser.ImportingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#controlblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlblock(ourLangParser.ControlblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(ourLangParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ourLangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleCondExpr}
	 * labeled alternative in {@link ourLangParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleCondExpr(ourLangParser.SingleCondExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiCondExpr}
	 * labeled alternative in {@link ourLangParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiCondExpr(ourLangParser.MultiCondExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#functiondeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondeclaration(ourLangParser.FunctiondeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#functionbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionbody(ourLangParser.FunctionbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#functionreturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionreturn(ourLangParser.FunctionreturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#parameterlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterlist(ourLangParser.ParameterlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(ourLangParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code customFunc}
	 * labeled alternative in {@link ourLangParser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomFunc(ourLangParser.CustomFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printFunc}
	 * labeled alternative in {@link ourLangParser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFunc(ourLangParser.PrintFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#argumentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentlist(ourLangParser.ArgumentlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpr}
	 * labeled alternative in {@link ourLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpr(ourLangParser.ValueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link ourLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(ourLangParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postIDExpr}
	 * labeled alternative in {@link ourLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIDExpr(ourLangParser.PostIDExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link ourLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(ourLangParser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link ourLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(ourLangParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ourLangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#valassignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValassignment(ourLangParser.ValassignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code entireCollectionAssignment}
	 * labeled alternative in {@link ourLangParser#collectionassignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntireCollectionAssignment(ourLangParser.EntireCollectionAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collectionEntranceAssignment}
	 * labeled alternative in {@link ourLangParser#collectionassignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionEntranceAssignment(ourLangParser.CollectionEntranceAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveDecl}
	 * labeled alternative in {@link ourLangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveDecl(ourLangParser.PrimitiveDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complexDecl}
	 * labeled alternative in {@link ourLangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexDecl(ourLangParser.ComplexDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link ourLangParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(ourLangParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatingpoint}
	 * labeled alternative in {@link ourLangParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingpoint(ourLangParser.FloatingpointContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link ourLangParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(ourLangParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#complexdatatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexdatatype(ourLangParser.ComplexdatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#functiondatatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondatatype(ourLangParser.FunctiondatatypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valID}
	 * labeled alternative in {@link ourLangParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValID(ourLangParser.ValIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valConstant}
	 * labeled alternative in {@link ourLangParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValConstant(ourLangParser.ValConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valList}
	 * labeled alternative in {@link ourLangParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValList(ourLangParser.ValListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valFuncCall}
	 * labeled alternative in {@link ourLangParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValFuncCall(ourLangParser.ValFuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valCollectionEntrance}
	 * labeled alternative in {@link ourLangParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValCollectionEntrance(ourLangParser.ValCollectionEntranceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valBool}
	 * labeled alternative in {@link ourLangParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValBool(ourLangParser.ValBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#collectionEntrance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionEntrance(ourLangParser.CollectionEntranceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#valueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(ourLangParser.ValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#constantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantList(ourLangParser.ConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#entranceCoordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntranceCoordinate(ourLangParser.EntranceCoordinateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collectionMatrix}
	 * labeled alternative in {@link ourLangParser#collectiontype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionMatrix(ourLangParser.CollectionMatrixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collectionRVector}
	 * labeled alternative in {@link ourLangParser#collectiontype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionRVector(ourLangParser.CollectionRVectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collectionCVector}
	 * labeled alternative in {@link ourLangParser#collectiontype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionCVector(ourLangParser.CollectionCVectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#postUnaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostUnaryOperator(ourLangParser.PostUnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(ourLangParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#conditionalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOperator(ourLangParser.ConditionalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(ourLangParser.ConstantContext ctx);
}