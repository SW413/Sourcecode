package com.doge.ContextualAnalysis.AST;

import com.doge.SyntaxAnalysis.Visitors.IASTVisitor;

/**
 * Created by michno on 19/3/15.
 */
public class DeclarationNode extends StatementNode {
    private Variable variable;
    private ExpressionNode expression;

    public DeclarationNode(BaseASTNode parent, Variable variable, ExpressionNode expression, int lineNum) {
        super(parent);
        this.variable = variable;
        this.expression = expression;
        this.setLineNumber(lineNum);
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
