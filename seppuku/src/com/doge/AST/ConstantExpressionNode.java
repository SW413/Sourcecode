package com.doge.AST;

import com.doge.types.OperatorType;

/**
 * Created by michno on 20/3/15.
 */
public class ConstantExpressionNode extends ExpressionNode {
    private String value;

    public ConstantExpressionNode(AST parent, String value) {
        super(parent, null, null, null);
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
