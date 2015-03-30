package com.doge.ErrorHandling;

import com.doge.AST.Variable;
import com.doge.checking.Scope;
import com.doge.checking.Symbol;
import com.doge.types.ValueType;

public class TypeMismatchError extends LanguageError {
    private String valueA, valueB;
    private ValueType valueTypeA, valueTypeB;

    public TypeMismatchError(String valueA, ValueType valueTypeA, String valueB, ValueType valueTypeB, int lineNum) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.valueTypeA = valueTypeA;
        this.valueTypeB = valueTypeB;
        this.lineNum = lineNum;

    }

    @Override
    public String toString() {
        return super.toString() + "Type mismatch between <" + valueA + ":" + valueTypeA + "> and <" + valueB + ":" + valueTypeB + ">";
    }
}
