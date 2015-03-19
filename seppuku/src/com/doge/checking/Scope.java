package com.doge.checking;

import com.doge.AST.Variable;
import com.doge.types.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Mathias on 18-03-2015.
 */
public class Scope {
    public final int scopeId;
    public ScopeType type;
    public Scope enclosingScope;
    protected Map<String, Symbol> symbolMap = new LinkedHashMap<String, Symbol>();

    public Scope(ScopeType type,final int scopeId, Scope enclosingScope) {
        this.type = type;
        this.scopeId = scopeId;
        this.enclosingScope = enclosingScope;
    }

    /**
     * Define a new variable in the current scope
     * This is the entry point for adding new variables
     */
    public void define(Variable variable) {
        Symbol symbol = new Symbol(variable.getId(), variable.getDatatype());
        define(symbol);
    }
    private void define(Symbol symbol) {
        symbol.setScope(this);
        symbolMap.put(symbol.name, symbol);
    }

    /**
     * Look up the symbol name in this scope and, if not found,
     * progressively search the enclosing scopes.
     * Return null if not found in any applicable scope.
     */
    public Symbol resolve(String name) {
        Symbol symbol = symbolMap.get(name);
        //Look in current scope
        if (symbol != null) return symbol;
        //Look in enclosing scopes recursively
        if (enclosingScope != null) return enclosingScope.resolve(name);
        //Return null if nothing is found
        return null;
    }

}
