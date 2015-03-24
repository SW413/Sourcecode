package com.doge.AST;

/**
 * Created by michno on 24/3/15.
 */
public class CollectionCoordinateNode extends AST {
    private ExpressionNode[] coordinates = new ExpressionNode[2];

    public CollectionCoordinateNode(AST parent, ExpressionNode coordinate1, ExpressionNode coordinate2) {
        super(parent);
        this.coordinates[0] = coordinate1;
        this.coordinates[1] = coordinate2;
    }
}
