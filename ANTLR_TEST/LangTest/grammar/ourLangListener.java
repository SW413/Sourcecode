// Generated from ourLang.g4 by ANTLR 4.5
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
	void enterTopLevel(ourLangParser.TopLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#topLevel}.
	 * @param ctx the parse tree
	 */
	void exitTopLevel(ourLangParser.TopLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ourLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ourLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#importing}.
	 * @param ctx the parse tree
	 */
	void enterImporting(ourLangParser.ImportingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#importing}.
	 * @param ctx the parse tree
	 */
	void exitImporting(ourLangParser.ImportingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#controlblock}.
	 * @param ctx the parse tree
	 */
	void enterControlblock(ourLangParser.ControlblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#controlblock}.
	 * @param ctx the parse tree
	 */
	void exitControlblock(ourLangParser.ControlblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(ourLangParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(ourLangParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ourLangParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ourLangParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#functiondeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondeclaration(ourLangParser.FunctiondeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#functiondeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondeclaration(ourLangParser.FunctiondeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#parameterlist}.
	 * @param ctx the parse tree
	 */
	void enterParameterlist(ourLangParser.ParameterlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#parameterlist}.
	 * @param ctx the parse tree
	 */
	void exitParameterlist(ourLangParser.ParameterlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(ourLangParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(ourLangParser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#argumentlist}.
	 * @param ctx the parse tree
	 */
	void enterArgumentlist(ourLangParser.ArgumentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#argumentlist}.
	 * @param ctx the parse tree
	 */
	void exitArgumentlist(ourLangParser.ArgumentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ourLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ourLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#addexpression}.
	 * @param ctx the parse tree
	 */
	void enterAddexpression(ourLangParser.AddexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#addexpression}.
	 * @param ctx the parse tree
	 */
	void exitAddexpression(ourLangParser.AddexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#multiexpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiexpression(ourLangParser.MultiexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#multiexpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiexpression(ourLangParser.MultiexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(ourLangParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(ourLangParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ourLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ourLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#valassignment}.
	 * @param ctx the parse tree
	 */
	void enterValassignment(ourLangParser.ValassignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#valassignment}.
	 * @param ctx the parse tree
	 */
	void exitValassignment(ourLangParser.ValassignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#collectionassignment}.
	 * @param ctx the parse tree
	 */
	void enterCollectionassignment(ourLangParser.CollectionassignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#collectionassignment}.
	 * @param ctx the parse tree
	 */
	void exitCollectionassignment(ourLangParser.CollectionassignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ourLangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ourLangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ourLangParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ourLangParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#collectionEntrance}.
	 * @param ctx the parse tree
	 */
	void enterCollectionEntrance(ourLangParser.CollectionEntranceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#collectionEntrance}.
	 * @param ctx the parse tree
	 */
	void exitCollectionEntrance(ourLangParser.CollectionEntranceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#valueList}.
	 * @param ctx the parse tree
	 */
	void enterValueList(ourLangParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#valueList}.
	 * @param ctx the parse tree
	 */
	void exitValueList(ourLangParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#constantList}.
	 * @param ctx the parse tree
	 */
	void enterConstantList(ourLangParser.ConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#constantList}.
	 * @param ctx the parse tree
	 */
	void exitConstantList(ourLangParser.ConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#entranceCoordinate}.
	 * @param ctx the parse tree
	 */
	void enterEntranceCoordinate(ourLangParser.EntranceCoordinateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#entranceCoordinate}.
	 * @param ctx the parse tree
	 */
	void exitEntranceCoordinate(ourLangParser.EntranceCoordinateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(ourLangParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(ourLangParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#collectiontype}.
	 * @param ctx the parse tree
	 */
	void enterCollectiontype(ourLangParser.CollectiontypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#collectiontype}.
	 * @param ctx the parse tree
	 */
	void exitCollectiontype(ourLangParser.CollectiontypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#infixBinaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterInfixBinaryOperator(ourLangParser.InfixBinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#infixBinaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitInfixBinaryOperator(ourLangParser.InfixBinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#postUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterPostUnaryOperator(ourLangParser.PostUnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#postUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitPostUnaryOperator(ourLangParser.PostUnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#conditionalOperator}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOperator(ourLangParser.ConditionalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#conditionalOperator}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOperator(ourLangParser.ConditionalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(ourLangParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(ourLangParser.ConstantContext ctx);
}