package com.doge.AST;

/**
 * Created by Søren on 19-03-2015.
 */
public class AddExpressionNode extends ExpressionNode {

    private ExpressionNode expr1;
    private ExpressionNode expr2;

    public AddExpressionNode(AST parent) {
        super(parent);
    }
}
