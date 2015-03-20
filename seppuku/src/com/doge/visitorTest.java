package com.doge;
import com.doge.types.OperatorType;
import com.doge.types.TypeParser;
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
public class visitorTest extends ourLangBaseVisitor<AST> {

    private AST ast;

    public visitorTest(AST ast){
        this.ast = ast;
    }

    @Override
    public AST visitTopLevel(ourLangParser.TopLevelContext ctx) {



        return super.visitTopLevel(ctx);
    }

    @Override
    public AST visitStatement(ourLangParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public DeclarationNode visitPrimitiveDecl(ourLangParser.PrimitiveDeclContext ctx) {

        Variable variable = new Variable(TypeParser.parseValueType(ctx.datatype().getText()), ctx.ID().getText());
        DeclarationNode node = new DeclarationNode(null, variable, (ExpressionNode) visit(ctx.getChild(3)));

        return node;
    }

    @Override
    public ConstantExpressionNode visitValueExpr(ourLangParser.ValueExprContext ctx) {
        return new ConstantExpressionNode(null, ctx.value().getText());
    }

    @Override
    public ExpressionNode visitAddExpr(ourLangParser.AddExprContext ctx) {
        return new ExpressionNode(null, visit(ctx.expression().get(0)), OperatorType.ADD, visit(ctx.expression().get(1)));
    }

    @Override
    public AST visitMulExpr(ourLangParser.MulExprContext ctx) {
        return super.visitMulExpr(ctx);
    }

    @Override
    public AST visitParenExpr(ourLangParser.ParenExprContext ctx) {
        return super.visitParenExpr(ctx);
    }

    @Override
    public AST visitPostIDExpr(ourLangParser.PostIDExprContext ctx) {
        return super.visitPostIDExpr(ctx);
    }
}
