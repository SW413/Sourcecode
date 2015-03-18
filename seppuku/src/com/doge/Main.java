package com.doge;
import com.antlr.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

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
        tree.accept(new visitorTest());
    }
}
