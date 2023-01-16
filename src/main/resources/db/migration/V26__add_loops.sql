CREATE TABLE `LearnJavaDB`.`loopinfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `LearnJavaDB`.`iteration`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `LearnJavaDB`.`forinfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `LearnJavaDB`.`whileinfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `LearnJavaDB`.`dowhileinfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `LearnJavaDB`.`foreachinfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);


INSERT INTO `LearnJavaDB`.`loopinfo` (`title`, `description`)
VALUES ('Loops ',
        '
In Java loops sunt folosite pentru a executa o secventa de cod d mai multe ori.<br>
In Java exista 4 tipuri de loop-uri:<br>
<li><a href="http://localhost:7777/For">For</a></li>
<li><a href="http://localhost:7777/ForEach">For Each</a></li>
<li><a href="http://localhost:7777/While">While</a></li>
<li><a href="http://localhost:7777/DoWhile">Do while</a></li>

');

INSERT INTO `LearnJavaDB`.`forinfo` (`title`, `description`)
VALUES ('For ',
        '
For este folosit atunci cand stim exact cate iteratii trebuie sa faca un loop.<br>
Exemplu:<br>
for (int i = 0; i < 5; i++) {<br>
    System.out.println("Hello, world!");<br>
}<br>
');

INSERT INTO `LearnJavaDB`.`whileinfo` (`title`, `description`)
VALUES ('While ',
        '
While se foloseste atunci cand nu stim numarul de iteratii.<br>
Conditia este verificata inainte de fiecare iteratie.<br>
Exemplu:<br>
int i = 0;<br>
while (i < 5) {<br>
    System.out.println("Hello, world!");<br>
    i++;<br>
}<br>
');

INSERT INTO `LearnJavaDB`.`dowhileinfo` (`title`, `description`)
VALUES ('Do While ',
        '
Do while este similar cu while, dar conditia este verificata dupa fiecare iteratie.<br>
Exemplu:<br>
int i = 0;<br>
do {<br>
    System.out.println("Hello, world!");<br>
    i++;<br>
} while (i < 5);<br>
');

INSERT INTO `LearnJavaDB`.`foreachinfo` (`title`, `description`)
VALUES ('For Each ',
        '
For each este folosit pentru a parcurge elementele unui array.<br>
Exemplu:<br>
int[] numbers = {1, 2, 3, 4, 5};<br>
for (int number : numbers) {<br>
    System.out.println(number);<br>
}<br>
');

INSERT INTO `LearnJavaDB`.`iteration` (`title`, `description`)
VALUES ('Iteration',
        '
O iteratie se refera la procesuk de executie repeata a unui loop.<br>
Loop-ul itereaza asupra unei colectii cum ar fi matrice sau lista, si efectueaza o serie de instructiuni pentru fiecare lement.<br>
Procesul de iteratie se termina atunci cand nu mai sunt elemente in colectie sau atunci cand se atinge anumit numar de iteratii.<br>
');




