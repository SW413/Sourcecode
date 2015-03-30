package com.doge.types;

import com.doge.ErrorHandling.LanguageError;
import com.doge.ErrorHandling.TypeMismatchError;

import java.util.ArrayList;

/**
 * Created by michno on 30/3/15.
 */
public class TypeChecker {

    //Can be modified to support implicit type conversion
    public static ValueType CombineValueTypes(ValueType lValueType, ValueType rValueType, ArrayList<LanguageError> errors, int lineNum){
        if (rValueType == null){
            return lValueType;
        }
        if (lValueType.equals(rValueType)){
            return lValueType;
        } else {
            errors.add(new TypeMismatchError("pik", lValueType, "fisse", rValueType, lineNum));
            return null;
        }
    }
}
