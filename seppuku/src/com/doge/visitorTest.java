package com.doge;
import com.antlr.*;
import com.doge.AST.*;
import com.doge.types.ValueType;
import com.sun.xml.internal.bind.v2.TODO;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.io.IOException;
import java.util.List;
import java.util.LinkedList;


/**
 * Created by michno on 18/3/15.
 **/
public class visitorTest extends ourLangBaseVisitor<Void> {

    private AST ast;

    public visitorTest(AST ast){
        this.ast = ast;
    }

    @Override public Void visitPrimitiveDecl(ourLangParser.PrimitiveDeclContext ctx) {

        //Datatype
        System.out.println(ctx.children.get(0).getChild(0).toString());
        ValueType valueType = ValueType.valueOf(ctx.children.get(0).getChild(0).toString().toUpperCase());

        Variable variable = new Variable(valueType, ctx.ID().getText());
        ExpressionNode expressionNode = new ExpressionNode(null);
        // TODO Ændre hvordan den får sat expression. Den skal ikke bare tage teksten, den skal lave træet af expression, så den skal altså visit dens expression barn, som kan være value osv osv.
        expressionNode.setValue(ctx.expression().getText());
        DeclarationNode node = new DeclarationNode(ast, variable, expressionNode);
        expressionNode.setParent(node);
        node.setParent(ast);


        //val
        //System.out.println(ctx.valassignment().assignmentOperator().getText());

        return visitChildren(ctx);
    }

    @Override public Void visitInteger(ourLangParser.IntegerContext ctx) {
        //System.out.println(ctx.INT());
        return null;
    }

    @Override public Void visitFloatingpoint(ourLangParser.FloatingpointContext ctx) {
        //System.out.println(ctx.FLOAT());
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
