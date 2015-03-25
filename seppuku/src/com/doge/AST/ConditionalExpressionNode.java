package com.doge.AST;

import com.doge.Visitors.IASTVisitor;
import com.doge.types.OperatorType;

import java.util.ArrayList;

/**
 * Created by michno on 19/3/15.
 */
public class ConditionalExpressionNode extends ExpressionNode {
    //TODO: make this shit

    public ConditionalExpressionNode(AST parent, Object lValue, OperatorType operatorType, Object rValue) {
        super(parent, lValue, operatorType, rValue);
    }
    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitConditionalExpressionNode(this);
        else return node.visitChildren(this);
    }
}
