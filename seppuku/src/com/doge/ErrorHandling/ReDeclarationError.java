package com.doge.ErrorHandling;

import com.doge.AST.Variable;
import com.doge.checking.Scope;
import com.doge.checking.Symbol;

public class ReDeclarationError extends LanguageError {
    private Variable variableReDecl;
    private Symbol symbolExisting;
    private Scope scope;

    public ReDeclarationError(Variable variableReDecl, Symbol symbolExisting, Scope scope, int lineNum) {
        this.variableReDecl = variableReDecl;
        this.symbolExisting = symbolExisting;
        this.scope = scope;
        this.errorType = ErrorType.ReDeclaration; // Dobbelt konfekt både at bruge enum ting og klasse type ??
        this.lineNum = lineNum;
    }

    @Override
    public String toString() {
        return super.toString() + "Variable " + variableReDecl + " in scope " + scope + "\n\talready declared as " + symbolExisting + " in scope " + symbolExisting.getScope();
    }
}
