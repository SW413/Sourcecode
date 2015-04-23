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
    private ArrayList<Object> printArguments;
    private CollectionCoordinateNode entrance;
    private int[] size;
    private ExpressionNode[] dynamicSize;
    private boolean isFunction;
    private boolean isComplex;
    //private int funcDeclScope;

    public Variable(ValueType valueType, String id, ArrayList<ExpressionNode> arguments){
        this.valueType = valueType;
        this.id = id;
        this.arguments = arguments;
        this.isFunction = true;
    }

    public Variable(ValueType valueType, String id, ArrayList<Object> printArguments, boolean shit) {
        this.valueType = valueType;
        this.id = id;
        this.printArguments = printArguments;
        this.isFunction = shit;
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

    public ArrayList<Object> getPrintArguments() {
        return printArguments;
    }

    public int[] getSize() {
        return size;
    }
    public ExpressionNode[] getDynamicSize() {return dynamicSize;}

    public void setSize(int[] size) {
        this.size = size;
    }
    public void setSize(ExpressionNode[] size) {
        this.dynamicSize = size;
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

