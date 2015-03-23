package com.doge.AST;

import java.util.ArrayList;

/**
 * Created by Mathias on 21-03-2015.
 */
public class TopNode extends AST {
    private AST imports;
    private ArrayList<FunctionDclNode> functionDeclarations = new ArrayList<FunctionDclNode>();
    private AST statements;

    public TopNode(AST parent) {
        super(parent);
    }

    public AST getImports() {
        return imports;
    }

    public void setImports(AST imports) {
        this.imports = imports;
        //this.addChild(imports);
    }

    public FunctionDclNode getFunctionDeclaration(int i) {
        return functionDeclarations.get(i);
    }

    public void addFunctionDeclaration(FunctionDclNode functionDeclaration) {
        this.functionDeclarations.add(functionDeclaration);
        //this.addChild(functionDeclaration);
    }

    public AST getStatements() {
        return statements;
    }

    public void setStatements(AST statements) {
        this.statements = statements;
        //this.addChild(statements);
    }
}
