package com.doge.types;

/**
 * Created by michno on 20/3/15.
 */
public class TypeParser {

    public static OperatorType parseOperator(String opp) {
        OperatorType oppType = null;
        switch (opp){
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

            default:
                //TODO make error handler
                System.out.println("Parse error");
        }

        return oppType;
    }

    public static AssignmentOperatorType parseAssignmentOperator(String opp) {
        AssignmentOperatorType oppType = null;
        switch (opp){
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

            default:
                //TODO make error handler
                System.out.println("Parse error");
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
        }
        return null;
    }

    public static ValueType ConstantType(Object constant) {
        if (constant.getClass() == Boolean.class){
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

        return null;
    }
}
