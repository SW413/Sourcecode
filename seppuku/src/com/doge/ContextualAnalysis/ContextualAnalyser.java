package com.doge.ContextualAnalysis;

import com.doge.ContextualAnalysis.AST.BaseASTNode;
import com.doge.ContextualAnalysis.Visitors.*;
import com.doge.ContextualAnalysis.AST.*;
import com.doge.ContextualAnalysis.checking.SymbolTable;
import com.doge.MiscComponents.ErrorReporting.ErrorReporter;
import com.doge.MiscComponents.ErrorReporting.ErrorType;
import com.doge.MiscComponents.ErrorReporting.LanguageError;
import com.doge.MiscComponents.FunctionImports;

import java.nio.file.FileSystems;
import java.util.ArrayList;

/**
 * Created by Mathias on 02-05-2015.
 */
public class ContextualAnalyser {
    private String inputFile;
    ArrayList<LanguageError> errors;

    public ContextualAnalyser(String inputFile, ArrayList<LanguageError> errors) {
        this.inputFile = inputFile;
        this.errors = errors;
    }

    public BaseASTNode GenerateDecoratedASTFromParseTree(BaseASTNode abstractSyntaxTree){

        //Add potential imported function declarations
        handleImports(abstractSyntaxTree);

        //Scope check
        SymbolTable symbolTable = new SymbolTable();
        scopeCheck(abstractSyntaxTree, symbolTable);
        //Type check
        typeCheck(abstractSyntaxTree, symbolTable);

        //Check for unused variables
        errors.addAll(symbolTable.getUnusedVariables());

        //Error Handling
        ErrorReporter errorReporter = new ErrorReporter();
        errorReporter.HandleErrors(errors, ErrorType.ALL);

        return abstractSyntaxTree;
    }

    private void handleImports(BaseASTNode abstractSyntaxTree){
        if (((TopNode)abstractSyntaxTree.getChild(0)).getImports() != null){
            FunctionImports funcImp = new FunctionImports();
            funcImp.AddFunctionDeclarationsFromImportNodes(abstractSyntaxTree, FileSystems.getDefault().getPath(this.inputFile).toAbsolutePath().toString());
        }
    }

    private void scopeCheck(BaseASTNode abstractSyntaxTree, SymbolTable symbolTable){
        abstractSyntaxTree.accept(new ScopeCheckVisitor(symbolTable, errors));
    }

    private void typeCheck(BaseASTNode abstractSyntaxTree, SymbolTable symbolTable){
        abstractSyntaxTree.accept(new TypeCheckVisitor(symbolTable, errors));
    }
}
