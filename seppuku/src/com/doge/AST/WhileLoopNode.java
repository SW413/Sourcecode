package com.doge.AST;

import com.doge.Visitors.IASTVisitor;

/**
 * Created by Søren on 24-03-2015.
 */
public class WhileLoopNode extends StatementNode {

    private ConditionalExpressionNode condNode;
    private StatementNode body;

    public ConditionalExpressionNode getCondNode() {
        return condNode;
    }

    public void setCondNode(ConditionalExpressionNode condNode) {
        this.condNode = condNode;
    }

    public StatementNode getBody() {
        return body;
    }

    public void setBody(StatementNode body) {
        this.body = body;
    }

    public WhileLoopNode(BaseASTNode parent) {
        super(parent);
    }

    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitWhileLoopNode(this);
        else return node.visitChildren(this);
    }
}
