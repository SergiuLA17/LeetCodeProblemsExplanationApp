CREATE TABLE `LearnJavaDB`.`roadmapincapsulare`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `LearnJavaDB`.`roadmapmostenire`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `LearnJavaDB`.`roadmapcollection`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);


INSERT INTO `LearnJavaDB`.`roadmapincapsulare` (`title`, `description`)
VALUES ('Incapsulare',
        '
<ul>
    <li><a href="http://localhost:7777/setterGetter">Getter and Setter</a></li>
    <li><a href="http://localhost:7777/modificators">Modificators</a></li>
</ul>

'
);

INSERT INTO `LearnJavaDB`.`roadmapcollection` (`title`, `description`)
VALUES ('Collection',
        '
Collection este interfata de baza in framework-ul Java Collections.<br>
Collection ofera metode de lucru cu elemente ca, adaugarea, stergerea, cautarea elmenetelor.<br>
Cu alte cuvinte Collection repreinta un container care ofera diferite metode de lucru cu elementele care se afla in el. <br>
Collection ofera mai multe interfete ca:<br>
'
);

INSERT INTO `LearnJavaDB`.`roadmapcollection` (`title`, `description`)
VALUES ('List',
        '
<ul>
    <li><a href="http://localhost:7777/lists">Info</a></li>
    <li><a href="http://localhost:7777/arrayLists">ArrayList</a></li>
    <li><a href="http://localhost:7777/LinkedList">LinkedList</a></li>
</ul>
'
       );

INSERT INTO `LearnJavaDB`.`roadmapcollection` (`title`, `description`)
VALUES ('Sets',
        '
<ul>
    <li><a href="http://localhost:7777/sets">Info</a></li>
    <li><a href="http://localhost:7777/hashsets">HashSet</a></li>
    <li><a href="http://localhost:7777/LinkedList">LinkedHashSet</a></li>
    <li><a href="http://localhost:7777/treeSetInfo">Info</a>TreeSet</li>
    <li><a href="http://localhost:7777/arrayLists">SortedSet</a></li>
    <li><a href="http://localhost:7777/LinkedList">NavigableSet</a></li>
</ul>
'
       );

INSERT INTO `LearnJavaDB`.`roadmapcollection` (`title`, `description`)
VALUES ('Queue',
        '
<ul>
    <li><a href="http://localhost:7777/ququeInfo">Info</a></li>

</ul>
'
       );








