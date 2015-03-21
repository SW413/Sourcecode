package com.doge.AST;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Mathias on 21-03-2015.
 */
public class ImportNode extends AST {
    private FileReader inputFile;

    public ImportNode(AST parent) {
        super(parent);
    }

    public Void setFile(String path) {
        try {
            inputFile = new FileReader(path);
        } catch (FileNotFoundException e) {
            //TODO generate compile error to user
            e.printStackTrace();
        }
        return null;
    }
}
