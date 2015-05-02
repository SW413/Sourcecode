package com.doge.MiscComponents;

import com.doge.ContextualAnalysis.AST.BaseASTNode;
import com.doge.ContextualAnalysis.AST.FunctionDclNode;
import com.doge.ContextualAnalysis.AST.TopNode;
import com.doge.ContextualAnalysis.Visitors.visitorAST;
import com.doge.SyntaxAnalysis.Parser;
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
            functionDclNodes.addAll(parseImportFile(path, FileHandling.pathToFile(sourcecodePath)));
        }
        ((TopNode) abstractSyntaxTree.getChild(0)).addFunctionDeclarations(functionDclNodes);
        return null;
    }

    private ArrayList<FunctionDclNode> parseImportFile(String relativePath, String sourcecodePath){
        Parser parser = new Parser();
        ParseTree tree = parser.GenerateParseTreeFromSourcecode(FileHandling.compatible(sourcecodePath + relativePath));
        if (parser.getOurLangParser().getNumberOfSyntaxErrors() == 0) {
            BaseASTNode abstractSyntaxTree = new BaseASTNode(null);
            tree.accept(new visitorAST(abstractSyntaxTree));
            return ((TopNode) abstractSyntaxTree.getChild(0)).getFunctionDeclarations();
        }
        System.out.println("Syntax errors in import files!");
        System.exit(1);
        return null;
    }
}
