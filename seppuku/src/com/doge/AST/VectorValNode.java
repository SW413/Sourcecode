package com.doge.AST;

import com.doge.Visitors.IASTVisitor;
import com.doge.types.OperatorType;

import java.util.ArrayList;

/**
 * Created by michno on 24/3/15.
 */
public class VectorValNode extends ExpressionNode {
    private ArrayList<ExpressionNode> values = new ArrayList<ExpressionNode>();

    public VectorValNode(AST parent) {
        super(parent, null, null, null);
    }

    public VectorValNode(AST parent, ArrayList<ExpressionNode> values) {
        super(parent, null, null, null);
        this.values = values;
    }

    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitVectorValNode(this);
        else return node.visitChildren(this);
    }

    public ArrayList<ExpressionNode> getValues() {
        return values;
    }

    public void setValues(ArrayList<ExpressionNode> values) {
        this.values = values;
    }

    public void addValue(ExpressionNode value) {
        this.values.add(value);
    }

    @Override
    public String toString() {
        return values.toString();
    }
}
