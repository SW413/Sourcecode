package com.doge.types;

/**
 * Created by Mathias on 18-03-2015.
 */
public enum ScopeType {
    GLOBAL("Global"),
    LOCAL("Local"),
    LOOP("Loop"),
    CONDITIONAL("Conditional"),
    FUNCDECL("Function declaration");

    private String scope;
    private ScopeType(String scope){
        this.scope = scope;
    }

    @Override
    public String toString() {
        return scope;
    }
}