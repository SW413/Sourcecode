package com.doge.types;

import com.doge.AST.Variable;
import com.doge.ErrorHandling.LanguageError;
import com.doge.ErrorHandling.TypeMismatchError;

import java.util.ArrayList;

/**
 * Created by michno on 30/3/15.
 */
public class TypeChecker {

    //Can be modified to support implicit type conversion
    public static ValueType CombineValueTypes(Variable lValue, Variable rValue, ArrayList<LanguageError> errors, int lineNum) {
        if (lValue == null && lValue.getDatatype() == ValueType.INVALID) {
            return ValueType.INVALID;
        } else if (rValue == null) {
            return lValue.getDatatype();
        } else if (lValue.getDatatype() == rValue.getDatatype()) {
            return lValue.getDatatype();
        } else {
            errors.add(new TypeMismatchError(lValue, rValue, lineNum));
            return ValueType.INVALID;
        }
    }
}
