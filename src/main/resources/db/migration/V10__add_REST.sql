CREATE TABLE `LearnJavaDB`.`restinfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `LearnJavaDB`.`restanswer`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `LearnJavaDB`.`soapinfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `LearnJavaDB`.`soapanswer`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);



INSERT INTO `LearnJavaDB`.`restinfo` (`title`, `description`)
VALUES ('REST - Representational State Transfer',
        '
este un stil arhitectural software care definește un set de constrângeri și proprietăți bazate pe HTTP.
Este folosit pentru a construi servicii web care sunt ușoare, ușor de întreținut și scalabile.
');

INSERT INTO `LearnJavaDB`.`restanswer` (`title`, `description`)
VALUES ('REST - Representational State Transfer
',
        '
REST este o arhitectură ușoară, bazată pe web, care este concepută pentru a facilita construirea de servicii web care sunt scalabile și ușor de întreținut.
REST folosește un protocol HTTP simplu și nu necesită mesaje XML sau reguli complexe de procesare a mesajelor.
REST este adesea folosit în aplicații moderne, bazate pe cloud, unde un număr mare de clienți pot accesa resursele furnizate de un server.
');


INSERT INTO `LearnJavaDB`.`restinfo` (`title`, `description`)
VALUES ('Here is an example of a simple RESTful API implemented using Spring Boot in Java:
',
        '
<img class = "center zoom"alt="" src="../photo/rest/img.png">

Acest API ascultă solicitările HTTP GET la calea „/hello/{name}” și returnează un mesaj „Hello {name}!”.
Adnotarea @GetMapping specifică că metoda trebuie apelată pentru solicitările HTTP GET, iar adnotarea @PathVariable injectează valoarea variabilei cale {name} în metodă.
');

INSERT INTO `LearnJavaDB`.`scopeinfo` (`title`, `description`)
VALUES ('SOAP - Simple Object Access Protocol',
        '
Este un protocol pentru schimbul de mesaje printr-o rețea.
Este adesea folosit pentru a trimite date între un server și un client într-o aplicație web.
În Java, puteți utiliza pachetul javax.xml.soap pentru a crea mesaje SOAP și a le trimite către un server SOAP.
');

INSERT INTO `LearnJavaDB`.`scopeinfo` (`title`, `description`)
VALUES ('Iată un exemplu de mesaj SOAP simplu în Java:',
        '
<img class = "center zoom"alt="" src="../photo/soap/img.png">

Acest cod creează un mesaj SOAP cu un singur element în corp numit „sayHello” care conține textul „Hello, World!”.
Apoi puteți trimite acest mesaj către un server SOAP utilizând o SOAPConnection și SOAPConnectionFactory.
');

INSERT INTO `LearnJavaDB`.`soapanswer` (`title`, `description`)
VALUES ('SOAP - Simple Object Access Protocol',
        '
Este un protocol pentru schimbul de mesaje printr-o rețea.
SOAP este un protocol de servicii web bazat pe standarde care utilizează XML pentru formatarea mesajelor.
Acesta definește un set de reguli pentru crearea mesajelor care pot fi schimbate între sisteme și specifică modul în care aceste mesaje trebuie procesate.
SOAP este folosit de obicei în aplicațiile de întreprindere, unde un server centralizat oferă servicii multor clienți.

În general, SOAP este considerat a fi mai puternic și mai flexibil decât REST, dar este și mai complex și poate fi mai dificil de lucrat.
REST este în general mai simplu și mai ușor de utilizat, dar este și mai puțin puternic și mai puțin flexibil decât SOAP.
');