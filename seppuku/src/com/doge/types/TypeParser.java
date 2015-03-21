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
            default:
                //TODO make error handler
                System.out.println("Parse error");
        }

        return oppType;
    }

    public static ValueType parseValueType(String datatype) {
        switch (datatype) {
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
        }
        return null;
    }
}
