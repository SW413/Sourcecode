package com.doge.MiscComponents.ErrorReporting;

import com.doge.ContextualAnalysis.AST.Variable;

import static com.doge.MiscComponents.ErrorReporting.ANSIEscapeCodes.ANSI_RED;
import static com.doge.MiscComponents.ErrorReporting.ANSIEscapeCodes.ANSI_RESET;

public class TypeMismatchError extends LanguageError {
    private Variable valueA, valueB;

    public TypeMismatchError(Variable valueA, Variable valueB, int lineNum) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.lineNum = lineNum;
        this.errorType = ErrorType.ERROR;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format("Type mismatch between %1$s%3$s%2$s and %1$s%4$s%2$s", ANSI_RED, ANSI_RESET, valueA, valueB);
    }
}
