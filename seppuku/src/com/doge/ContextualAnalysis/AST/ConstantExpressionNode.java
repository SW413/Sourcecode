package com.doge.ContextualAnalysis.AST;

import com.doge.SyntaxAnalysis.Visitors.IASTVisitor;

/**
 * Created by michno on 20/3/15.
 */
public class ConstantExpressionNode extends ExpressionNode {
    private Object value;

    public ConstantExpressionNode(BaseASTNode parent, Object value) {
        super(parent, null, null, null);
        this.value = value;
    }

    public ConstantExpressionNode(BaseASTNode parent, Object value, int lineNum) {
        super(parent, null, null, null, lineNum);
        this.value = value;
    }

    public Object getValue() {
        return this.value;
    }

    public void setValue(Object value) {
        this.value = value;
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
