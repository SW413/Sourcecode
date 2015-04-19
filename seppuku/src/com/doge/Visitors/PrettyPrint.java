package com.doge.Visitors;

import com.doge.AST.*;
import com.doge.types.*;

/**
 * Pretty printing which prints the AST out as the code it was before parsing.
 */
public class PrettyPrint extends BaseASTVisitor<String> {
    private StringBuilder printer;

    public PrettyPrint(StringBuilder printer) {
        this.printer = printer;
    }

    @Override
    public String VisitDeclarationNode(DeclarationNode node){
        Variable var = node.getVariable();

        printer.append(var.getValueType().toString() + " " + var.getId() + " = ");
        visit(node.getExpression());
        printer.append("\n");
        return null;
    }


    @Override
    public String VisitExpressionNode(ExpressionNode node){

        if (node.getLValue() != null && node.getRValue() != null) {
            visit(node.getLValue());
            printer.append(" " + node.getOperatorType().toString() + " ");
            visit(node.getRValue());
        } else if (node.getLValue() != null) {
            visit(node.getLValue());
            if (node.getOperatorType() != null) {
                printer.append(node.getOperatorType().toString());
            }
        }


        if (node.getRValue() != null){
            return visit(node.getLValue()) + " " + node.getOperatorType() + " " + visit(node.getRValue());
        }
        return visit(node.getLValue()) + node.getOperatorType();
    }
    @Override
    public String VisitFunctionDclNode(FunctionDclNode node) {
        Variable var = node.getVariable();

        if (var.isFunction()){
            printer.append(var.getValueType() + " " + var.getId() + " (");
            for (int i = 0; i <node.getParameterCount() - 1; i++) {
                printer.append(var.getValueType() + " " + var.getId());
            }

            printer.append(node.getParameter(node.getParameterCount() - 1).getValueType() + " " + node.getParameter(node.getParameterCount() - 1).getId() + ") {\n");
        }
        super.VisitFunctionDclNode(node);
        printer.append("}\n");
        return null;
    }

    @Override
    public String VisitConstantExpressionNode(ConstantExpressionNode node) {
        printer.append(node.getValue());
        if (node.getRValue() == null){
            printer.append(";");
        }
        return null;
    }

    @Override
    public String VisitVariableExpressionNode(VariableExpressionNode node) {
        if (node.getVariable().isFunction()) {
            //printer.append(node.getVariable());
        }
        //printer.append(node.getVariable().getId());
        return null;
    }
    @Override
    public String VisitConditionalExpressionNode(ConditionalExpressionNode node) {
        printer.append(node.getOperatorType().toString());
        return null; //visit(node.getLValue()) + " " + node.getOperatorType() + " " + visit(node.getRValue());
    }
    
}

/*
Statements
   De her inde er dem der skal printer.append.
   Så når de virker så brude resten følge med, da vi "bobler her inde fra"
 */