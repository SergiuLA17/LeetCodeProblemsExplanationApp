CREATE TABLE `LearnJavaDB`.`springcoreinfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);


INSERT INTO `LearnJavaDB`.`springcoreinfo` (`title`, `description`)
VALUES ('Spring Core',
        '
Spring Core este fundamentul Spring Framework, oferind funcționalitatea de bază pentru injectarea dependenței și inversarea controlului,
precum și alte caracteristici, cum ar fi programarea orientată pe aspecte și suportul pentru șabloane.
Este un cadru ușor care poate fi folosit pentru a dezvolta aplicații de sine stătătoare sau ca bază pentru construirea de sisteme mai mari.
Spring Core oferă, de asemenea, un model de programare consistent într-o varietate de medii, ceea ce îl face o alegere populară pentru dezvoltarea Java pentru întreprinderi.
');






