package com.doge.AST;

import com.doge.Visitors.IASTVisitor;
import com.doge.types.OperatorType;
import java.util.ArrayList;

public class FunctionCallNode extends VariableExpressionNode {

    public FunctionCallNode(AST parent, Variable func, int lineNum) {
        super(parent, func);
        this.setLineNumber(lineNum);
    }

    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitFunctionCallNode(this);
        else return node.visitChildren(this);
    }
}
