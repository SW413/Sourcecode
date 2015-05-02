package com.doge.ContextualAnalysis.AST;

import com.doge.ContextualAnalysis.Visitors.IASTVisitor;
import com.doge.MiscComponents.Types.AssignmentOperatorType;

/**
 * Created by michno on 19/3/15.
 */
public class AssignmentNode extends StatementNode {
    private Variable variable;
    private AssignmentOperatorType assignmentOperator;
    private ExpressionNode expression;

    public AssignmentNode(BaseASTNode parent, Variable variable, AssignmentOperatorType assignmentOperator, ExpressionNode expression) {
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

    public String PrettyPrint() {
        switch (assignmentOperator) {
            case BASIC:
                return "=";
            case ADD:
                return "+=";
            case SUB:
                return "-=";
            case MUL:
                return "*=";
            case DIV:
                return "/=";
            case INCREMENT:
                return "++";
            case DECREMENT:
                return "++";
            default:
                return "ERROR";
        }
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    public <T> T accept(IASTVisitor<? extends T> node) {
        if (node instanceof IASTVisitor) return node.VisitAssignmentNode(this);
        else return node.visitChildren(this);
    }
}
