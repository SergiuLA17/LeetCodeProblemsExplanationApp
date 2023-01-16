CREATE TABLE `LearnJavaDB`.`ifelseinfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO `LearnJavaDB`.`ifelseinfo` (`title`, `description`)
VALUES ('If Else ',
        '
Este o instructiune pentru a controla fluxul unui program in anumite conditii.<br>
Instructiunea "if" verifica o conditie booleana si daca este adevarata, atunci se va executa codul din blocul "if".<br>
Daca este falsa, atunci din blocul "else".<br>
<br>
Exemplu:<br>
int age = 25;<br>
if (age >= 18) {<br>
    System.out.println("You are an adult.");<br>
} else {<br>
    System.out.println("You are not an adult.");<br>
}<br>
');


INSERT INTO `LearnJavaDB`.`ifelseinfo` (`title`, `description`)
VALUES ('If Else ',
        '

Pot exista mai multe "if-else" in acelasi program, pentru a crea o conditie mai complexa.<br>
Exemplu:<br>
if (age < 18) {<br>
    System.out.println("You are a minor.");<br>
} else if (age >= 18 && age < 30) {<br>
    System.out.println("You are a young adult.");<br>
} else {<br>
    System.out.println("You are an adult.");<br>
}<br>
');

INSERT INTO `LearnJavaDB`.`ifelseinfo` (`title`, `description`)
VALUES ('If Else ',
        '
Deaseena putem folosi operatorul ternar pentru a scrie cod mai scurt.<br>
Exemplu:<br>
String result = (age >= 18) ? "You are an adult." : "You are not an adult.";<br>
');




