package com.doge;
import com.antlr.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.io.IOException;
import java.util.List;
import java.util.LinkedList;


/**
 * Created by michno on 18/3/15.
 **/
public class visitorTest extends ourLangBaseVisitor<Void> {

    @Override public Void visitPrimitiveDecl(ourLangParser.PrimitiveDeclContext ctx) {

        //Datatype
        System.out.println(ctx.datatype().children.get(0));
        //val
        //System.out.println(ctx.valassignment().assignmentOperator().getText());

        return visitChildren(ctx);
    }

    @Override public Void visitInteger(ourLangParser.IntegerContext ctx) {
        //System.out.println(ctx.INT());
        return null;
    }

    @Override public Void visitFloatingpoint(ourLangParser.FloatingpointContext ctx) {
        System.out.println(ctx.FLOAT());
        return null;
    }

    @Override public Void visitBoolean(ourLangParser.BooleanContext ctx) {
        System.out.println(ctx.BOOL());
        return null;
    }

    @Override public Void visitValassignment(ourLangParser.ValassignmentContext ctx) {
        System.out.println(ctx.ID());
        return null;
    }
}
