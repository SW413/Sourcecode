package com.doge.AST;

import com.doge.Visitors.IASTVisitor;

import java.util.ArrayList;

/**
 * Created by michno on 19/3/15.
 */
public class ControlBlockNode extends StatementNode {
    private ConditionalNode ifNode;
    private ArrayList<ConditionalNode> elseIfNodes = new ArrayList<ConditionalNode>();
    private ConditionalNode elseNode;

    public ControlBlockNode(AST parent, ConditionalNode ifNode) {
        super(parent);
        this.ifNode = ifNode;
    }

    public void addElseIf(ConditionalNode elseIfNode) {
        this.elseIfNodes.add(elseIfNode);
    }

    public void setElse(ConditionalNode elseNode) {
        this.elseNode = elseNode;
    }

    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitControlBlockNode(this);
        else return node.visitChildren(this);
    }
}
