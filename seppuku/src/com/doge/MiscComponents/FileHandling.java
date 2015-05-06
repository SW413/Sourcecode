package com.doge.MiscComponents;

import java.io.*;
import java.util.Scanner;

/**
 * Created by michno on 28/4/15.
 */
public class FileHandling {

    public String CheckArgs(String[] args){
        String inputFile = null;
        if (args.length > 0 && !args[0].equals("--prettyTest")) {
            inputFile = args[0];
        } else {
            System.out.println("Something is wrong with the input file argument!");
            System.exit(1);
        }
        return inputFile;
    }

    public File GetFileForOutputCode(String filename, String dest){
        File outputSourcecode = null;
        try {
            outputSourcecode = new File(dest + filename);
            if (!outputSourcecode.exists()) {
                if (!outputSourcecode.getParentFile().exists())
                    outputSourcecode.getParentFile().mkdirs();
                outputSourcecode.createNewFile();
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        return outputSourcecode;
    }

    public boolean WriteToFile(File file, StringBuilder text){
        try {
            FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
            Writer writer = new BufferedWriter(fileWriter);
            writer.append(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean WriteToFile(File file, String text){
        return WriteToFile(file, new StringBuilder(text));
    }

    public FileInputStream GetFileInputStreamFromPath(String path){
        String inputFile = path;
        FileInputStream fileInputStream = null;
        if (inputFile != null) try {
            fileInputStream = new FileInputStream(inputFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return fileInputStream;
    }

    public boolean ExportResource(String resourcePath, String dest){
        try {
            String resourceName = resourcePath.substring(resourcePath.lastIndexOf('/') + 1, resourcePath.length());
            InputStream stream = openResourceAsStream(resourcePath);
            if(stream == null) {
                System.out.println("Cannot get resource \"" + resourceName + "\"");
                return false;
            }

            int readBytes;
            byte[] buffer = new byte[4096];
            OutputStream resStreamOut = new FileOutputStream(dest + resourceName);

            while ((readBytes = stream.read(buffer)) > 0) {
                resStreamOut.write(buffer, 0, readBytes);
            }

            stream.close();
            resStreamOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return true;
    }


    public String ImportStringFromResource(String resourceName){
        StringBuilder stringBuilder = new StringBuilder();
        File input = openResourceAsFile(resourceName);
        try (Scanner scanner = new Scanner(input)){

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                stringBuilder.append(line).append("\n");
            }

            scanner.close();
        } catch (IOException e) {
            System.out.println("CANT FIND:" + resourceName);
            e.printStackTrace();
        }

        return stringBuilder.toString();
    }

    private File openResourceAsFile(String resourceName){
        File file = null;
        try {
            file = new File(getClass().getClassLoader().getResource(resourceName).getFile());
            if (file != null)
                return file;
        } catch (Exception e) {
            System.out.println("CANT FIND: " + resourceName);
            System.out.println(file.getAbsolutePath());
            e.printStackTrace();
        }
        return null;
    }

    private InputStream openResourceAsStream(String resourceName){
        InputStream stream = null;
        try {
            stream = getClass().getClassLoader().getResourceAsStream(resourceName);
            if (stream != null)
                return stream;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String pathToFile(String path){
        char sep = isWindows() ? '\\' : '/';
        return path.substring(0, path.lastIndexOf(sep)+1);
    }

    public static String compatible(String path){
        return isWindows() ? path.replaceAll("/", "\\") : path;
    }

    private static boolean isWindows(){
        return System.getProperty("os.name").toLowerCase().indexOf("win") >= 0;
    }
}
