package com.doge.Visitors;

import com.doge.AST.*;
import com.doge.types.*;

/**
 * Pretty printing which prints the AST out as the code it was before parsing.
 */
public class PrettyPrint extends BaseASTVisitor<Void> {

    @Override
    public Void VisitDeclarationNode(DeclarationNode node) {
        Variable var = node.getVariable();

        System.out.print(String.format("%s %s = ", var.getDatatype(), var.getId()));
        //System.out.print(TypeParser.parseStringFromValue(var.getDatatype()) + " " + var.getId() + " = ");

        visit(node.getExpression());
        System.out.print("");
        return null;
    }

    @Override
    public Void VisitFunctionDclNode(FunctionDclNode node) {
        Variable var = node.getVariable();
        if (var.getIsFunction()) {
            System.out.print(String.format("%s %s (", var.getDatatype(), var.getId()));
            //System.out.print(TypeParser.parseStringFromValue(var.getDatatype()) + " " + var.getId() + "(");
            for (int i = 0; i < node.getParameterCount() - 1; i++) {
                System.out.print(TypeParser.parseStringFromValue(node.getParameter(i).getDatatype()) + " " + node.getParameter(i).getId() + ",");
            }
            System.out.print(TypeParser.parseStringFromValue(node.getParameter(node.getParameterCount() - 1).getDatatype()) +
                    " " + node.getParameter(node.getParameterCount() - 1).getId() + ") { \n");
        }
        super.VisitFunctionDclNode(node);
        System.out.println("}\n");
        return null;
    }

    @Override
    public Void VisitExpressionNode(ExpressionNode node) {
        if (node.getLValue() != null && node.getRValue() != null) {
            visit(node.getLValue());
            System.out.print(" " + TypeParser.parseStringFromOperator(node.getOperatorType()) + " ");
            visit(node.getRValue());
        } else if (node.getLValue() != null) {
            visit(node.getLValue());
            if (node.getOperatorType() != null) {
                System.out.print(TypeParser.parseStringFromOperator(node.getOperatorType()));
            }
        }
        return null;
    }

    @Override
    public Void VisitConstantExpressionNode(ConstantExpressionNode node) {
        System.out.print(node.getValue());
        return super.VisitConstantExpressionNode(node);
    }

    @Override
    public Void VisitVariableExpressionNode(VariableExpressionNode node) {
        Variable var = node.getVariable();
        if (var.getIsFunction()) {
            if (!node.getVariable().getId().equals("PRINT")) {
                System.out.print(node.getVariable().getId() + "(");
            }
            if (node.getVariable().getPrintArgument() == null && node.getVariable().getArguments().size() > 0 && !node.getVariable().getId().equals("PRINT")) {
                int i;

                for (i = 0; i < node.getVariable().getArguments().size() - 1; i++) {
                    visit(node.getVariable().getArguments().get(i));
                    System.out.print(",");
                }
                visit(node.getVariable().getArguments().get(i));
                System.out.print(")");
            } else if (node.getVariable().getPrintArgument() != null) {
                System.out.print("print(" + node.getVariable().getPrintArgument() + ")");
            } else if (node.getVariable().getId().equals("PRINT") && node.getVariable().getArguments() != null) {
                System.out.print("print(");
                int i;
                for (i = 0; i < node.getVariable().getArguments().size() - 1; i++) {
                    if (((VariableExpressionNode) node.getVariable().getArguments().get(i)).getVariable() != null) {
                        visit(((VariableExpressionNode) node.getVariable().getArguments().get(i)).getVariable().getEntrance());
                    } else {
                        visit(node.getVariable().getArguments().get(i));
                        System.out.print(",");
                    }
                }
                if (((VariableExpressionNode) node.getVariable().getArguments().get(i)).getVariable() != null) {
                    visit(((VariableExpressionNode) node.getVariable().getArguments().get(i)).getVariable().getEntrance());
                } else {
                    visit(node.getVariable().getArguments().get(i));
                }
                System.out.print(")");
            } else {
                System.out.print(")");
            }
        } else {
            System.out.print(var.getId());
        }
        return null;
    }

    @Override
    public Void VisitCollectionCoordinateNode(CollectionCoordinateNode node) {
        System.out.print("[" + ((ConstantExpressionNode) node.getCoordinates()[0]).getValue() + "," + ((ConstantExpressionNode) node.getCoordinates()[1]).getValue() + "]");
        return null;
    }

    @Override
    public Void VisitForLoopNode(ForLoopNode node) {
        System.out.print("for(");
        visit(node.getInitialize());
        System.out.print("; ");
        visit(node.getCondition());
        System.out.print("; ");
        visit(node.getUpdate());
        System.out.print("){\n");
        visit(node.getBody());
        System.out.println("}");
        return null;
    }

    @Override
    public Void VisitStatementNode(StatementNode node) {
        for (int i = 0; i < node.getChildCount(); i++) {
            visit(node.getChild(i));
            if (node.getChild(i).getClass() != ForLoopNode.class && node.getChild(i).getClass() != WhileLoopNode.class && node.getChild(i).getClass() != ConditionalNode.class)
                System.out.print(";\n");
        }
        return null;
    }

    @Override
    public Void VisitAssignmentNode(AssignmentNode node) {
        if(node.getAssignmentOperator() != AssignmentOperatorType.DECREMENT && node.getAssignmentOperator() != AssignmentOperatorType.INCREMENT)
            System.out.print(node.getVariable().getId() + " " + node.PrettyPrint() + " ");
        else
            System.out.print(node.getVariable().getId() + node.PrettyPrint());
        return super.VisitAssignmentNode(node);
    }

    @Override
    public Void VisitFunctionReturnNode(FunctionReturnNode node) {
        System.out.print("return ");
        visit(node.getExpression());
        System.out.println(";");
        return null;
    }

    @Override
    public Void VisitMatrixValNode(MatrixValNode node) {
        if (!node.getRows().isEmpty()) {
            int i;

            System.out.print("[");
            for (i = 0; i < node.getRows().size() - 1; i++) {
                visit(node.getRows().get(i));
                System.out.print(";");
            }
            visit(node.getRows().get(i));
            System.out.print("]");
        }
        return null;
    }

    @Override
    public Void VisitVectorValNode(VectorValNode node) {
        if (((MatrixValNode) node.getParent()).getRows().size() == 1) {
            System.out.print("[");
        }
        int i;
        for (i = 0; i < node.getValues().size() - 1; i++) {
            visit(node.getValues().get(i));
            System.out.print(",");
        }
        visit(node.getValues().get(i));
        if (((MatrixValNode) node.getParent()).getRows().size() == 1) {
            System.out.print("]");
        }
        return null;
    }


    @Override
    public Void VisitConditionalExpressionNode(ConditionalExpressionNode node) {
        if (node.getLValue() != null && node.getRValue() != null) {
            visit(node.getLValue());
            System.out.print(" " + TypeParser.parseStringFromOperator(node.getOperatorType()) + " ");
            visit(node.getRValue());
        }
        return null;
    }

    @Override
    public Void VisitConditionalNode(ConditionalNode node) {
        System.out.print("if(");
        visit(node.getConditionalExpression());
        System.out.print("){\n");
        visit(node.getBody());
        System.out.println("}");

        if (!node.getElseIfs().isEmpty()) {
            for (ConditionalNode conditionalNode : node.getElseIfs()) {
                System.out.print("else ");
                visit(conditionalNode);
            }
        }
        if (node.getElseBody() != null) {
            System.out.print("else{\n");
            visit(node.getElseBody());
            System.out.println("}\n");

        }
        return null;
    }

    @Override
    public Void VisitWhileLoopNode(WhileLoopNode node) {
        System.out.print("while(");
        visit(node.getCondNode());
        System.out.print("){\n");
        visit(node.getBody());
        System.out.println("}\n");

        return null;
    }
}

