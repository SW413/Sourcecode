package com.doge.components;

import com.doge.AST.BaseASTNode;
import com.doge.AST.FunctionDclNode;
import com.doge.AST.TopNode;
import com.doge.Visitors.visitorAST;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;

/**
 * Created by michno on 28/4/15.
 */
public class FunctionImports {

    public Void AddFunctionDeclarationsFromImportNodes(BaseASTNode abstractSyntaxTree, String sourcecodePath){
        ArrayList<String> importPaths = ((TopNode)abstractSyntaxTree.getChild(0)).getImports().getInputFilePaths();
        ArrayList<FunctionDclNode> functionDclNodes = new ArrayList<FunctionDclNode>();
        for (String path : importPaths){
            functionDclNodes.addAll(parseImportFile(path, sourcecodePath.substring(0, sourcecodePath.lastIndexOf('/')+1)
            ));
        }
        ((TopNode) abstractSyntaxTree.getChild(0)).addFunctionDeclarations(functionDclNodes);
        return null;
    }

    private ArrayList<FunctionDclNode> parseImportFile(String relativePath, String sourcecodePath){
        Parser parser = new Parser();
        ParseTree tree = parser.GenerateParseTreeFromSourcecode(
                isWindows() ? (sourcecodePath + relativePath).replaceAll("/", "\\") : (sourcecodePath + relativePath));
        if (parser.getOurLangParser().getNumberOfSyntaxErrors() == 0) {
            BaseASTNode abstractSyntaxTree = new BaseASTNode(null);
            tree.accept(new visitorAST(abstractSyntaxTree));
            return ((TopNode) abstractSyntaxTree.getChild(0)).getFunctionDeclarations();
        }
        System.out.println("Syntax errors in import files!");
        System.exit(1);
        return null;
    }

    private boolean isWindows(){
        return System.getProperty("os.name").indexOf("win") >= 0;
    }
}
