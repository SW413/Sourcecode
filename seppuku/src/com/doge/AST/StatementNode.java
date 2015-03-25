package com.doge.AST;

import com.doge.Visitors.IASTVisitor;

/**
 * Created by michno on 19/3/15.
 */
public class StatementNode extends AST {

    public StatementNode(AST parent) {
        super(parent);
    }

    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitStatementNode(this);
        else return node.visitChildren(this);
    }
}
