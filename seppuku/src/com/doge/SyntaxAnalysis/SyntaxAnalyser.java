package com.doge.SyntaxAnalysis;

import com.antlr.ourLangLexer;
import com.antlr.ourLangParser;
import com.doge.ContextualAnalysis.AST.BaseASTNode;
import com.doge.SyntaxAnalysis.Visitors.GenerateASTVisitor;
import com.doge.MiscComponents.FileHandling;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import static com.doge.MiscComponents.ErrorReporting.ANSIEscapeCodes.ANSI_RED;
import static com.doge.MiscComponents.ErrorReporting.ANSIEscapeCodes.ANSI_RESET;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by michno on 28/4/15.
 */
public class SyntaxAnalyser {

    private ourLangLexer _ourLangLexer = null;
    private ourLangParser _ourLangParser = null;
    public SyntaxAnalyser() {}

    private CommonTokenStream generateTokenStream(FileInputStream file){
        ANTLRInputStream input = null;
        try {
            input = new ANTLRInputStream(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        _ourLangLexer = new ourLangLexer(input);
        return new CommonTokenStream(_ourLangLexer);
    }
    public ParseTree GenerateParseTreeFromSourcecode(String path){
        FileHandling filesNstuff = new FileHandling();

        _ourLangParser = new ourLangParser(
                generateTokenStream(
                        filesNstuff.GetFileInputStreamFromPath(path)));
        ParseTree tree =  _ourLangParser.topLevel();
        if (_ourLangParser.getNumberOfSyntaxErrors() == 0) {
            return tree;
        }else{
            System.out.println(String.format("%1$s%3$d syntax %4$s...%2$s Please resolve and attempt recompile",
                    ANSI_RED, ANSI_RESET,
                    _ourLangParser.getNumberOfSyntaxErrors(),
                    _ourLangParser.getNumberOfSyntaxErrors() > 1 ? "errors" : "error"));
            System.exit(1);
        }
        return null;
    }

    public BaseASTNode GenerateASTFromSourcecode(String path){
        FileHandling filesNstuff = new FileHandling();

        _ourLangParser = new ourLangParser(
                generateTokenStream(
                        filesNstuff.GetFileInputStreamFromPath(path)));
        ParseTree tree =  _ourLangParser.topLevel();
        if (_ourLangParser.getNumberOfSyntaxErrors() == 0) {
            return ASTGenerator(tree);
        }else{
        System.out.println(String.format("%1$s%3$d syntax %4$s...%2$s Please resolve and attempt recompile",
                ANSI_RED, ANSI_RESET,
                _ourLangParser.getNumberOfSyntaxErrors(),
                _ourLangParser.getNumberOfSyntaxErrors() > 1 ? "errors" : "error"));
        System.exit(1);
        }
        return null;
    }

    public BaseASTNode ASTGenerator(ParseTree parseTree){
        //Generate abstract syntax tree
        BaseASTNode abstractSyntaxTree = new BaseASTNode(null);
        parseTree.accept(new GenerateASTVisitor(abstractSyntaxTree));

        return abstractSyntaxTree;
    }

    public ourLangLexer getOurLangLexer() {
        return _ourLangLexer;
    }

    public ourLangParser getOurLangParser() {
        return _ourLangParser;
    }
}
