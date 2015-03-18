// Generated from C:/Users/Mathias/.babun/cygwin/home/Mathias/Sourcecode/ANTLR_TEST/LangTest/grammar\ourLang.g4 by ANTLR 4.5
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
	 * Visit a parse tree produced by {@link ourLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull ourLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#importing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImporting(@NotNull ourLangParser.ImportingContext ctx);
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
	 * Visit a parse tree produced by {@link ourLangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull ourLangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(@NotNull ourLangParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#functiondeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondeclaration(@NotNull ourLangParser.FunctiondeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#functionbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionbody(@NotNull ourLangParser.FunctionbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#parameterlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterlist(@NotNull ourLangParser.ParameterlistContext ctx);
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
	 * Visit a parse tree produced by {@link ourLangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull ourLangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#valassignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValassignment(@NotNull ourLangParser.ValassignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#collectionassignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionassignment(@NotNull ourLangParser.CollectionassignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull ourLangParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(@NotNull ourLangParser.DatatypeContext ctx);
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
	 * Visit a parse tree produced by {@link ourLangParser#collectiontype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectiontype(@NotNull ourLangParser.CollectiontypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#postUnaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostUnaryOperator(@NotNull ourLangParser.PostUnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ourLangParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(@NotNull ourLangParser.AssignmentOperatorContext ctx);
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