CREATE TABLE `LearnJavaDB`.`lcbeaninfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `LearnJavaDB`.`omainfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `LearnJavaDB`.`jpainfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO `LearnJavaDB`.`jpainfo` (`title`, `description`)
VALUES ('JPA - Java Persistence API',
        '
Spring Data JPA este un modul cadru Spring care oferă suport pentru Java Persistence API (JPA) -
o specificație Java pentru accesarea, persistența și gestionarea datelor între obiectele/clasele Java și o bază de date relațională.

Spring Data JPA facilitează implementarea depozitelor bazate pe JPA (un nume de lux pentru implementarea modelului DAO)
și simplifică foarte mult dezvoltarea straturilor de acces la baze de date. Oferă mai multe beneficii, printre care:
');

INSERT INTO `LearnJavaDB`.`jpainfo` (`title`, `description`)
VALUES ('Reduced boilerplate code:',
        '
nu trebuie să scrieți atât de mult cod pentru a accesa baza de date, deoarece puteți utiliza metodele încorporate
Spring Data JPA sau puteți crea propriile dvs. urmând câteva convenții simple.
');

INSERT INTO `LearnJavaDB`.`jpainfo` (`title`, `description`)
VALUES ('Consistency:',
        '
Spring Data JPA oferă o abordare consecventă a accesului la date care funcționează în diferite implementări și baze de date JPA.
');

INSERT INTO `LearnJavaDB`.`jpainfo` (`title`, `description`)
VALUES ('Flexibility:',
        '
puteți suprascrie comportamentul implicit al unei metode furnizând o implementare proprie sau puteți utiliza
interogări denumite pentru a specifica exact cum ar trebui să se execute o metodă.
');

INSERT INTO `LearnJavaDB`.`jpainfo` (`title`, `description`)
VALUES ('Pentru a utiliza Spring Data JPA, trebuie să:',
        '
Definiți-vă entitățile JPA (de exemplu, clasa @Entity)
Creați o interfață de depozit Spring Data JPA (de exemplu, CrudRepository)
Utilizați interfața de depozit în stratul dvs. de servicii
Configurați stratul de persistență (de exemplu, sursa de date, fabrica de manager de entități) folosind Spring
');



INSERT INTO `LearnJavaDB`.`omainfo` (`title`, `description`)
VALUES ('ORM - Object-Relational Mapping',
        '
Un ORM (Object-Relational Mapping) este un instrument software care ajută dezvoltatorii să lucreze cu o bază de date
într-un mod orientat pe obiecte. În Java, există multe cadre ORM populare, cum ar fi Hibernate, EclipseLink și Spring Data JPA.
Aceste cadre vă permit să definiți schema bazei de date folosind obiecte Java și apoi să mapați automat între acele obiecte și
rândurile corespunzătoare din tabelele bazei de date. Acest lucru poate face mult mai ușor să lucrați cu o bază de date din codul dvs.
Java, deoarece puteți manipula datele folosind concepte familiare orientate pe obiect, în loc să fiți nevoit să scrieți interogări SQL brute.
');




INSERT INTO `LearnJavaDB`.`lcbeaninfo` (`title`, `description`)
VALUES ('Bean Life Cycle',
        '
În Spring primăverii, ciclul de viață al unui bean se referă la diferitele etape prin care trece un bean de la crearea sa până la distrugerea sa.
Ciclul de viață exact al unui bean depinde de tipul de bean și de configurația containerului Spring.
');

INSERT INTO `LearnJavaDB`.`omainfo` (`title`, `description`)
VALUES ('Bean Life Cycle',
        '
În Spring primăverii, ciclul de viață al unui bean se referă la diferitele etape prin care trece un bean de la crearea sa până la distrugerea sa.
Ciclul de viață exact al unui bean depinde de tipul de bean și de configurația containerului Spring.
');

INSERT INTO `LearnJavaDB`.`lcbeaninfo` (`title`, `description`)
VALUES ('Iată ciclul general de viață al unui bean Spring:,',
        '
Instantiation:
containerul Spring creează o instanță a bean-ului folosind un constructor sau o metodă din fabrică.
');

INSERT INTO `LearnJavaDB`.`lcbeaninfo` (`title`, `description`)
VALUES ('Dependency Injection:',
        '
containerul Spring injectează orice dependențe ale bean-ului folosind metode de setare sau constructori.
');

INSERT INTO `LearnJavaDB`.`lcbeaninfo` (`title`, `description`)
VALUES ('Post-procesare:',
        '
containerul Spring efectuează orice inițializare necesară după ce toate dependențele au fost injectate.
Aceasta poate include lucruri precum setarea proprietăților bean-ului sau apelarea metodelor de inițializare.
');


INSERT INTO `LearnJavaDB`.`lcbeaninfo` (`title`, `description`)
VALUES ('Ready for use:',
        '
Bean-ul este acum gata de utilizare de către aplicație.
');

INSERT INTO `LearnJavaDB`.`lcbeaninfo` (`title`, `description`)
VALUES ('Destruction:',
        '
Când recipientul Spring este închis, acesta distruge bean-urile din el.
Aceasta poate include apelarea unei metode de distrugere sau eliberarea oricăror resurse pe care le deține bean-ul.
');

INSERT INTO `LearnJavaDB`.`lcbeaninfo` (`title`, `description`)
VALUES ('',
        '
Cadrul Spring oferă mai multe modalități de personalizare a ciclului de viață al unui bean, cum ar fi utilizarea interfețelor InitializingBean și DisposableBean sau utilizarea adnotărilor @PostConstruct și @PreDestroy.
De asemenea, puteți defini metode personalizate de inițializare și distrugere pentru un bean în configurația sa.
');
