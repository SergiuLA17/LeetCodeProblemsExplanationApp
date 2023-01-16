CREATE TABLE `LearnJavaDB`.`fieldinfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO `LearnJavaDB`.`fieldinfo` (`title`, `description`)
VALUES ('Fields ',
        '
Campurile sunt variabilele unei clase numite si instante. In ele se stocheaza datele.<br>
Campurile sunt de tip primitiv si de tip referinta.<br>
Cumpurile pot fi definite de diferiti modificatori.<br>
Campurile pot fi initializate cu o valoare implicita.<br>
Exemplu: <br>
//field<br>
int a = 5;<br>
');




