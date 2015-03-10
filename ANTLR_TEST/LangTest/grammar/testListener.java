// Generated from test.g4 by ANTLR 4.5
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
	void enterTopLevel(testParser.TopLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#topLevel}.
	 * @param ctx the parse tree
	 */
	void exitTopLevel(testParser.TopLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(testParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(testParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#controlblock}.
	 * @param ctx the parse tree
	 */
	void enterControlblock(testParser.ControlblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#controlblock}.
	 * @param ctx the parse tree
	 */
	void exitControlblock(testParser.ControlblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(testParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(testParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(testParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(testParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#functiondeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondeclaration(testParser.FunctiondeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#functiondeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondeclaration(testParser.FunctiondeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#parameterlist}.
	 * @param ctx the parse tree
	 */
	void enterParameterlist(testParser.ParameterlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#parameterlist}.
	 * @param ctx the parse tree
	 */
	void exitParameterlist(testParser.ParameterlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(testParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(testParser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#argumentlist}.
	 * @param ctx the parse tree
	 */
	void enterArgumentlist(testParser.ArgumentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#argumentlist}.
	 * @param ctx the parse tree
	 */
	void exitArgumentlist(testParser.ArgumentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(testParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(testParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#addexpression}.
	 * @param ctx the parse tree
	 */
	void enterAddexpression(testParser.AddexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#addexpression}.
	 * @param ctx the parse tree
	 */
	void exitAddexpression(testParser.AddexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#multiexpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiexpression(testParser.MultiexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#multiexpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiexpression(testParser.MultiexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(testParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(testParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(testParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(testParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(testParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(testParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(testParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(testParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#collectionEntrance}.
	 * @param ctx the parse tree
	 */
	void enterCollectionEntrance(testParser.CollectionEntranceContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#collectionEntrance}.
	 * @param ctx the parse tree
	 */
	void exitCollectionEntrance(testParser.CollectionEntranceContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#valueList}.
	 * @param ctx the parse tree
	 */
	void enterValueList(testParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#valueList}.
	 * @param ctx the parse tree
	 */
	void exitValueList(testParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#constantList}.
	 * @param ctx the parse tree
	 */
	void enterConstantList(testParser.ConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#constantList}.
	 * @param ctx the parse tree
	 */
	void exitConstantList(testParser.ConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#entranceCoordinate}.
	 * @param ctx the parse tree
	 */
	void enterEntranceCoordinate(testParser.EntranceCoordinateContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#entranceCoordinate}.
	 * @param ctx the parse tree
	 */
	void exitEntranceCoordinate(testParser.EntranceCoordinateContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(testParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(testParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#collectiontype}.
	 * @param ctx the parse tree
	 */
	void enterCollectiontype(testParser.CollectiontypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#collectiontype}.
	 * @param ctx the parse tree
	 */
	void exitCollectiontype(testParser.CollectiontypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#infixBinaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterInfixBinaryOperator(testParser.InfixBinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#infixBinaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitInfixBinaryOperator(testParser.InfixBinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#postUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterPostUnaryOperator(testParser.PostUnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#postUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitPostUnaryOperator(testParser.PostUnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#conditionalOperator}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOperator(testParser.ConditionalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#conditionalOperator}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOperator(testParser.ConditionalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(testParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(testParser.ConstantContext ctx);
}