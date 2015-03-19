package com.doge.checking;

import java.util.ArrayList;
import java.util.Stack;
import com.doge.types.*;

/**
 * Created by Mathias on 18-03-2015.
 */
public class SymbolTable {

    protected Stack<Scope> scopeStack;
    protected ArrayList<Scope> allScopes;
    protected int scopeId;

    public SymbolTable() {
        init();
    }

    protected void init() {
        scopeStack = new Stack<Scope>();
        allScopes = new ArrayList<Scope>();
        scopeId = 0;

        Scope globals = new Scope(ScopeType.GLOBAL, nextScopeId(), null);
        scopeStack.push(globals);
        allScopes.add(globals);
    }

    public Scope pushScope(ScopeType type) {
        Scope enclosingScope = scopeStack.peek();
        Scope scope = new Scope(type, nextScopeId(), enclosingScope);
        scopeStack.push(scope);
        allScopes.add(scope);
        return scope;
    }

    public void popScope() {
        scopeStack.pop();
    }

    public Scope currentScope() {
        if (scopeStack.size() > 0) {
            return scopeStack.peek();
        }
        System.err.println("Unbalanced scope stack.");
        return allScopes.get(0);
    }

    public Scope getScope(int scopeId) {
        for (Scope scope : scopeStack) {
            if (scope.scopeId == scopeId) return scope;
        }
        return null;
    }

    private int nextScopeId() {
        scopeId++;
        return scopeId;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Scope scope : scopeStack.subList(0, scopeStack.size() - 1)) {
            sb.append(scope.toString());
        }
        return sb.toString();
    }
}