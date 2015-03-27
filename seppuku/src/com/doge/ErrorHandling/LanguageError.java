package com.doge.ErrorHandling;

import java.util.ArrayList;

public abstract class LanguageError {
    protected ErrorType errorType;
    protected int lineNum;


    @Override
    public String toString(){
        return "Error[line " + lineNum + "]: ";
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
