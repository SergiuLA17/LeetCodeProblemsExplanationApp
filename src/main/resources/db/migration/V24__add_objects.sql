CREATE TABLE `LearnJavaDB`.`objectinfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO `LearnJavaDB`.`objectinfo` (`title`, `description`)
VALUES ('Object ',
        '
In Java un obiect reprezinta instanta unei clase. O clasa reprezinta un modul sau un sablon, care are anumite proprietati
sau comportament.<br>
Exemplu:<br>
Person person = new Person();<br>
In exemplul de mai sus, person este un obiect de tipul Person.<br>
<br>
Obiectele pot fi transmise ca argumente, returnate de la metode si stocate in structuri de date.<br>
Java este un limbaj orientat pe obiecte, ceea ce inseamna ca toate datele sunt reprezentate ca obiecte.<br>
In Java toate clasele sunt mostenite de la clasa Object.<br>
');




