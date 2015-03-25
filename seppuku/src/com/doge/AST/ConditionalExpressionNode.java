package com.doge.AST;

import com.doge.types.OperatorType;

import java.util.ArrayList;

/**
 * Created by michno on 19/3/15.
 */
public class ConditionalExpressionNode extends ExpressionNode {

    public ConditionalExpressionNode(AST parent, Object lValue, OperatorType operatorType, Object rValue) {
        super(parent, lValue, operatorType, rValue);
    }
}
