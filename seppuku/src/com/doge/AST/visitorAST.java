package com.doge.AST;

import com.doge.types.AssignmentOperatorType;
import com.doge.types.TypeParser;
import com.antlr.*;
import com.doge.AST.*;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;


/**
 * Created by michno on 18/3/15.
 **/
public class visitorAST extends ourLangBaseVisitor<AST> {

    private AST ast;
    private Stack<AST> parentStack = new Stack<AST>();
    public visitorAST(AST ast){
        this.ast = ast;
    }


    /**
     * TopLevel
     */
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

    /**
     * Importing, functiondecls, and statements
     *
     */

    //TODO currently filepath is relative to compiler location... maybe it should be relative to sourcecode location
    @Override
    public AST visitImporting(ourLangParser.ImportingContext ctx) {
        TopNode tmp = (TopNode)parentStack.peek();
        if (tmp.getImports() == null)
            tmp.setImports(new ImportNode(tmp));
        parentStack.push(tmp.getImports());
        ((ImportNode) parentStack.peek()).addFile(ctx.LIBRARY().getText());
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
    public AST visitStatement(ourLangParser.StatementContext ctx) {
        if(parentStack.peek().getClass() == ForLoopNode.class){
            ForLoopNode parent = (ForLoopNode) parentStack.peek();
            if(parent.getBody() == null){
                parent.setBody(new StatementNode(null));
            }
            StatementNode tmp = parent.getBody();

            parentStack.push(tmp);
            visit(ctx.getChild(0));
            parentStack.pop();
            return parent.getBody();
        }
        else if(parentStack.peek().getClass() == WhileLoopNode.class){
            WhileLoopNode parent = (WhileLoopNode) parentStack.peek();
            if(parent.getBody() == null){
                parent.setBody(new StatementNode(null));
            }
            StatementNode tmp = parent.getBody();

            parentStack.push(tmp);
            visitChildren(ctx);
            parentStack.pop();
            return parent.getBody();
        }
        else if (parentStack.peek().getClass() == TopNode.class) {
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
        else if(parentStack.peek().getClass() == ConditionalNode.class ){
            ConditionalNode parent = (ConditionalNode) parentStack.peek();

            if(parent.IsDoneWithIf()){
                if(parent.getElseBody() == null){
                    parent.setElseBody(new StatementNode(parent));
                }
                StatementNode tmp = parent.getElseBody();

                parentStack.push(tmp);
                visit(ctx.getChild(0));
                parentStack.pop();

                parent.setElseBody(tmp);
                return tmp;
        }
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

    /**
     * Related to functions
     *
     */
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

    /**
     * Decls
     *
     */
    @Override
    public DeclarationNode visitPrimitiveDecl(ourLangParser.PrimitiveDeclContext ctx) {
        return new DeclarationNode(
                parentStack.peek(),
                new Variable(TypeParser.parseValueType(ctx.datatype().getText()), ctx.ID().getText()),
                (ExpressionNode) visit(ctx.expression()));

    }

    @Override
    public AST visitComplexDecl(ourLangParser.ComplexDeclContext ctx) {
        return new DeclarationNode(
                parentStack.peek(),
                new Variable(TypeParser.parseValueType(ctx.complexdatatype().getText()), ctx.ID().getText()),
                (ExpressionNode) visit(ctx.expression()));
    }

    @Override
    public AST visitEntranceCoordinate(ourLangParser.EntranceCoordinateContext ctx) {
        return new CollectionCoordinateNode(null,
                (ExpressionNode) visit(ctx.value(0)),
                (ExpressionNode) visit(ctx.value(1)));
    }

    /**
     * Assignment
     *
     */

    @Override
    public AST visitValassignment(ourLangParser.ValassignmentContext ctx) {
        return new AssignmentNode(
                parentStack.peek(),
                new Variable(null, ctx.ID().getText()),
                TypeParser.parseAssignmentOperator(ctx.assignmentOperator().getText()),
                (ExpressionNode) visit(ctx.expression()));
    }

    @Override
    public AST visitEntireCollectionAssignment(ourLangParser.EntireCollectionAssignmentContext ctx) {
        return new AssignmentNode(
                parentStack.peek(),
                new Variable(null, ctx.ID().getText()),
                AssignmentOperatorType.BASIC,
                (ExpressionNode) visit(ctx.expression()));
    }

    @Override
    public AST visitCollectionEntranceAssignment(ourLangParser.CollectionEntranceAssignmentContext ctx) {
        AST tmp = parentStack.peek();
        parentStack.push(null);
        AssignmentNode assignment = new AssignmentNode(
                tmp,
                new Variable(null,
                        ctx.collectionEntrance().ID().getText(),
                        (CollectionCoordinateNode) visit(ctx.collectionEntrance().entranceCoordinate())),
                TypeParser.parseAssignmentOperator(ctx.assignmentOperator().getText()),
                (ExpressionNode) visit(ctx.expression()));
        parentStack.pop();
        return assignment;
    }

    /**
     * Values
     *
     */
    @Override
    public AST visitValID(ourLangParser.ValIDContext ctx) {
        return new VariableExpressionNode(null, new Variable(null, ctx.ID().getText()));
    }

    @Override
    public AST visitValConstant(ourLangParser.ValConstantContext ctx) {
        return new ConstantExpressionNode(null, ctx.constant().getText());
    }

    //This is bad and I should feel bad
    @Override
    public AST visitValList(ourLangParser.ValListContext ctx) {
        MatrixValNode matrix = new MatrixValNode(null);

        //Visit all rows
        for (ourLangParser.ValueListContext valueListContext : ctx.valueList()) {
            VectorValNode row = new VectorValNode(null);
            //Visit all values
            for(ourLangParser.ValueContext valueContext : valueListContext.value()) {
                row.addValue((ExpressionNode) visit(valueContext));
            }
            matrix.addRow(row);
        }

        //Return matrixNode if more than 1 row exists
        if (matrix.getRows().size()>1)
            return matrix;

        //Return vectorNode if only one row exists
        return matrix.getRows().get(0);
    }

    @Override
    public AST visitValFuncCall(ourLangParser.ValFuncCallContext ctx) {

        return visit(ctx.functioncall());
    }

    @Override
    public AST visitCustomFunc(ourLangParser.CustomFuncContext ctx) {
        ArrayList<ExpressionNode> arguments = new ArrayList<ExpressionNode>();

        for(int i = 0; i < ctx.argumentlist().getChildCount(); i++) {
            if(!ctx.argumentlist().getChild(i).getText().equals(",")) {
                arguments.add((ExpressionNode) visit(ctx.argumentlist().getChild(i)));
            }
        }
        return new VariableExpressionNode(parentStack.peek(), new Variable(null, ctx.ID().getText(), arguments));
    }

    @Override
    public AST visitPrintFunc(ourLangParser.PrintFuncContext ctx) {
        if((ctx.argumentlist().getChild(0).getClass() == TerminalNodeImpl.class)){
        VariableExpressionNode tmp = new VariableExpressionNode(parentStack.peek(), new Variable(null, "PRINT", ctx.argumentlist().getText()));
        return tmp;
        }
        ArrayList<ExpressionNode> arguments = new ArrayList<ExpressionNode>();
        for(int i = 0; i < ctx.argumentlist().getChildCount(); i++) {
            if(!ctx.argumentlist().getChild(i).getText().equals(",")) {
                arguments.add((ExpressionNode) visit(ctx.argumentlist().getChild(i)));
            }
        }
        return new VariableExpressionNode(parentStack.peek(), new Variable(null, "PRINT", arguments));
    }


    @Override
    public AST visitValCollectionEntrance(ourLangParser.ValCollectionEntranceContext ctx) {
        return super.visitValCollectionEntrance(ctx);
    }

    @Override
    public AST visitCollectionEntrance(ourLangParser.CollectionEntranceContext ctx) {
        return new VariableExpressionNode(null,
                new Variable(null,
                        ctx.ID().getText(),
                        (CollectionCoordinateNode) visit(ctx.entranceCoordinate()))
        );
    }

    @Override
    public AST visitValBool(ourLangParser.ValBoolContext ctx) {
        return new ConstantExpressionNode(null, ctx.BOOLVAL().getText());
    }

    /**
     * Expressions
     *
     */
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
    public AST visitWhileLoop(ourLangParser.WhileLoopContext ctx) {
        WhileLoopNode whileLoopNode = new WhileLoopNode(parentStack.peek());
        whileLoopNode.setCondNode((ConditionalExpressionNode)visit(ctx.conditionalExpression()));
        parentStack.push(whileLoopNode);
        visitChildren(ctx.whileBlock);
        parentStack.pop();
        return whileLoopNode;
    }

    @Override
    public AST visitForLoop(ourLangParser.ForLoopContext ctx) {
        ForLoopNode forLoopNode = new ForLoopNode(parentStack.peek());

        //Makes sure the intilizations do not appear on the tree as children to the for loop.
        parentStack.push(null);
        if(ctx.assignment() == null && ctx.declaration() != null){
            forLoopNode.setInitialize((DeclarationNode)visit(ctx.declaration()));
        }
        else if(ctx.declaration() == null && ctx.assignment() != null){
            forLoopNode.setInitialize((AssignmentNode)visit(ctx.assignment()));
        }
        //Reestablishes the previous stack, hack is over.
        parentStack.pop();
        forLoopNode.setCondition((ConditionalExpressionNode)visit(ctx.conditionalExpression()));
        forLoopNode.setUpdate((ExpressionNode)visit(ctx.expression()));

        parentStack.push(forLoopNode);
        visitChildren(ctx.forBlock);
        parentStack.pop();

        return forLoopNode;
    }

    /**
     * ControlBlocks
     *
     */
    @Override
    public AST visitControlblock(ourLangParser.ControlblockContext ctx) {
        AST parent = parentStack.peek();

        //Makes sure the intilizations do not appear on the tree as children to the for loop.
        parentStack.push(null);

        ConditionalNode conditionalNode = new ConditionalNode(parent, (ConditionalExpressionNode) visit(ctx.conditionalExpression(0)));
        parentStack.pop();
        //Reestablishes the previous stack, hack is over.

        parentStack.push(conditionalNode);
        for(int i = 0; i < ctx.ifBlock.getChildCount();i++)
        visit(ctx.ifBlock.getChild(i));

        //TODO Kan ændres til følgende kommentar hvis det er :
        /*for(int i = 8; i < ctx.getChildCount();i = i+6){
            if(ctx.getChild(i).getClass() == ourLangParser.ConditionalExpressionContext.class){
            ConditionalNode tmp = new ConditionalNode(parentStack.peek(),(ConditionalExpressionNode) visit(ctx.getChild(i)));
            parentStack.push(tmp);
            visit(ctx.getChild(i + 2));
            parentStack.pop();
            conditionalNode.AddIfElse(tmp);}
        }*/
        //Find the conditionalExpressions to fill in the IFElses.
        if(ctx.elseIfBlock != null) {
            for (int i = 5; i < ctx.getChildCount(); i++) {
                if (ctx.getChild(i).getClass() == ourLangParser.SingleCondExprContext.class) {
                    ConditionalNode tmp = new ConditionalNode(null, (ConditionalExpressionNode) visit(ctx.getChild(i)));
                    parentStack.push(tmp);
                    visit(ctx.getChild(i + 2));
                    parentStack.pop();
                    conditionalNode.AddIfElse(tmp);
                }
            }
        }
        conditionalNode.setDoneWithIf(true);
        if(ctx.elseBlock != null){
        for(int i = 0; i < ctx.elseBlock.getChildCount();i++)
            visit(ctx.elseBlock.getChild(i));
        }
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

}
