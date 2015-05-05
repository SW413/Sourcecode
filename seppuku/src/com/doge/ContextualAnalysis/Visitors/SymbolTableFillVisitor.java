package com.doge.ContextualAnalysis.Visitors;

import com.doge.ContextualAnalysis.AST.*;
import com.doge.MiscComponents.ErrorReporting.LanguageError;
import com.doge.MiscComponents.ErrorReporting.ReDeclarationError;
import com.doge.MiscComponents.ErrorReporting.UnDeclaredError;
import com.doge.ContextualAnalysis.checking.Symbol;
import com.doge.ContextualAnalysis.checking.SymbolTable;
import com.doge.MiscComponents.Types.ScopeType;
import com.doge.MiscComponents.Types.TypeChecker;
import com.doge.MiscComponents.Types.TypeParser;
import com.doge.MiscComponents.Types.ValueType;

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
            Variable tmp = variable;
            if (TypeParser.isComplexValueType(variable.getValueType()))
                tmp.setComplex(true);
            args.add(new VariableExpressionNode(null, tmp));

            symbolTable.currentScope().define(tmp, node.getLineNumber());
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
        if (node.getVariable().getId() == "print") {
            if (node.getVariable().getPrintArguments() != null)
                for (Object arg : node.getVariable().getPrintArguments()) {
                    if (arg != null && arg.getClass().getSuperclass() == ExpressionNode.class || arg.getClass() == ExpressionNode.class)
                        visit((ExpressionNode) arg);
                }
        } else if (node.getVariable().getId().equals("matrixToFile")) {
            if (node.getVariable().getPrintArguments() != null && node.getVariable().getPrintArguments().size() == 2) {
                if (node.getVariable().getPrintArguments().get(0).getClass() == VariableExpressionNode.class) {
                    visit((ExpressionNode) node.getVariable().getPrintArguments().get(0));
                } else {
                    System.out.println("Panic: in matrixToFile!");
                }

                if (node.getVariable().getPrintArguments().get(1).getClass() != String.class) {
                    System.out.println("Panic: in matrixToFile! 2nd argument is not a string");
                }
            } else {
                System.out.println("Panic: in matrixToFile! Error in arguments");
            }
        } else {
            // Default
            checkIfUndeclared(node.getVariable(), node);
        }
        return null;
    }

    @Override
    public Void VisitForLoopNode(ForLoopNode node) {
        symbolTable.pushScope(ScopeType.LOOP);
        if (node.getInitialize() != null)
            visit(node.getInitialize());
        if (node.getCondition() != null)
            visit(node.getCondition());
        if (node.getUpdate() != null)
            visit(node.getUpdate());
        if (node.getBody() != null)
            visit(node.getBody());
        symbolTable.popScope();
        return null;
    }

    @Override
    public Void VisitWhileLoopNode(WhileLoopNode node) {
        symbolTable.pushScope(ScopeType.LOOP);
        visit(node.getCondNode());
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
        if (node.getVariable().isComplex() && node.getVariable().getDynamicSize() != null){
            visit(node.getVariable().getDynamicSize()[0]);
            visit(node.getVariable().getDynamicSize()[1]);
        }
        return super.VisitDeclarationNode(node);
    }

    @Override
    public Void VisitAssignmentNode(AssignmentNode node) {
        checkIfUndeclared(node.getVariable(), node);
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
        checkIfUndeclared(node.getVariable(), node);
        return null;
    }

    @Override
    public Void VisitConstantExpressionNode(ConstantExpressionNode node) {
        node.setValueType(TypeParser.ConstantType(node.getValue()));
        return null;
    }

    private Void checkIfUndeclared(Variable variable, StatementNode node) {
        if (!isLanguageFunc(variable.getId())) {
            Symbol tmpSymbol = symbolTable.currentScope().resolve(variable.getId());
            if (tmpSymbol == null) {
                errors.add(new UnDeclaredError(variable, symbolTable.currentScope(), node.getLineNumber()));
                symbolTable.currentScope().define(variable);
                return null;
            } else {
                if (variable.getValueType() == null)
                    variable.setValueType(tmpSymbol.getType());
                tmpSymbol.setUsed(true);
                variable.setComplex(tmpSymbol.getVariable().isComplex());
                node.setScope(symbolTable.currentScope());
                if (variable.getEntrance() != null){
                    node.setValueType(TypeChecker.ComplexToSimple(variable.getValueType()));
                } else {
                    node.setValueType(tmpSymbol.getType());
                }
                symbolTable.currentScope().define(tmpSymbol);
            }
        }
        if (variable.isFunction()) {
            for (ExpressionNode arg : variable.getArguments()) {
                visit(arg);
            }
        }else{
            if(variable.getId().equals("rows") || variable.getId().equals("cols"))
                node.setValueType(ValueType.INT);
        }
        return null;
    }

    private boolean isLanguageFunc(String id){
        switch (id){
            case "rows":case "cols":
                return true;
            default:
                return false;
        }
    }
}
