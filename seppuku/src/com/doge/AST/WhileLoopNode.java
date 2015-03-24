package com.doge.AST;

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

    public WhileLoopNode(AST parent) {
        super(parent);
    }
}
