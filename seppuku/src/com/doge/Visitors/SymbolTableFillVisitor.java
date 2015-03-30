package com.doge.Visitors;

import com.doge.AST.*;
import com.doge.ErrorHandling.LanguageError;
import com.doge.ErrorHandling.ReDeclarationError;
import com.doge.ErrorHandling.UnDeclaredError;
import com.doge.checking.Symbol;
import com.doge.checking.SymbolTable;
import com.doge.types.ScopeType;
import com.doge.types.TypeParser;

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
        //Add all function declarations to the symbol table in global scope
        for (FunctionDclNode FuncDecl : node.getFunctionDeclarations())
            symbolTable.currentScope().define(FuncDecl.getVariable());
        //Visit all function declarations
        for (FunctionDclNode FuncDecl : node.getFunctionDeclarations())
            visit(FuncDecl);
        symbolTable.pushScope(ScopeType.LOCAL);
        if (node.getStatements() != null)
            visit(node.getStatements());
        symbolTable.popScope();
        return null;
    }

    @Override
    public Void VisitFunctionDclNode(FunctionDclNode node) {
        symbolTable.pushScope(ScopeType.FUNCDECL);
        for (Variable variable : node.getParameters()) {
            symbolTable.currentScope().define(variable);
        }
        if (node.getFunctionBody() != null)
            visit(node.getFunctionBody());
        if (node.getFunctionReturn() != null)
            visit(node.getFunctionReturn());
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
            errors.add(new ReDeclarationError(node.getVariable(), tmpSym, symbolTable.currentScope(), node.getLineNumber()));
        } else {
            node.setScope(symbolTable.currentScope());
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
            if (tmpVariable.getDatatype() == null)
                tmpVariable.setDatatype(tmpSymbol.getType());
            tmpSymbol.setUsed(true);
            node.setScope(symbolTable.currentScope());
            node.setValueType(tmpSymbol.getType());
            symbolTable.currentScope().define(tmpSymbol);
            if (tmpVariable.getIsFunction()){
                for(ExpressionNode arg : tmpVariable.getArguments()){
                    visit(arg);
                }
            }
        } else {
            errors.add(new UnDeclaredError(tmpVariable, symbolTable.currentScope(), node.getLineNumber()));
            symbolTable.currentScope().define(tmpVariable);
        }
        return null;
    }

    @Override
    public Void VisitConstantExpressionNode(ConstantExpressionNode node) {
        node.setValueType(TypeParser.ConstantType(node.getValue()));
        return null;
    }
}
