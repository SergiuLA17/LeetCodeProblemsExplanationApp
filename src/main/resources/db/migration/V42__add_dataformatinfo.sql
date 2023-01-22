CREATE TABLE `LearnJavaDB`.`dataformatinfo.`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);


INSERT INTO `LearnJavaDB`.`dataformatinfo.` (`title`, `description`)
VALUES ('XML - Extensible Markup Language. ',
        '
XML este format de date care este folosit pentru a stoca si a transmite date.
XML este un limbaj de marcare, care este folosit pentru a marca textul, pentru a-i da semnificatie.

');

INSERT INTO `LearnJavaDB`.`dataformatinfo.` (`title`, `description`)
VALUES ('JSON - JavaScript Object Notation. ',
        '
JSON este un format de schimb de date text, care este independent de limbaj, si este usor de citit de catre oameni si de a fi scris de catre calculatori.
In Java bibliotecele populare care ofera procesararea JSON sunt Gson si Jackson.
');

INSERT INTO `LearnJavaDB`.`dataformatinfo.` (`title`, `description`)
VALUES ('CSV - Comma Separated Values. ',
        '
CSV este un format bazat pe text pentru stocarea datelor.
Bibliotecele folosite in Java pentru a procesa CSV sunt OpenCSV si Apache Commons CSV.

');

INSERT INTO `LearnJavaDB`.`dataformatinfo.` (`title`, `description`)
VALUES ('Serializable. ',
        '
Java ofera interfate ca Serializable si Desializable pentru a serializa si a deserializa obiecte.
Adica pentru a transforma obiectele in siruri de bytes si pentru a transforma sirurile de bytes in obiecte.
Si a le salva in fisier.

');

INSERT INTO `LearnJavaDB`.`dataformatinfo.` (`title`, `description`)
VALUES ('Serializable. ',
        '
Java ofera interfate ca Serializable si Desializable pentru a serializa si a deserializa obiecte.
Adica pentru a transforma obiectele in siruri de bytes si pentru a transforma sirurile de bytes in obiecte.
Si a le salva in fisier.

');

INSERT INTO `LearnJavaDB`.`dataformatinfo.` (`title`, `description`)
VALUES ('Protocol Buffer. ',
        '
Protocol Protocol Buffers este un format de serializare a datelor neutru pentru limbă și platformă, dezvoltat de Google,
care este utilizat pentru a serializa eficient datele într-un format binar compact.
Google oferă o implementare Java a Protocol Buffers, care este utilizată pe scară largă în sistemele de înaltă performanță.

');

