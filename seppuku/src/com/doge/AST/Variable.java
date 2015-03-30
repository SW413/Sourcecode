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
    private CollectionCoordinateNode entrance;
    private boolean isFunction;

    public Variable(ValueType datatype, String id, ArrayList<ExpressionNode> arguments){
        this.datatype = datatype;
        this.id = id;
        this.arguments = arguments;
        this.isFunction = true;
    }

    public Variable(ValueType datatype, String id, String arguments) {
        this.datatype = datatype;
        this.id = id;
        this.printArgument = arguments;
        this.isFunction = true;
    }

    public Variable(ValueType datatype, String id, CollectionCoordinateNode entrance) {
        this.datatype = datatype;
        this.id = id;
        this.entrance = entrance;
        this.isFunction = false;
    }

    public Variable(ValueType datatype, String id) {
        this.datatype = datatype;
        this.id = id;
        this.isFunction = false;
    }

    public Variable(ValueType datatype, String id, boolean isFunction) {
        this.datatype = datatype;
        this.id = id;
        this.isFunction = isFunction;
    }

    public boolean getIsFunction() {return this.isFunction; }

    public ValueType getDatatype(){ return this.datatype; }

    public void setDatatype(ValueType datatype) {
        this.datatype = datatype;
    }

    public String getId() { return this.id; }

    public ArrayList<ExpressionNode> getArguments() {
        return arguments;
    }

    public CollectionCoordinateNode getEntrance() {
        return entrance;
    }

    public String getPrintArgument() {
        return printArgument;
    }

    @Override
    public String toString() {
        if (this.getDatatype() != null) return '<' + getId() + ":" + getDatatype() + '>';
        return this.getId();
    }
}

