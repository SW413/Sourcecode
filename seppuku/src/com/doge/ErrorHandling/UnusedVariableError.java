package com.doge.ErrorHandling;

import com.doge.AST.Variable;
import com.doge.checking.Scope;

import static com.doge.ErrorHandling.ANSIEscapeCodes.*;

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
        this.errorType = ErrorType.WARNING;
    }

    @Override
    public String toString() {
        String type = unDeclaredVariable.getIsFunction() ? "function " : "variable ";
        return  String.format("%1$sWarning[line %3$4d]->%2$s ", ANSI_YELLOW, ANSI_RESET, lineNum) +
                String.format("Unused %4$s %1$s%5$s%3$s in scope %2$s%6$s%3$s",
                        ANSI_YELLOW, ANSI_BLUE, ANSI_RESET,
                        type, unDeclaredVariable, scope);
    }
}
