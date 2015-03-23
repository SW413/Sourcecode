package com.doge.AST;

import java.util.ArrayList;

/**
 * Created by michno on 19/3/15.
 */
public class ConditionalNode extends AST{

    private ConditionalExpressionNode conditionalExpression;
    private StatementNode body;
    private ArrayList<ConditionalNode> IfElses = new ArrayList<ConditionalNode>();
    private StatementNode elseBody;
    private boolean DoneWithIf = false;

    public void AddIfElse(ConditionalNode node){

        IfElses.add(node);
    }

    public boolean IsDoneWithIf() {
        return DoneWithIf;
    }

    public void setDoneWithIf(boolean DoneWithIf) {
        this.DoneWithIf = DoneWithIf;
    }

    public ArrayList<ConditionalNode> getIfElses() {
        return IfElses;
    }

    public ConditionalExpressionNode getConditionalExpression() {
        return conditionalExpression;
    }

    public void setConditionalExpression(ConditionalExpressionNode conditionalExpression) {
        this.conditionalExpression = conditionalExpression;
    }

    public ConditionalNode(AST parent, ConditionalExpressionNode conditionalExpression) {
        super(parent);
        this.conditionalExpression = conditionalExpression;
    }

    public StatementNode getElseBody() {
        return elseBody;
    }

    public void setElseBody(StatementNode elseBody) {
        this.elseBody = elseBody;
    }

    public StatementNode getBody() {
        return this.body;
    }

    public void setBody(StatementNode body) {
        this.body = body;
    }
}
