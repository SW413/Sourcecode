package com.doge.types;

/**
 * Created by michno on 20/3/15.
 */
public class TypeParser {

    public static OperatorType parseOperator(char opp) {
        OperatorType oppType = null;
        switch (opp){
            case '+':
                oppType = OperatorType.ADD;
                break;
            case '-':
                oppType = OperatorType.SUB;
                break;
            case '*':
                oppType = OperatorType.MUL;
                break;
            case '/':
                oppType = OperatorType.DIV;
                break;
            case '%':
                oppType = OperatorType.MOD;
                break;
            default:
                //TODO make error handler
                System.out.println("Parse error");
        }

        return oppType;
    }

    public static ValueType parseValueType(String datatype) {
        if (datatype.equals("int")) {
            return ValueType.INT;
        } else if (datatype.equals("int16")) {
            return ValueType.INT16;
        } else if (datatype.equals("int64")) {
            return ValueType.INT64;
        } else if (datatype.equals("float")) {
            return ValueType.FLOAT;
        } else if (datatype.equals("float16")) {
            return ValueType.FLOAT16;
        } else if (datatype.equals("float64")) {
            return ValueType.FLOAT64;
        } else if (datatype.equals("bool")) {
            return ValueType.BOOLEAN;
        }
        return null;
    }
}
