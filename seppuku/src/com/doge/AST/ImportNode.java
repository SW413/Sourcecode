package com.doge.AST;

import com.doge.Visitors.IASTVisitor;

import java.util.ArrayList;

/**
 * Created by Mathias on 21-03-2015.
 */
public class ImportNode extends BaseASTNode {
    private ArrayList<String> inputFilePaths = new ArrayList<String>();

    public ImportNode(BaseASTNode parent) {
        super(parent);
    }

    public Void addFile(String path) {
        inputFilePaths.add(path);
        return null;
    }

    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitImportNode(this);
        else return node.visitChildren(this);
    }

    public String getInputFilePath(int i) { return inputFilePaths.get(i); }
    public ArrayList<String> getInputFilePaths() {
        return inputFilePaths;
    }
}
