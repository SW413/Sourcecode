package com.doge.ContextualAnalysis.AST;

import com.doge.SyntaxAnalysis.Visitors.IASTVisitor;
import com.doge.MiscComponents.Types.OperatorType;

/**
 * Created by michno on 19/3/15.
 */
public class ConditionalExpressionNode extends ExpressionNode {

    public ConditionalExpressionNode(BaseASTNode parent, ExpressionNode lValue, OperatorType operatorType, ExpressionNode rValue) {
        super(parent, lValue, operatorType, rValue);
    }

    public ConditionalExpressionNode(BaseASTNode parent, ExpressionNode lValue, OperatorType operatorType, ExpressionNode rValue, int lineNum) {
        super(parent, lValue, operatorType, rValue, lineNum);
    }


    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitConditionalExpressionNode(this);
        else return node.visitChildren(this);
    }
}
