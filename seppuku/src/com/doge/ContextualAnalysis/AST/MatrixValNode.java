package com.doge.ContextualAnalysis.AST;

import com.doge.SyntaxAnalysis.Visitors.IASTVisitor;

import java.util.ArrayList;

/**
 * Created by michno on 24/3/15.
 */
public class MatrixValNode extends ExpressionNode {
    private ArrayList<VectorValNode> rows = new ArrayList<VectorValNode>();

    public MatrixValNode(BaseASTNode parent) {
        super(parent, null, null, null);
    }

    public ArrayList<VectorValNode> getRows() {
        return rows;
    }

    public void setRows(ArrayList<VectorValNode> rows) {
        this.rows = rows;
    }

    public void addRow(VectorValNode row){
        this.rows.add(row);
    }

    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitMatrixValNode(this);
        else return node.visitChildren(this);
    }

    @Override
    public String toString() {
        return rows.toString();
    }
}
