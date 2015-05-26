package com.doge.MiscComponents.ErrorReporting;

import java.util.ArrayList;

/**
 * Created by Mathias on 02-05-2015.
 */
public class ErrorReporter {
    public void HandleErrors(ArrayList<LanguageError> errors, ErrorType errorType){
        LanguageError.PrintAllErrors(errors, errorType);
        if (LanguageError.NumErrors(errors, ErrorType.ERROR) != 0)
            System.exit(1);
    }
}
