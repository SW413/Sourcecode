package com.doge.AST;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Søren on 27-03-2015.
 */
public class ImportFile {
    private FileReader fileReader;
    private int lineNumber;

    public ImportFile(String path) {
        try {
        fileReader = new FileReader(path);
    } catch (FileNotFoundException e) {
            //TODO generate compile error to user
            e.printStackTrace();
        }
    }

    public FileReader getFileReader() {
        return fileReader;
    }

    public void setFileReader(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }
}
