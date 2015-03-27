package com.doge.AST;

import java.util.ArrayList;

/**
 * Created by Søren on 27-03-2015.
 */
public class MultiConditionalExpression extends AST{
    private ArrayList<ConditionalExpressionNode> ConditionalExpressions = new ArrayList<ConditionalExpressionNode>();

    public MultiConditionalExpression(AST parent) {
        super(parent);
    }

    public ArrayList<ConditionalExpressionNode> getConditionalExpressions() {
        return ConditionalExpressions;
    }

    public void setConditionalExpressions(ArrayList<ConditionalExpressionNode> conditionalExpressions) {
        ConditionalExpressions = conditionalExpressions;
    }
    public void AddConditionalExpression(ConditionalExpressionNode node){
        ConditionalExpressions.add(node);
    }
}
