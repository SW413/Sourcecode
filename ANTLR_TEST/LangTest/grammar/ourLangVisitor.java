// Generated from ourLang.g4 by ANTLR 4.5
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
	 * Visit a parse tree produced by {@link ourLangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(ourLangParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#functiondeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondeclaration(ourLangParser.FunctiondeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#parameterlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterlist(ourLangParser.ParameterlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(ourLangParser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#argumentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentlist(ourLangParser.ArgumentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ourLangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#addexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddexpression(ourLangParser.AddexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#multiexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiexpression(ourLangParser.MultiexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(ourLangParser.PrimaryContext ctx);
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
	 * Visit a parse tree produced by {@link ourLangParser#collectionassignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionassignment(ourLangParser.CollectionassignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ourLangParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ourLangParser.ValueContext ctx);
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
	 * Visit a parse tree produced by {@link ourLangParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(ourLangParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#collectiontype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectiontype(ourLangParser.CollectiontypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#infixBinaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixBinaryOperator(ourLangParser.InfixBinaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#postUnaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostUnaryOperator(ourLangParser.PostUnaryOperatorContext ctx);
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