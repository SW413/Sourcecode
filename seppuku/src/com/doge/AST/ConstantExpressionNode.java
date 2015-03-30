package com.doge.AST;

import com.doge.Visitors.IASTVisitor;

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

    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitConstantExpressionNode(this);
        else return node.visitChildren(this);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
