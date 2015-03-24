package com.doge.AST;

import com.doge.types.ValueType;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by michno on 19/3/15.
 */
public class Variable {
    private ValueType datatype;
    private String id;
    private ArrayList<ExpressionNode> arguments;
    private String printArgument;
    private int[] entrance;

    public Variable(ValueType datatype, String id, ArrayList<ExpressionNode> arguments){
        this.datatype = datatype;
        this.id = id;
        this.arguments = arguments;
    }

    public Variable(ValueType datatype, String id, String arguments) {
        this.datatype = datatype;
        this.id = id;
        this.printArgument = arguments;
    }

    public Variable(ValueType datatype, String id, int[] entrance) {
        this.datatype = datatype;
        this.id = id;
        this.entrance = entrance;
    }

    public Variable(ValueType datatype, String id) {
        this.datatype = datatype;
        this.id = id;
    }



    public ValueType getDatatype(){ return this.datatype; }

    public String getId() { return this.id; }

    public ArrayList<ExpressionNode> getArguments() {
        return arguments;
    }

    public int[] getEntrance() {
        return entrance;
    }
}

