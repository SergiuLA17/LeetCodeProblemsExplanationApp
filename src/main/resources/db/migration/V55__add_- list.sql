CREATE TABLE `LearnJavaDB`.`lists`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO `LearnJavaDB`.`lists` (`title`, `description`)
VALUES ('List information',
        '
List este colectia care stcheaza elementele intr-o anumita ordine si elementele se acceseaza dupa index.
Interfata list se implementeaza in clasele ArrayList si LinkedList.
Avantajele list sunt mentinerea odrinei elementelor, ce permite accesarea lor dupa index.
Este foarte flexibila, datorita faptului ca putem adauga, elimina sau modifica elementele. Putem folosi orice tip de date.
Este rapida si eficienta, deoarece foloseste ca structura de date matrice.
Sunt dinamice, adica cand nu stim cantitatea de elemente, listele pot fi usor modificate dupa lungime.
Dinte dezavantaje putem evidentia ca pot folosi multă memorie, daceasta problema apare atunci cand lucram cu memorie limitata sau cand vrem sa optimizam un program.
Pot fi mai lente in unele operatiuni ca, inserarea sau stergerea elementelor din mijlocul listei.
');