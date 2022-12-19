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

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('De ce Java este un limbaj care poate lucra pe orce platform?',
        'Pentru ca este un limbaj cross-platforma.');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('De ce Java nu se socoate 100% orientata pe obiecte?',
        '<a href="http://localhost:7777/primitive">Pentru ca are variabile primitive.</a>');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Ce-i asta autoboxing/unboxing?',
        '<a href="http://localhost:7777/autoboxing">Atribuirea automata al variabilelor primitive la calse wrapper.</a>');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Care este diferența dintre o metodă și un <a href="classConstructor.html">constructor?',
        '<p><a href="classConstructor.html">Constructorul</a> participă la crearea instanței, pe când metoda reprezintă o instrucțiune. </p> <p><a href="classConstructor.html">Constructorul</a> obligatoriu are denumirea ca și clasa. Metoda are ori ce denumire.</p>
<p> Metodele pot fi suprascrise și supraâncărcate, pe cănd <a href="classConstructor.html">constructorul</a> poate fi doar supraâncărcat.
Nu este sens să-l suprascrim, suprascrierea se face la metodele moștenite, dar
<a href="classConstructor.html">constructorul</a> prea conportamentul de la <a href="classConstructor.html">constructorul</a> superclasei și
java, nu ne va permite să-l suprascrim.</p> <p><a href="classConstructor.html">constructorul</a> apelează prin operatorul "new", metodele dacă sunt statice, prin denumirea clase, dacă nu, prin instansul obiectului.</p>');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Va fi apelat <a href="classConstructor.html">constructorul</a> superclasei când este creat obiectul moștenit.',
        'Da.');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Ce este incapsularea?',
        'Un pilon al POO.');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Putem o pentru this sa setam null?',
        'Nu, deoarece obietul nu poate să-și piarda referința la el însuși.');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Care este diferenta dintre interface si clasa <a href="OOPMostenireAbstract.html">abstracta</a>?',
        'Clasa <a href="OOPMostenireAbstract.html">abstracta</a> poate avea variabile, <a href="classConstructor.html">constructor</a> pentru aceste variabile, metode
implementate sau metode abstracte.</p>
<p>In interfate sunt metode care obligatoriu vor vi implementate in clase care va implementa interfata.</p>
<p>Metodele in <a href="OOPMostenireInterface.html">interfata</a> sunt numai publice</p>
<p>Metodele in clase <a href="OOPMostenireAbstract.html">abstracta</a> sunt cu toate tipuri de <a href="OOPIncapsulareModificators.html">modificatpor</a>.</p>
<p><a href="OOPMostenireInterface.html">Interfata</a> reprezinta o abilitate. Clasa abstracta reprezint o stare a obiectului.</p>
<p>Clasa <a href="OOPMostenireAbstract.html">abstracta</a> este mostenita de acelasi tip de obiecte.
De ex: tipuri de masine, sedan, coupe ect.
Interfatele pot fi implementate de diferite tipuri de obiect.
De ex: a merge, a zbura ect.</p>');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Cand avem posibilitatea de a folosi si <a href="OOPMostenireInterface.html">interfata</a> si clasa <a href="OOPMostenireAbstract.html">abstracta</a>, ce vom alege?',
        'Vom alege <a href="OOPMostenireInterface.html">interfata</a>, deoarece <a
href="OOPMostenireInterface.html">interfata</a> reprezinta un contract care se va realiza in orce caz, deoarece are
metoda cu <a href="OOPIncapsulareModificators.html">modificatorul</a> <a href="OOPIncapsulareModificators.html">public</a>, pe cand in clase abstracte,
metodele pot avea toate tipurile, ce nu garanteaza ca vom putea realiza metoda in orice loc al proeictului.</p>');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Care este diferenta dintre HashSet si <a href="collectionTreeSet.html">TreeSet</a>',
        '<p>Unda dintre diferente este ca au diferite structuri de date, una are <a href="OOPStrucDataHashTable.html">HashTable?</a>, alta are RedBlackWhite.</p>
<p>Alta diferenta este in timpul de realizare a operatiilor, HashSet este mai rapid(constanta), <a href="collectionTreeSet.html">TreeSet</a> este mai lent(Logarifmica).</p> in ordine, HashSet nu.</p>
<p>In hashSet putem avea null, in <a href="collectionTreeSet.html">TreeSet</a> nu.</p>');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Cum se compara obiectele in <a href="collectionHashSet.html">HashSet</a>?',
        '<p>Cu ajutorul metodei equals si hashCode, le aranjam in lista pentru a le putea accesa in timp constant.</p>');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Poate <a href="collectionTreeSet.html">TreeSet</a> avea null?',
        '<p>Nu, deoarece in <a href="collectionTreeSet.html">TreeSet</a> elementele sunt sortate si in cazul dat,
seface comparatie intre obiecte, si daca se face comparatie cu null, atunci se arunca exceptie.
<a href="collectionTreeSet.html">TreeSet</a> este de tip homogeneous objects.</p>');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Ce fel de metode se folosesc pentru sortare si comparare obiectelor <a href="collectionTreeSet.html">TreeSet</a>?',
        '<p>Putem sa folosim interfata Comparable, care are 2 metode, compare so compare to. Daca nu folosim interfata Comparable, atunci se foloseste natural-ordering.</p>');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Ce este JRE?',
        '<p>JRE este Java Runtime Environment, este un mediu de executie pentru a rula aplicatii Java.</p>
<p>Se foloseste pentru a rula aplicatii deja gata.</p>');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Cum de procedat cand avem de lucrat cu o parola si cum sa ne asiguram ca in heap nu a ramas parola?',
        '<p>Putem parola sa o inscrim intr-un char array si dupa ce am termita de lucru cu parola,
in char array putem schimba valorile in care vrem, deoarece char array nu este mutabil
in comparatie cu String. </p>');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Care este diferenta intre HashMap si <a href="OOPStrucDataHashTable.html">HashTable?',
        '<p>In <a href="OOPStrucDataHashTable.html">HashTable</a> nu poate sa salva null, toate metodele sunt sincronizate din cauza data ea lucreaza mai lent. </p>
<p><a href="OOPStrucDataHashTable.html">HashTable</a> nu este recomandata pentru folosinta, este invechita, mai bine de folosit HashMap </p>
<p>Daca avem nevoie de a folosi pentru paralelism putem folosi ConcurrentHashMap</p>');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Cum putem crea o <a href="classImmutableClass.html">clasa immutable?</a>',
        '<img class="center" alt="" src="../../../../photo/interviewPractice/1.png" ">');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Ce o safiseze in codul de mai jos?',
        '<img class="center" alt="" src="../../../../photo/interviewPractice/img_1.png" ">
<p>Raspuns:</p>
<p>Se va afisa "Not Equal", deoarece char daca sunt obiecte diferite, ele se adreseaza la aceleiasi referinta din heap</p>');

INSERT INTO `LearnJavaDB`.`classes` (`title`, `description`)
VALUES ('Clasele sunt modele',
        '<p class="mb-4">Clasele sunt modele pentru obiecte.
Clasele sunt definite prin cuvântul cheie class.
Clasele pot conține:
<ul>
<li>date</li>
<li>metode</li>
</ul>
</p>');

INSERT INTO `LearnJavaDB`.`nullword` (`title`, `description`)
VALUES ('Clasele sunt modele',
        '<p class="mb-4">Clasele sunt modele pentru obiecte.
Clasele sunt definite prin cuvântul cheie class.
Clasele pot conține:
<ul>
<li>date</li>
<li>metode</li>
</ul>
</p>');

INSERT INTO `LearnJavaDB`.`staticword` (`title`, `description`)
VALUES ('Clasele sunt modele',
        '<p class="mb-4">Clasele sunt modele pentru obiecte.
Clasele sunt definite prin cuvântul cheie class.
Clasele pot conține:
<ul>
<li>date</li>
<li>metode</li>
</ul>
</p>');

INSERT INTO `LearnJavaDB`.`pooinfo` (`title`, `description`)
VALUES ('POO represinta o abordare in care un program este considerat o multime de obiecte care interactioneaaz intre ele.',
        '<p>Fieacre avand proprietati si comportament. Permite scrierea codului mai rapida si mai izibila. </p>
<p> Poo are 4 piloni:</p>
<ul>
<li>Abstractizarea</li>
<li><a href="OOPincapsulare.html">Incapsularea</a></li>
<li>Mostenirea</li>
<li>Poliformizm</li>
</ul>');

INSERT INTO `LearnJavaDB`.`pooinfo` (`title`, `description`)
VALUES ('Avantajele POO:',
        '<ul>
<li>Permite scrierea unui cod structurat, ceia ce permite altor programamtori sa-l intaleaga.
Datorita incapsularii, se reduc numarul de greseli si permit crearea mai rapida a programelor in grup.</li>
<li>POO cod este foarte usor de schimbat, extins sau adaugat. Datorita poliformizmului putem adapta codul la cerintele sarcinii fara a crea noi obiecte si functii. </li>
<li>POO permite crearea de programe mai complexe, care sa poata fi folosite de cat mai multe persoane. </li>
<li>Datorita pilonilor sai, nu este nevoie de scris unul si acelasi cod de mai multe ori. Interfatele si clasele pot fi transformate in biblioteci, care pot fi folosite in alte proiecte. </li>
</ul>');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Dezavantajele POO:',
        '<ul>
<li>Greu de inteles.</li>
<li>Datorita particularitatilor accesului la date si a numarului mare de entitai, programele scrise pot lucra mai lent.  </li>
<li>COdul scris este mai mare si ocupa mai mult loc. Astfel programele pot avea greutate mare. </li>
</ul>');





