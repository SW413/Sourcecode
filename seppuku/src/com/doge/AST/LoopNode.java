package com.doge.AST;

import com.doge.types.LoopType;

/**
 * Created by michno on 19/3/15.
 */
public class LoopNode extends StatementNode{
    private LoopType type;

    //TODO: not even close to taco

    public LoopNode(AST parent, LoopType type) {
        super(parent);
        this.type = type;
    }
}
