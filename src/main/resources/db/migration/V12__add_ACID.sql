CREATE TABLE `LearnJavaDB`.`acidinfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `LearnJavaDB`.`normalform`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `LearnJavaDB`.`isolationlevel`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `LearnJavaDB`.`acidanswer`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);



INSERT INTO `LearnJavaDB`.`acidinfo` (`title`, `description`)
VALUES ('ACID înseamnă Atomicity, Consistency, Isolation, and Durability. ',
        '
Acestea sunt cele patru proprietăți care sunt folosite pentru a descrie comportamentul unui sistem de management al bazei de date atunci când execută tranzacții.
');

INSERT INTO `LearnJavaDB`.`acidinfo` (`title`, `description`)
VALUES ('În contextul Java,',
        '
ACID este adesea folosit pentru a se referi la proprietățile tranzacțiilor care sunt executate folosind Java Database Connectivity (JDBC).
JDBC este un API Java care permite programelor Java să acceseze și să manipuleze baze de date. Tranzacțiile în JDBC pot fi controlate folosind interfața java.sql.Connection, care oferă metode pentru pornirea, efectuarea și derularea tranzacțiilor.
');

INSERT INTO `LearnJavaDB`.`acidinfo` (`title`, `description`)
VALUES ('În contextul Java,',
        '
Pentru a se asigura că tranzacțiile sunt conforme cu ACID, driverul JDBC și sistemul de gestionare a bazei de date trebuie să respecte anumite reguli.
De exemplu, proprietatea Atomicity necesită fie ca toate operațiunile dintr-o tranzacție să fie finalizate, fie nici una dintre ele. Acest lucru asigură că baza de date rămâne într-o stare consecventă chiar dacă o tranzacție eșuează.

ACID este un concept important în sistemele de baze de date deoarece ajută la asigurarea integrității și consecvenței datelor, chiar și în fața erorilor sau a defecțiunilor.
');


INSERT INTO `LearnJavaDB`.`normalform` (`title`, `description`)
VALUES ('Normal Form ',
        '
În teoria bazelor de date, se spune că o bază de date este în formă normală dacă îndeplinește anumite criterii menite să reducă redundanța și dependența datelor. Există mai multe forme normale diferite în care poate fi o bază de date, variind de la prima formă normală (1NF) la a cincea formă normală (5NF).
');

INSERT INTO `LearnJavaDB`.`normalform` (`title`, `description`)
VALUES ('Prima formă normală (1NF)',
        '
Prima formă normală (1NF) necesită ca un tabel al bazei de date să aibă o cheie primară unică și ca fiecare coloană să conțină o singură valoare. Acest lucru asigură că fiecare rând din tabel reprezintă o entitate unică și că nu există redundanță de date într-un rând.
');

INSERT INTO `LearnJavaDB`.`normalform` (`title`, `description`)
VALUES ('A doua formă normală (2NF) ',
        '
A doua formă normală (2NF) se bazează pe 1NF cerând ca toate atributele non-cheie dintr-un tabel să fie dependente de întreaga cheie primară. Acest lucru ajută la reducerea redundanței și dependenței dintre coloane.
');

INSERT INTO `LearnJavaDB`.`normalform` (`title`, `description`)
VALUES ('A treia formă normală (3NF)',
        '
A treia formă normală (3NF) duce 2NF un pas mai departe, solicitând ca toate atributele non-cheie dintr-un tabel să fie dependente numai de cheia primară și nu de orice alte atribute non-cheie.
Acest lucru ajută la eliminarea oricăror dependențe tranzitive rămase și asigură că datele din tabel sunt complet dependente de cheia primară.');

INSERT INTO `LearnJavaDB`.`normalform` (`title`, `description`)
VALUES ('Boyce-Codd (BCNF) și a cincea formă normală (5NF) ',
        '
Mai există două forme normale dincolo de 3NF, cunoscute sub numele de formă normală Boyce-Codd (BCNF) și a cincea formă normală (5NF). Aceste forme normale sunt mai specializate și nu sunt la fel de frecvent utilizate ca 1NF, 2NF și 3NF.
');


INSERT INTO `LearnJavaDB`.`isolationlevel` (`title`, `description`)
VALUES ('Nivelul de izolare a tranzacțiilor',
        '
Într-o bază de date, nivelul de izolare se referă la gradul în care modificările efectuate de o tranzacție sunt izolate de modificările efectuate de alte tranzacții.
Niveluri de izolare diferite oferă niveluri diferite de protecție împotriva tranzacțiilor care se execută concomitent.
');

INSERT INTO `LearnJavaDB`.`isolationlevel` (`title`, `description`)
VALUES ('Here are some common isolation levels:
Read Uncommitted:',
        '
Acesta este cel mai scăzut nivel de izolare. Permite unei tranzacții să citească date care nu au fost încă comise de alte tranzacții.
Acest lucru poate duce la citiri murdare, în care o tranzacție citește date care sunt ulterior anulate de o altă tranzacție.
');

INSERT INTO `LearnJavaDB`.`isolationlevel` (`title`, `description`)
VALUES ('Read Committed ',
        '
Acesta este un nivel de izolare mai mare decât citirea necommitată.
Se asigură că o tranzacție nu poate citi date care nu au fost comise de alte tranzacții.
Acest lucru previne citirile murdare, dar nu împiedică alte fenomene, cum ar fi citirile nerepetabile și citirile fantomă.
');

INSERT INTO `LearnJavaDB`.`isolationlevel` (`title`, `description`)
VALUES ('Repeatable Read: ',
        '
Acest nivel de izolare merge mai departe decât citirea comisă, asigurându-se că o tranzacție nu poate citi date care au fost modificate, dar care nu au fost încă comise de alte tranzacții.
De asemenea, previne citirile nerepetabile, în care o tranzacție citește același rând de mai multe ori și primește date diferite de fiecare dată din cauza altor tranzacții care modifică datele între citiri. Cu toate acestea,
nu împiedică citirile fantomă, în care o tranzacție citește mai multe rânduri și obține rezultate diferite de fiecare dată din cauza altor tranzacții care inserează sau șterg rânduri între citiri.
');

INSERT INTO `LearnJavaDB`.`isolationlevel` (`title`, `description`)
VALUES ('Serializable:  ',
        '
Acesta este cel mai înalt nivel de izolare. Oferă cea mai puternică protecție împotriva tranzacțiilor concurente, asigurându-se că tranzacțiile se execută ca și cum ar fi fost executate pe rând, în serie.
Acest lucru previne toate fenomenele descrise mai sus (citiri murdare, citiri nerepetabile și citiri fantomă).
');

INSERT INTO `LearnJavaDB`.`isolationlevel` (`title`, `description`)
VALUES ('Serializable:  ',
        '
Colectorul de gunoi este o parte importantă a mediului de rulare Java, deoarece ajută la prevenirea scurgerilor de memorie prin eliberarea automată a memoriei care nu mai este utilizată.
Acest lucru este util în special în programele Java de lungă durată, unde cantitatea de memorie utilizată de program poate crește în timp dacă obiectele neutilizate nu sunt eliberate.');


INSERT INTO `LearnJavaDB`.`acidanswer` (`title`, `description`)
VALUES ('ACID ',
        '
ACID - sunt o serie de cerinte care salveaza datele in baza de date.<br>
Aceste cerinte sunt:<br>
Atomicitate - garanteaza ca o tranzactie este executata in intregime sau nu este executata deloc.<br>
Transactia reprezinta un grup de requesturi care sunt executate ca un singur request.<br>
Consistency - garanteaza ca datele din baza de date sunt corecte, adica exista o stare consistenta a bazei, si daca ddupa fiecare tranzactie, baza trebuie sa fie in aceeasi stare consistenta.<br>
');
INSERT INTO `LearnJavaDB`.`acidanswer` (`title`, `description`)
VALUES ('ACID ',
        '
Isolation - garanteaza ca tranzactiile sunt executate independent de alte tranzactii, dar aici pot aparea probleme de sincronizare.<br>
Trebuie de izolat tranzactiile pentru a nu se intampla ca o tranzactie sa citeasca datele inainte ca alta tranzactie sa le modifice.<br>
<br>
<br>
Sunt 2 de rezolvare a acestei probleme:<br>
1.Blocking - atunci cand o tranzactie se executa, datele sunt blocate si nu pot fi modificate de alte tranzactii.<br>
2.Versioning - atunci cand baza de date  foloseste o versiune a datelor, si cand o tranzactie este executata,
se creeaza o noua versiune a datelor, si daca o alta tranzactie vrea sa citeasca datele, se va citi versiunea anterioara a datelor.<br>
<br>
Durabilitate - garanteaza ca datele sunt salvate permanent in baza de date, chiar daca sistemul de operare sau calculatorul se opreste brusc.<br>
');

