package com.doge.Visitors;

import com.doge.AST.*;
import com.doge.ErrorHandling.LanguageError;
import com.doge.ErrorHandling.ArgumentsError;
import com.doge.checking.Symbol;
import com.doge.checking.SymbolTable;
import com.doge.types.TypeChecker;
import com.doge.types.ValueType;

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

    @Override
    public Variable VisitFunctionDclNode(FunctionDclNode node) {
        super.VisitFunctionDclNode(node);
        if (node.getFunctionBody() != null) {
            if (node.getVariable().getValueType() != ValueType.VOID)
                TypeChecker.CombineValueTypes(
                    new Variable(node.getFunctionReturn().getExpression().getValueType(), "Return statement"),
                    node.getVariable(), errors, node.getLineNumber());
        }
        return null;
    }

    @Override
    public Variable VisitVectorValNode(VectorValNode node) {
        ValueType tmpValueType = ValueType.INVALID;
        for (ExpressionNode val : node.getValues().subList(1, node.getValues().size())) {
            tmpValueType = TypeChecker.CombineValueTypes(visit(node.getValues().get(0)), visit(val), errors, node.getLineNumber());
        }
        node.setValueType(tmpValueType);
        return null;
    }

    @Override
    public Variable VisitDeclarationNode(DeclarationNode node) {
        TypeChecker.CombineValueTypes(
                node.getVariable(),
                visit(node.getExpression()),
                errors, node.getLineNumber());
        return null;
    }

    @Override
    public Variable VisitConditionalExpressionNode(ConditionalExpressionNode node) {
        ValueType valueType = TypeChecker.CombineValueTypes(
                node.getLValue() != null ? visit(node.getLValue()) : null,
                node.getRValue() != null ? visit(node.getRValue()) : null,
                errors,
                node.getLineNumber()
        );
        if (valueType != ValueType.INVALID)
            node.setValueType(ValueType.BOOLEAN);
        else
            node.setValueType(valueType);

        return new Variable(valueType, "LogicExpr:<" + node.toString() + ">");
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

        return new Variable(valueType, "Expr:<" + node.toString() + ">");
    }

    @Override
    public Variable VisitVariableExpressionNode(VariableExpressionNode node) {
        if (node.getVariable().isFunction() && !node.getVariable().getId().equals("print")) {
            CheckFuncArgsMatch(node.getVariable(), node.getLineNumber());
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

    private Void CheckFuncArgsMatch(Variable func, int lineNum) {
        Symbol funcDeclSym = symbolTable.getScope(1).resolve(func.getId());
        if (funcDeclSym != null) {
            Variable funcDecl = funcDeclSym.getVariable();
            if (funcDecl.getArguments().size() != func.getArguments().size()) {
                errors.add(new ArgumentsError(func, funcDecl.getArguments().size(), func.getArguments().size(), lineNum));
            } else {
                int i = 0;
                for (ExpressionNode arg : func.getArguments()) {
                    TypeChecker.CombineValueTypes(visit(funcDecl.getArgument(i++)), visit(arg), errors, lineNum);
                }
            }
        }
        return null;
    }
}
