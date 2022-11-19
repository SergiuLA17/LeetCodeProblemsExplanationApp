package com.example.leetcodeproblems.RedactorFiles.FilReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {
    private String line;
    private int index = 0;
    private ArrayList<String> file = new ArrayList<>();

    public void replaceSingleLine(String path, int indexLine, String replace) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        file.clear();
        index = 0;
        while ((line = br.readLine()) != null) {

            if (index == indexLine) {
                line = replace;
                file.add(line);
            } else {
                file.add(line);
            }
            index++;
        }
        br.close();
    }

    public void addLine(String path, int indexLine, String replace) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        file.clear();
        index = 0;
        while ((line = br.readLine()) != null) {

            if (index == indexLine) {
                file.add(line);
                file.add(replace);
            } else {
                file.add(line);
            }
            index++;
        }
        br.close();
    }


    public void replaceMultiLine(String path, int indexStart, int indexStop, ArrayList<String> lines) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        int i =0;
        index = 0;
        while ((line = br.readLine()) != null) {

            if (index >= indexStart && index <= indexStop) {
                line = lines.get(i++);
                file.add(line);
                index++;
            } else {
                file.add(line);
                index++;
            }

        }
        br.close();

    }

    public ArrayList<String> getFile() {
        return file;
    }

    public void readFile() {
        System.out.println("File read");
        for (String s : file) {
            System.out.print(s);
        }
    }
}
