package com.doge.MiscComponents.Types;

/**
 * Created by michno on 20/3/15.
 */
public enum OperatorType {
    ADD("+"),
    SUB("-"),
    MUL("*"),
    DIV("/"),
    MOD("%"),
    MULENTRY("#"),
    INCREMENT("++"),
    DECREMENT("--"),
    INVERS("!"),
    TRANSPOSE("^"),
    EQUAL("=="),
    NOTEQUAL("!="),
    BIGGERTHAN(">"),
    LESSTHAN("<"),
    BIGGEROREQUAL(">="),
    LESSOREQUAL("<="),
    AND("&&"),
    OR("||");

    private String oppType;
    private OperatorType(String oppType) {
        this.oppType = oppType;
    }

    @Override
    public String toString(){
        return oppType;
    }

    public static OperatorType fromString(String text) {
        if (text != null) {
            for (OperatorType opp : OperatorType.values()) {
                if (text.equalsIgnoreCase(opp.oppType)) {
                    return opp;
                }
            }
        }
        return null;
    }

    public static boolean isAllowed(OperatorType opp){
        switch (opp){
            case ADD:case SUB: case MUL: case TRANSPOSE: case MULENTRY:
                return true;
            default:
                return false;
        }
    }
}
