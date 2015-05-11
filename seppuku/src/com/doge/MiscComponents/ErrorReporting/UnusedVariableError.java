package com.doge.MiscComponents.ErrorReporting;

import com.doge.ContextualAnalysis.AST.Variable;
import com.doge.ContextualAnalysis.checking.Scope;

import static com.doge.MiscComponents.ErrorReporting.ANSIEscapeCodes.*;

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
        String type = unDeclaredVariable.isFunction() ? "function " : "variable ";
        String fileName = LanguageError.GetFileNameForError(unDeclaredVariable);
        return  String.format("%1$sWarning[line %3$4d]->%2$s ", ANSI_YELLOW, ANSI_RESET, lineNum) +
                String.format("Unused %4$s %1$s%5$s%3$s in scope %2$s%6$s%3$s%7$s",
                        ANSI_YELLOW, ANSI_BLUE, ANSI_RESET,
                        type, unDeclaredVariable, scope, fileName != "" ? " in importing file " + ANSI_YELLOW + fileName +  ANSI_RESET + "."  : "");
    }
}
