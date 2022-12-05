CREATE TABLE `LearnJavaDB`.`java`
(
    `id`  INT  NOT NULL AUTO_INCREMENT,
    `question` text NULL,
    `answer`   text NULL,
    `category`   text NULL,
    PRIMARY KEY (`id`)
);


INSERT INTO `LearnJavaDB`.`java` (`question`, `answer`,`category`)
VALUES (
            'Java cross-platform',
            'Java se pornește pe Java Virtual Machine(JVM).
            Noi scriem cod, care este transformat in bite cod.
            Realizarea JMV este aproape pe toate sistemele de operare.
            Și Java scrisă o dată, poate fi folosită pe orice dispozitiv.',
            'Java'
        );
INSERT INTO `LearnJavaDB`.`java` (`question`, `answer`,`category`)
VALUES (
           'Nu este 100% bazată OOP',
           'Java are date primitive care nu sunt obiecte și se salvează în stack șinu este nevoie de a le elimina din limbaj.
            Sunt bune pentru optimizare.
            Dar si ele au clase care prezintă adaptarea acestor primitive la obiecte, ele sunt
            numite wrapper class,
            aceste clase sunt create din cauza, ca că collecții nu este posibilitatea de a lucra cu primitive.
            Și aceste wrapper classe le inlocuește.',
           'Java'
       );

