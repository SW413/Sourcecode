package com.doge.AST;

import com.doge.types.ValueType;


import java.util.ArrayList;

/**
 * Created by michno on 19/3/15.
 */
public class FunctionDclNode extends AST {

    private Variable variable;
    private ArrayList<Variable> parameters = new ArrayList<Variable>();
    private ArrayList<StatementNode> functionBody = new ArrayList<StatementNode>();

    public FunctionDclNode(AST parent, Variable variable) {
        super(parent);
        this.variable = variable;
    }

    public Variable getVariable(){
        return this.variable;
    }

    public void setParameter(Variable variable){
        this.parameters.add(variable);
    }

    public Variable getParameter(int i){
        return this.parameters.get(i);
    }

    public int getParameterCount(){
        return this.parameters.size();
    }
}
