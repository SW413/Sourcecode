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
public class ASTTypeCheckVisitor extends BaseASTVisitor<Variable> {

    private SymbolTable symbolTable;
    private ArrayList<LanguageError> errors;

    public ASTTypeCheckVisitor(SymbolTable symbolTable, ArrayList<LanguageError> errors) {
        this.symbolTable = symbolTable;
        this.errors = errors;
    }

    //TODO Complex datatype type checking
    //TODO Conditional expression type checking
    //TODO Function args matching declaration

    @Override
    public Variable VisitFunctionDclNode(FunctionDclNode node) {
        super.VisitFunctionDclNode(node);
        if (node.getFunctionBody() != null){
            TypeChecker.CombineValueTypes(
                    new Variable(node.getFunctionReturn().getExpression().getValueType(), "Return statement"),
                    node.getVariable(), errors, node.getLineNumber());
        }
        return null;
    }

    @Override
    public Variable VisitExpressionNode(ExpressionNode node) {
        ValueType valueType = TypeChecker.CombineValueTypes(
                node.getLValue() != null ? visit(node.getLValue()) : null,
                node.getRValue() != null ? visit(node.getRValue()) : null,
                errors,
                node.getLineNumber()
        );
        node.setValueType(valueType);

        return new Variable(valueType, "Expression->" + node.toString());
    }

    @Override
    public Variable VisitVariableExpressionNode(VariableExpressionNode node) {
        //TODO check if declared functions parameters match...
        if (node.getVariable().getIsFunction()){
            for (ExpressionNode arg : node.getVariable().getArguments()){
                visit(arg);
            }
        }
        return node.getVariable();
    }

    @Override
    public Variable VisitConstantExpressionNode(ConstantExpressionNode node) {
        return new Variable(
                node.getValueType(),
                node.getValue().toString()
                );
    }
}
