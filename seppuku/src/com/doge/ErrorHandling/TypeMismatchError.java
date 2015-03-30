package com.doge.ErrorHandling;

import com.doge.AST.Variable;
import com.doge.checking.Scope;
import com.doge.checking.Symbol;
import com.doge.types.ValueType;

import static com.doge.ErrorHandling.ANSIEscapeCodes.ANSI_RED;
import static com.doge.ErrorHandling.ANSIEscapeCodes.ANSI_RESET;

public class TypeMismatchError extends LanguageError {
    private Variable valueA, valueB;

    public TypeMismatchError(Variable valueA, Variable valueB, int lineNum) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.lineNum = lineNum;
    }

    @Override
    public String toString() {
        return super.toString() + "Type mismatch between " + ANSI_RED + valueA + ANSI_RESET + " and "+ ANSI_RED + valueB + ANSI_RESET;
    }
}
