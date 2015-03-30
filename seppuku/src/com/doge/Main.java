package com.doge;

import com.antlr.*;
import com.doge.AST.AST;
import com.doge.Visitors.ASTTypeCheckVisitor;
import com.doge.Visitors.PrettyPrint;
import com.doge.Visitors.visitorAST;
import com.doge.Visitors.SymbolTableFillVisitor;
import com.doge.checking.SymbolTable;
import com.doge.ErrorHandling.LanguageError;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;

        if ( inputFile!=null ) try {
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

        ourLangLexer lexer = new ourLangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ourLangParser parser = new ourLangParser(tokens);
        ParseTree tree = parser.topLevel(); // parse
        System.out.println(tree.toStringTree(parser)); // print tree as text
        AST abstractSyntaxTree = new AST(null);
        tree.accept(new visitorAST(abstractSyntaxTree));



        ArrayList<LanguageError> errors = new ArrayList<LanguageError>();
        //System.out.println(abstractSyntaxTree.getChild);
        SymbolTable symbolTable = new SymbolTable();
        abstractSyntaxTree.accept(new SymbolTableFillVisitor(symbolTable, errors));
        abstractSyntaxTree.accept(new ASTTypeCheckVisitor(symbolTable, errors));
        errors.addAll(symbolTable.getUnusedVariables());
        LanguageError.PrintAllErrors(errors);
        System.out.println("PRETTY PRINT:\n");
        abstractSyntaxTree.accept(new PrettyPrint());
        System.out.println("\n");
        System.out.println("SUT MIN PIK JEG VIL HA' ET BREAKPOINT!");


        //tree.accept(new visitorChecker(symbolTable));
    }
}
