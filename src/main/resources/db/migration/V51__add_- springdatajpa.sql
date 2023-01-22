CREATE TABLE `LearnJavaDB`.`springdatajpainfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);


INSERT INTO `LearnJavaDB`.`springdatajpainfo` (`title`, `description`)
VALUES ('Spring Data JPA',
        '

Spring Data JPA este o componentă a Spring Framework care oferă o abordare consecventă, bazată pe domeniu, a accesului la date în aplicațiile Java.<br>
Se bazează pe Java Persistence API (JPA), care este API-ul Java standard pentru interacțiunea cu bazele de date relaționale și oferă o modalitate simplă,
puternică și flexibilă de a accesa și manipula datele dintr-o bază de date.<br>

'
);

INSERT INTO `LearnJavaDB`.`springdatajpainfo` (`title`, `description`)
VALUES ('Spring Data JPA oferă mai multe caracteristici cheie, inclusiv:',
        '

Abstracția depozitului: Spring Data JPA oferă o interfață simplă, generică pentru interacțiunea cu o bază de date, numită depozit, care poate fi implementată cu ușurință pentru orice entitate JPA.<br>
Generarea de interogări: Spring Data JPA generează automat interogări de bază de date pe baza numelui metodei metodei de depozit care este apelată.<br>
Paginare și sortare: Spring Data JPA acceptă paginarea și sortarea rezultatelor interogărilor imediate.<br>
Tranzacții: Spring Data JPA facilitează gestionarea tranzacțiilor într-un mod consistent, declarativ.<br>

'
);

INSERT INTO `LearnJavaDB`.`springdatajpainfo` (`title`, `description`)
VALUES ('Spring Data JPA',
        '
În general, Spring Data JPA își propune să faciliteze lucrul cu bazele de date într-o aplicație Java și să reducă cantitatea de cod standard care trebuie scris pentru accesul la date.<br>
'
);






