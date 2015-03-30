package com.doge.Visitors;

import com.doge.AST.*;
import com.doge.ErrorHandling.LanguageError;
import com.doge.ErrorHandling.ReDeclarationError;
import com.doge.ErrorHandling.UnDeclaredError;
import com.doge.checking.Symbol;
import com.doge.checking.SymbolTable;
import com.doge.types.ScopeType;
import com.doge.types.TypeChecker;
import com.doge.types.TypeParser;
import com.doge.types.ValueType;

import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by michno on 25-03-2015.
 */
public class ASTTypeCheckVisitor extends BaseASTVisitor<ValueType> {

    private SymbolTable symbolTable;
    private ArrayList<LanguageError> errors;

    public ASTTypeCheckVisitor(SymbolTable symbolTable, ArrayList<LanguageError> errors) {
        this.symbolTable = symbolTable;
        this.errors = errors;
    }

    @Override
    public ValueType VisitExpressionNode(ExpressionNode node) {
        ValueType valueType;
        valueType = TypeChecker.CombineValueTypes(
                node.getLValue() != null ? visit(node.getLValue()) : null,
                node.getRValue() != null ? visit(node.getRValue()) : null,
                errors,
                node.getLineNumber()
        );
        node.setValueType(valueType);
        return valueType;
    }

    @Override
    public ValueType VisitVariableExpressionNode(VariableExpressionNode node) {
        return node.getValueType();
    }

    @Override
    public ValueType VisitConstantExpressionNode(ConstantExpressionNode node) {
        return node.getValueType();
    }
}
