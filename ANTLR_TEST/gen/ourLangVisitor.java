// Generated from /Users/michno/Desktop/AAU/SW4-P4/Sourcecode/ANTLR_TEST/LangTest/grammar/ourLang.g4 by ANTLR 4.5
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
	T visitTopLevel(@NotNull ourLangParser.TopLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#importing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImporting(@NotNull ourLangParser.ImportingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#functiondeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondeclaration(@NotNull ourLangParser.FunctiondeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#parameterlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterlist(@NotNull ourLangParser.ParameterlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull ourLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#controlblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlblock(@NotNull ourLangParser.ControlblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(@NotNull ourLangParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(@NotNull ourLangParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(@NotNull ourLangParser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#argumentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentlist(@NotNull ourLangParser.ArgumentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull ourLangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#addexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddexpression(@NotNull ourLangParser.AddexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#multiexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiexpression(@NotNull ourLangParser.MultiexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(@NotNull ourLangParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull ourLangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull ourLangParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull ourLangParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#collectionEntrance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionEntrance(@NotNull ourLangParser.CollectionEntranceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#valueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(@NotNull ourLangParser.ValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#constantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantList(@NotNull ourLangParser.ConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#entranceCoordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntranceCoordinate(@NotNull ourLangParser.EntranceCoordinateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(@NotNull ourLangParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#collectiontype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectiontype(@NotNull ourLangParser.CollectiontypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#infixBinaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixBinaryOperator(@NotNull ourLangParser.InfixBinaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#postUnaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostUnaryOperator(@NotNull ourLangParser.PostUnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#conditionalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOperator(@NotNull ourLangParser.ConditionalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(@NotNull ourLangParser.ConstantContext ctx);
}