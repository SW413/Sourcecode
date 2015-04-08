package com.doge.ErrorHandling;

import com.doge.AST.Variable;

import static com.doge.ErrorHandling.ANSIEscapeCodes.ANSI_RESET;
import static com.doge.ErrorHandling.ANSIEscapeCodes.ANSI_YELLOW;

public class MissingArgumentError extends LanguageError {
    private Variable function;

    public MissingArgumentError(Variable function, int lineNum) {
        this.function = function;
        this.errorType = ErrorType.ReDeclaration;
        this.lineNum = lineNum;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Argument(s) missing in function call to %1$s%3$s%2$s",
                ANSI_YELLOW, ANSI_RESET,
                function);
    }
}
