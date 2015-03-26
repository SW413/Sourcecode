package com.doge.AST;

import com.doge.Visitors.IASTVisitor;
import com.doge.types.LoopType;

/**
 * Created by michno on 19/3/15.
 */
public class ForLoopNode extends StatementNode{

    private StatementNode body;
    private ConditionalExpressionNode condition;
    private AST initialize;
    private ExpressionNode update;

    public ForLoopNode(AST parent) {
        super(parent);
    }

    public StatementNode getBody() {
        return body;
    }

    public void setBody(StatementNode body) {
        this.body = body;
    }

    public ConditionalExpressionNode getCondition() {
        return condition;
    }

    public void setCondition(ConditionalExpressionNode condition) {
        this.condition = condition;
    }

    public AST getInitialize() {
        return initialize;
    }

    public void setInitialize(AST initialize) {
        this.initialize = initialize;
    }

    public ExpressionNode getUpdate() {
        return update;
    }

    public void setUpdate(ExpressionNode update) {
        this.update = update;
    }

    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitForLoopNode(this);
        else return node.visitChildren(this);
    }
}
