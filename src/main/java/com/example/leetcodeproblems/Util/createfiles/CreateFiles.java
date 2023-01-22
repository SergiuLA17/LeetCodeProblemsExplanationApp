package com.example.leetcodeproblems.Util.createfiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class CreateFiles {

    public static void main(String[] args) throws IOException {
        String name = "refactor";
       createFileInfo(name, pathEntity.INFO.getPath());
       createFileRep(name, pathRep.INFO.getPath());
    }

    static private void createFileInfo(String fileName, String path) throws IOException {
        File file = new File(path + fileName + ".java");
        file.createNewFile();
        try {
            FileWriter myWriter = new FileWriter(file);
            myWriter.write("package com.example.leetcodeproblems.model.entity."+findNameFolder(file.getPath())+";\n" +
                    "\n" +
                    "import com.example.leetcodeproblems.model.entity.Tables;\n" +
                    "import jakarta.persistence.Entity;\n" +
                    "\n" +
                    "@Entity\n" +
                    "public class "+fileName +" extends Tables {\n" +
                    "}\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    static private void createFileRep(String fileName, String path) throws IOException {
        File file = new File(path + fileName + "Rep.java");
        file.createNewFile();
        try {
            FileWriter myWriter = new FileWriter(file);
            myWriter.write("package com.example.leetcodeproblems.repository."+findNameFolder(file.getPath())+";\n" +
                    "\n" +
                    "import com.example.leetcodeproblems.model.entity."+findNameFolder(file.getPath())+"."+fileName+";\n" +
                    "import org.springframework.data.repository.CrudRepository;\n" +
                    "import org.springframework.stereotype.Repository;\n" +
                    "\n" +
                    "@Repository\n" +
                    "public interface "+ fileName+"Rep extends CrudRepository<"+fileName+", Long> {\n" +
                    "}\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    static private String findNameFolder(String path) throws IOException {
        File folder = new File(path);
        return folder.getParentFile().getName();
    }
}


