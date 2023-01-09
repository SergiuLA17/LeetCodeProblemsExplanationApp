CREATE TABLE `LearnJavaDB`.`normalizareaanswer`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);



INSERT INTO `LearnJavaDB`.`normalizareaanswer` (`title`, `description`)
VALUES ('Normalizarea bazei de date: ',
        '
Normalizarea sunt criterii si reguli, care trebuie sa corespunda o BD.
Normalizarea are scop de a evita surplusul de date, de a mari performanta bazei de date, de a evita anomalii si de un control mai bun.
Surplusul de date apare atunci cand unul si acelasi atribut^ este folosit in mai multe tabele, la schimbare o sa avem nevoie sa
facem schimbari in toate locurile, in caz contrar, pot aparea diferite anomalii.
Procesul de normalizare aduce o baza de date, la un etalonm, cu cat nivelul de normalizare este mai mare, cu atat baza de date este mai buna.
Exista mai multe nivele de normalizare, iar ordinea cea mai buna este:
1. UNF (unnormalized form) - forma neormalizata, deobicei este o forma initiala, in care nu se respecta niciun criteriu de normalizare.
Datele nu trebuie sa fie numerotate, la inceputul normalizarii.
2. 1NF (first normal form) - prima forma normala, care nu are duplicate
Datele nu trebuie sa se repete,
in celule nu se salveaza mai multe valori,
datele tebue sa fie tipizate, daca este posibil.
3. 2NF (second normal form) - a doua forma normala, care nu are dependente functionale
Datele trebuie sa corespunda primei normalizari.
Tabelul trebuie sa aiba cheie, cu care putem identifica un rand unic. Astfel adaugam o coloana, care va fi cheia primara.
Apoi eliminam dependentele functionale, adica coloanele care depind de cheia primara.
Facem decompozitia tabelului, in mai multe tabele, astfel incat sa nu mai avem dependente functionale,adica daca intr-un tabel sunt 2 sau mai multe dependente intre variabile, atunci facem decompozitia tabelului.
4. 3NF (third normal form) - a treia forma normala, care nu are dependente functionale transitive, inseamna ca nu avem dependente functionale intre coloanele care nu sunt chei primare.
Datele trebuie sa depinda de cheia primara, dar nu de alte date din tabel.

Mai sunt si alte forme, dar ele nu se folosesc, si au mai mult scop teoretic.



');


