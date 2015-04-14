package com.doge.AST;

import com.doge.Visitors.IASTVisitor;

/**
 * Created by michno on 24/3/15.
 */
public class CollectionCoordinateNode extends AST {
    private ExpressionNode[] coordinates = new ExpressionNode[2];

    public CollectionCoordinateNode(AST parent, ExpressionNode coordinate1, ExpressionNode coordinate2) {
        super(null);
        this.coordinates[0] = coordinate1;
        this.coordinates[1] = coordinate2;
    }

    public ExpressionNode[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ExpressionNode[] coordinates) {
        this.coordinates = coordinates;
    }

    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitCollectionCoordinateNode(this);
        else return node.visitChildren(this);
    }
}
