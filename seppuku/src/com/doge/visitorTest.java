package com.doge;

import com.doge.types.TypeParser;
import com.antlr.*;
import com.doge.AST.*;
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
    public AST visitFunctiondeclaration(ourLangParser.FunctiondeclarationContext ctx) {
        Variable funcVariable = new Variable(TypeParser.parseValueType(ctx.functiondatatype().getText()), ctx.ID().getText());
        FunctionDclNode functionDclNode = new FunctionDclNode(parentStack.peek(), funcVariable);
        parentStack.push(functionDclNode);
        visit(ctx.parameterlist());
        visit(ctx.functionbody());
        parentStack.pop();
        TopNode tmp = (TopNode) parentStack.peek();
        tmp.addFunctionDeclaration(functionDclNode);
        return functionDclNode;
    }

    @Override
    public AST visitParameterlist(ourLangParser.ParameterlistContext ctx) {
        FunctionDclNode tmp = (FunctionDclNode) parentStack.peek();
        for (int i = 0; i < ctx.getChildCount(); i++){
            if (!ctx.getChild(i).getText().equals(",")) {
                tmp.setParameter(new Variable(
                        TypeParser.parseValueType(ctx.getChild(i).getChild(0).getText()),
                        ctx.getChild(i).getChild(1).getText()));
            }
        }
        return super.visitParameterlist(ctx);
    }

    @Override
    public AST visitFunctionbody(ourLangParser.FunctionbodyContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AST visitFunctionreturn(ourLangParser.FunctionreturnContext ctx) {
        FunctionDclNode tmp = (FunctionDclNode) parentStack.peek();
        tmp.setFunctionReturn(new FunctionReturnNode(tmp, (ExpressionNode) visit(ctx.expression())));
        return tmp.getFunctionReturn();
    }

    @Override
    public AST visitStatement(ourLangParser.StatementContext ctx) {
        if (parentStack.peek().getClass() == TopNode.class) {
            TopNode tmp = (TopNode)parentStack.peek();
            if (tmp.getStatements() == null)
                tmp.setStatements(new StatementNode(tmp));
            parentStack.push(tmp.getStatements());
            visitChildren(ctx);
            parentStack.pop();
            return tmp.getStatements();
        } else if(parentStack.peek().getClass() == FunctionDclNode.class) {
            FunctionDclNode tmp = (FunctionDclNode)parentStack.peek();
            if (tmp.getFunctionBody() == null)
                tmp.setFunctionBody(new StatementNode(tmp));
            parentStack.push(tmp.getFunctionBody());
            visitChildren(ctx);
            parentStack.pop();
            return tmp.getFunctionBody();
        }
        else if(parentStack.peek().getClass() == ConditionalNode.class){
            ConditionalNode parent = (ConditionalNode) parentStack.peek();
            if(parent.getBody() == null){
                parent.setBody(new StatementNode(parent));
            }

            StatementNode tmp = parent.getBody();

            parentStack.push(tmp);
            visit(ctx.getChild(0));
            parentStack.pop();

            parent.setBody(tmp);
            return tmp;
        }
        return null;
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

    @Override
    public AST visitControlblock(ourLangParser.ControlblockContext ctx) {
           ConditionalNode conditionalNode = new ConditionalNode(parentStack.peek(),
                                                                (ConditionalExpressionNode) visit(ctx.conditionalExpression(0)));

        parentStack.push(conditionalNode);
        for(int i = 0; i < ctx.ifBlock.getChildCount();i++)
        visit(ctx.ifBlock.getChild(i));
        parentStack.pop();
        return conditionalNode;
    }

    @Override
    public AST visitSingleCondExpr(ourLangParser.SingleCondExprContext ctx) {
        ConditionalExpressionNode tmp =  new ConditionalExpressionNode(
                null,
                visit(ctx.expression(0)),
                TypeParser.parseOperator(ctx.getChild(1).getText()),
                visit(ctx.expression(1)));

        return tmp;
    }

    @Override
    public AST visitBlock(ourLangParser.BlockContext ctx) {
        return super.visitBlock(ctx);
    }

}
