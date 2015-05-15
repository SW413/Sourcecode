package com.doge.ContextualAnalysis.Visitors;

import com.doge.ContextualAnalysis.AST.*;
import com.doge.MiscComponents.ErrorReporting.ComplexDatatypeError;
import com.doge.MiscComponents.ErrorReporting.LanguageError;
import com.doge.MiscComponents.ErrorReporting.ArgumentsError;
import com.doge.MiscComponents.ErrorReporting.TypeMismatchError;
import com.doge.ContextualAnalysis.checking.Symbol;
import com.doge.ContextualAnalysis.checking.SymbolTable;
import com.doge.MiscComponents.Types.OperatorType;
import com.doge.MiscComponents.Types.TypeChecker;
import com.doge.MiscComponents.Types.TypeParser;
import com.doge.MiscComponents.Types.ValueType;
import com.doge.SyntaxAnalysis.Visitors.BaseASTVisitor;

import java.util.ArrayList;

/**
 * Created by michno on 25-03-2015.
 */
public class TypeCheckVisitor extends BaseASTVisitor<Variable> {

    private SymbolTable symbolTable;
    private ArrayList<LanguageError> errors;

    public TypeCheckVisitor(SymbolTable symbolTable, ArrayList<LanguageError> errors) {
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
        if (node.getExpression() != null) {
            TypeChecker.CombineValueTypes(
                    node.getVariable(),
                    visit(node.getExpression()),
                    errors, node.getLineNumber());
        }else{
            TypeChecker.CombineValueTypes(visit(node.getVariable().getDynamicSize()[0]),
                    new Variable(ValueType.INT, ""),
                    errors, node.getLineNumber());
            TypeChecker.CombineValueTypes(visit(node.getVariable().getDynamicSize()[1]),
                    new Variable(ValueType.INT, ""),
                    errors, node.getLineNumber());
            if (TypeChecker.MatrixOrVector(node.getVariable()) == ValueType.MATRIX &&
                    visit(node.getVariable().getDynamicSize()[1]).getId().equals("1")){
                errors.add(new ComplexDatatypeError(node.getVariable(), node.getScope(), node.getLineNumber()));
            }
        }
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
            valueType = ValueType.BOOLEAN;

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

        if (TypeParser.isComplexValueType(valueType) && node.getOperatorType() != null && !OperatorType.isAllowed(node.getOperatorType())){
            System.out.println("\nOperator not allowed at the moment!\n");
            System.exit(1);
        }

        return new Variable(valueType, "Expr:<" + node.toString() + ">");
    }

    @Override
    public Variable VisitVariableExpressionNode(VariableExpressionNode node) {
        if (node.getVariable().isFunction()) {
            CheckFuncArgsMatch(node.getVariable(), node.getLineNumber());
        }
        return node.getVariable();
    }

    @Override
    public Variable VisitFunctionCallNode(FunctionCallNode node) {
        if (node.getVariable().isFunction()) {
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
        if (func.getId().equals("print")){
            for(Object arg : func.getPrintArguments()){
                if (arg != null && arg.getClass().getSuperclass() == ExpressionNode.class || arg.getClass() == ExpressionNode.class)
                    visit((ExpressionNode) arg);
            }
            return null;
        }
        if (isLanguageFunc(func.getId())){
            if (func.getArguments().size() != 1) {
                errors.add(new ArgumentsError(func, 1, func.getArguments().size(), lineNum));
            }else{
                Variable tmp = visit(func.getArgument(0));
                if (!tmp.isComplex()){
                    errors.add(new TypeMismatchError(tmp, new Variable(ValueType.COMPLEX, ""), lineNum));
                }
            }
        }else {
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
