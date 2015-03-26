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
	 * Enter a parse tree produced by {@link ourLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ourLangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ourLangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleCondExpr}
	 * labeled alternative in {@link ourLangParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleCondExpr(ourLangParser.SingleCondExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleCondExpr}
	 * labeled alternative in {@link ourLangParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleCondExpr(ourLangParser.SingleCondExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiCondExpr}
	 * labeled alternative in {@link ourLangParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiCondExpr(ourLangParser.MultiCondExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiCondExpr}
	 * labeled alternative in {@link ourLangParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiCondExpr(ourLangParser.MultiCondExprContext ctx);
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
	 * Enter a parse tree produced by {@link ourLangParser#functionbody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionbody(ourLangParser.FunctionbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#functionbody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionbody(ourLangParser.FunctionbodyContext ctx);
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
	 * Enter a parse tree produced by the {@code customFunc}
	 * labeled alternative in {@link ourLangParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterCustomFunc(ourLangParser.CustomFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code customFunc}
	 * labeled alternative in {@link ourLangParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitCustomFunc(ourLangParser.CustomFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printFunc}
	 * labeled alternative in {@link ourLangParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunc(ourLangParser.PrintFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printFunc}
	 * labeled alternative in {@link ourLangParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunc(ourLangParser.PrintFuncContext ctx);
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
	 * Enter a parse tree produced by the {@code valueExpr}
	 * labeled alternative in {@link ourLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpr(ourLangParser.ValueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpr}
	 * labeled alternative in {@link ourLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpr(ourLangParser.ValueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link ourLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(ourLangParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link ourLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(ourLangParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postIDExpr}
	 * labeled alternative in {@link ourLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostIDExpr(ourLangParser.PostIDExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postIDExpr}
	 * labeled alternative in {@link ourLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostIDExpr(ourLangParser.PostIDExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link ourLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(ourLangParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link ourLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(ourLangParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link ourLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(ourLangParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link ourLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(ourLangParser.ParenExprContext ctx);
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
	 * Enter a parse tree produced by the {@code entireCollectionAssignment}
	 * labeled alternative in {@link ourLangParser#collectionassignment}.
	 * @param ctx the parse tree
	 */
	void enterEntireCollectionAssignment(ourLangParser.EntireCollectionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code entireCollectionAssignment}
	 * labeled alternative in {@link ourLangParser#collectionassignment}.
	 * @param ctx the parse tree
	 */
	void exitEntireCollectionAssignment(ourLangParser.EntireCollectionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code collectionEntranceAssignment}
	 * labeled alternative in {@link ourLangParser#collectionassignment}.
	 * @param ctx the parse tree
	 */
	void enterCollectionEntranceAssignment(ourLangParser.CollectionEntranceAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collectionEntranceAssignment}
	 * labeled alternative in {@link ourLangParser#collectionassignment}.
	 * @param ctx the parse tree
	 */
	void exitCollectionEntranceAssignment(ourLangParser.CollectionEntranceAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveDecl}
	 * labeled alternative in {@link ourLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDecl(ourLangParser.PrimitiveDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveDecl}
	 * labeled alternative in {@link ourLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDecl(ourLangParser.PrimitiveDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexDecl}
	 * labeled alternative in {@link ourLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterComplexDecl(ourLangParser.ComplexDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexDecl}
	 * labeled alternative in {@link ourLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitComplexDecl(ourLangParser.ComplexDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integer}
	 * labeled alternative in {@link ourLangParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterInteger(ourLangParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link ourLangParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitInteger(ourLangParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatingpoint}
	 * labeled alternative in {@link ourLangParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterFloatingpoint(ourLangParser.FloatingpointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatingpoint}
	 * labeled alternative in {@link ourLangParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitFloatingpoint(ourLangParser.FloatingpointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link ourLangParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(ourLangParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link ourLangParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(ourLangParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#complexdatatype}.
	 * @param ctx the parse tree
	 */
	void enterComplexdatatype(ourLangParser.ComplexdatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#complexdatatype}.
	 * @param ctx the parse tree
	 */
	void exitComplexdatatype(ourLangParser.ComplexdatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ourLangParser#functiondatatype}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondatatype(ourLangParser.FunctiondatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#functiondatatype}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondatatype(ourLangParser.FunctiondatatypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valID}
	 * labeled alternative in {@link ourLangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValID(ourLangParser.ValIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valID}
	 * labeled alternative in {@link ourLangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValID(ourLangParser.ValIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valConstant}
	 * labeled alternative in {@link ourLangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValConstant(ourLangParser.ValConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valConstant}
	 * labeled alternative in {@link ourLangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValConstant(ourLangParser.ValConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valList}
	 * labeled alternative in {@link ourLangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValList(ourLangParser.ValListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valList}
	 * labeled alternative in {@link ourLangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValList(ourLangParser.ValListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valFuncCall}
	 * labeled alternative in {@link ourLangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValFuncCall(ourLangParser.ValFuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valFuncCall}
	 * labeled alternative in {@link ourLangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValFuncCall(ourLangParser.ValFuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valCollectionEntrance}
	 * labeled alternative in {@link ourLangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValCollectionEntrance(ourLangParser.ValCollectionEntranceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valCollectionEntrance}
	 * labeled alternative in {@link ourLangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValCollectionEntrance(ourLangParser.ValCollectionEntranceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valBool}
	 * labeled alternative in {@link ourLangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValBool(ourLangParser.ValBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valBool}
	 * labeled alternative in {@link ourLangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValBool(ourLangParser.ValBoolContext ctx);
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
	 * Enter a parse tree produced by the {@code collectionMatrix}
	 * labeled alternative in {@link ourLangParser#collectiontype}.
	 * @param ctx the parse tree
	 */
	void enterCollectionMatrix(ourLangParser.CollectionMatrixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collectionMatrix}
	 * labeled alternative in {@link ourLangParser#collectiontype}.
	 * @param ctx the parse tree
	 */
	void exitCollectionMatrix(ourLangParser.CollectionMatrixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code collectionRVector}
	 * labeled alternative in {@link ourLangParser#collectiontype}.
	 * @param ctx the parse tree
	 */
	void enterCollectionRVector(ourLangParser.CollectionRVectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collectionRVector}
	 * labeled alternative in {@link ourLangParser#collectiontype}.
	 * @param ctx the parse tree
	 */
	void exitCollectionRVector(ourLangParser.CollectionRVectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code collectionCVector}
	 * labeled alternative in {@link ourLangParser#collectiontype}.
	 * @param ctx the parse tree
	 */
	void enterCollectionCVector(ourLangParser.CollectionCVectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collectionCVector}
	 * labeled alternative in {@link ourLangParser#collectiontype}.
	 * @param ctx the parse tree
	 */
	void exitCollectionCVector(ourLangParser.CollectionCVectorContext ctx);
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
	 * Enter a parse tree produced by {@link ourLangParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(ourLangParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ourLangParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(ourLangParser.AssignmentOperatorContext ctx);
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