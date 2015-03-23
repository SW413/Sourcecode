package com.doge.AST;

import java.util.ArrayList;

/**
 * Created by michno on 19/3/15.
 */
public class ConditionalNode extends AST{

    private ConditionalExpressionNode conditionalExpression;
    private StatementNode body;

    public ConditionalNode(AST parent, ConditionalExpressionNode conditionalExpression) {
        super(parent);
        this.conditionalExpression = conditionalExpression;
    }

    public StatementNode getBody() {
        return this.body;
    }

    public void setBody(StatementNode body) {
        this.body = body;
    }
}
