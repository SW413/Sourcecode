package com.doge.MiscComponents.ErrorReporting;

import java.util.ArrayList;
import java.util.Collections;

import static com.doge.MiscComponents.ErrorReporting.ANSIEscapeCodes.ANSI_RED;
import static com.doge.MiscComponents.ErrorReporting.ANSIEscapeCodes.ANSI_RESET;

public abstract class LanguageError implements Comparable<LanguageError> {

    protected ErrorType errorType;
    protected int lineNum;

    static public int NumErrors(ArrayList<LanguageError> errorList, ErrorType typeOfErrors){
        int i = 0;
        if (typeOfErrors == null)
            i = errorList.size();
        for (LanguageError err : errorList) {
            if (err.errorType == typeOfErrors)
                i++;
        }
        return i;
    }
    static public Void PrintAllErrors(ArrayList<LanguageError> errorList, ErrorType typeOfErrors) {
        if (errorList.size() == 0)
            return null;
        Collections.sort(errorList);
        String out = "";
        for (LanguageError err : errorList) {
            if (typeOfErrors == ErrorType.ALL) {
                if(!out.contains(err.toString()))
                    out += err + "\n";
            }
            else {
                if (err.errorType == typeOfErrors) {
                    if(!out.contains(err.toString()))
                        out += err + "\n";
                }
            }
        }
        System.out.println(out.substring(0, out.length()-1));
        return null;
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
