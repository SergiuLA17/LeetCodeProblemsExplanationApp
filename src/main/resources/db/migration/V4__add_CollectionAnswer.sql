INSERT INTO `LearnJavaDB`.`collectionAnswer` (`title`, `description`)
VALUES ('Collection este o interfata care defineste un grup de obiecte numite elemente.',
        '
Collection este interfata de baza in framework-ul Java Collections.<br>
Collection ofera metode de lucru cu elemente ca, adaugarea, stergerea, cautarea elmenetelor.<br>
Cu alte cuvinte Collection repreinta un container care ofera diferite metode de lucru cu elementele care se afla in el. <br>
Collection ofera mai multe interfete ca:<br>
');

INSERT INTO `LearnJavaDB`.`collectionAnswer` (`title`, `description`)
VALUES ('1)List',
        '
List este colectia care stcheaza elementele intr-o anumita ordine si elementele se acceseaza dupa index.<br>
Interfata list se implementeaza in clasele ArrayList si LinkedList.<br>
Avantajele list sunt mentinerea odrinei elementelor, ce permite accesarea lor dupa index.<br>
Este foarte flexibila, datorita faptului ca putem adauga, elimina sau modifica elementele. Putem folosi orice tip de date.<br>
Este rapida si eficienta, deoarece foloseste ca structura de date matrice.<br>
Sunt dinamice, adica cand nu stim cantitatea de elemente, listele pot fi usor modificate dupa lungime.<br>
Dinte dezavantaje putem evidentia ca pot folosi multă memorie, daceasta problema apare atunci cand lucram cu memorie limitata sau cand vrem sa optimizam un program.<br>
Pot fi mai lente in unele operatiuni ca, inserarea sau stergerea elementelor din mijlocul listei.<br>

');

INSERT INTO `LearnJavaDB`.`collectionAnswer` (`title`, `description`)
VALUES ('2)Set',
        '
Set este o colectie care stocheaza elemente unice, oridnea lor nu este garantata.<br>
Clasese care implementeaza interfata Set sunt HashSet, LinkedHashSet si TreeSet.<br>
Avantajele set sunt:<br>
-Seturile nu permit elemente duplicate.<br>
-Elementele din set sunt imutabile, prezinta avantak cand avem nevoie sa elemente neschimbate.<br>
-Set se foloseste cu alte colectii ca list si map, pentru a efectua operatie de intersectie, reuniune, diferenta.<br>

Din dezavantaje putem evidentia:<br>
-Nu este compatibila cu alte stuclute de date, deoarece nu mentine ordinea elementelor.<br>
-Seturile nu permit accesarea elementelor dupa index.<br>
-Au aceleasi dezavantaje ca si listele, adica pot folosi multa memorie si pot fi mai lente in unele operatii.<br>
<br>
<br>
');

INSERT INTO `LearnJavaDB`.`collectionAnswer` (`title`, `description`)
VALUES ('Queue - este o interfata care stocheaza elemente in ordinea in care au fost adaugate.',
        '
Clasele care sunt implementate de aceasta interfata sunt: LinkedList, PriorityQueue, ArrayDeque.<br>
Structura de date folosita este FIFO (First In First Out), adica primul element adaugat va fi si primul element eliminat.<br>
Avantajele acestei structuri de date sunt:<br>
- elementele sunt adaugate si eliminate in ordinea in care au fost adaugate si eliminate.<br>
- are un numar mic dar efectiv de metode, ce face ca aceasta sa fie mai rapida decat alte structuri de date.<br>
- este folosita la sarcinile unde este important ordinea in care au fost adaugate elementele.<br>
- este folosita in threaduri in rezolvarea problemei producer-consumer.<br>
Dezavantajele acestei structuri de date sunt:<br>
- nu are metode pentru accesarea elemntelor din interilorul cozii.<br>
');


INSERT INTO `LearnJavaDB`.`collectionAnswer` (`title`, `description`)
VALUES ('4)Dequeue',
        '
Este interfață care reprezintă o coadă cu două capete, care este o coadă care permite adăugarea sau eliminarea elementelor de la fiecare capăt.<br>
Exemple de clase care implementează interfața Deque includ ArrayDeque și LinkedList.<br>


');

INSERT INTO `LearnJavaDB`.`collectionAnswer` (`title`, `description`)
VALUES ('5)Map',
        '
Map este interfata care salveaza perechi de chei si valori, fiecare cheie este unica.<br>
Exemple de clase care implementeaza interfata Map includ HashMap, TreeMap si LinkedHashMap.<br>
Avantajele maps este cautarea rapida, deoarece se implementeza structura de date hash table.<br>
Din aceasta cauza operatiile de stergere si inserare sunt deasemenea rapide.<br>
<br>
<br>
Dezavantajul este ca nu se mentine oprdinea elementelor, , din cauza data se poate face un numar limitat de operatiuni, ca stergerea, inserarea si cautarea. Filtrarea si sortarea nu sunt posibile.<br>
Din cauza ca se foloseste hash table, este posibil de a avea coliziuni, astfel se poate reduce performanta programului deoarece necesita mai mult timp pentru a rezolva coleziune.
Necesita memorie multa pentru a stoca date.
<br>
<br>
');

INSERT INTO `LearnJavaDB`.`collectionAnswer` (`title`, `description`)
VALUES ('6)SortedMap',
        '
SortedMap este o interfata care extinde Map, care mentine ordinea elementelor in functie de chei.<br>
Exemple de clase care implementeaza interfata SortedMap includ TreeMap.
<br>
<br>
Avantajele SortedMap este ca mentine ordinea elementelor, deoarece se implementeza structura de date red-black tree.<br>
Din aceasta cauza operatiile de stergere si inserare sunt deasemenea rapide.<br>
Dezavantajele sunt ca si la Map, din cauza ca se foloseste red-black tree, este posibil de a avea coliziuni, astfel se poate reduce performanta programului deoarece necesita mai mult timp pentru a rezolva coleziune.
<br>
<br>
');
