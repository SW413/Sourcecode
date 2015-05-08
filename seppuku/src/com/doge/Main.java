package com.doge;

import com.doge.CodeGeneration.CodeGenerator;
import com.doge.ContextualAnalysis.AST.BaseASTNode;
import com.doge.ContextualAnalysis.Analyser;
import com.doge.MiscComponents.ErrorReporting.ErrorReporter;
import com.doge.MiscComponents.ErrorReporting.ErrorType;
import com.doge.MiscComponents.ErrorReporting.LanguageError;
import com.doge.MiscComponents.FileHandling;
import com.doge.MiscComponents.PrettyPrinter.PrettyPrintTester;
import com.doge.SyntaxAnalysis.Parser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Check if path from args is valid
        FileHandling filesNstuff = new FileHandling();
        String inputFile = filesNstuff.CheckArgs(args);

        //Syntax Analysis
        Parser parser = new Parser();
        ParseTree tree = parser.GenerateParseTreeFromSourcecode(inputFile);

        ArrayList<LanguageError> errors = new ArrayList<LanguageError>();

        //Contextual Analysis
        Analyser analyser = new Analyser(inputFile, errors);
        BaseASTNode abstractSyntaxTree = analyser.GenerateDecoratedASTFromParseTree(tree);

        //Pretty Print Testing (activated by '--prettyTest' flag)
        PrettyPrintTester prettyPrintTester = new PrettyPrintTester();
        prettyPrintTester.PrettyTest(args, abstractSyntaxTree);

        //Error Handling
        ErrorReporter errorReporter = new ErrorReporter();
        errorReporter.HandleErrors(errors, ErrorType.ALL);

        //Code Generation
        CodeGenerator codeGenerator = new CodeGenerator();
        codeGenerator.GenerateCodeAndWriteToFile(abstractSyntaxTree);

        System.exit(0);
    }
}
