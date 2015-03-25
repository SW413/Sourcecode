package com.doge.Visitors;

import com.doge.AST.AST;
import com.doge.AST.ForLoopNode;
import com.doge.AST.TopNode;

/**
 * Created by Søren on 25-03-2015.
 */
public class SymbolTableFillVisitor extends BaseASTVisitor<AST> {

    private AST tree;
    public SymbolTableFillVisitor(AST tree) {
        this.tree = tree;
    }

    @Override
    public AST VisitTopNode(TopNode node) {
        System.out.println("MORTEN VENT!!!");
        return super.VisitTopNode(node);
    }

    @Override
    public AST VisitForLoopNode(ForLoopNode node) {
        System.out.println("Visitting a ForLoop");
        return super.VisitForLoopNode(node);
    }
}
