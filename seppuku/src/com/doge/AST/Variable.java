package com.doge.AST;

import com.doge.types.ValueType;

/**
 * Created by michno on 19/3/15.
 */
public class Variable {
    private ValueType datatype;
    private String id;

    public Variable(ValueType datatype, String id) {
        this.datatype = datatype;
        this.id = id;
    }

    public ValueType getDatatype(){ return this.datatype; }

    public String getId() { return this.id; }
}

