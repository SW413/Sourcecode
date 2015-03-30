package com.doge.ErrorHandling;

import com.doge.AST.Variable;
import com.doge.checking.Scope;

/**
 * Created by TroelsBeck on 30-03-2015.
 */
public class UnusedVariableError extends LanguageError {
    private Variable unDeclaredVariable;
    private Scope scope;

    public UnusedVariableError(Variable unDeclaredVariable, Scope scope, int lineNum) {
        this.unDeclaredVariable = unDeclaredVariable;
        this.scope = scope;
        this.lineNum = lineNum;
    }

    @Override
    public String toString() {
        String type = unDeclaredVariable.getIsFunction() ? "function " : "variable ";
        return super.toString() + "Unused " + type + unDeclaredVariable + " in scope " + scope;
    }
}
