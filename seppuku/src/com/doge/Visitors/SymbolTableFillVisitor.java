package com.doge.Visitors;

import com.doge.AST.*;
import com.doge.ErrorHandling.LanguageError;
import com.doge.ErrorHandling.ArgumentsError;
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
        for (FunctionDclNode FuncDecl : node.getFunctionDeclarations()) {
            symbolTable.currentScope().define(FuncDecl.getVariable(), FuncDecl.getLineNumber());
        }
        //symbolTable.currentScope().define(new Variable(ValueType.VOID, "print", true));
        //Visit all function declarations
        for (FunctionDclNode funcDecl : node.getFunctionDeclarations())
            visit(funcDecl);
        symbolTable.pushScope(ScopeType.LOCAL);
        if (node.getStatements() != null)
            visit(node.getStatements());
        symbolTable.popScope();
        return null;
    }

    @Override
    public Void VisitFunctionDclNode(FunctionDclNode node) {
        symbolTable.pushScope(ScopeType.FUNCDECL);
        Variable func = symbolTable.currentScope().resolve(node.getVariable().getId()).getVariable();
        ArrayList<ExpressionNode> args = new ArrayList<ExpressionNode>();
        for (Variable variable : node.getParameters()) {
            args.add(new VariableExpressionNode(null, variable));
            symbolTable.currentScope().define(variable, node.getLineNumber());
        }
        func.setArguments(args);
        if (node.getFunctionBody() != null)
            visit(node.getFunctionBody());
        if (node.getFunctionReturn() != null) {
            visit(node.getFunctionReturn());
        }
        symbolTable.popScope();
        return null;
    }

    @Override
    public Void VisitFunctionCallNode(FunctionCallNode node) {
        if (node.getVariable().getId() != "print")
            CheckIfUndeclared(node.getVariable(), node);
        else if (node.getVariable().getId() == "print")
            if (node.getVariable().getArguments() != null)
                for(ExpressionNode arg : node.getVariable().getArguments()) {
                    visit(arg);
                }
        return null;
    }

    @Override
    public Void VisitForLoopNode(ForLoopNode node) {
        symbolTable.pushScope(ScopeType.LOOP);
        if (node.getInitialize() != null)
            visit(node.getInitialize());
        if (node.getBody() != null)
            visit(node.getBody());
        symbolTable.popScope();
        return null;
    }

    @Override
    public Void VisitWhileLoopNode(WhileLoopNode node) {
        symbolTable.pushScope(ScopeType.LOOP);
        if (node.getBody() != null)
            visit(node.getBody());
        symbolTable.popScope();
        return null;
    }

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
        if (node.getElseBody() != null) {
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
            symbolTable.currentScope().define(node.getVariable(), node.getLineNumber());
        }
        return super.VisitDeclarationNode(node);
    }

    @Override
    public Void VisitAssignmentNode(AssignmentNode node) {
        CheckIfUndeclared(node.getVariable(), node);
        return node.getExpression() != null ? visit(node.getExpression()) : null;
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
        if (node.getVariable().getId() != "print")
            CheckIfUndeclared(node.getVariable(), node);
        else if (node.getVariable().getId() == "print")
            if (node.getVariable().getArguments() != null)
                for(ExpressionNode arg : node.getVariable().getArguments()) {
                    visit(arg);
                }
        return null;
    }

    @Override
    public Void VisitConstantExpressionNode(ConstantExpressionNode node) {
        //Change value to constant if rows or cols function call... bitch
        if (node.getValue().getClass() == Variable.class){
            Variable tmp = (Variable) node.getValue();
            if (tmp.getArguments() == null || tmp.getArguments().size() != 1){
                errors.add(new ArgumentsError(tmp, 1, 0, node.getLineNumber()));
            }else {
                Variable complexVar = symbolTable.currentScope()
                        .resolve(((VariableExpressionNode) tmp.getArgument(0)).getVariable().getId()).getVariable();
                switch (tmp.getId()) {
                    case "rows":
                        if (complexVar.getSize() != null && complexVar.getSize().length > 0)
                            node.setValue(Integer.toString(complexVar.getSize()[0]));
                        break;
                    case "cols":
                        if (complexVar.getSize() != null && complexVar.getSize().length > 1)
                            node.setValue(Integer.toString(complexVar.getSize()[1]));
                        break;
                }
            }
        }

        node.setValueType(TypeParser.ConstantType(node.getValue()));
        return null;
    }

    public Void CheckIfUndeclared(Variable variable, StatementNode node) {
        Symbol tmpSymbol = symbolTable.currentScope().resolve(variable.getId());
        if (tmpSymbol != null) {
            if (variable.getValueType() == null)
                variable.setValueType(tmpSymbol.getType());
            tmpSymbol.setUsed(true);
            node.setScope(symbolTable.currentScope());
            node.setValueType(tmpSymbol.getType());
            symbolTable.currentScope().define(tmpSymbol);
            if (variable.isFunction()) {
                for (ExpressionNode arg : variable.getArguments()) {
                    visit(arg);
                }
            }
        } else {
            errors.add(new UnDeclaredError(variable, symbolTable.currentScope(), node.getLineNumber()));
            symbolTable.currentScope().define(variable);
        }

        return null;
    }
}
