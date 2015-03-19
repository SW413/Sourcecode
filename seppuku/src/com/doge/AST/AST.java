package com.doge.AST;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.*;

import java.util.ArrayList;

/**
 * Created by michno on 19/3/15.
 */
public class AST implements ParseTree {

    private AST parent;
    private ArrayList<AST> children = new ArrayList<AST>();

    public AST(AST parent) {
        this.parent = parent;
    }

    @Override
    public ParseTree getParent() {
        return this.parent;
    }

    @Override
    public ParseTree getChild(int i) {
        return this.children.get(i);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
        return parseTreeVisitor.visit(this);
    }

    @Override
    public String getText() {
        return null;
    }

    @Override
    public String toStringTree(Parser parser) {
        return null;
    }

    @Override
    public Interval getSourceInterval() {
        return null;
    }

    @Override
    public Object getPayload() {
        return null;
    }

    @Override
    public int getChildCount() {
        return children.size();
    }

    @Override
    public String toStringTree() {
        return null;
    }
}
