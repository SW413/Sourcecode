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

import java.util.ArrayList;

/**
 * Created by michno on 25-03-2015.
 */
public class ASTDecoratorVisitor extends BaseASTVisitor<ValueType> {

    private SymbolTable symbolTable;
    private ArrayList<LanguageError> errors;

    public ASTDecoratorVisitor(SymbolTable symbolTable, ArrayList<LanguageError> errors) {
        this.symbolTable = symbolTable;
        this.errors = errors;
    }


}
