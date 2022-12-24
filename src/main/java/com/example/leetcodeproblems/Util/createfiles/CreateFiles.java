package com.example.leetcodeproblems.Util.createfiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFiles {
    static final String pathInfo = "src/main/java/com/example/leetcodeproblems/CommonLayer/entity/info/";
    static final String pathPractice = "src/main/java/com/example/leetcodeproblems/CommonLayer/entity/practice/";
    static final String pathSpring = "src/main/java/com/example/leetcodeproblems/CommonLayer/entity/spring/";
    static final String pathQuiz = "src/main/java/com/example/leetcodeproblems/CommonLayer/entity/quiz/";

    static final String pathDaoRepInfo= "src/main/java/com/example/leetcodeproblems/DataAccesLayer/repository/info/";
    static final String pathDaoRepPractice= "src/main/java/com/example/leetcodeproblems/DataAccesLayer/repository/practice/";
    static final String pathDaoRepSpring= "src/main/java/com/example/leetcodeproblems/DataAccesLayer/repository/spring/";
    static final String pathQuizRep = "src/main/java/com/example/leetcodeproblems/DataAccesLayer/repository/quiz/";

    public static void main(String[] args) throws IOException {
//       createFileInfo("quiz",pathQuiz);
//       createFileRep("quiz",pathQuizRep);
    }



    static private void createFileInfo(String fileName, String path) throws IOException {
        File file = new File(path + fileName + ".java");
        file.createNewFile();
        try {
            FileWriter myWriter = new FileWriter(file);
            myWriter.write("package com.example.leetcodeproblems.CommonLayer.entity."+findNameFolder(file.getPath())+";\n" +
                    "\n" +
                    "import com.example.leetcodeproblems.CommonLayer.entity.Tables;\n" +
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
            myWriter.write("package com.example.leetcodeproblems.DataAccesLayer.repository."+findNameFolder(file.getPath())+";\n" +
                    "\n" +
                    "import com.example.leetcodeproblems.CommonLayer.entity.info."+fileName+";\n" +
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


