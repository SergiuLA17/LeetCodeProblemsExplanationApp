CREATE TABLE `LearnJavaDB`.`datastructureinfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);





INSERT INTO `LearnJavaDB`.`datastructureinfo` (`title`, `description`)
VALUES ('Data structure ',
        '
Structurile de date sunt, o modalitate de a organiza si stoca datele, astfel incat acestea sa poata fi utilizate eficient. <br>
Structurile de date sunt folosite in programare pentru a stoca date, pentru a le organiza si pentru a le procesa. <br>
');

INSERT INTO `LearnJavaDB`.`datastructureinfo` (`title`, `description`)
VALUES ('Tipuri de structuri de date:',
        '
<ul>
    <li><a href="http://localhost:7777/stackInfo">>>Stack<<</a></li>
    <li><a href="#">Queque</a></li>
    <li><a href="#">Heap</a></li>
    <li><a href="http://localhost:7777/hashTableInfo">>>HashTable<<</a></li>
    <li><a href="http://localhost:7777/RedBlackTreeInfo">Red and Black Tree</a></li>
    <li><a href="http://localhost:7777/enumInfo">>>Enum<< </a></li>
</ul>
');



