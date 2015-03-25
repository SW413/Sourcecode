package com.doge.AST;

import com.doge.Visitors.IASTVisitor;
import com.doge.types.AssignmentOperatorType;

/**
 * Created by michno on 19/3/15.
 */
public class AssignmentNode extends StatementNode {
    private Variable variable;
    private AssignmentOperatorType assignmentOperator;
    private ExpressionNode expression;

    public AssignmentNode(AST parent, Variable variable, AssignmentOperatorType assignmentOperator, ExpressionNode expression) {
        super(parent);
        this.variable = variable;
        this.assignmentOperator = assignmentOperator;
        this.expression = expression;
    }

    public Variable getVariable() {
        return variable;
    }

    public AssignmentOperatorType getAssignmentOperator() {
        return assignmentOperator;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitAssignmentNode(this);
        else return node.visitChildren(this);
    }
}
