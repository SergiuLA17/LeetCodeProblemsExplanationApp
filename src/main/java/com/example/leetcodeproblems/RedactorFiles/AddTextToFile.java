package com.example.leetcodeproblems.RedactorFiles;


import com.example.leetcodeproblems.RedactorFiles.FilReader.Reader;
import com.example.leetcodeproblems.RedactorFiles.FireWriter.Writer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class AddTextToFile {
    Reader read = new Reader();
    Writer write = new Writer();
    ArrayList<String> files;
    static ArrayList<String> replaceLines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        replaceLines.add("add2");
        replaceLines.add("add2");
        replaceLines.add("add2");
        replaceLines.add("add2");
        replaceLines.add("add1");
        int indexStart = 7;
        int indexStop = indexStart+replaceLines.size();

        AddTextToFile addTextToFile = new AddTextToFile();
        System.out.println("Move files to html folder");
        addTextToFile.moveFiles();
        System.out.println("Replace text");
//        addTextToFile.multiReplaceString(indexStart,indexStop,replaceLines);
 //       addTextToFile.addLine(60,"<li><a ></li>"); //line number -1
        System.out.println("Move files to java folder");
        addTextToFile.moveBackFiles();

    }


    public void moveFiles() throws IOException {
        File folder = new File("src/main/resources/templates/Java");
        File[] listOfFiles = folder.listFiles();
        for (File file : listOfFiles) {
            if (file.isFile()) {
                Path srcFile = Path.of(file.getPath());
                Path destDir = Path.of("src/main/resources/templates/Java/html");
                Files.move(srcFile, destDir.resolve(srcFile.getFileName()));
            }
        }
    }

    public void replaceString(int index, String replace) throws IOException {
        File folder = new File("src/main/resources/templates/Java/html");
        File[] listOfFiles = folder.listFiles();
        for (File file : listOfFiles) {
            if (file.isFile()) {
                read.replaceSingleLine(file.getPath(),index-1, replace);
                files = read.getFile();
                write.write(files, file.getPath());
                files.clear();
            }
        }
    }

    public void addLine(int index, String replace) throws IOException {
        File folder = new File("src/main/resources/templates/Java/html");
        File[] listOfFiles = folder.listFiles();
        for (File file : listOfFiles) {
            if (file.isFile()) {
                read.addLine(file.getPath(),index-2, replace);
                files = read.getFile();
                write.write(files, file.getPath());
                files.clear();
            }
        }
    }

    public void multiReplaceString(int indexStart, int indexStop, ArrayList<String> replaceLine) throws IOException {
        File folder = new File("src/main/resources/templates/Java/html");
        File[] listOfFiles = folder.listFiles();
        for (File file : listOfFiles) {
            if (file.isFile()) {
                read.replaceMultiLine(file.getPath(),indexStart-1, indexStop-2, replaceLine);
                files = read.getFile();
                write.write(files, file.getPath());
                files.clear();
            }
        }
    }

    public void moveBackFiles() throws IOException {
        File folder = new File("src/main/resources/templates/Java/html");
        File[] listOfFiles = folder.listFiles();
        for (File file : listOfFiles) {
            if (file.isFile()) {
                Path srcFile2 = Path.of("src/main/resources/templates/Java/html/" + file.getName());
                Path destDir2 = Path.of("src/main/resources/templates/Java/");
                Files.move(srcFile2, destDir2.resolve(srcFile2.getFileName()));
            }
        }

    }
}
