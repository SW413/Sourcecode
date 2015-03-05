// Generated from /Users/michno/Desktop/AAU/SW4-P4/Sourcecode/ANTLR_TEST/LangTest/grammar/test.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link testParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface testVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link testParser#topLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevel(@NotNull testParser.TopLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull testParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull testParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#functiondeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondeclarations(@NotNull testParser.FunctiondeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#functiondeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondeclaration(@NotNull testParser.FunctiondeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#parameterlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterlist(@NotNull testParser.ParameterlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(@NotNull testParser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#argumentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentlist(@NotNull testParser.ArgumentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull testParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#addexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddexpression(@NotNull testParser.AddexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#multiexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiexpression(@NotNull testParser.MultiexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(@NotNull testParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull testParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull testParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull testParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#valueListList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueListList(@NotNull testParser.ValueListListContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#valueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(@NotNull testParser.ValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#constantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantList(@NotNull testParser.ConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimension(@NotNull testParser.DimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(@NotNull testParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection(@NotNull testParser.CollectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#infixBinaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixBinaryOperator(@NotNull testParser.InfixBinaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#postUnaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostUnaryOperator(@NotNull testParser.PostUnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(@NotNull testParser.ConstantContext ctx);
}