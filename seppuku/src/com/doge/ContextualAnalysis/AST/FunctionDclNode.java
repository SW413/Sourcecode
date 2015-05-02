package com.doge.ContextualAnalysis.AST;

import com.doge.ContextualAnalysis.Visitors.IASTVisitor;
import com.doge.MiscComponents.Types.ValueType;


import java.util.ArrayList;

/**
 * Created by michno on 19/3/15.
 */
public class FunctionDclNode extends BaseASTNode {

    private Variable variable;
    private ArrayList<Variable> parameters = new ArrayList<Variable>();
    private StatementNode functionBody;
    private FunctionReturnNode functionReturn;
    private ValueType valueType;

    public FunctionDclNode(BaseASTNode parent, Variable variable) {
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

    public ArrayList<Variable> getParameters() {
        return parameters;
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

    public ValueType getValueType() {
        return valueType;
    }

    public void setValueType(ValueType valueType) {
        this.valueType = valueType;
    }

    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitFunctionDclNode(this);
        else return node.visitChildren(this);
    }
}
