package com.doge.AST;

import com.doge.Visitors.IASTVisitor;
import com.doge.checking.Scope;

/**
 * Created by michno on 19/3/15.
 */
public class StatementNode extends AST {
    private Scope scope;

    public StatementNode(AST parent) {
        super(parent);
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitStatementNode(this);
        else return node.visitChildren(this);
    }
}
