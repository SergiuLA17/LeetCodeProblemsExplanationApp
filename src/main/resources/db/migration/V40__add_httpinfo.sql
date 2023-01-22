CREATE TABLE `LearnJavaDB`.`httpinfo.`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);


INSERT INTO `LearnJavaDB`.`httpinfo.` (`title`, `description`)
VALUES ('HTTP',
        '
HTTP este un protocol pentru transmiterea datelor prin internet.
Este fundamentul comunicării de date pentru World Wide Web.
Acest protocol defenite un set de reguli pentru a permite clientilor si serverilor sa comunice.
Metodele HTTP sunt: GET, POST, PUT, DELETE, HEAD, OPTIONS, TRACE, CONNECT.
');

INSERT INTO `LearnJavaDB`.`httpinfo.` (`title`, `description`)
VALUES ('HTTP',
        '
GET - este folosit pentru a cere o resursa de pe un server.
POST - este folosit pentru a trimite o resursa pe un server.
PUT - este folosit pentru a trimite o resursa pe un server.
DELETE - este folosit pentru a sterge o resursa de pe un server.
HEAD - este folosit pentru a cere o resursa de pe un server.
OPTIONS - este folosit pentru a cere o resursa de pe un server.
TRACE - este folosit pentru a cere o resursa de pe un server.
CONNECT - este folosit pentru a cere o resursa de pe un server.

');


