package com.doge.AST;

/**
 * Created by michno on 24/3/15.
 */
public class VariableExpressionNode extends ExpressionNode {
    private Variable variable;

    public VariableExpressionNode(AST parent, Variable variable) {
        super(parent, null, null, null);
        this.variable = variable;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }
}
