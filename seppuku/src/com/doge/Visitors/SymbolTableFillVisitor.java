package com.doge.Visitors;

import com.doge.AST.*;
import com.doge.Exceptions.ReDeclarationException;
import com.doge.checking.Symbol;
import com.doge.checking.SymbolTable;
import com.doge.types.ScopeType;

/**
 * Created by Søren on 25-03-2015.
 */
public class SymbolTableFillVisitor extends BaseASTVisitor<Void> {

    private SymbolTable symbolTable;
    public SymbolTableFillVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    @Override
    public Void VisitTopNode(TopNode node) {
        for (FunctionDclNode FuncDecl : node.getFunctionDeclarations())
            visit(FuncDecl);
        symbolTable.pushScope(ScopeType.LOCAL);
        visit(node.getStatements());
        symbolTable.popScope();
        return null;
    }

    @Override
    public Void VisitFunctionDclNode(FunctionDclNode node) {
        symbolTable.currentScope().define(node.getVariable());
        symbolTable.pushScope(ScopeType.FUNCDECL);
        for (Variable variable : node.getParameters()) {
            symbolTable.currentScope().define(variable);
        }
        if (node.getFunctionBody() != null)
            visit(node.getFunctionBody());
        symbolTable.popScope();
        return null;
    }

    @Override
    public Void VisitForLoopNode(ForLoopNode node) {
        symbolTable.pushScope(ScopeType.LOOP);
        if (node.getInitialize() != null)
            visit(node.getInitialize());
        if(node.getBody() != null)
            visit(node.getBody());
        symbolTable.popScope();
        return null;
    }

    @Override
    public Void VisitWhileLoopNode(WhileLoopNode node) {
        symbolTable.pushScope(ScopeType.LOOP);
        if(node.getBody() != null)
            visit(node.getBody());
        symbolTable.popScope();
        return null;
    }

    //TODO scope pr. if, else if, og else, right??
    @Override
    public Void VisitConditionalNode(ConditionalNode node) {
        visit(node.getConditionalExpression());
        symbolTable.pushScope(ScopeType.CONDITIONAL);
        visit(node.getBody());
        symbolTable.popScope();
        for (ConditionalNode ifElse : node.getIfElses()) {
            visit(ifElse.getConditionalExpression());
            symbolTable.pushScope(ScopeType.CONDITIONAL);
            visit(ifElse.getBody());
            symbolTable.popScope();
        }
        if(node.getElseBody() != null) {
            symbolTable.pushScope(ScopeType.CONDITIONAL);
            visit(node.getElseBody());
            symbolTable.popScope();
        }
        return null;
    }

    @Override
    public Void VisitConditionalExpressionNode(ConditionalExpressionNode node) {
        if (node.getLValue() != null)
            visit(node.getLValue());
        if (node.getRValue() != null)
            visit(node.getRValue());
        return null;
    }

    @Override
    public Void VisitDeclarationNode(DeclarationNode node) {
        Symbol tmpSym = symbolTable.currentScope().resolve(node.getVariable().getId());
        if (tmpSym != null) {
            System.out.println("Variable " + node.getVariable() + " in scope " + symbolTable.currentScope() +
                    "\n   already declared as " + tmpSym + " in scope " + tmpSym.getScope());
        } else {
            symbolTable.currentScope().define(node.getVariable());
            visit(node.getExpression());
        }
        return null;
    }

    @Override
    public Void VisitExpressionNode(ExpressionNode node) {
        if (node.getLValue() != null)
            visit(node.getLValue());
        if (node.getRValue() != null)
            visit(node.getRValue());
        return null;
    }

    @Override
    public Void VisitVariableExpressionNode(VariableExpressionNode node) {
        Variable tmpVariable = node.getVariable();
        Symbol tmpSymbol = symbolTable.currentScope().resolve(tmpVariable.getId());
        if (tmpSymbol != null)
            symbolTable.currentScope().define(tmpSymbol);
        else
            symbolTable.currentScope().define(tmpVariable);
        return null;
    }
}
