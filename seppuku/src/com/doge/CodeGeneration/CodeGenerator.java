package com.doge.CodeGeneration;

import com.doge.CodeGeneration.Visitors.CodeGeneratorVisitor;
import com.doge.ContextualAnalysis.AST.BaseASTNode;
import com.doge.MiscComponents.FileHandling;

import java.io.File;
import java.io.IOException;

/**
 * Created by Mathias on 02-05-2015.
 */
public class CodeGenerator {
    public void GenerateCodeAndWriteToFile(BaseASTNode abstractSyntaxTree){
        FileHandling filesNstuff = new FileHandling();
        StringBuilder output = new StringBuilder();

        abstractSyntaxTree.accept(new CodeGeneratorVisitor(output));

        filesNstuff.WriteToFile(
                filesNstuff.GetFileForOutputCode("code.c", "../../../codeout/"),
                output);

        filesNstuff.ExportResource("simpleCL.h", "../../../codeout/");
        filesNstuff.ExportResource("simpleCL.c", "../../../codeout/");
        filesNstuff.ExportResource("complexTypes.h", "../../../codeout/");
        filesNstuff.ExportResource("Makefile", "../../../codeout/");
        filesNstuff.ExportResource("gambleStdlib.c", "../../../codeout/");
        filesNstuff.ExportResource("gambleStdlib.h", "../../../codeout/");
    }
}
