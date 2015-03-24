package com.doge.AST;

import java.util.ArrayList;

/**
 * Created by michno on 24/3/15.
 */
public class MatrixValNode extends ExpressionNode {
    private ArrayList<VectorValNode> rows = new ArrayList<VectorValNode>();

    public MatrixValNode(AST parent) {
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
}
