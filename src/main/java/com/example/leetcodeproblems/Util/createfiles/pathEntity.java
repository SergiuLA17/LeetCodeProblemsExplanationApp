package com.example.leetcodeproblems.Util.createfiles;

public enum pathEntity {
    INFO("src/main/java/com/example/leetcodeproblems/model/entity/info/"),
    PRACTICE("src/main/java/com/example/leetcodeproblems/model/entity/practice/"),
    SPRING("src/main/java/com/example/leetcodeproblems/model/entity/spring/"),
    QUIZ("src/main/java/com/example/leetcodeproblems/CommonLayer/entity/quiz/"),
    SQL("src/main/java/com/example/leetcodeproblems/model/entity/sql/"),
    ANSWER("src/main/java/com/example/leetcodeproblems/model/entity/answers/"),
    COLLECTION("src/main/java/com/example/leetcodeproblems/model/entity/collections/"),
    PRINCIPIES("src/main/java/com/example/leetcodeproblems/model/entity/principies/"),
    Web("src/main/java/com/example/leetcodeproblems/model/entity/Web/"),
    GIT("src/main/java/com/example/leetcodeproblems/model/entity/git/"),
    EXCEPTION("src/main/java/com/example/leetcodeproblems/model/entity/exception/"),
    PATTERNS("src/main/java/com/example/leetcodeproblems/model/entity/patterns/");

    private final String path;

    pathEntity(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
