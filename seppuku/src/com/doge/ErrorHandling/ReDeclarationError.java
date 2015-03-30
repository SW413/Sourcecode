package com.doge.ErrorHandling;

import com.doge.AST.Variable;
import com.doge.checking.Scope;
import com.doge.checking.Symbol;
import static com.doge.ErrorHandling.ANSIEscapeCodes.ANSI_RED;
import static com.doge.ErrorHandling.ANSIEscapeCodes.ANSI_RESET;

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
        return super.toString() + "Variable " + ANSI_RED + variableReDecl + ANSI_RESET + " in scope " + scope + " already declared as " + ANSI_RED + symbolExisting + ANSI_RESET + " in scope " + symbolExisting.getScope();
    }
}
