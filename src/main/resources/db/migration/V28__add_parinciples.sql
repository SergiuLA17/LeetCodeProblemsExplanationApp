CREATE TABLE `LearnJavaDB`.`principieslist`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);


INSERT INTO `LearnJavaDB`.`principieslist` (`title`, `description`)
VALUES ('Principles',
        '
<ul>
    <li><a href="http://localhost:7777/solidAnswer">SOLID</a></li>
    <li><a href="http://localhost:7777/kissAnswer">KISS</a></li>
    <li><a href="http://localhost:7777/DRYanswer">DRY</a></li>
    <li><a href="http://localhost:7777/YAGNIanswer">YAGNI</a></li>
</ul>
');


