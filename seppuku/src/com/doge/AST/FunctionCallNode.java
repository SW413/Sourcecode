package com.doge.AST;

import com.doge.types.OperatorType;
import java.util.ArrayList;

public class FunctionCallNode extends ExpressionNode {

    private ArrayList<ExpressionNode> argumentList;

    public FunctionCallNode(AST parent, Object lValue, OperatorType operatorType, Object rValue) {
        super(parent, lValue, operatorType, rValue);
    }
}
