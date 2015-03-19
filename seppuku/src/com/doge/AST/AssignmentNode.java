package com.doge.AST;

/**
 * Created by michno on 19/3/15.
 */
public class AssignmentNode extends StatementNode {
    private Variable variable;
    private ExpressionNode expression;

    //TODO: Måske ENUM?
    private String assignmentOpperator;

    public AssignmentNode(AST parent, Variable variable, ExpressionNode expression, String assignmentOpperator) {
        super(parent);
        this.variable = variable;
        this.expression = expression;
        this.assignmentOpperator = assignmentOpperator;
    }
}
