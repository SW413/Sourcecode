package com.doge.AST;

import com.doge.Visitors.IASTVisitor;

import java.util.ArrayList;

/**
 * Created by michno on 19/3/15.
 */
public class DeclarationNode extends StatementNode {
    private Variable variable;
    private ExpressionNode expression;

    public DeclarationNode(AST parent, Variable variable, ExpressionNode expression) {
        super(parent);
        this.variable = variable;
        this.expression = expression;
    }

    public Variable getVariable(){
        return this.variable;
    }

    public ExpressionNode getExpression() {
        return this.expression;
    }

    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitDeclarationNode(this);
        else return node.visitChildren(this);
    }
}
