package com.doge;

import com.doge.CodeGeneration.CodeGenerator;
import com.doge.ContextualAnalysis.AST.BaseASTNode;
import com.doge.ContextualAnalysis.ContextualAnalyser;
import com.doge.MiscComponents.ErrorReporting.ErrorReporter;
import com.doge.MiscComponents.ErrorReporting.ErrorType;
import com.doge.MiscComponents.ErrorReporting.LanguageError;
import com.doge.MiscComponents.FileHandling;
import com.doge.MiscComponents.PrettyPrinter.PrettyPrintTester;
import com.doge.SyntaxAnalysis.SyntaxAnalyser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Check if path from args is valid
        FileHandling filesNstuff = new FileHandling();
        String inputFile = filesNstuff.CheckArgs(args);

        //Syntax Analysis
        SyntaxAnalyser syntaxAnalyser = new SyntaxAnalyser();
        BaseASTNode abstractSyntaxTree = syntaxAnalyser.GenerateASTFromSourcecode(inputFile);

        ArrayList<LanguageError> errors = new ArrayList<LanguageError>();

        //Contextual Analysis
        ContextualAnalyser contextualAnalyser = new ContextualAnalyser(inputFile, errors);
        abstractSyntaxTree = contextualAnalyser.GenerateDecoratedASTFromParseTree(abstractSyntaxTree);

        //Pretty Print Testing (activated by '--prettyTest' flag)
        PrettyPrintTester prettyPrintTester = new PrettyPrintTester();
        prettyPrintTester.PrettyTest(args, abstractSyntaxTree);


        //Code Generation
        CodeGenerator codeGenerator = new CodeGenerator();
        codeGenerator.GenerateCodeAndWriteToFile(abstractSyntaxTree);

        System.exit(0);
    }
}
