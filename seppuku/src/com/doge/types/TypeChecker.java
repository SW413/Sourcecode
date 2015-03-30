package com.doge.types;

/**
 * Created by michno on 30/3/15.
 */
public class TypeChecker {

    //Can be modified to support implicit type conversion
    public static ValueType CombineValueTypes(ValueType lValueType, ValueType rValueType){
        if (rValueType == null){
            return lValueType;
        }
        if (lValueType.equals(rValueType)){
            return lValueType;
        } else {
            return null;
        }
    }
}
