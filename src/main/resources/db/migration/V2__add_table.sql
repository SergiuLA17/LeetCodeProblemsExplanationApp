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
        'Fieacre avand proprietati si comportament. Permite scrierea codului mai rapida si mai izibila.
Poo are 4 piloni:
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


INSERT INTO `LearnJavaDB`.`gettersetter` (`title`, `description`)
VALUES ('Sunt folosite pentru a face legatura proiectul in care lucram si obiect de care avem nevoie.',
        'Si in caz cand se fac modificari in obiect, proiectul nu este afectat de erori.');

INSERT INTO `LearnJavaDB`.`modificators` (`title`, `description`)
VALUES ('private',
        'pentru  clasele mostenite variabilele nu sunt vizibile,
pentru clasele din acelasi pachet variabilele nu sunt vizibile,
pentru clasele din alte pachete variabilele nu sunt vizibile,
pentru clasele din alte proiecte variabilele nu sunt vizibile');

INSERT INTO `LearnJavaDB`.`modificators` (`title`, `description`)
VALUES ('public',
        'pentru  clasele mostenite variabilele sunt vizibile
pentru clasele din acelasi pachet variabilele sunt vizibile
pentru clasele din alte pachete variabilele sunt vizibile
pentru clasele din alte proiecte variabilele sunt vizibile');

INSERT INTO `LearnJavaDB`.`modificators` (`title`, `description`)
VALUES ('default',
        'pentru  clasele mostenite variabilele nu sunt vizibile
pentru clasele din acelasi pachet variabilele sunt vizibile
pentru clasele din alte pachete variabilele nu sunt vizibile
pentru clasele din alte proiecte variabilele nu sunt vizibile');

INSERT INTO `LearnJavaDB`.`modificators` (`title`, `description`)
VALUES ('protected',
        '<p>pentru  clasele mostenite variabilele sunt vizibile</p>
<p>pentru clasele din acelasi pachet variabilele sunt vizibile</p>
<p>pentru clasele din alte pachete variabilele nu sunt vizibile</p>
<p>pentru clasele din alte proiecte variabilele nu sunt vizibile</p>');

INSERT INTO `LearnJavaDB`.`mostenire` (`title`, `description`)
VALUES ('Este un mecanism de creare a clase pe baza altui clas, care permite utilizarea caracteristicilor si comportamentelor clasei de baza in clasa derivata.',
        'Clasa de baza se mai numeste super sau clasa parinte. </p>
<p>Clasa derivata se mai numeste sub sau clasa copil.</p>
<p>Se face mostenirea prin cuvantul cheie extends.</p>
<p>Clasa copil nu poate mosteni varibile si metode private</p>
<p>Pentru a rescrie o metoda din super clasa, se adauga cuvantul cheie @Override</p>
<p>Putem apela o metoda din super clasa cu super.metoda()</p>
<p>Nu putem mosteni de la mai multe clase.</p>
<p>Dece?</p>
<p>Deatata</p>
<p>Cand se creaza un exemplar din clasa copil, se apeleaza constructorul din clasa parinte, iar apoi constructorul din clasa copil.</p>
<img class="center zoom" alt="" src="../../../../photo/mostenire/img.png" ">

<img class="center zoom" alt="" src="../../../../photo/mostenire/img_1.png" ">
<img class="center zoom" alt="" src="../../../../photo/mostenire/img_2.png" ">');

INSERT INTO `LearnJavaDB`.`abstractclass` (`title`, `description`)
VALUES ('Este un mecanism de creare a clase pe baza altui clas, care permite utilizarea caracteristicilor si comportamentelor clasei de baza in clasa derivata.',
        'In clasa abstracta nu putem crea obiecte, dar putem sa o mostenim.
Pentru a crea o clasa abstracta, folosim cuvantul cheie abstract.
In clasa abstracta putem ave metode cat abstracte, care nu au o implementare si prezinta abilitatile obiectului, dar si metode care au implementare.
Putem crea variabile si sa le initializam in clasa abstracta. Putem crea constructori.
Clasa abstracta nu poate fi finala deoarece clasa abstracta numai decat trebuie sa fie mostenita.');

INSERT INTO `LearnJavaDB`.`interfaceclass` (`title`, `description`)
VALUES ('Interface',
        '<p>Interfața are scop de care lega 2 obiecte care interacționează între ele. </p>
<p>Interfața a fost creata pentru a rezolva problema mostenirii multipla. </p>
<p>Interfața nu poate avea constructori. </p>');

INSERT INTO `LearnJavaDB`.`interfaceclass` (`title`, `description`)
VALUES ('Modelam o situație.',
        'Avem o familie, mama, tata și copil.
Mama si tata au cate ceva, ce copilul ar dori sa moștenească, în cazul dat culoarea parului al tatălui si culoarea ochilor al mamei.
Realizarea doar cu clase nu este posibilă, deoarece moștenirea multiplă nu este permisă în Java.');

INSERT INTO `LearnJavaDB`.`hashtableinfo` (`title`, `description`)
VALUES ('HashTable',
        '<p>Este o structura de date abstracta, inseamna ca nu are un model standatizat de implementare, implementarea depinde de in mare parte de limbajul de programare.</p>
<p>HashTable este o colectie de date care stocheaza perechi de cheie si valoare.</p>
<p>Este posibila introducerea valorii null pentru cheie sau valoare.</p>
<p>Un exemplar are 2 parametri, care afecteaza performanta, acesti parametri sunt: initialCapacity si loadFactor.</p>
<ul>
    <li>initialCapacity - capacitatea initiala a tabelei hash.</li>
    <li>loadFactor - factorul de incarcare al tabelei hash. De baza este 0.75.</li>
</ul>

<p>La intrare in HashTable se transmite chesi si valoarea. Valoarea se vor stoca intr-un array care se va crea la initializare,
se trec prin hash-functie, care pe urma in alta functie se transforma in index din array</p>');

INSERT INTO `LearnJavaDB`.`hashtableinfo` (`title`, `description`)
VALUES ('Hash functie.',
        '<p> In exemplul dat avem cheie de tip string, se aduna toate codurile ale caracterilor si se imparte la capacitatea initiala a tabelei hash si se ea restul ca index .</p>
<p>In cazul ca avem o cheie de tip int, putem doar sa folosim acest int ca index.</p>
<img class="center zoom" alt="" src="../../../../photo/hashTable/img.png" ">

<ul>
<li>Hash-codu pentru String: se ia valoarea ascii a fiecarui caracter si se aduna</li>
<li>Hash-codu pentru Integer: se ia valoarea integer-ului</li>
<li>Hash-codul pentru obiecte: se ea toate campurile obiectului si se ia hashcode-ul fiecarui camp si se aduna, pentru
a nu avea colizii,  fiecare canm se inmulteste la un numar impar, mai des 31</li>
</ul>

<p>O hash function trebuie sa indeplineasca urmatoarele conditii:</p>
<ul>
<li>Pentru una si aceiasi cheie, hash function trebuie sa returneze aceelasi index</li>
<li>Pentru doua chei diferite, hash function trebuie sa returneze indexe diferite, astfel incat sa nu se produca coliziuni</li>
<li>Hash function trebuie sa fie rapida, adica sa nu fie prea complexa, pentru a nu afecta performanta</li>
<li>Hash function trebuie sa nu returneze index care sa depaseasca capacitatea tabelei</li>
</ul>');

INSERT INTO `LearnJavaDB`.`stackinfo` (`title`, `description`)
VALUES ('Stack',
        'Stack este o structura de datae cu principiul de lucru, ultimul a venit - ultimul a iesit(LIFO).
In stack se stocheaza
Pentru manipularea cu stack sunt 2 metode:
<p>1)Pop - scoaterea datelor</p>
<p>2)Push - introducrea datelor. Cand se foloseste metoda pop() se face controlul daca marimea stackului
nu depaseste dcat cea curenta, daca depaseste, atunci se mareste lungimea.</p>');

INSERT INTO `LearnJavaDB`.`treesetinfo` (`title`, `description`)
VALUES ('Reprezinta o substructura in forma de tree, modelul de structura tree este des folosit in programare si in viata.',
        'De exemplu, cand avem o lista cu numere de telefoane, ca sa ne fie mai usro de gasit numarul dorit, le impartim dopa prima litera,
     daca sunt telefoane tot multe, le imparti, dupa primele 2 litere si asa mai departe, astfel se reduce consecutiv timpul de cautare');

INSERT INTO `LearnJavaDB`.`redblacktreeinfo` (`title`, `description`)
VALUES ('Reprezinta o substructura in forma de tree, modelul de structura tree este des folosit in programare si in viata.',
        'De exemplu, cand avem o lista cu numere de telefoane, ca sa ne fie mai usro de gasit numarul dorit, le impartim dopa prima litera,
     daca sunt telefoane tot multe, le imparti, dupa primele 2 litere si asa mai departe, astfel se reduce consecutiv timpul de cautare.');

INSERT INTO `LearnJavaDB`.`enuminfo` (`title`, `description`)
VALUES ('Enum sunt niste constante de acelati tip.',
        'Ele se folosesc acolo unde este nevoie de folosit constante care sunt legate cu un sens comun.
Astfel enum are un avantaj fata de constante, ca se poate folosi in switch, iar constantele nu. Alta diferenta este ca enum poate avea metode.
Constantele nu au restrictii de tip, iar enum are restrictii de tip.');

INSERT INTO `LearnJavaDB`.`enumpractice` (`title`, `description`)
VALUES ('Partea 1:',
        'Avem variabila Mercury, care ne spune ca este denumirea planete, dar in in mifologie Mercury este denumirea zeului, care este zeul vitezei.
Cum se poate de facut ca sa putem deferentia planeta de zeu?
<img class = "center zoom"alt="" src="../photo/practice/img.png">
Putem crea inca o variabila, care o vom numi MercuryZeus, dar asta nu este o solutie buna, deoarece daca avem 1000 de planete, atunci vom avea 1000 de variabile.
Dar cand un cuvant poate fi folosit in mai multe contexte, de exemplu Mars
<img class = "center zoom"alt="" src="../photo/practice/img_1.png">
In cazul dat putem folosi enum, care ne va permite sa folosim aceeasi variabila pentru mai multe contexte.');

INSERT INTO `LearnJavaDB`.`enumpractice` (`title`, `description`)
VALUES ('Partea 2:',
        'Petru a scapa de situatia cand avem multe variabile, care au acelasi nume, dar sunt folosite in contexte diferite, putem folosi enum.
<img class = "center zoom"alt="" src="../photo/practice/img_2.png">');

INSERT INTO `LearnJavaDB`.`enumpractice` (`title`, `description`)
VALUES ('Partea 3:',
        'Avem o situatie cand avem o metoda care afiseaza salutuil zeilor, cum se poate de facut, ca in aceasta metoda sa trasnmitem doar numele zeului, ca sa nu putem sa transmitem de exemplu denumirea planetei, chear daca tehnic aceasta e posibil?
        <img class = "center zoom"alt="" src="../photo/practice/img_3.png">
In cazul dae enum-ul ne ajuta. Simplu cream un enum cu numele zeilor si schimbar parametrul primit.
<img class = "center zoom"alt="" src="../photo/practice/img_4.png>');

INSERT INTO `LearnJavaDB`.`scopeinfo` (`title`, `description`)
VALUES ('Scope-ul este zona in care o variabila este vizibila.',
        'Exista mai multe tipuri de scope:
<ul>
<li>Singleton - clasa se va crea la pornirea programei de catre spring si exista pana cand programul se va finisa.</li>
<li>Prototype - clasa va fi creata de catre spring la fiecare request si va fi distrusa la sfarsitul requestului.</li>
By default, spring foloseste singleton, dar daca vrem sa folosim prototype, trebuie sa adaugam  @Scope("prototype")
');

INSERT INTO `LearnJavaDB`.`beaninfo` (`title`, `description`)
VALUES ('Anotatia @Bean este folosita pentru a crea un bean.',
        'bean-ul este o instanta a unei clase, care este creata si administrat de catre spring, care este folosita in aplicatie.
         Spring creaza bean-ul si il roleaza in container, care este un obiect care contine toate bean-urile. Din container se extrag bean-urile, care sunt folosite in aplicatie.

');
INSERT INTO `LearnJavaDB`.`beaninfo` (`title`, `description`)
VALUES ('Bean-urile se salveaza in container classa ApplicationContext.',
        'Clasa data se creaza la initializarea applicatiei si dirijeaza cu ciclul de viata al bean-urilor.

');

INSERT INTO `LearnJavaDB`.`iocinfo` (`title`, `description`)
VALUES ('Spring IoC reprezinta reprezinta un principiu de proiectare, permite ca obiectele sa nu fie create de catre noi, ci de catre spring.',
        '
In Spring IoC se realizeaza prin Dependency Injection (DI).
Dependency Injection - injectarea dependintelor, este o metoda prin care se injecteaza dependintele in clasa, fara ca aceasta sa le creeze. Aceasta se face prin anotatia @Autowired.
Utilizarea IoC și a injecției de dependențe poate ajuta la modulararea unei aplicații și la mai ușor de întreținut,
deoarece permite o separare a preocupărilor și facilitează schimbarea sau înlocuirea dependențelor fără a afecta restul aplicației.
');

INSERT INTO `LearnJavaDB`.`iocinfo` (`title`, `description`)
VALUES ('Practice:',
        '
<img class = "center zoom"alt="" src="../photo/IoC/dasd.png">
<br><br><br><br><br><br>
');

INSERT INTO `LearnJavaDB`.`configInfo` (`title`, `description`)
VALUES ('@Configuration indica faptul ca clasa este o clasa de configurare. ',
        '
In aceasta clasa se vor crea bean-urile. Ele vor fi folosite de catre spring. Aceasta anotatie se foloseste in configuratii mai complee.
Pentru configuratii mai simple se foloseste @Component.
');


INSERT INTO `LearnJavaDB`.`componentInfo` (`title`, `description`)
VALUES ('@Component indica faptul ca clasa este un component si este si trebuie sa fie inregistrat ca un bean.
',
        '
        Aceasta anotatie de obicei se foloseste in configuratii mai simple,
        cu anotatia ComponentScan, care indica Spring-ului sa caute toate clasele cu anotatia Component si sa le inregistreze ca bean-uri.
        ');

INSERT INTO `LearnJavaDB`.`componentInfo` (`title`, `description`)
VALUES ('@ComponentScan indica faptul ca Spring trebuie sa caute toate clasele cu anotatia Component si sa le inregistreze ca bean-uri.',
        '
Putem folosi diferite parametri pentru a specifica unde sa caute Spring.
<img class = "center zoom"alt="" src="../photo/component/dasd.png">
În exemplul de mai sus, clasa AppConfig este adnotată cu @Configuration, ceea ce indică faptul că definește una sau mai multe definiții Bean.
Adnotarea @ComponentScan îi spune lui Spring să scaneze pachetul com.example.services pentru clase adnotate cu @Component și să creeze bean-uri din acestea.
');

INSERT INTO `LearnJavaDB`.`importinfo` (`title`, `description`)
VALUES ('@Import este o adnotare Spring care este folosită pentru a importa alte clase @Configuration și pentru a avea definițiile Bean adăugate la contextul aplicației curente.
Este adesea folosit în combinație cu adnotarea @Configuration pentru a crea și configura fasole într-un mod mai flexibil și mai puternic.
',
        '
<img class = "center zoom"alt="" src="../photo/component/dasd.png">
În exemplul de mai sus, clasa AppConfig este adnotată cu @Configuration,
ceea ce indică faptul că definește una sau mai multe definiții Bean.
Adnotarea @Import îi spune lui Spring să importe clasele AppConfig1 și AppConfig2 și să aibă definițiile Bean adăugate în contextul aplicației.
        ');

INSERT INTO `LearnJavaDB`.`joinsinfo` (`title`, `description`)
VALUES ('Prin operatorul join se poate de unit datele din doua tabele.',
        '
Exista mau multe tipuri de join-uri, cele mai folosite sunt:
INNER JOIN
LEFT JOIN
RIGHT JOIN
');

INSERT INTO `LearnJavaDB`.`joinsinfo` (`title`, `description`)
VALUES ('INNER JOIN - returneaza randurile care au valori comune in ambele tabele.',
        '
De exemplau avem 2 tabele:
Customers
<img class = "center zoom"alt="" src="../photo/sql/innerjoin/img_1.png">
Order
<img class = "center zoom"alt="" src="../photo/sql/innerjoin/img.png">
Daca folosim comanda:
<img class = "center zoom"alt="" src="../photo/sql/innerjoin/img_3.png">
Care spune ca vrem sa returnam toate campurile din tabelul Customers si Order, unde id-ul din tabelul Customers este egal cu id-ul din tabelul Order.
Rezultatul va fi:
<img class = "center zoom"alt="" src="../photo/sql/innerjoin/img_2.png">
Pentru comanda data:
<img class = "center zoom"alt="" src="../photo/sql/innerjoin/img_4.png">
Care pune ca vrem sa primim toate campurile din tabelul Customers si Order, unde id-ul custumerului din tabelul Customers este egal cu id-ul orderului din tabelul Order.
Rezultatul:
<img class = "center zoom"alt="" src="../photo/sql/innerjoin/img_5.png">
Campurile 3 si 4 din tabelul Order nu vor intra in rezultat, deoarece nu exista niciun id din tabelul Customers care sa fie egal cu id-ul din tabelul Order.
');

INSERT INTO `LearnJavaDB`.`joinsinfo` (`title`, `description`)
VALUES ('Sarcina este de afisat toate persoanele care preda la cursul de Java.',
        '
Avem tabelalel urmatoare.
Tipul de cursuri:
<img class = "center zoom"alt="" src="../photo/practiceSql/img.png">
Persoanele care preda la cursuri:
<img class = "center zoom"alt="" src="../photo/practiceSql/img_1.png">
Cursele:
<img class = "center zoom"alt="" src="../photo/practiceSql/img_2.png">

Comanda:
<img class = "center zoom"alt="" src="../photo/practiceSql/img_3.png">

');
