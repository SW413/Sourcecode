package com.doge.ErrorHandling;

import com.doge.AST.Variable;
import com.doge.checking.Scope;
import com.doge.checking.Symbol;

public class ReDeclarationError extends LanguageError {
    private Variable variableReDecl;
    private Symbol symbolExisting;
    private Scope scope;

    public ReDeclarationError(Variable variableReDecl, Symbol symbolExisting, Scope scope) {
        this.variableReDecl = variableReDecl;
        this.symbolExisting = symbolExisting;
        this.scope = scope;
        this.Error = ErrorType.ReDeclaration; // Dobbelt konfekt både at bruge enum ting og klasse type ??
    }

    @Override
    public String PrettyErrorPrint() {
        return "Variable " + variableReDecl + " in scope " + scope + "\n   already declared as " + symbolExisting; // + " in scope " + "TODO";
    }
}
