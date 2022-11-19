package com.example.leetcodeproblems.RedactorFiles.FireWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Writer {
    public void write(ArrayList<String> file, String path) {

        try (BufferedWriter writter = new BufferedWriter(new FileWriter(path))) {
            for (String value : file) {
                writter.write(value + "\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
