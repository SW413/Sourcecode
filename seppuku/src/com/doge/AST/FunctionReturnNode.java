package com.doge.AST;

/**
 * Created by michno on 23/3/15.
 */
public class FunctionReturnNode extends StatementNode {
    private ExpressionNode expression;

    public FunctionReturnNode(AST parent, ExpressionNode expression) {
        super(parent);
        this.expression = expression;
    }

    public ExpressionNode getExpression() {
        return expression;
    }
}
