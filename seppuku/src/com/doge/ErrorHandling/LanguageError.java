package com.doge.ErrorHandling;

import java.util.ArrayList;
import java.util.Collections;

import static com.doge.ErrorHandling.ANSIEscapeCodes.ANSI_RED;
import static com.doge.ErrorHandling.ANSIEscapeCodes.ANSI_RESET;

public abstract class LanguageError implements Comparable<LanguageError> {

    protected ErrorType errorType;
    protected int lineNum;

    static public void PrintAllErrors(ArrayList<LanguageError> errorList, ErrorType typeOfErrors) {
        Collections.sort(errorList);
        for (LanguageError err : errorList) {
            if (typeOfErrors == null) {
                System.out.println(err);
            }
            else {
                if (err.errorType == typeOfErrors)
                    System.out.println(err);
            }
        }
    }

    @Override
    public String toString() {
        return ANSI_RED + "  Error[line " + String.format("%4d", lineNum) + "]-> " + ANSI_RESET;
    }

    public ErrorType getErrorType() {
        return errorType;
    }

    public int compareTo(LanguageError o) {
        return lineNum - o.lineNum;
    }
}
