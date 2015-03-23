package com.doge.AST;

import com.doge.types.ValueType;


import java.util.ArrayList;

/**
 * Created by michno on 19/3/15.
 */
public class FunctionDclNode extends AST {

    private Variable variable;
    private ArrayList<Variable> parameters = new ArrayList<Variable>();
    private StatementNode functionBody;
    private FunctionReturnNode functionReturn;

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

    public StatementNode getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(StatementNode functionBody) {
        this.functionBody = functionBody;
    }

    public FunctionReturnNode getFunctionReturn() {
        return functionReturn;
    }

    public void setFunctionReturn(FunctionReturnNode functionReturn) {
        this.functionReturn = functionReturn;
    }
}
