CREATE TABLE `LearnJavaDB`.`iostream`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);




INSERT INTO `LearnJavaDB`.`iostream` (`title`, `description`)
VALUES ('I/O Stream',
        '
Sunt fluxuri de citire si scriere a datelor. Java ofera mai multe clase pentru a realiza acest lucru.<br>
');

INSERT INTO `LearnJavaDB`.`iostream` (`title`, `description`)
VALUES ('InputStream / OutputStream',
        '
Sunt superclase pentru citirea si scrierea datelor. Sunt folosite pentru a citi si scrie datele in binar.<br>

');

INSERT INTO `LearnJavaDB`.`iostream` (`title`, `description`)
VALUES ('Reader / Writer',
        '
Sunt folosite mai des pentru citirea si scrierea datelor in text.<br>

');

INSERT INTO `LearnJavaDB`.`iostream` (`title`, `description`)
VALUES ('FileInputStream / FileOutputStream',
        '
Sunt folosite pentru a citi si scrie datele dintr-un fisier.<br>

');

INSERT INTO `LearnJavaDB`.`iostream` (`title`, `description`)
VALUES ('BufferedReader / BufferedWriter',
        '
Sunt folosite pentru a citi si scrie datele dintr-un fisier text.<br>
Aceste clase sunt mai eficiente decat celelalte clase de citire si scriere a datelor. Deoarece citesc si scriu datele in blocuri.<br>
Astfel, citesc si scriu datele mai rapid.<br>

');

INSERT INTO `LearnJavaDB`.`iostream` (`title`, `description`)
VALUES ('DataInputStream / DataOutputStream',
        '
Sunt folosite pentru citirea unor tipuri de date specifice ca int, double, float, etc.<br>

');

INSERT INTO `LearnJavaDB`.`iostream` (`title`, `description`)
VALUES ('ObjectInputStream / ObjectOutputStream',
        '
Se folosesc pentru a citi si scrie obiecte.<br>

');
