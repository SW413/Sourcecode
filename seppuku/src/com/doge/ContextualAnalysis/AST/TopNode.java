package com.doge.ContextualAnalysis.AST;

import com.doge.SyntaxAnalysis.Visitors.IASTVisitor;

import java.util.ArrayList;

/**
 * Created by Mathias on 21-03-2015.
 */
public class TopNode extends BaseASTNode {
    private ImportNode imports;
    private ArrayList<FunctionDclNode> functionDeclarations = new ArrayList<FunctionDclNode>();
    private BaseASTNode statements;

    public TopNode(BaseASTNode parent) {
        super(parent);
    }

    public ImportNode getImports() {
        return imports;
    }

    public void setImports(ImportNode imports) {
        this.imports = imports;
        //this.addChild(imports);
    }

    public FunctionDclNode getFunctionDeclaration(int i) {
        return functionDeclarations.get(i);
    }

    public ArrayList<FunctionDclNode> getFunctionDeclarations() {
        return functionDeclarations;
    }

    public void addFunctionDeclarations(ArrayList<FunctionDclNode> functionDclNodes){
        this.functionDeclarations.addAll(functionDclNodes);
    }
    public void addFunctionDeclaration(FunctionDclNode functionDeclaration) {
        this.functionDeclarations.add(functionDeclaration);
        //this.addChild(functionDeclaration);
    }

    public BaseASTNode getStatements() {
        return statements;
    }

    public void setStatements(BaseASTNode statements) {
        this.statements = statements;
        //this.addChild(statements);
    }

    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitTopNode(this);
        else return node.visitChildren(this);
    }
}
