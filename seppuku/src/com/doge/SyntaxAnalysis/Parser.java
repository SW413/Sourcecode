package com.doge.SyntaxAnalysis;

import com.antlr.ourLangLexer;
import com.antlr.ourLangParser;
import com.doge.MiscComponents.FileHandling;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by michno on 28/4/15.
 */
public class Parser {

    private ourLangLexer _ourLangLexer = null;
    private ourLangParser _ourLangParser = null;
    public Parser() {}

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
        return _ourLangParser.topLevel();
    }

    public ourLangLexer getOurLangLexer() {
        return _ourLangLexer;
    }

    public ourLangParser getOurLangParser() {
        return _ourLangParser;
    }
}
