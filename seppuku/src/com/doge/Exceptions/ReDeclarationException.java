package com.doge.Exceptions;

import com.doge.AST.Variable;
import com.doge.checking.Scope;
import com.doge.checking.Symbol;

/**
 * Created by michno on 26/3/15.
 */
public class ReDeclarationException extends Exception {
    private Variable variableReDecl;
    private Symbol symbolExisting;
    private Scope scope;

    public ReDeclarationException(Variable variableReDecl, Symbol symbolExisting, Scope scope) {
        this.variableReDecl = variableReDecl;
        this.symbolExisting = symbolExisting;
        this.scope = scope;
    }
}
