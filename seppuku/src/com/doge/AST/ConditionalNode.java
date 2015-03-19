package com.doge.AST;

import java.util.ArrayList;

/**
 * Created by michno on 19/3/15.
 */
public class ConditionalNode extends AST{
    private ConditionalExpressionNode conditionalExpression;
    private ArrayList<StatementNode> body = new ArrayList<StatementNode>();

    public ConditionalNode(AST parent, ConditionalExpressionNode conditionalExpression) {
        super(parent);
        this.conditionalExpression = conditionalExpression;
    }

    public void addStatement(StatementNode statement) {
        this.body.add(statement);
    }

    public ArrayList<StatementNode> getBody() {
        return this.body;
    }
}
