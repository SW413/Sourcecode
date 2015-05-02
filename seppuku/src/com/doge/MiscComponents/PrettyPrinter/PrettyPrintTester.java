package com.doge.MiscComponents.PrettyPrinter;

import com.doge.ContextualAnalysis.AST.BaseASTNode;
import com.doge.MiscComponents.PrettyPrinter.Visitors.*;

import java.io.*;

import static com.doge.Main.main;

/**
 * Created by Mathias on 02-05-2015.
 */
public class PrettyPrintTester {

    public void PrettyTest(String[] args, BaseASTNode abstractSyntaxTree) {

        if (args.length > 1 && args[1].equals("--prettyTest")) {
            StringBuilder printTest = new StringBuilder();
            abstractSyntaxTree.accept(new PrettyPrint(printTest));
            System.out.println("DEBUG PRETTYPRINT:\n" + printTest.toString());
            if (args[0].equals("prettyTest.hlial")) {

                StringBuilder inputCode = new StringBuilder();
                int ch;
                try {
                    InputStream inpS = new FileInputStream(args[0]);
                    while ((ch = inpS.read()) != -1) {
                        inputCode.append((char) ch);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (printTest.length() == inputCode.length()) {
                    for (int i = 0; i < printTest.length(); i++) {
                        if (printTest.charAt(i) != inputCode.charAt(i))
                            System.exit(1);
                    }
                } else {
                    System.exit(1);
                }
            } else {
                try {
                    File outputSourcecode = new File("prettyTest.hlial");
                    if (!outputSourcecode.exists()) {
                        outputSourcecode.createNewFile();
                    }
                    FileWriter fileWriter = new FileWriter(outputSourcecode.getAbsoluteFile());
                    Writer writer = new BufferedWriter(fileWriter);
                    writer.append(printTest);
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                String[] testArgs = {"prettyTest.hlial", "--prettyTest"};
                main(testArgs);
            }
        }
    }
}
