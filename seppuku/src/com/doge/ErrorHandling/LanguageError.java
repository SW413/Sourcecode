package com.doge.ErrorHandling;

import java.util.ArrayList;

public abstract class LanguageError {
    public ErrorType Error;

    abstract public String PrettyErrorPrint();

    static public void PrintAllErrors(ArrayList<LanguageError> errorList){
        for (int i = 0; i < errorList.size(); i++) {
            System.out.println(errorList.get(i).PrettyErrorPrint());
        }
    }
}
