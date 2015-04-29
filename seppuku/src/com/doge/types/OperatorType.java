package com.doge.types;

/**
 * Created by michno on 20/3/15.
 */
public enum OperatorType {
    ADD("+"),
    SUB("-"),
    MUL("*"),
    DIV("/"),
    MOD("%"),
    MULINDEX("#"),
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
}
