package com.doge.AST;

import com.doge.Visitors.IASTVisitor;
import com.doge.types.OperatorType;
import java.util.ArrayList;

public class FunctionCallNode extends ExpressionNode {

    private ArrayList<ExpressionNode> argumentList;

    public FunctionCallNode(AST parent, ExpressionNode lValue, OperatorType operatorType, ExpressionNode rValue) {
        super(parent, lValue, operatorType, rValue);
    }

    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitFunctionCallNode(this);
        else return node.visitChildren(this);
    }
}
