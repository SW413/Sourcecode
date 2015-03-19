package com.doge.AST;

import java.util.ArrayList;

/**
 * Created by michno on 19/3/15.
 */
public class ExpressionNode extends StatementNode {

    private String value;

    public String getValue(){
        return this.value;
    }
    public void setValue(String value){
        this.value = value;
    }

    public ExpressionNode(AST parent) {
        super(parent);
    }
}
