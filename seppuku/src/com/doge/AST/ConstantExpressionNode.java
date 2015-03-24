package com.doge.AST;

/**
 * Created by michno on 20/3/15.
 */
public class ConstantExpressionNode extends ExpressionNode {
    private Object value;

    public ConstantExpressionNode(AST parent, Object value) {
        super(parent, null, null, null);
        this.value = value;
    }

    public Object getValue() {
        return this.value;
    }
}
