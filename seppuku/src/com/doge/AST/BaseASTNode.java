package com.doge.AST;
import com.doge.Visitors.IASTVisitor;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.misc.Interval;

import java.util.ArrayList;

/**
 * Created by michno on 19/3/15.
 */
public class BaseASTNode {

    private int LineNumber;
    private BaseASTNode parent;
    private ArrayList<BaseASTNode> children = new ArrayList<BaseASTNode>();

    public int getLineNumber() {
        return LineNumber;
    }

    public void setLineNumber(int lineNumber) {
        LineNumber = lineNumber;
    }

    public BaseASTNode(BaseASTNode parent) {
        if (parent != null)
            parent.addChild(this);
        this.parent = parent;
    }

    public void setParent(BaseASTNode parent){
        parent.children.add(this);
        this.parent = parent;
    }

    public BaseASTNode getParent() {
        return this.parent;
    }

    public BaseASTNode getChild(int i) {
         return this.children.get(i);
    }

    public void addChild(BaseASTNode node) {
        this.children.add(node);
    }

    public ArrayList<BaseASTNode> getChildren() { return this.children; }


    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitTopNode((TopNode)this.getChild(0));
        else return node.visitChildren(this);
    }

    public String getText() {
        return null;
    }

    public String toStringTree(Parser parser) {
        return null;
    }

    public Interval getSourceInterval() {
        return null;
    }

    public Object getPayload() {
        return null;
    }

    public int getChildCount() {
        return children.size();
    }

    public String toStringTree() {
        return null;
    }
}
