package com.doge.ContextualAnalysis.AST;

import com.doge.ContextualAnalysis.Visitors.IASTVisitor;
import com.doge.MiscComponents.Types.OperatorType;

/**
 * Created by michno on 24/3/15.
 */
public class VariableExpressionNode extends ExpressionNode {
    private Variable variable;

    public VariableExpressionNode(BaseASTNode parent, Variable variable) {
        super(parent, null, null, null);
        this.variable = variable;
    }

    public VariableExpressionNode(BaseASTNode parent, Variable variable, int lineNum) {
        super(parent, null, null, null, lineNum);
        this.variable = variable;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {this.variable = variable;}

    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitVariableExpressionNode(this);
        else return node.visitChildren(this);
    }

    @Override
    public String toString() {
        return variable.toString();
    }
}
