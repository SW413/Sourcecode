package com.doge;

import com.antlr.ourLangLexer;
import com.antlr.ourLangParser;
import com.doge.AST.BaseASTNode;
import com.doge.ErrorHandling.ErrorType;
import com.doge.ErrorHandling.LanguageError;
import com.doge.Visitors.*;
import com.doge.checking.SymbolTable;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.util.ArrayList;

import static com.doge.ErrorHandling.ANSIEscapeCodes.ANSI_RED;
import static com.doge.ErrorHandling.ANSIEscapeCodes.ANSI_RESET;

public class Main {

    public static void main(String[] args) {

        //Get sourcecode file and set as ANTLR input stream
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];
        InputStream is = System.in;
        if (inputFile != null) try {
            is = new FileInputStream(inputFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ANTLRInputStream input = null;
        try {
            input = new ANTLRInputStream(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //ANTLR magic
        ourLangLexer lexer = new ourLangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ourLangParser parser = new ourLangParser(tokens);
        ParseTree tree = parser.topLevel();


        //System.out.println(tree.toStringTree(parser)); // print tree as text
        if (parser.getNumberOfSyntaxErrors() == 0) {
            //Generate abstract syntax tree
            BaseASTNode abstractSyntaxTree = new BaseASTNode(null);
            tree.accept(new visitorAST(abstractSyntaxTree));

            //Scope check BaseASTNode
            ArrayList<LanguageError> errors = new ArrayList<LanguageError>();
            SymbolTable symbolTable = new SymbolTable();
            abstractSyntaxTree.accept(new SymbolTableFillVisitor(symbolTable, errors));
            //Type check BaseASTNode
            abstractSyntaxTree.accept(new ASTTypeCheckVisitor(symbolTable, errors));
            //Check for unused variables
            errors.addAll(symbolTable.getUnusedVariables());

            System.out.println("\t(\u256f\u00b0 \u25a1 \u00b0 \uff09\u256f\ufe35 \u253b\u2501\u253b ");
            //Errors
            LanguageError.PrintAllErrors(errors, ErrorType.ERROR);

            System.out.println("\t\u252c\u2500\u252c\u30ce( \u00ba _ \u00ba\u30ce)");
            //Warnings
            LanguageError.PrintAllErrors(errors, ErrorType.WARNING);

            //Pretty print
            if (args.length > 1 && args[1].equals("--prettyTest")) {
                StringBuilder printTest = new StringBuilder();
                abstractSyntaxTree.accept(new PrettyPrint(printTest));
                if (args[0].equals("prettyTest.hlial")){

                    StringBuilder inputCode = new StringBuilder();
                    int ch;
                    try {
                        InputStream inpS = new FileInputStream(args[0]);
                        while((ch = inpS.read()) != -1){
                            inputCode.append((char)ch);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (printTest.length() == inputCode.length()){
                        for (int i = 0; i < printTest.length(); i++) {
                            if (printTest.charAt(i) != inputCode.charAt(i))
                                System.exit(1);
                        }
                    } else {
                        System.exit(1);
                    }
                }else {
                    try {
                        File outputSourcecode = new File("prettyTest.hlial");
                        if (!outputSourcecode.exists()) {
                            outputSourcecode.createNewFile();
                        }
                        FileWriter fileWriter = new FileWriter(outputSourcecode.getAbsoluteFile());
                        Writer writer = new BufferedWriter(fileWriter);
                        writer.append(printTest);
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    String[] testArgs = {"prettyTest.hlial", "--prettyTest"};
                    main(testArgs);
                }
            }


            if (LanguageError.NumErrors(errors, ErrorType.ERROR) == 0){
                StringBuilder output = new StringBuilder();
                abstractSyntaxTree.accept(new CodeGeneratorVisitor(output));
                try {
                    File outputSourcecode = new File("../../../" + "/codeout/code.c");
                    if(!outputSourcecode.exists()) {
                        if (!outputSourcecode.getParentFile().exists())
                            outputSourcecode.getParentFile().mkdirs();
                        outputSourcecode.createNewFile();
                    }
                    FileWriter fileWriter = new FileWriter(outputSourcecode.getAbsoluteFile());
                    Writer writer = new BufferedWriter(fileWriter);
                    writer.append(output);
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.exit(0);

            } else  {
                System.exit(1);
            }
        } else {
            System.out.println(String.format("%1$s%3$d syntax %4$s...%2$s Please resolve and attempt recompile",
                    ANSI_RED, ANSI_RESET,
                    parser.getNumberOfSyntaxErrors(),
                    parser.getNumberOfSyntaxErrors() > 1 ? "errors" : "error"));
            System.exit(1);
        }
    }
}
