package com.doge.Visitors;

import com.doge.AST.AST;
import com.doge.AST.ForLoopNode;

/**
 * Created by Søren on 25-03-2015.
 */
public class SymbolTableFillVisitor extends BaseASTVisitor<AST> {

    private AST tree;
    public SymbolTableFillVisitor(AST tree) {
        this.tree = tree;
    }

    @Override
    public AST VisitForLoopNode(ForLoopNode node) {
        System.out.println("Visitting a ForLoop");
        return super.VisitForLoopNode(node);
    }
}
