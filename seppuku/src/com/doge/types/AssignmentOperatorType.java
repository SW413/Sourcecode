package com.doge.types;

/**
 * Created by michno on 23/3/15.
 */
public enum AssignmentOperatorType {
    BASIC("="),
    ADD("+="),
    SUB("-="),
    MUL("*="),
    DIV("/="),
    INCREMENT("++"),
    DECREMENT("--");

    private String oppType;
    private AssignmentOperatorType(String oppType) {
        this.oppType = oppType;
    }

    @Override
    public String toString(){
        return oppType;
    }

}
