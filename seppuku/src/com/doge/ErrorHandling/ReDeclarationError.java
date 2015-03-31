package com.doge.ErrorHandling;

import com.doge.AST.Variable;
import com.doge.checking.Scope;
import com.doge.checking.Symbol;

import static com.doge.ErrorHandling.ANSIEscapeCodes.*;

public class ReDeclarationError extends LanguageError {
    private Variable variableReDecl;
    private Symbol symbolExisting;
    private Scope scope;

    public ReDeclarationError(Variable variableReDecl, Symbol symbolExisting, Scope scope, int lineNum) {
        this.variableReDecl = variableReDecl;
        this.symbolExisting = symbolExisting;
        this.scope = scope;
        this.errorType = ErrorType.ReDeclaration;
        this.lineNum = lineNum;
    }

    @Override
    public String toString() {
        return super.toString() + "Variable " + ANSI_RED + variableReDecl + ANSI_RESET + " in scope " + ANSI_BLUE + scope + ANSI_RESET + " already declared as " + ANSI_RED + symbolExisting + ANSI_RESET + " in scope " + ANSI_BLUE + symbolExisting.getScope() + ANSI_RESET;
    }
}
