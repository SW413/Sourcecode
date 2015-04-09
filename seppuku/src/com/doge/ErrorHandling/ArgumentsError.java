package com.doge.ErrorHandling;

import com.doge.AST.Variable;

import static com.doge.ErrorHandling.ANSIEscapeCodes.ANSI_RESET;
import static com.doge.ErrorHandling.ANSIEscapeCodes.ANSI_YELLOW;

public class ArgumentsError extends LanguageError {
    private Variable function;
    private int needed;
    private int provided;

    public ArgumentsError(Variable function, int needed, int provided, int lineNum) {
        this.function = function;
        this.needed = needed;
        this.provided = provided;
        this.errorType = ErrorType.ERROR;
        this.lineNum = lineNum;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Function call to %1$s%3$s%2$s needs %4$d arguments only %5$d provided",
                ANSI_YELLOW, ANSI_RESET,
                function, needed, provided);
    }
}
