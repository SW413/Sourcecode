package com.doge.checking;

import com.doge.ErrorHandling.LanguageError;
import com.doge.ErrorHandling.UnusedVariableError;
import com.doge.types.ScopeType;

import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;



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

    // Gets all unused variables and returns them as Errors
    public ArrayList<LanguageError> getUnusedVariables(){
        ArrayList<LanguageError> errors = new ArrayList<>();

        // Iterate through all scopes (each have a symbolmap)
        for (int i = 0; i < allScopes.size(); i++) {
            // Iterate through each entry of the symboltable
            for (Map.Entry<String, Symbol> entry : allScopes.get(i).symbolMap.entrySet()) {
                // Get the symbol as a value
                Symbol tempSymbol = entry.getValue();
                // If the symbol is NOT used then add an error to the list.
                //TODO: Add line numbers.
                if(!tempSymbol.used)
                    errors.add(new UnusedVariableError(tempSymbol.variable, allScopes.get(i), 666));
            }
        }

        return errors;
    }
}