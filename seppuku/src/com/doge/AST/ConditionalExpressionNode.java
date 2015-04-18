package com.doge.AST;

import com.doge.Visitors.IASTVisitor;
import com.doge.types.OperatorType;

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
