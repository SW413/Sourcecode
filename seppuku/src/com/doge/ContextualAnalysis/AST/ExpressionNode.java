package com.doge.ContextualAnalysis.AST;

import com.doge.ContextualAnalysis.Visitors.IASTVisitor;
import com.doge.MiscComponents.Types.OperatorType;
import com.doge.MiscComponents.Types.ValueType;
/**
 * Created by michno on 19/3/15.
 */
public class ExpressionNode extends StatementNode {

    private ExpressionNode lValue;
    private OperatorType operatorType;
    private ExpressionNode rValue;


    public ExpressionNode getLValue(){
        return this.lValue;
    }
    public OperatorType getOperatorType() { return this.operatorType; }
    public ExpressionNode getRValue(){
        return this.rValue;
    }

    public ExpressionNode(BaseASTNode parent, ExpressionNode lValue, OperatorType operatorType, ExpressionNode rValue) {
        super(parent);
        this.lValue = lValue;
        this.operatorType = operatorType;
        this.rValue = rValue;
    }

    public ExpressionNode(BaseASTNode parent, ExpressionNode lValue, OperatorType operatorType, ExpressionNode rValue, int lineNum) {
        this(parent, lValue, operatorType, rValue);
        this.setLineNumber(lineNum);
    }

    public ValueType getValueType() {
        return valueType;
    }


    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitExpressionNode(this);
        else return node.visitChildren(this);
    }

    @Override
    public String toString() {
        if(operatorType == null && rValue ==  null) {
            // This must be a parenthesis
            return lValue.toString();
        }

        return (lValue != null ? " " + lValue.toString() : "") + " " + operatorType.toString()+ " " + (rValue != null ? rValue.toString() + " " : "") ;
    }
}
