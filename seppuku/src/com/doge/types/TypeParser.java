package com.doge.types;

import com.doge.AST.Variable;

/**
 * Created by michno on 20/3/15.
 */
public class TypeParser {

    public static OperatorType parseOperator(String opp) {
        OperatorType oppType = null;
        switch (opp) {
            case "+":
                oppType = OperatorType.ADD;
                break;
            case "-":
                oppType = OperatorType.SUB;
                break;
            case "*":
                oppType = OperatorType.MUL;
                break;
            case "/":
                oppType = OperatorType.DIV;
                break;
            case "%":
                oppType = OperatorType.MOD;
                break;
            case "++":
                oppType = OperatorType.INCREMENT;
                break;
            case "--":
                oppType = OperatorType.DECREMENT;
                break;
            case "==":
                oppType = OperatorType.EQUAL;
                break;
            case "!=":
                oppType = OperatorType.NOTEQUAL;
                break;
            case "<=":
                oppType = OperatorType.LESSOREQUAL;
                break;
            case ">=":
                oppType = OperatorType.BIGGEROREQUAL;
                break;
            case "<":
                oppType = OperatorType.LESSTHAN;
                break;
            case ">":
                oppType = OperatorType.BIGGERTHAN;
                break;
            case "&&":
                oppType = OperatorType.AND;
                break;
            case "||":
                oppType = OperatorType.OR;
                break;
        }
        return oppType;
    }

    public static AssignmentOperatorType parseAssignmentOperator(String opp) {
        AssignmentOperatorType oppType = null;
        switch (opp) {
            case "=":
                oppType = AssignmentOperatorType.BASIC;
                break;
            case "+=":
                oppType = AssignmentOperatorType.ADD;
                break;
            case "-=":
                oppType = AssignmentOperatorType.SUB;
                break;
            case "*=":
                oppType = AssignmentOperatorType.MUL;
                break;
            case "/=":
                oppType = AssignmentOperatorType.DIV;
                break;
            case "++":
                oppType = AssignmentOperatorType.INCREMENT;
                break;
            case "--":
                oppType = AssignmentOperatorType.DECREMENT;
                break;
        }
        return oppType;
    }

    public static ValueType parseValueType(String datatype) {
        switch (datatype) {
            case "void":
                return ValueType.VOID;
            case "int":
                return ValueType.INT;
            case "int16":
                return ValueType.INT16;
            case "int64":
                return ValueType.INT64;
            case "float":
                return ValueType.FLOAT;
            case "float16":
                return ValueType.FLOAT16;
            case "float64":
                return ValueType.FLOAT64;
            case "bool":
                return ValueType.BOOLEAN;
            case "matrix<int>":
                return ValueType.MATRIX_INT;
            case "matrix<int16>":
                return ValueType.MATRIX_INT16;
            case "matrix<int64>":
                return ValueType.MATRIX_INT64;
            case "matrix<float>":
                return ValueType.MATRIX_FLOAT;
            case "matrix<float16>":
                return ValueType.MATRIX_FLOAT16;
            case "matrix<float64>":
                return ValueType.MATRIX_FLOAT64;
            case "matrix<bool>":
                return ValueType.MATRIX_BOOLEAN;
            case "vector<int16>":
                return ValueType.VECTOR_INT16;
            case "vector<int>":
                return ValueType.VECTOR_INT;
            case "vector<int64>":
                return ValueType.VECTOR_INT64;
            case "vector<float16>":
                return ValueType.VECTOR_FLOAT16;
            case "vector<float>":
                return ValueType.VECTOR_FLOAT;
            case "vector<float64>":
                return ValueType.VECTOR_FLOAT64;
            case "vector<bool>":
                return ValueType.VECTOR_BOOLEAN;
        }
        return ValueType.INVALID;
    }

    public static String cTypeFromValueType(ValueType datatype) {
        switch (datatype) {
            case VOID:
                return "void";
            case INT:
            case MATRIX_INT:
            case VECTOR_INT:
                return "int32_t";
            case INT16:
            case MATRIX_INT16:
            case VECTOR_INT16:
                return "int16_t";
            case INT64:
            case MATRIX_INT64:
            case VECTOR_INT64:
                return "int64_t";
            case FLOAT:
            case MATRIX_FLOAT:
            case VECTOR_FLOAT:
                return "float";
            case FLOAT16:
            case MATRIX_FLOAT16:
            case VECTOR_FLOAT16:
                //There exists no such thing as 16-bit real numbers in C...
                return "float";
            case FLOAT64:
            case MATRIX_FLOAT64:
            case VECTOR_FLOAT64:
                return "double";
            case BOOLEAN:
            case MATRIX_BOOLEAN:
            case VECTOR_BOOLEAN:
                return "bool";
        }
        return null;
    }

    public static ValueType ConstantType(Object constant) {
        if (constant.getClass() == null || constant.getClass() == Variable.class) {
            return ValueType.INVALID;
        }

        if (constant.getClass() == Boolean.class) {
            return ValueType.BOOLEAN;
        }

        if (constant.getClass() == String.class && ((String) constant).contains(".")) {
            Double tmp = Double.parseDouble((String) constant);
            if (tmp != null)
                return ValueType.FLOAT;
        } else {
            Long tmp = Long.parseLong((String) constant);
            if (tmp != null)
                return ValueType.INT;
        }

        return ValueType.INVALID;
    }

    public static boolean isComplexValueType(ValueType type) {
        switch (type) {
            case MATRIX_INT16:
            case MATRIX_INT:
            case MATRIX_INT64:
            case MATRIX_FLOAT16:
            case MATRIX_FLOAT:
            case MATRIX_FLOAT64:
            case MATRIX_BOOLEAN:
            case VECTOR_INT16:
            case VECTOR_INT:
            case VECTOR_INT64:
            case VECTOR_FLOAT16:
            case VECTOR_FLOAT:
            case VECTOR_FLOAT64:
            case VECTOR_BOOLEAN:
                return true;
            default:
                return false;
        }
    }
}
