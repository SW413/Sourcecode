package com.doge.ContextualAnalysis.AST;

import java.util.ArrayList;

/**
 * Created by Søren on 27-03-2015.
 */
public class MultiConditionalExpression extends BaseASTNode {
    private ArrayList<ConditionalExpressionNode> ConditionalExpressions = new ArrayList<ConditionalExpressionNode>();

    public MultiConditionalExpression(BaseASTNode parent) {
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
