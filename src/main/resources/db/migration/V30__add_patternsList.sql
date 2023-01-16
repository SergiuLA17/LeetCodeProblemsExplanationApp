CREATE TABLE `LearnJavaDB`.`patternslist`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);


INSERT INTO `LearnJavaDB`.`patternslist` (`title`, `description`)
VALUES ('Patterns',
        '
<ul>
    <li><a href="http://localhost:7777/GOFanswer">GoF</a></li>
    <li><a href="http://localhost:7777/GRASPAnswer">GRASP</a></li>

</ul>
');


