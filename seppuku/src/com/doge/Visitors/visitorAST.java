package com.doge.Visitors;

import com.doge.AST.*;
import com.doge.types.AssignmentOperatorType;
import com.doge.types.TypeParser;
import com.antlr.*;
import com.doge.types.ValueType;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.ArrayList;
import java.util.Stack;


/**
 * Implementation of the visitor pattern that generates an abstract syntax tree,
 * from an ANTLR parse tree.
 *
 * @author michno
 * @since 2015-03-19
 **/
public class visitorAST extends ourLangBaseVisitor<AST> {

    private AST ast;
    //Stack to keep track of parents when building the AST
    private Stack<AST> parentStack = new Stack<AST>();

    //Constructor
    public visitorAST(AST ast){
        this.ast = ast;
    }


    /**
     * Generate a {@link com.doge.AST.TopNode} and link it to the {@link com.doge.AST.AST} tree.
     * Then push said TopNode to the parent stack and visit children.
     * Finally pop the TopNode from the parent stack,
     * and check if the parent stack is balanced.
     * No other nodes will be generated after the children are visited.
     *
     * @param ctx   the context which the visitor visits
     * @return      a {@link com.doge.AST.TopNode}
     */
    @Override
    public AST visitTopLevel(ourLangParser.TopLevelContext ctx) {
        TopNode top/*kek*/ = new TopNode(this.ast);
        parentStack.push(top/*kek*/);
        visitChildren(ctx);
        parentStack.pop();
        if (!parentStack.empty()) {
            System.out.println("MAJOR ERROR! - Unbalanced parent stack!");
        }
        return top/*kek*/;
    }


    /**
     * Set ImportNode on TopNode and add filepaths,
     * to all the files which should be included, given
     * by the sourcecode.
     * Note: only makes a new include node if TopNode
     * does not already have one, otherwise it just uses
     * the already excisting ImportNode
     *
     * @param ctx
     * @return      {@link com.doge.AST.ImportNode} of the {@link com.doge.AST.TopNode}
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
        tmp.getImports().getInputFiles().get(tmp.getImports().getInputFiles().size()-1).setLineNumber(ctx.start.getLine());
        return tmp.getImports();
    }

    /**
     * Generates a {@link com.doge.AST.FunctionDclNode} and links it to the TopNode,
     * using the parent stack. Then utilises the parent stack, and visits the functiondeclaration's children.
     * First the parameter list, then the function body.
     * It also makes the {@link com.doge.AST.Variable} consisting of the functions return type and the function name.
     *
     * @param ctx
     * @return      a {@link com.doge.AST.FunctionDclNode}
     */
    @Override
    public AST visitFunctiondeclaration(ourLangParser.FunctiondeclarationContext ctx) {
        Variable funcVariable = new Variable(TypeParser.parseValueType(ctx.functiondatatype().getText()), ctx.ID().getText(), true);
        FunctionDclNode functionDclNode = new FunctionDclNode(parentStack.peek(), funcVariable);
        parentStack.push(functionDclNode);
        visit(ctx.parameterlist());
        visit(ctx.functionbody());
        parentStack.pop();
        TopNode tmp = (TopNode) parentStack.peek();
        tmp.addFunctionDeclaration(functionDclNode);
        functionDclNode.setLineNumber(ctx.start.getLine());
        return functionDclNode;
    }

    //TODO doc comment...
    @Override
    public AST visitStatement(ourLangParser.StatementContext ctx) {

        //Visit through TopLevel
        if (parentStack.peek().getClass() == TopNode.class) {
            TopNode tmp = (TopNode)parentStack.peek();
            if (tmp.getStatements() == null)
                tmp.setStatements(new StatementNode(tmp));
            parentStack.push(tmp.getStatements());
            visitChildren(ctx);
            parentStack.pop();
            return tmp.getStatements();
        }
        //Visit through FunctionDeclaration
        else if(parentStack.peek().getClass() == FunctionDclNode.class) {
            FunctionDclNode tmp = (FunctionDclNode)parentStack.peek();
            if (tmp.getFunctionBody() == null)
                tmp.setFunctionBody(new StatementNode(tmp));
            parentStack.push(tmp.getFunctionBody());
            visitChildren(ctx);
            parentStack.pop();
            return tmp.getFunctionBody();
        }
        //Visit through ForLoop
        else if(parentStack.peek().getClass() == ForLoopNode.class){
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
        //Visit through WhileLoop
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
        //Visit through ConditionalBlock
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
        //If all else fails
        return null;
    }

    /**
     * Parses the parameters as {@link com.doge.AST.Variable}s and sets the on a {@link com.doge.AST.FunctionDclNode},
     * using the parent stack.
     *
     * @param ctx
     * @return
     */
    @Override
    public AST visitParameterlist(ourLangParser.ParameterlistContext ctx) {
        FunctionDclNode tmp = (FunctionDclNode) parentStack.peek();
        for (int i = 0; i < ctx.getChildCount(); i++){
            //Don't parse the commas separating the parameters
            if (!ctx.getChild(i).getText().equals(",")) {
                tmp.setParameter(new Variable(
                        TypeParser.parseValueType(ctx.getChild(i).getChild(0).getText()),
                        ctx.getChild(i).getChild(1).getText()));
            }
        }
        return super.visitParameterlist(ctx);
    }

    /**
     * Generate {@link com.doge.AST.FunctionReturnNode} and set it on the {@link com.doge.AST.FunctionDclNode}
     * provided through the parent stack
     *
     * @param ctx
     * @return
     */
    @Override
    public AST visitFunctionreturn(ourLangParser.FunctionreturnContext ctx) {
        FunctionDclNode tmp = (FunctionDclNode) parentStack.peek();
        tmp.setFunctionReturn(new FunctionReturnNode(tmp, (ExpressionNode) visit(ctx.expression())));
        tmp.getFunctionReturn().setLineNumber(ctx.start.getLine());
        return tmp.getFunctionReturn();
    }

    /**
     * Generates a {@link com.doge.AST.DeclarationNode} containing a {@link com.doge.AST.Variable} representation
     * of the declared variable, and an {@link com.doge.AST.ExpressionNode} as the value of the variable.
     *
     * @param ctx
     * @return
     */
    @Override
    public DeclarationNode visitPrimitiveDecl(ourLangParser.PrimitiveDeclContext ctx) {
        AST parent = parentStack.peek();
        parentStack.push(null);
        DeclarationNode dcl = new DeclarationNode(
                parent,
                new Variable(TypeParser.parseValueType(ctx.datatype().getText()), ctx.ID().getText()),
                (ExpressionNode) visit(ctx.expression()),
                ctx.start.getLine());
        parentStack.pop();
        return  dcl;
    }

    /**
     * Used for declaration of complex datatypes.
     * @see visitorAST#visitPrimitiveDecl
     *
     * @param ctx
     * @return
     */
    @Override
    public AST visitComplexDecl(ourLangParser.ComplexDeclContext ctx) {
        ExpressionNode expr = (ExpressionNode) visit(ctx.expression());
        Variable var =  new Variable(TypeParser.parseValueType(ctx.complexdatatype().getText()), ctx.ID().getText());
        var.setComplex(true);

        //Set size if matrix decl
        if (expr.getClass() == MatrixValNode.class) {
            int[] tmpSize = {((MatrixValNode) expr).getRows().size(),
                    ((MatrixValNode) expr).getRows().get(0).getValues().size()};
            var.setSize(tmpSize);
        } else if (expr.getClass() == VectorValNode.class) {
            int[] tmpSize = {((VectorValNode) expr).getValues().size(), ((VectorValNode) expr).getValues().size()};
            var.setSize(tmpSize);
        }
        return new DeclarationNode(parentStack.peek(), var, expr, ctx.start.getLine());
    }

    /**
     * Generates a {@link com.doge.AST.CollectionCoordinateNode} with the coordinates to a complex datatype variable.
     * The coordinates are represented as {@link com.doge.AST.ExpressionNode}s.
     *
     * @param ctx
     * @return
     */
    @Override
    public AST visitEntranceCoordinate(ourLangParser.EntranceCoordinateContext ctx) {
        return new CollectionCoordinateNode(null,
                (ExpressionNode) visit(ctx.value(0)),
                (ExpressionNode) visit(ctx.value(1)));
    }

    @Override
    public AST visitStdAssignment(ourLangParser.StdAssignmentContext ctx) {
        AST parent = parentStack.peek();
        parentStack.push(null);
        AssignmentNode assNode = new AssignmentNode(
                parent,
                new Variable(null, ctx.ID().getText()),
                TypeParser.parseAssignmentOperator(ctx.assignmentOperator().getText()),
                (ExpressionNode) visit(ctx.expression()));

        parentStack.pop();
        assNode.setLineNumber(ctx.start.getLine());
        return assNode;
    }

    @Override
    public AST visitPostUnaryAssignment(ourLangParser.PostUnaryAssignmentContext ctx) {
        AST parent = parentStack.peek();
        parentStack.push(null);
        AssignmentNode assNode = new AssignmentNode(
                parent,
                new Variable(null, ctx.ID().getText()),
                TypeParser.parseAssignmentOperator(ctx.postUnaryOperator().getText()),
                null);
        parentStack.pop();
        assNode.setLineNumber(ctx.start.getLine());
        return assNode;
    }

    @Override
    public AST visitEntireCollectionAssignment(ourLangParser.EntireCollectionAssignmentContext ctx) {
        AssignmentNode assNode = new AssignmentNode(
                parentStack.peek(),
                new Variable(null, ctx.ID().getText()),
                AssignmentOperatorType.BASIC,
                (ExpressionNode) visit(ctx.expression()));
        ast.setLineNumber(ctx.start.getLine());
        return assNode;
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
        assignment.setLineNumber(ctx.start.getLine());
        parentStack.pop();
        return assignment;
    }

    /**
     * Values
     *
     */
    @Override
    public AST visitValID(ourLangParser.ValIDContext ctx) {
        VariableExpressionNode varexp = new VariableExpressionNode(null, new Variable(null, ctx.ID().getText()));
        varexp.setLineNumber(ctx.start.getLine());
        return varexp;
    }

    @Override
    public AST visitValConstant(ourLangParser.ValConstantContext ctx) {
        ConstantExpressionNode ConstNode = new ConstantExpressionNode(null, ctx.constant().getText());
        ConstNode.setLineNumber(ctx.start.getLine());

        return ConstNode;
    }

    /**
     * Parses a value list in {@link com.doge.AST.VectorValNode}s,
     * and if there exists more than one "row", it collects the {@link com.doge.AST.VectorValNode}s
     * in a single {@link com.doge.AST.MatrixValNode}.
     *
     * @param ctx
     * @return      Either a {@link com.doge.AST.MatrixValNode} or a {@link com.doge.AST.VectorValNode}
     */
    @Override
    public AST visitValList(ourLangParser.ValListContext ctx) {
        MatrixValNode matrix = new MatrixValNode(null);

        //Visit all rows
        for (ourLangParser.ValueListContext valueListContext : ctx.valueList()) {
            VectorValNode row = new VectorValNode(matrix);
            row.setLineNumber(valueListContext.start.getLine());
            //Visit all values
            for(ourLangParser.ValueContext valueContext : valueListContext.value()) {
                row.addValue((ExpressionNode) visit(valueContext));
            }
            matrix.addRow(row);
        }
        matrix.setLineNumber(ctx.start.getLine());

        //Return matrixNode if more than 1 row exists
        if (matrix.getRows().size()>1)
            return matrix;

        //Return vectorNode if only one row exists
        return matrix.getRows().get(0);
    }

    @Override
    public AST visitCustomFunc(ourLangParser.CustomFuncContext ctx) {
        ArrayList<ExpressionNode> arguments = new ArrayList<ExpressionNode>();

        for(int i = 0; i < ctx.argumentlist().getChildCount(); i++) {
            if(!ctx.argumentlist().getChild(i).getText().equals(",")) {
                arguments.add((ExpressionNode) visit(ctx.argumentlist().getChild(i)));
            }
        }

        if(ctx.ID().getText().equals("rows") || ctx.ID().getText().equals("cols")){
            ConstantExpressionNode rowsOrColsFunc = new ConstantExpressionNode(null, new Variable(ValueType.INT, ctx.ID().getText(), arguments));
            rowsOrColsFunc.setLineNumber(ctx.start.getLine());
            return rowsOrColsFunc;
        }

        VariableExpressionNode Varexp =  new VariableExpressionNode(parentStack.peek(), new Variable(null, ctx.ID().getText(), arguments));
        Varexp.setLineNumber(ctx.start.getLine());
        return Varexp;
    }

    @Override
    public AST visitPrintFunc(ourLangParser.PrintFuncContext ctx) {
        if((ctx.argumentlist().getChild(0).getClass() == TerminalNodeImpl.class)){
        VariableExpressionNode tmp = new VariableExpressionNode(parentStack.peek(), new Variable(null, "print", ctx.argumentlist().getText()));
            tmp.setLineNumber(ctx.start.getLine());
            return tmp;
        }
        ArrayList<ExpressionNode> arguments = new ArrayList<ExpressionNode>();
        for(int i = 0; i < ctx.argumentlist().getChildCount(); i++) {
            if(!ctx.argumentlist().getChild(i).getText().equals(",")) {
                arguments.add((ExpressionNode) visit(ctx.argumentlist().getChild(i)));
            }
        }
        VariableExpressionNode varExp =  new VariableExpressionNode(parentStack.peek(), new Variable(null, "print", arguments));
        varExp.setLineNumber(ctx.start.getLine());
        return varExp;
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
        return new ConstantExpressionNode(null, Boolean.parseBoolean(ctx.BOOLVAL().getText()), ctx.start.getLine());
    }

    /**
     * Expressions
     *
     */
    @Override
    public ExpressionNode visitAddExpr(ourLangParser.AddExprContext ctx) {
        return new ExpressionNode(
                null,
                (ExpressionNode) visit(ctx.expression(0)),
                TypeParser.parseOperator(ctx.getChild(1).getText()),
                (ExpressionNode) visit(ctx.expression(1)),
                ctx.start.getLine());
    }

    @Override
    public ExpressionNode visitMulExpr(ourLangParser.MulExprContext ctx) {
        parentStack.push(null);
        ExpressionNode tmp = new ExpressionNode(
                null,
                (ExpressionNode) visit(ctx.expression(0)),
                TypeParser.parseOperator(ctx.getChild(1).getText()),
                (ExpressionNode) visit(ctx.expression(1)),
                ctx.start.getLine());
        parentStack.pop();
        return tmp;
    }

    @Override
    public ExpressionNode visitParenExpr(ourLangParser.ParenExprContext ctx) {
        return new ExpressionNode(null, (ExpressionNode) visit(ctx.expression()), null, null, ctx.start.getLine());
    }

    @Override
    public ExpressionNode visitPostIDExpr(ourLangParser.PostIDExprContext ctx) {
        return new ExpressionNode(
                null,
                new VariableExpressionNode(null, new Variable(null, ctx.ID().getText())),
                TypeParser.parseOperator(ctx.postUnaryOperator().getText()),
                null,
                ctx.start.getLine());
    }

    @Override
    public AST visitWhileLoop(ourLangParser.WhileLoopContext ctx) {
        WhileLoopNode whileLoopNode = new WhileLoopNode(parentStack.peek());
        whileLoopNode.setCondNode((ConditionalExpressionNode)visit(ctx.conditionalExpression()));
        parentStack.push(whileLoopNode);
        visitChildren(ctx.whileBlock);
        parentStack.pop();
        whileLoopNode.setLineNumber(ctx.start.getLine());
        return whileLoopNode;
    }

    @Override
    public AST visitForLoop(ourLangParser.ForLoopContext ctx) {
        ForLoopNode forLoopNode = new ForLoopNode(parentStack.peek());

        //Makes sure the intilizations do not appear on the tree as children to the for loop.
        parentStack.push(null);
        if(ctx.assignment() == null && ctx.declaration() != null){
            forLoopNode.setInitialize(visit(ctx.declaration()));
        }
        else if(ctx.declaration() == null && ctx.assignment() != null){
            forLoopNode.setInitialize(visit(ctx.assignment()));
        }
        //Reestablishes the previous stack, hack is over.
        parentStack.pop();
        forLoopNode.setCondition((ConditionalExpressionNode)visit(ctx.conditionalExpression()));
        forLoopNode.setUpdate((ExpressionNode)visit(ctx.expression()));

        parentStack.push(forLoopNode);
        visitChildren(ctx.forBlock);
        parentStack.pop();
        forLoopNode.setLineNumber(ctx.start.getLine());

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

        conditionalNode.setLineNumber(ctx.start.getLine());
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
        return new ConditionalExpressionNode(
                null,
                (ExpressionNode) visit(ctx.expression(0)),
                TypeParser.parseOperator(ctx.conditionalOperator().getText()),
                (ExpressionNode) visit(ctx.expression(1)),
                ctx.start.getLine());
    }

    @Override
    public AST visitMultiAndCondExpr(ourLangParser.MultiAndCondExprContext ctx) {
        return new ConditionalExpressionNode(
                null,
                (ExpressionNode) visit(ctx.conditionalExpression(0)),
                TypeParser.parseOperator(ctx.getChild(1).getText()),
                (ExpressionNode) visit(ctx.conditionalExpression(1)),
                ctx.start.getLine());
    }
    @Override
    public AST visitMultiOrCondExpr(ourLangParser.MultiOrCondExprContext ctx) {
        return new ConditionalExpressionNode(
                null,
                (ExpressionNode) visit(ctx.conditionalExpression(0)),
                TypeParser.parseOperator(ctx.getChild(1).getText()),
                (ExpressionNode) visit(ctx.conditionalExpression(1)),
                ctx.start.getLine());
    }
}
