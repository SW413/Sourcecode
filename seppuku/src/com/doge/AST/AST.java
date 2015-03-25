package com.doge.AST;
import com.antlr.ourLangVisitor;
import com.doge.Visitors.IASTVisitor;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.*;

import java.util.ArrayList;

/**
 * Created by michno on 19/3/15.
 */
public class AST {

    private AST parent;
    private ArrayList<AST> children = new ArrayList<AST>();

    public AST(AST parent) {
        if (parent != null)
            parent.addChild(this);
        this.parent = parent;
    }

    public void setParent(AST parent){
        parent.children.add(this);
        this.parent = parent;
    }

    public AST getParent() {
        return this.parent;
    }

    public AST getChild(int i) {
         return this.children.get(i);
    }

    public void addChild(AST node) {
        this.children.add(node);
    }

    public ArrayList<AST> getChildren() { return this.children; }


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
