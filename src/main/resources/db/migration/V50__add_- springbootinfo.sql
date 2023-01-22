CREATE TABLE `LearnJavaDB`.`springbootinfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);


INSERT INTO `LearnJavaDB`.`springbootinfo` (`title`, `description`)
VALUES ('Spring Boot',
        '
Spring Boot este un cadru pentru construirea de aplicații autonome, gata de producție, bazate pe Spring.<br>
Este construit pe baza Spring Framework și își propune să simplifice dezvoltarea de noi aplicații Spring,
oferind un set de convenții și bune practici pentru configurarea și lansarea aplicațiilor bazate pe Spring.<br>

'
);

INSERT INTO `LearnJavaDB`.`springbootinfo` (`title`, `description`)
VALUES ('Spring Boot oferă o serie de funcții gata de fabricație, cum ar fi:',
        '
Server web încorporat: Spring Boot poate configura și lansa automat un server web încorporat, cum ar fi Tomcat sau Jetty, pentru a rula aplicația.<br>
Configurare automată: Spring Boot poate configura automat aplicația pe baza dependențelor care sunt prezente pe calea clasei.<br>
Interfață de linie de comandă: Spring Boot oferă o interfață de linie de comandă (CLI) care poate fi utilizată pentru a genera rapid un nou proiect bazat pe Spring.<br>
Spring Boot oferă, de asemenea, o serie de instrumente de dezvoltare utile, cum ar fi Spring Boot Actuator și Spring Boot Developer Tools, care pot fi folosite pentru a monitoriza și gestiona aplicația în timpul dezvoltării și în producție.<br>
'
);

INSERT INTO `LearnJavaDB`.`springbootinfo` (`title`, `description`)
VALUES ('Spring Boot oferă o serie de funcții gata de fabricație, cum ar fi:',
        '
În general, Spring Boot își propune să faciliteze crearea de aplicații de sine stătătoare, bazate pe Spring, de nivel de producție, pe care le puteți „pur și simplu să rulați”.
'
);





