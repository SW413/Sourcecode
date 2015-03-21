package com.doge.AST;

import java.util.ArrayList;

/**
 * Created by Mathias on 21-03-2015.
 */
public class TopNode extends AST {
    private AST imports;
    private AST functionDeclarations;
    private AST statements;

    public TopNode(AST parent) {
        super(parent);
    }

    public AST getImports() {
        return imports;
    }

    public void setImports(AST imports) {
        this.imports = imports;
        this.addChild(imports);
    }

    public AST getFunctionDeclarations() {
        return functionDeclarations;
    }

    public void setFunctionDeclarations(AST functionDeclarations) {
        this.functionDeclarations = functionDeclarations;
        this.addChild(functionDeclarations);
    }

    public AST getStatements() {
        return statements;
    }

    public void setStatements(AST statements) {
        this.statements = statements;
        this.addChild(statements);
    }
}
