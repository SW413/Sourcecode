package com.doge;
import com.doge.types.OperatorType;
import com.doge.types.TypeParser;
import com.antlr.*;
import com.doge.AST.*;
import com.doge.types.ValueType;
import com.sun.xml.internal.bind.v2.TODO;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.RuleNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Stack;


/**
 * Created by michno on 18/3/15.
 **/
public class visitorTest extends ourLangBaseVisitor<AST> {

    private AST ast;
    private Stack<AST> parentStack = new Stack<AST>();
    public visitorTest(AST ast){
        this.ast = ast;
    }

    @Override
    public AST visitTopLevel(ourLangParser.TopLevelContext ctx) {
        TopNode top/*kek*/ = new TopNode(this.ast);
        parentStack.push(top/*kek*/);
        visitChildren(ctx);
        parentStack.pop();
        if (!parentStack.empty()) {
            //TODO Error handle
            System.out.println("Unbalanced parent stack!");
        }
        return top/*kek*/;
    }

    @Override
    public AST visitImporting(ourLangParser.ImportingContext ctx) {
        TopNode tmp = (TopNode)parentStack.peek();
        if (tmp.getImports() == null)
            tmp.setImports(new ImportNode(tmp));
        parentStack.push(tmp.getImports());
        visitChildren(ctx);
        parentStack.pop();
        return tmp.getImports();
    }

    @Override
    //TODO FuncDecl. node!!
    public AST visitFunctiondeclaration(ourLangParser.FunctiondeclarationContext ctx) {
        TopNode tmp = (TopNode)parentStack.peek();
        if (tmp.getFunctionDeclarations() == null)
            tmp.setFunctionDeclarations(new AST(tmp));
        parentStack.push(tmp.getFunctionDeclarations());
        visitChildren(ctx);
        parentStack.pop();
        return tmp.getFunctionDeclarations();
    }

    @Override
    public AST visitStatement(ourLangParser.StatementContext ctx) {
        TopNode tmp = (TopNode)parentStack.peek();
        if (tmp.getStatements() == null)
            tmp.setStatements(new StatementNode(tmp));
        parentStack.push(tmp.getStatements());
        visitChildren(ctx);
        parentStack.pop();
        return tmp.getStatements();
    }

    @Override
    public DeclarationNode visitPrimitiveDecl(ourLangParser.PrimitiveDeclContext ctx) {
        return new DeclarationNode(
                parentStack.peek(),
                new Variable(TypeParser.parseValueType(ctx.datatype().getText()), ctx.ID().getText()),
                (ExpressionNode) visit(ctx.getChild(3)));

    }

    @Override
    public ConstantExpressionNode visitValueExpr(ourLangParser.ValueExprContext ctx) {
        return new ConstantExpressionNode(null, ctx.value().getText());
    }

    @Override
    public ExpressionNode visitAddExpr(ourLangParser.AddExprContext ctx) {
        return new ExpressionNode(
                null,
                visit(ctx.expression(0)),
                TypeParser.parseOperator(ctx.getChild(1).getText()),
                visit(ctx.expression(1)));
    }

    @Override
    public ExpressionNode visitMulExpr(ourLangParser.MulExprContext ctx) {
        return new ExpressionNode(
                null,
                visit(ctx.expression(0)),
                TypeParser.parseOperator(ctx.getChild(1).getText()),
                visit(ctx.expression(1)));
    }

    @Override
    public ExpressionNode visitParenExpr(ourLangParser.ParenExprContext ctx) {
        return new ExpressionNode(null, visit(ctx.expression()), null, null);
    }

    @Override
    public ExpressionNode visitPostIDExpr(ourLangParser.PostIDExprContext ctx) {
        return new ExpressionNode(
                null,
                new Variable(null, ctx.ID().getText()),
                TypeParser.parseOperator(ctx.postUnaryOperator().getText()),
                null);
    }

}
