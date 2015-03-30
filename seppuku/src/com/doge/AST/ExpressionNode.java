package com.doge.AST;

import com.doge.Visitors.IASTVisitor;
import com.doge.types.OperatorType;
import com.doge.types.ValueType;
/**
 * Created by michno on 19/3/15.
 */
public class ExpressionNode extends StatementNode {

    private ExpressionNode lValue;
    private OperatorType operatorType;
    private ExpressionNode rValue;
    private ValueType valueType;

    public ExpressionNode getLValue(){
        return this.lValue;
    }
    public OperatorType getOperatorType() { return this.operatorType; }
    public ExpressionNode getRValue(){
        return this.rValue;
    }

    public ExpressionNode(AST parent, ExpressionNode lValue, OperatorType operatorType, ExpressionNode rValue) {
        super(parent);
        this.lValue = lValue;
        this.operatorType = operatorType;
        this.rValue = rValue;
    }

    public ValueType getValueType() {
        return valueType;
    }

    public void setValueType(ValueType valueType) {
        this.valueType = valueType;
    }

    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitExpressionNode(this);
        else return node.visitChildren(this);
    }

    @Override
    public String toString() {
        return (lValue != null ? " " + lValue.toString() : "") + " " + operatorType.toString()+ " " + (rValue != null ? rValue.toString() + " " : "") ;
    }
}
