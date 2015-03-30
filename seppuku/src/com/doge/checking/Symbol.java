package com.doge.checking;

import com.doge.AST.Variable;
import com.doge.types.ValueType;

/**
 * Created by Mathias on 18-03-2015.
 */
public class Symbol {

    protected Scope scope; // the owning scope
    protected Variable variable;
    protected boolean used;

    public Symbol(Variable variable) {
        this.variable = variable;
        this.used = false;
    }

    public String getName() {
        return variable.getId();
    }

    public ValueType getType() {
        return variable.getDatatype();
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public void setUsed(boolean used) { this.used = used; }

    public Scope getScope() {
        return scope;
    }

    public int scopeId() {
        return scope.scopeId;
    }

    public String toString() {
        if (variable.getDatatype() != null) return '<' + getName() + ":" + getType() + '>';
        return getName();
    }
}
