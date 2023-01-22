CREATE TABLE `LearnJavaDB`.`hibernateinfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);


INSERT INTO `LearnJavaDB`.`hibernateinfo` (`title`, `description`)
VALUES ('Hibernate',
        '

Hibernate este un framework ORM (Object-Relational Mapping) bazat pe Java, care oferă o modalitate puternică și
flexibilă de a interacționa cu bazele de date relaționale.
Simplifică dezvoltarea aplicațiilor Java, permițând dezvoltatorilor să lucreze cu datele într-un mod mai orientat pe obiecte,
în loc să fie nevoiți să scrie instrucțiuni SQL de nivel scăzut.

'
);

INSERT INTO `LearnJavaDB`.`hibernateinfo` (`title`, `description`)
VALUES ('Hibernate oferă mai multe caracteristici cheie, inclusiv:',
        '
Maparea obiect-relațională: Hibernate permite dezvoltatorilor să mapeze obiecte Java la tabele de baze de date relaționale și invers, folosind o configurație XML simplă și flexibilă sau bazată pe Java.
Persistență automată: Hibernate persistă automat modificările aduse obiectelor în baza de date și, de asemenea, poate prelua automat obiecte din baza de date atunci când sunt necesare.
Generarea de interogări: Hibernate oferă un limbaj de interogare puternic și flexibil numit HQL, care poate fi folosit pentru a genera interogări complexe în baze de date.
Memorarea în cache: Hibernate oferă suport pentru stocarea în cache la diferite niveluri, cum ar fi caching la nivel de sesiune și de nivel al doilea, care poate ajuta la îmbunătățirea performanței aplicației.
Tranzacții: Hibernate oferă o modalitate simplă și flexibilă de a gestiona tranzacțiile și se poate ocupa automat de eliminarea modificărilor din baza de date.
'
);

INSERT INTO `LearnJavaDB`.`hibernateinfo` (`title`, `description`)
VALUES ('Hibernate',
        '
Hibernate este utilizat pe scară largă și unul dintre cele mai populare cadre ORM pentru Java, este un proiect open source sub licența Apache
și poate fi folosit cu orice alte cadre bazate pe Java, cum ar fi Spring sau Struts.'
);






