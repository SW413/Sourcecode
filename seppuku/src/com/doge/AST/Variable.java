package com.doge.AST;

import com.doge.types.TypeParser;
import com.doge.types.ValueType;

import java.util.ArrayList;

/**
 * Created by michno on 19/3/15.
 */
public class Variable {
    private ValueType valueType;
    private String id;
    private ArrayList<ExpressionNode> arguments;
    private String printArgument;
    private CollectionCoordinateNode entrance;
    private int[] size;
    private boolean isFunction;
    private boolean isComplex;
    //private int funcDeclScope;

    public Variable(ValueType valueType, String id, ArrayList<ExpressionNode> arguments){
        this.valueType = valueType;
        this.id = id;
        this.arguments = arguments;
        this.isFunction = true;
    }

    public Variable(ValueType valueType, String id, String arguments) {
        this.valueType = valueType;
        this.id = id;
        this.printArgument = arguments;
        this.isFunction = true;
    }

    public Variable(ValueType valueType, String id, CollectionCoordinateNode entrance) {
        this.valueType = valueType;
        this.id = id;
        this.entrance = entrance;
        this.isFunction = false;
        this.isComplex = true;
    }

    public Variable(ValueType valueType, String id) {
        this.valueType = valueType;
        this.id = id;
        this.isFunction = false;
    }

    public Variable(ValueType valueType, String id, boolean isFunction) {
        this.valueType = valueType;
        this.id = id;
        this.isFunction = true;
    }

    public boolean isFunction() {return this.isFunction; }

    public boolean isComplex() {return this.isComplex; }

    public void setComplex(boolean isComplex) {
        this.isComplex = isComplex;
    }

    public ValueType getValueType(){ return this.valueType; }

    public void setValueType(ValueType valueType) {
        this.valueType = valueType;
    }

    public String getId() { return this.id; }

    public ArrayList<ExpressionNode> getArguments() {
        return arguments;
    }
    public ExpressionNode getArgument(int i) {
        return arguments.get(i);
    }

    public void setArguments(ArrayList<ExpressionNode> arguments) {
        this.arguments = arguments;
    }

    public CollectionCoordinateNode getEntrance() {
        return entrance;
    }

    public String getPrintArgument() {
        return printArgument;
    }

    public int[] getSize() {
        return size;
    }

    public void setSize(int[] size) {
        this.size = size;
    }

    @Override
    public String toString() {
        if (this.getValueType() != null) return getId() + ":" + getValueType();
        return this.getId();
    }

    public String toCcode(){
        return String.format("%s %s", TypeParser.cTypeFromValueType(getValueType()), getId());
    }
}

