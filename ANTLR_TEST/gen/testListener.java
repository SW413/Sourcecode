// Generated from /Users/michno/Desktop/AAU/SW4-P4/Sourcecode/ANTLR_TEST/LangTest/grammar/test.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#topLevel}.
	 * @param ctx the parse tree
	 */
	void enterTopLevel(@NotNull testParser.TopLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#topLevel}.
	 * @param ctx the parse tree
	 */
	void exitTopLevel(@NotNull testParser.TopLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull testParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull testParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#controlblock}.
	 * @param ctx the parse tree
	 */
	void enterControlblock(@NotNull testParser.ControlblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#controlblock}.
	 * @param ctx the parse tree
	 */
	void exitControlblock(@NotNull testParser.ControlblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull testParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull testParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#functiondeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondeclaration(@NotNull testParser.FunctiondeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#functiondeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondeclaration(@NotNull testParser.FunctiondeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#parameterlist}.
	 * @param ctx the parse tree
	 */
	void enterParameterlist(@NotNull testParser.ParameterlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#parameterlist}.
	 * @param ctx the parse tree
	 */
	void exitParameterlist(@NotNull testParser.ParameterlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(@NotNull testParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(@NotNull testParser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#argumentlist}.
	 * @param ctx the parse tree
	 */
	void enterArgumentlist(@NotNull testParser.ArgumentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#argumentlist}.
	 * @param ctx the parse tree
	 */
	void exitArgumentlist(@NotNull testParser.ArgumentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull testParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull testParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#addexpression}.
	 * @param ctx the parse tree
	 */
	void enterAddexpression(@NotNull testParser.AddexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#addexpression}.
	 * @param ctx the parse tree
	 */
	void exitAddexpression(@NotNull testParser.AddexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#multiexpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiexpression(@NotNull testParser.MultiexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#multiexpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiexpression(@NotNull testParser.MultiexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull testParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull testParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull testParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull testParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull testParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull testParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull testParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull testParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#collectionEntrance}.
	 * @param ctx the parse tree
	 */
	void enterCollectionEntrance(@NotNull testParser.CollectionEntranceContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#collectionEntrance}.
	 * @param ctx the parse tree
	 */
	void exitCollectionEntrance(@NotNull testParser.CollectionEntranceContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#valueListList}.
	 * @param ctx the parse tree
	 */
	void enterValueListList(@NotNull testParser.ValueListListContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#valueListList}.
	 * @param ctx the parse tree
	 */
	void exitValueListList(@NotNull testParser.ValueListListContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#valueList}.
	 * @param ctx the parse tree
	 */
	void enterValueList(@NotNull testParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#valueList}.
	 * @param ctx the parse tree
	 */
	void exitValueList(@NotNull testParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#constantList}.
	 * @param ctx the parse tree
	 */
	void enterConstantList(@NotNull testParser.ConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#constantList}.
	 * @param ctx the parse tree
	 */
	void exitConstantList(@NotNull testParser.ConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterDimension(@NotNull testParser.DimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitDimension(@NotNull testParser.DimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(@NotNull testParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(@NotNull testParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#collectiontype}.
	 * @param ctx the parse tree
	 */
	void enterCollectiontype(@NotNull testParser.CollectiontypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#collectiontype}.
	 * @param ctx the parse tree
	 */
	void exitCollectiontype(@NotNull testParser.CollectiontypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#infixBinaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterInfixBinaryOperator(@NotNull testParser.InfixBinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#infixBinaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitInfixBinaryOperator(@NotNull testParser.InfixBinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#postUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterPostUnaryOperator(@NotNull testParser.PostUnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#postUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitPostUnaryOperator(@NotNull testParser.PostUnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#conditionalOperator}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOperator(@NotNull testParser.ConditionalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#conditionalOperator}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOperator(@NotNull testParser.ConditionalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull testParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull testParser.ConstantContext ctx);
}