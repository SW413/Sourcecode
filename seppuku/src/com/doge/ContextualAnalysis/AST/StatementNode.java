package com.doge.ContextualAnalysis.AST;

import com.doge.ContextualAnalysis.Visitors.IASTVisitor;
import com.doge.ContextualAnalysis.checking.Scope;
import com.doge.MiscComponents.Types.ValueType;

/**
 * Created by michno on 19/3/15.
 */
public class StatementNode extends BaseASTNode {
    private Scope scope;
    protected ValueType valueType;

    public StatementNode(BaseASTNode parent) {
        super(parent);
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public void setValueType(ValueType valueType) {
        this.valueType = valueType;
    }


    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitStatementNode(this);
        else return node.visitChildren(this);
    }
}
