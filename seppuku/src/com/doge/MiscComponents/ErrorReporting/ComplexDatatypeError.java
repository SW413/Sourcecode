package com.doge.MiscComponents.ErrorReporting;

import com.doge.ContextualAnalysis.AST.Variable;
import com.doge.ContextualAnalysis.checking.Scope;

import static com.doge.MiscComponents.ErrorReporting.ANSIEscapeCodes.*;

/**
 * Created by TroelsBeck on 30-03-2015.
 */
public class ComplexDatatypeError extends LanguageError {
    private Variable complex;
    private Scope scope;

    public ComplexDatatypeError(Variable complex, Scope scope, int lineNum) {
        this.complex = complex;
        this.scope = scope;
        this.lineNum = lineNum;
        this.errorType = ErrorType.WARNING;
    }

    @Override
    public String toString() {
        return  String.format("%1$sWarning[line %3$4d]->%2$s ", ANSI_YELLOW, ANSI_RESET, lineNum) +
                String.format("Matrix %1$s%4$s%3$s in scope %2$s%5$s%3$s only has 1 column, could be vector.",
                        ANSI_YELLOW, ANSI_BLUE, ANSI_RESET,
                        complex, scope);
    }
}
