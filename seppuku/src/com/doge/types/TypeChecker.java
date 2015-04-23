package com.doge.types;

import com.doge.AST.Variable;
import com.doge.ErrorHandling.LanguageError;
import com.doge.ErrorHandling.TypeMismatchError;

import java.util.ArrayList;

/**
 * Created by michno on 30/3/15.
 */
public class TypeChecker {

    public static ValueType MatrixOrVector(Variable value){
        switch (value.getValueType()){
            case MATRIX_INT16:
            case MATRIX_INT:
            case MATRIX_INT64:
            case MATRIX_FLOAT16:
            case MATRIX_FLOAT:
            case MATRIX_FLOAT64:
            case MATRIX_BOOLEAN:
                return ValueType.MATRIX;
            case VECTOR_INT16:
            case VECTOR_INT:
            case VECTOR_INT64:
            case VECTOR_FLOAT16:
            case VECTOR_FLOAT:
            case VECTOR_FLOAT64:
            case VECTOR_BOOLEAN:
                return ValueType.VECTOR;
            default:
                return ValueType.INVALID;
        }
    }
    //Can be modified to support implicit type conversion
    public static ValueType CombineValueTypes(Variable lValue, Variable rValue, ArrayList<LanguageError> errors, int lineNum) {
        if (lValue == null) {
            return ValueType.INVALID;
        } else if (rValue == null) {
            return lValue.getValueType();
        } else {
            ValueType combined = compatibleTypes(lValue.getValueType(), rValue.getValueType());
            if (combined != ValueType.INVALID) {
                return combined;
            } else {
                errors.add(new TypeMismatchError(lValue, rValue, lineNum));
                return ValueType.INVALID;
            }
        }
    }

    private static ValueType compatibleTypes(ValueType typeA, ValueType typeB) {
        if (typeA == null || typeB == null )
            return ValueType.INVALID;
        switch (typeA) {
            case VOID:
                switch (typeB){
                    case VOID:
                        return ValueType.VOID;
                    default:
                        return ValueType.INVALID;
                }
            case BOOLEAN:
                switch (typeB) {
                    case BOOLEAN:
                        return ValueType.BOOLEAN;
                    default:
                        return ValueType.INVALID;
                }
            case INT16:
                switch (typeB) {
                    case INT16:
                        return ValueType.INT16;
                    default:
                        return ValueType.INVALID;
                }
            case INT:
                switch (typeB) {
                    case INT16:
                    case INT:
                        return ValueType.INT;
                    default:
                        return ValueType.INVALID;
                }
            case INT64:
                switch (typeB) {
                    case INT16:
                    case INT:
                    case INT64:
                        return ValueType.INT64;
                    default:
                        return ValueType.INVALID;
                }
            case FLOAT16:
                switch (typeB) {
                    case FLOAT16:
                        return ValueType.FLOAT16;
                    default:
                        return ValueType.INVALID;
                }
            case FLOAT:
                switch (typeB) {
                    case FLOAT16:
                    case FLOAT:
                        return ValueType.FLOAT;
                    default:
                        return ValueType.INVALID;
                }
            case FLOAT64:
                switch (typeB) {
                    case FLOAT16:
                    case FLOAT:
                    case FLOAT64:
                        return ValueType.FLOAT64;
                    default:
                        return ValueType.INVALID;
                }
            case MATRIX_INT16:
                switch (typeB) {
                    case MATRIX_INT16:
                        return ValueType.MATRIX_INT16;
                    default:
                        return ValueType.INVALID;
                }
            case MATRIX_INT:
                switch (typeB) {
                    case MATRIX_INT16: case MATRIX_INT:
                        return ValueType.MATRIX_INT;
                    default:
                        return ValueType.INVALID;
                }
            case MATRIX_INT64:
                switch (typeB) {
                    case MATRIX_INT16: case MATRIX_INT: case MATRIX_INT64:
                        return ValueType.MATRIX_INT64;
                    default:
                        return ValueType.INVALID;
                }
            case MATRIX_FLOAT16:
                switch (typeB) {
                    case MATRIX_FLOAT16:
                        return ValueType.MATRIX_FLOAT16;
                    default:
                        return ValueType.INVALID;
                }
            case MATRIX_FLOAT:
                switch (typeB) {
                    case MATRIX_FLOAT16: case MATRIX_FLOAT:
                        return ValueType.MATRIX_FLOAT;
                    default:
                        return ValueType.INVALID;
                }
            case MATRIX_FLOAT64:
                switch (typeB) {
                    case MATRIX_FLOAT16: case MATRIX_FLOAT: case MATRIX_FLOAT64:
                        return ValueType.MATRIX_FLOAT64;
                    default:
                        return ValueType.INVALID;
                }
            case MATRIX_BOOLEAN:
                switch (typeB) {
                    case MATRIX_BOOLEAN:
                        return ValueType.MATRIX_BOOLEAN;
                    default:
                        return ValueType.INVALID;
                }
            case VECTOR_INT16:
                switch (typeB) {
                    case VECTOR_INT16:
                        return ValueType.VECTOR_INT16;
                    default:
                        return ValueType.INVALID;
                }
            case VECTOR_INT:
                switch (typeB) {
                    case VECTOR_INT16: case VECTOR_INT:
                        return ValueType.VECTOR_INT;
                    default:
                        return ValueType.INVALID;
                }
            case VECTOR_INT64:
                switch (typeB) {
                    case VECTOR_INT16: case VECTOR_INT: case VECTOR_INT64:
                        return ValueType.VECTOR_INT64;
                    default:
                        return ValueType.INVALID;
                }
            case VECTOR_FLOAT16:
                switch (typeB) {
                    case VECTOR_FLOAT16:
                        return ValueType.VECTOR_FLOAT16;
                    default:
                        return ValueType.INVALID;
                }
            case VECTOR_FLOAT:
                switch (typeB) {
                    case VECTOR_FLOAT16: case VECTOR_FLOAT:
                        return ValueType.VECTOR_FLOAT;
                    default:
                        return ValueType.INVALID;
                }
            case VECTOR_FLOAT64:
                switch (typeB) {
                    case VECTOR_FLOAT16: case VECTOR_FLOAT:case VECTOR_FLOAT64:
                        return ValueType.VECTOR_FLOAT64;
                    default:
                        return ValueType.INVALID;
                }
            case VECTOR_BOOLEAN:
                switch (typeB) {
                    case VECTOR_BOOLEAN:
                        return ValueType.VECTOR_BOOLEAN;
                    default:
                        return ValueType.INVALID;
                }
            case INVALID:
                return ValueType.INVALID;
        }
        return ValueType.INVALID;
    }
}
