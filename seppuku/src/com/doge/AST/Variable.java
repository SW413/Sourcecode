package com.doge.AST;

import com.doge.types.ValueType;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by michno on 19/3/15.
 */
public class Variable {
    private ValueType datatype;
    private String id;
    private ArrayList<String> arguments;

    public Variable(ValueType datatype, String id, String arguments) {
        this.datatype = datatype;
        this.id = id;
        //TODO måske argumenter som variables?
        this.arguments = new ArrayList<String>(Arrays.asList(arguments.split(",")));
    }

    public Variable(ValueType datatype, String id) {
        this.datatype = datatype;
        this.id = id;
    }

    public ValueType getDatatype(){ return this.datatype; }

    public String getId() { return this.id; }
}

