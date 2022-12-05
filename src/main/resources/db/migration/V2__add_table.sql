INSERT INTO `LearnJavaDB`.`java` (`title`, `description`)
VALUES ('Java cross-platform',
        'Java se pornește pe Java Virtual Machine(JVM).
        Noi scriem cod, care este transformat in bite cod.
        Realizarea JMV este aproape pe toate sistemele de operare.
        Și Java scrisă o dată, poate fi folosită pe orice dispozitiv.');
INSERT INTO `LearnJavaDB`.`java` (`title`, `description`)
VALUES ('Nu este 100% bazată OOP.',
        'Java are date primitive care nu sunt obiecte și se salvează în stack șinu este nevoie de a le elimina din limbaj. Sunt bune pentru optimizare. Dar si ele au clase care prezintă adaptarea acestor primitive la obiecte, ele sunt numite wrapper class, aceste clase sunt create din cauza, ca că collecții nu este posibilitatea de a lucra cu primitive. Și aceste wrapper classe le inlocuește.');

INSERT INTO `LearnJavaDB`.`methods` (`title`, `description`)
VALUES ('Metoda reprezintă o instrucțiune pentru rezolvarea anumitei sarcini.',
        'Daca metoda este statică, ea poate fi apelată print denumirea clasei, iar daca nu, ea poate fi apelată prin instanța clasei.');

INSERT INTO `LearnJavaDB`.`primitive` (`title`, `description`)
VALUES ('<p>Variabilele primitive se stochează in <a href="http://localhost:7777/stacks">stack</a>.</p>',
        '<p>• Un bit este o unitate de informație, care poate avea doar două valori: 0 sau
                                 1. </p>
                             <p>• In Java există 8 tipuri de variabile primitive, care sunt: byte, short, int, long,
                                 float, double, boolean si char.</p>
                             <p>• Un <a href="http://localhost:7777/bytes">byte</a> este o unitate de
                                 informație, care poate avea 256 valori diferite. De la -128 la 127.</p>
                             <p>• Un short este o unitate de informație, care poate avea 65536 valori diferite. De la
                                 -32768 la 32767. Se folosesc mai des când este nevoie de salvat memorie in lucrul cu
                                 tablouri mari.</p>
                             <p>• Un int este o unitate de informație, care poate avea 2^32 valori diferite. De la
                                 -2147483648 la 2147483647.</p>
                             <p>• Fiecare variabila primitivă are o clasă ambalaj(wrapper). Ele sunt create din cauza
                                 că colecțiile nu pot lucra cu primitivele.</p>');

INSERT INTO `LearnJavaDB`.`autoboxing` (`title`, `description`)
VALUES ('Atunci cand o variabila primitiva este atribuita la o variabila de clasa wrapper si invers',
        '<p>Exemplu:<br>
             int i = 10;<br>
             Integer num = i; //autoboxing <br>
             int n = num; //unboxing </p>');

INSERT INTO `LearnJavaDB`.`bytes` (`title`, `description`)
VALUES ('De obicei nu se lucreaza cu byte la nivel inalt.',
        '<p>Byte se foloseste de exemplu la transmiterea infoematiei prin retea, la citirea sa inscrierea datelor din fisiere. Se folosesc la lucrul cu String si codificare. </p>');
INSERT INTO `LearnJavaDB`.`bytes` (`title`, `description`)
VALUES ('Ca regula byte se folosesc pentru stocarea datelor, pentru a limita folosirea memoriei',
        '<p>dar daca o sa le procesam memoria va fi folosita ca si la date de tip int. Deoarece sistema de operare sunt majoritatea pe 32/64 biti, byte si short, vor fi trasnformate in int de 32 de biti.</p>');

INSERT INTO `LearnJavaDB`.`constructors` (`title`, `description`)
VALUES ('Un constructor al clasei reprezintă o metodă, care are ca scop, inițializarea varibilelor clasei.',
        'Se apelează de fiecare dată când este creat obiectul.
        Daca clasa nu are constructor, el va fi automat creat fix ca la superclasa.
        Constructorul poate fi supraîncărcat, adică pot exista mai multe constructori cu același nume, dar cu parametri diferiți.
        Costructorul nu paoate fi suprascris deoarece nu este sens, noi dorim ca el să aibă același comportament ca la superclasa.
        Daca vom crea o instanță a clasei moștenite, atunci constructorul suprclasei va fi apelat și el.');

INSERT INTO `LearnJavaDB`.`immutable` (`title`, `description`)
VALUES ('Clasa imutabila este o clasa care nu poate fi modificata dupa ce a fost creata.',
        'Chear daca facem ceva schimbari in obiect, obiectul va fi creat din nou.
         In Java, clasa String este clasa imutabila. Daca se face o schimbare in obiectul String, se va crea un nou obiect String.
         Clase imutabile in Java sunt toate wrapper classes (Integer, Long, Byte, Short, Character, Boolean, Float, Double), String si clasele enum.');

INSERT INTO `LearnJavaDB`.`referinta` (`title`, `description`)
VALUES ('La crearea acestor date, referinta se salveaza in stack ear obietul se salveaza in heap.',
        'Pentru a crea astfel de obiect, folosim operatorul "new".
        Aceste obiecte in memorie var raspunde garbage collector, el va avea grija in caz ca obiectul care mai are referinta, sa fie sters din memorie.
        <p id="wrapper">~Nu pentru toate obiecte cu referinta este nevoie de folsit operatorul "new". Se vorbeste despre clase wrapper.
        Ex: String var = hi;</p>');

INSERT INTO `LearnJavaDB`.`collections` (`title`, `description`)
VALUES ('Collection este interfata care extinde Iterable si contine metode de adaugare, stergere, cautare si alte metode utile pentru manipularea colectiilor.',
        'Collection contine metodele:<br>
        add() - adauga un element in colectie,<br>
        remove() - sterge un element din colectie,<br>
        contains() - verifica daca un element se afla in colectie,<br>
        size() - returneaza numarul de elemente din colectie,<br>
        isEmpty() - verifica daca colectia este goala,<br>
        toArray() - returneaza un array cu elementele din colectie,<br>
        clear() - sterge toate elementele din colectie,<br>
        addAll() - adauga toate elementele dintr-o colectie in alta colectie,<br>
        containsAll() - verifica daca toate elementele dintr-o colectie se afla in alta colectie,<br>
        equals() - verifica daca doua colectii contin aceleasi elemente,<br>
        hashCode() - returneaza un hashcode pentru colectie.<br>
        De la Collection se extind interfetele List, Set si Queue si clasa abstracta AbstractCollection.
        AbstractCollection este clasa abstracta care implementeaza metodele din interfata Collection, de aceea nu este nevoie sa le implementam noi. ');

INSERT INTO `LearnJavaDB`.`hashsets` (`title`, `description`)
VALUES ('In clasa HashSet se foloseste structura de date <a href="http://localhost:7777/hashtables">HashTable</a> pentru a stoca elementele.',
        'Timpul de executie pentru operatiile de adaugare, stergere si cautare este O(1)(constanta).<br>
        In HashSet putem adauga valoarea null. Odata ca key si cate vrem pentru valoare.<br>
        Compararea, stergerea si cautarea se face ca si in <a href="http://localhost:7777/hashtables">HashTable');

INSERT INTO `LearnJavaDB`.`iterables` (`title`, `description`)
VALUES ('Iterable este interfata care contine o metoda iterator(), aceasta metoda returneaza un obiect de tip Iterator.',
        'Interfata Iterator contine metode hasNext() si next().<br>
        hasNext() returneaza true daca mai exista elemente in colectie,<br>
        next() returneaza elementul curent si muta cursorul la urmatorul element,<br>
        daca nu mai exista elemente in colectie, next() va arunca exceptia NoSuchElementException.');

INSERT INTO `LearnJavaDB`.`lists` (`title`, `description`)
VALUES ('List este interfata care extinde interfata Collection.',
        'List este o colectie care permite elemente duplicate si permite accesarea elementelor prin index.<br>
        <ul>List contine metodele:
        <li>get() - returneaza elementul de pe pozitia index,</li>
        <li>set() - seteaza elementul de pe pozitia index,</li>
        <li>add() - adauga un element in colectie,</li>
        <li>indexOf() - returneaza indexul primului element egal cu elementul dat,</li>
        <li>lastIndexOf() - returneaza indexul ultimului element egal cu elementul dat,</li>
        <li>listIterator() - returneaza un obiect de tip ListIterator,</li>
        <li>subList() - returneaza o sublista cu elementele din intervalul (fromIndex, toIndex).</li></ul>
        <p>List extinde interfetele RandomAccess, Cloneable si Serializable.<br>
        RandomAccess este o interfata marker care indica ca lista este accesata random, adica elementele nu sunt accesate in ordinea in care sunt adaugate.<br>
        Cloneable este o interfata marker care indica ca lista poate fi clonata.<br>
        Serializable este o interfata marker care indica ca lista poate fi serializata.<br>
        Serializarea representeaza procesul de transformare a unui obiect intr-un sir de biti.<br>
        Pentru al pastra intr-un file sau pentru a-l transmite pe retea.<br>
        De la List se extind interfetele ArrayList, LinkedList, Vector si Stack.');

INSERT INTO `LearnJavaDB`.`arraylists` (`title`, `description`)
VALUES ('ArrayList este clasa care extinde clasa AbstractList.',
        'ArrayList implementeaza interfata List.<br>
        De la ArrayList se extind clasa Stack si clasa Vector.<br>
        ArrayList permite elemente duplicate si permite elemente nule.<br>
        Permite de asi schimba dimensiunea.<br>
        Permite accesarea elementelor prin index.<br>
        Permite accesarea elementelor random.<br>
        Permite accesarea elementelor in ordinea in care sunt adaugate.<br>
        ArrayList este reprezentat in memoria calculatorului ca un vector, ce ii permite procesorului de a accesa foarte rapid elementele din memorie');

INSERT INTO `LearnJavaDB`.`sets` (`title`, `description`)
VALUES ('Set mosteneste Collection.',
        'Set este o colectie de elemente care nu sunt ordonate si nu sunt indexate.</p>
        Set nu permite duplicate.<br>
        -metoda add() este suprascrisa pentru a nu permite duplicate.<br>
        In set nu putem accesa un element prin index, deoarece nu sunt indexate.<br>
        Set sunt de tipul HashSet, LinkedHashSet si TreeSet.<br>
        HashSet este cel mai rapid, dar nu este ordonat.<br>
        LinkedHashSet este ordonat, dar nu este cel mai rapid.<br>
        TreeSet este ordonat si este cel mai lent.');

INSERT INTO `LearnJavaDB`.`convertstringtoarrtolist` (`title`, `description`)
VALUES ('Convertarea String array to List array .',
        '<br>
        <img class = "center zoom"alt="" src="../photo/utilits/convertStringArrToList.png" >
        <br>
        <br>
        <br>');