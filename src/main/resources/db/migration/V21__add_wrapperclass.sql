CREATE TABLE `LearnJavaDB`.`wrapperclass`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);





INSERT INTO `LearnJavaDB`.`wrapperclass` (`title`, `description`)
VALUES ('Wrapper class ',
        '
Sunt clase convertesc variabilele primitive in obiecte si obiectele in variabile primitive.<br>
Pentru a converta se foloseste tehnologia de auto-boxing si unboxing.<br>
<br>
<ul>
    <li><a href="http://http://localhost:7777/autoboxing">>>auto-boxing si unboxing<<</a></li>
</ul>
');




