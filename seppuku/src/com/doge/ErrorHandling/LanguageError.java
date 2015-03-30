package com.doge.ErrorHandling;

import java.util.ArrayList;

import static com.doge.ErrorHandling.ANSIEscapeCodes.ANSI_RED;
import static com.doge.ErrorHandling.ANSIEscapeCodes.ANSI_RESET;

public abstract class LanguageError {

    protected ErrorType errorType;
    protected int lineNum;


    @Override
    public String toString(){
        return ANSI_RED + "Error[line " + String.format("%4d", lineNum) + "]-> " + ANSI_RESET;
    }

    public ErrorType getErrorType() {
        return errorType;
    }

    static public void PrintAllErrors(ArrayList<LanguageError> errorList){
        for (int i = 0; i < errorList.size(); i++) {
            System.out.println(errorList.get(i));
        }
    }
}
