package com.doge.Visitors;

import com.doge.AST.*;
import com.doge.ErrorHandling.LanguageError;
import com.doge.ErrorHandling.ReDeclarationError;
import com.doge.ErrorHandling.UnDeclaredError;
import com.doge.checking.Symbol;
import com.doge.checking.SymbolTable;
import com.doge.types.ScopeType;

import java.util.ArrayList;

/**
 * Created by Søren on 25-03-2015.
 */
public class SymbolTableFillVisitor extends BaseASTVisitor<Void> {

    private SymbolTable symbolTable;
    private ArrayList<LanguageError> errors;
    public SymbolTableFillVisitor(SymbolTable symbolTable, ArrayList<LanguageError> errors) {
        this.symbolTable = symbolTable;
        this.errors = errors;
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
        for (ConditionalNode ifElse : node.getElseIfs()) {
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
            //TODO linenum
            errors.add(new ReDeclarationError(node.getVariable(), tmpSym, symbolTable.currentScope(), 666));
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
        if (tmpSymbol != null) {
            symbolTable.currentScope().define(tmpSymbol);
        } else {
            //TODO linenum
            errors.add(new UnDeclaredError(tmpVariable, symbolTable.currentScope(), 666));
            symbolTable.currentScope().define(tmpVariable);
        }
        return null;
    }
}
