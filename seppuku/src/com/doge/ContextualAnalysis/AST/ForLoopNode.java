package com.doge.ContextualAnalysis.AST;

import com.doge.SyntaxAnalysis.Visitors.IASTVisitor;

import javax.swing.plaf.nimbus.State;

/**
 * Created by michno on 19/3/15.
 */
public class ForLoopNode extends StatementNode{

    private StatementNode body;
    private ConditionalExpressionNode condition;
    private BaseASTNode initialize;
    private BaseASTNode update;

    public ForLoopNode(BaseASTNode parent) {
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

    public BaseASTNode getInitialize() {
        return initialize;
    }

    public void setInitialize(BaseASTNode initialize) {
        this.initialize = initialize;
    }

    public BaseASTNode getUpdate() {
        return update;
    }

    public void setUpdate(BaseASTNode update) {
        this.update = update;
    }

    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitForLoopNode(this);
        else return node.visitChildren(this);
    }
}
