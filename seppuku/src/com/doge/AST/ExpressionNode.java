package com.doge.AST;

import java.util.ArrayList;

/**
 * Created by michno on 19/3/15.
 */
public class ExpressionNode extends StatementNode {

    private ArrayList<ExpressionNode> expressions = new ArrayList<ExpressionNode>();

    //TODO: hvad skal den ellers indeholde

    public ExpressionNode(AST parent) {
        super(parent);
    }
}
