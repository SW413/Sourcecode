package com.doge.ContextualAnalysis.AST;

import com.doge.ContextualAnalysis.Visitors.IASTVisitor;

/**
 * Created by michno on 23/3/15.
 */
public class FunctionReturnNode extends StatementNode {
    private ExpressionNode expression;

    public FunctionReturnNode(BaseASTNode parent, ExpressionNode expression) {
        super(parent);
        this.expression = expression;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitFunctionReturnNode(this);
        else return node.visitChildren(this);
    }
}
