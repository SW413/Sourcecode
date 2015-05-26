package com.doge.MiscComponents.Types;

/**
 * Created by Mathias on 18-03-2015.
 */
public enum ValueType {
    VOID("void"),
    BOOLEAN("bool"),
    INT16("int16"),
    INT("int"),
    INT64("int64"),
    FLOAT16("float16"),
    FLOAT("float"),
    FLOAT64("float64"),
    MATRIX_INT16("matrix<int16>"),
    MATRIX_INT("matrix<int>"),
    MATRIX_INT64("matrix<int64>"),
    MATRIX_FLOAT16("matrix<float16>"),
    MATRIX_FLOAT("matrix<float>"),
    MATRIX_FLOAT64("matrix<float64>"),
    MATRIX_BOOLEAN("matrix<bool>"),
    VECTOR_INT16("vector<int16>"),
    VECTOR_INT("vector<int>"),
    VECTOR_INT64("vector<int64>"),
    VECTOR_FLOAT16("vector<float16>"),
    VECTOR_FLOAT("vector<float>"),
    VECTOR_FLOAT64("vector<float64>"),
    VECTOR_BOOLEAN("vector<bool>"),
    INVALID("invalid"),
    MATRIX("matrix"),
    VECTOR("vector"),
    COMPLEX("matrix or vector");

    private String valType;
    private ValueType(String valType) {
        this.valType = valType;
    }

    @Override
    public String toString(){
        return valType;
    }

    public static ValueType fromString(String text) {
        if (text != null) {
            for (ValueType val : ValueType.values()) {
                if (text.equalsIgnoreCase(val.valType)) {
                    return val;
                }
            }
        }
        return ValueType.INVALID;
    }
}