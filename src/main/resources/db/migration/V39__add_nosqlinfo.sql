CREATE TABLE `LearnJavaDB`.`nosqlinfo.`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);


INSERT INTO `LearnJavaDB`.`nosqlinfo.` (`title`, `description`)
VALUES ('NoSQL',
        '
NoSQL este  baza de date care nu folosesc scheme fixe si sunt orientate spre performanta si gestionarea volumelor mari de date.
Exista multe baze de date NoSQL pentru Java, unele dintre ele sunt: MongoDB, Cassandra, CouchDB, Redis, Neo4j, HBase, Riak, Couchbase, OrientDB, MarkLogic, VoltDB, etc.
Hibernate si Spring Data ofera suport pentru aceste baze de date.

');


