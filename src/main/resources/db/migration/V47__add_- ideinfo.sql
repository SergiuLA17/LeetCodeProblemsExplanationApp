CREATE TABLE `LearnJavaDB`.`ideinfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);


INSERT INTO `LearnJavaDB`.`ideinfo` (`title`, `description`)
VALUES ('IDE',
        '
Un mediu de dezvoltare integrat (IDE) este o aplicație software care oferă un set cuprinzător de instrumente pentru dezvoltarea de software. <br>
IDE-urile includ de obicei un editor de cod, un compilator sau un interpret și un depanator. <br>
Acestea sunt concepute pentru a face dezvoltarea software-ului mai eficientă, oferind o locație centralizată pentru toate instrumentele necesare unui proiect.<br>

');

INSERT INTO `LearnJavaDB`.`ideinfo` (`title`, `description`)
VALUES ('IDE',
        '
Unele IDE-uri populare pentru dezvoltarea Java includ:

Eclipse: Eclipse este un IDE open-source care este utilizat pe scară largă pentru dezvoltarea Java. Este cunoscut pentru extensibilitatea sa și are o comunitate mare și activă de dezvoltatori care contribuie la dezvoltarea sa.<br>
IntelliJ IDEA: IntelliJ IDEA este un IDE proprietar dezvoltat de JetBrains. Este cunoscut pentru capabilitățile sale avansate de analiză și refactorizare a codului.<br>
NetBeans: NetBeans este un IDE open-source care este utilizat pe scară largă pentru dezvoltarea Java. Este cunoscut pentru suportul pentru mai multe limbi și pentru integrarea cu alte instrumente precum GlassFish și Apache Tomcat.<br>
Visual Studio Code: Visual Studio Code este un editor de cod ușor, open-source, dezvoltat de Microsoft. Are o gamă largă de extensii care pot fi folosite pentru a sprijini dezvoltarea Java și este popular printre dezvoltatori.<br>
BlueJ: BlueJ este un IDE gratuit, open-source, conceput special pentru predarea și învățarea Java. Este simplu, ușor de utilizat și excelent pentru începători.<br>
');

INSERT INTO `LearnJavaDB`.`ideinfo` (`title`, `description`)
VALUES ('IDE',
        '
Alegerea unui IDE va depinde de nevoile specifice ale dezvoltatorului și ale proiectului.
Unii dezvoltatori preferă IDE-urile care sunt ușoare și rapide, în timp ce alții preferă IDE-urile cu caracteristici și funcționalități mai avansate.
');





