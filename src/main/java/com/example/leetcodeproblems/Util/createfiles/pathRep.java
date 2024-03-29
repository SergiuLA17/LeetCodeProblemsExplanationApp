package com.example.leetcodeproblems.Util.createfiles;

public enum pathRep {
    INFO("src/main/java/com/example/leetcodeproblems/repository/info/"),
    TOOLS("src/main/java/com/example/leetcodeproblems/repository/tools/"),
    MULTITHREADING("src/main/java/com/example/leetcodeproblems/repository/multithreading/"),
    AlGORITHMS("src/main/java/com/example/leetcodeproblems/repository/algorithms/"),
    PRACTICE("src/main/java/com/example/leetcodeproblems/repository/practice/"),
    SPRING("src/main/java/com/example/leetcodeproblems/repository/spring/"),
    QUIZ("src/main/java/com/example/leetcodeproblems/DataAccesLayer/repository/sql/"),
    SQL("src/main/java/com/example/leetcodeproblems/repository/sql/"),
    ANSWER("src/main/java/com/example/leetcodeproblems/repository/answer/"),
    COLLECTION("src/main/java/com/example/leetcodeproblems/repository/collections/"),
    PRINCIPIES("src/main/java/com/example/leetcodeproblems/repository/principies/"),
    WEB("src/main/java/com/example/leetcodeproblems/repository/Web/"),
    GIT("src/main/java/com/example/leetcodeproblems/repository/git/"),
    PATTERNS("src/main/java/com/example/leetcodeproblems/repository/patterns/"),
    EXCEPTION("src/main/java/com/example/leetcodeproblems/repository/exception/");

    private final String path;

    pathRep(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}

