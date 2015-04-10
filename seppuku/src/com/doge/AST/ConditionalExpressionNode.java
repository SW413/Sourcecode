package com.doge.AST;

import com.doge.Visitors.IASTVisitor;
import com.doge.types.OperatorType;

import java.util.ArrayList;

/**
 * Created by michno on 19/3/15.
 */
public class ConditionalExpressionNode extends ExpressionNode {

    public ConditionalExpressionNode(AST parent, ExpressionNode lValue, OperatorType operatorType, ExpressionNode rValue) {
        super(parent, lValue, operatorType, rValue);
    }

    public ConditionalExpressionNode(AST parent, ExpressionNode lValue, OperatorType operatorType, ExpressionNode rValue, int lineNum) {
        super(parent, lValue, operatorType, rValue, lineNum);
    }


    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitConditionalExpressionNode(this);
        else return node.visitChildren(this);
    }
}
