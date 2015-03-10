// Generated from /Users/michno/Desktop/AAU/SW4-P4/Sourcecode/ANTLR_TEST/LangTest/grammar/ourLang.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ourLangParser}.
 */
public interface ourLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ourLangParser#topLevel}.
	 * @param ctx the parse tree
	 */
	void enterTopLevel(@NotNull ourLangParser.TopLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#topLevel}.
	 * @param ctx the parse tree
	 */
	void exitTopLevel(@NotNull ourLangParser.TopLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#importing}.
	 * @param ctx the parse tree
	 */
	void enterImporting(@NotNull ourLangParser.ImportingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#importing}.
	 * @param ctx the parse tree
	 */
	void exitImporting(@NotNull ourLangParser.ImportingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#functiondeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondeclaration(@NotNull ourLangParser.FunctiondeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#functiondeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondeclaration(@NotNull ourLangParser.FunctiondeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#parameterlist}.
	 * @param ctx the parse tree
	 */
	void enterParameterlist(@NotNull ourLangParser.ParameterlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#parameterlist}.
	 * @param ctx the parse tree
	 */
	void exitParameterlist(@NotNull ourLangParser.ParameterlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull ourLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull ourLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#controlblock}.
	 * @param ctx the parse tree
	 */
	void enterControlblock(@NotNull ourLangParser.ControlblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#controlblock}.
	 * @param ctx the parse tree
	 */
	void exitControlblock(@NotNull ourLangParser.ControlblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(@NotNull ourLangParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(@NotNull ourLangParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull ourLangParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull ourLangParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(@NotNull ourLangParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(@NotNull ourLangParser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#argumentlist}.
	 * @param ctx the parse tree
	 */
	void enterArgumentlist(@NotNull ourLangParser.ArgumentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#argumentlist}.
	 * @param ctx the parse tree
	 */
	void exitArgumentlist(@NotNull ourLangParser.ArgumentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull ourLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull ourLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#addexpression}.
	 * @param ctx the parse tree
	 */
	void enterAddexpression(@NotNull ourLangParser.AddexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#addexpression}.
	 * @param ctx the parse tree
	 */
	void exitAddexpression(@NotNull ourLangParser.AddexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#multiexpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiexpression(@NotNull ourLangParser.MultiexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#multiexpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiexpression(@NotNull ourLangParser.MultiexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull ourLangParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull ourLangParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull ourLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull ourLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull ourLangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull ourLangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull ourLangParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull ourLangParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#collectionEntrance}.
	 * @param ctx the parse tree
	 */
	void enterCollectionEntrance(@NotNull ourLangParser.CollectionEntranceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#collectionEntrance}.
	 * @param ctx the parse tree
	 */
	void exitCollectionEntrance(@NotNull ourLangParser.CollectionEntranceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#valueList}.
	 * @param ctx the parse tree
	 */
	void enterValueList(@NotNull ourLangParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#valueList}.
	 * @param ctx the parse tree
	 */
	void exitValueList(@NotNull ourLangParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#constantList}.
	 * @param ctx the parse tree
	 */
	void enterConstantList(@NotNull ourLangParser.ConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#constantList}.
	 * @param ctx the parse tree
	 */
	void exitConstantList(@NotNull ourLangParser.ConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#entranceCoordinate}.
	 * @param ctx the parse tree
	 */
	void enterEntranceCoordinate(@NotNull ourLangParser.EntranceCoordinateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#entranceCoordinate}.
	 * @param ctx the parse tree
	 */
	void exitEntranceCoordinate(@NotNull ourLangParser.EntranceCoordinateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(@NotNull ourLangParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(@NotNull ourLangParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#collectiontype}.
	 * @param ctx the parse tree
	 */
	void enterCollectiontype(@NotNull ourLangParser.CollectiontypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#collectiontype}.
	 * @param ctx the parse tree
	 */
	void exitCollectiontype(@NotNull ourLangParser.CollectiontypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#infixBinaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterInfixBinaryOperator(@NotNull ourLangParser.InfixBinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#infixBinaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitInfixBinaryOperator(@NotNull ourLangParser.InfixBinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#postUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterPostUnaryOperator(@NotNull ourLangParser.PostUnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#postUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitPostUnaryOperator(@NotNull ourLangParser.PostUnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#conditionalOperator}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOperator(@NotNull ourLangParser.ConditionalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#conditionalOperator}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOperator(@NotNull ourLangParser.ConditionalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull ourLangParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull ourLangParser.ConstantContext ctx);
}