package com.doge.AST;

import com.doge.Visitors.IASTVisitor;
import com.doge.types.OperatorType;
/**
 * Created by michno on 19/3/15.
 */
public class ExpressionNode extends StatementNode {

    private Object lValue;
    private OperatorType operatorType;
    private Object rValue;

    public Object getLValue(){
        return this.lValue;
    }
    public OperatorType getOperatorType() { return this.operatorType; }
    public Object getRValue(){
        return this.rValue;
    }

    public ExpressionNode(AST parent, Object lValue, OperatorType operatorType, Object rValue) {
        super(parent);
        this.lValue = lValue;
        this.operatorType = operatorType;
        this.rValue = rValue;
    }

    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitExpressionNode(this);
        else return node.visitChildren(this);
    }
}
