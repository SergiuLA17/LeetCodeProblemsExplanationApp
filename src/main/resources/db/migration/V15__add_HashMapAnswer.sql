CREATE TABLE `LearnJavaDB`.`hashtableanswer`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);



INSERT INTO `LearnJavaDB`.`hashtableanswer` (`title`, `description`)
VALUES ('HashTable(HT) - este o structura de date, care permite accesara informatiei dupa cheie.Timpul de accesare este constant.',
        '
HT se folosesc la crearea cache-urilor, indecșilor din baza de date, in procesele limbajelor de exemplu compilator.
Pentru a putea introduce perechi in HT, avem nevoie de a calcula poziția unde va fi amplasat.
Aceasta poziție se calculează prin intermediul unei hash-funtii, care primeste ca parametrul cheia si returneaza indexul.
Daca cheia reprezinta un string, de obicei se calculează suma caracterilor si se imparte la lungimea HT, si restul va reprezenta pozitia.
Dar daca cheia reprezinta un numar, de exemplu numar de telefon, se poate calcula suma cifrelor si se imparte la lungimea HT, si restul va reprezenta pozitia.

');

INSERT INTO `LearnJavaDB`.`hashtableanswer` (`title`, `description`)
VALUES ('Pentru a crea o hash functie, trebuie sa ducem cont de anumiti factori.',
        '
1) Pentru una si aceiași functie, trebuie sa genereze aceiași poziție.
2) Generarea uniforma a indexului.
3) Trebuie sa fie rapida.


');

INSERT INTO `LearnJavaDB`.`hashtableanswer` (`title`, `description`)
VALUES ('Dar exista cazuri, cand dupa calcularea indexului, primit 2 perechi, care au acelasi index, aceasta situatie se numeste coleziune.
',
        '
Sunt 2 tipuri de coleziuni:
1)Adresare deschisa, se cauta in HT pana cand se gaseste pozitia libera.
Daca indexul generat de hash-functie este ocupat, se adauga +1 la indexul primit, si se transmite la hash-functie , asa repetam pana cand gasim indexul liber.
Aceasta metoda se numeste probare liniara.
La aceasta metoda apare cateva probleme.
Daca HT este deja plin, se creaza un HT nou si se copiaza toate elementele in noul HT.
Cand stergem un element, el va fi marcat ca a fost sters. La cautare noi le vom ignora, dar da adaugare le vom suprascrie.
Dar daca se acumuleaza prea multe elemente marcate ca sters, se va face rehashing, se va crea un HT nou si se vor copia toate elementele in noul HT.

Minusurile acestei metode sunt:
-dependenta de metoda de probare, daca vom folosi o metoda nu rea, hash tablita noastra nu va fi efectiva,
-dependenta de volumul HT, daca este prea mica nu va fi eficienta, daca este prea mare, va fi lenta.
Plusurile:
-este eficienta, daca avem o metoda de probare buna, si o HT mare.
-este rapida, deoarece elementele sunt aproape si accesul este rapid.
-folosim mai putina memorie, deoarece nu retinem referinte catre elemente, ci doar chei.

');

INSERT INTO `LearnJavaDB`.`hashtableanswer` (`title`, `description`)
VALUES ('2) Metoda link-urilor ',
        '
Metoda data consta in faptul, daca intalnim colizie, se creaza un linked-list. Astfel in HT noi nu vom salva insusi datele, dar numai referinte catre acestea.
Cautarea in metoda:
1) Se calculeaza indexul.
2) Gasim elementul in HT dupa indeul primit.
3) Daca chia este egala cu cheia cautata, returnam elementul.
4) Dar daca nu, ne uitam la refetinta catre urmatorul element.
5) Iarasi controlma daca chiele corespund.
6) Daca nu sunt egali si nu exista referinta, atunci asa informatie nu exista in HT.

Minusurile:
-se foloseste memorie adaugatoare
-elementele se afla in pozitie diferita in memorie, accesul este mai lent la ele.
Plusurile:
-este usoara implementarea
-numarul de nuante care pot crea probleme este mai mic.


');

