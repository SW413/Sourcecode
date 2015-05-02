package com.doge.ContextualAnalysis.AST;

import com.doge.ContextualAnalysis.Visitors.IASTVisitor;

public class FunctionCallNode extends VariableExpressionNode {

    public FunctionCallNode(BaseASTNode parent, Variable func, int lineNum) {
        super(parent, func);
        this.setLineNumber(lineNum);
    }

    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitFunctionCallNode(this);
        else return node.visitChildren(this);
    }
}
