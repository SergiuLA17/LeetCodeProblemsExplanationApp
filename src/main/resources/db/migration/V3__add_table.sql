INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('De ce Java este un limbaj care poate lucra pe orce platform?',
        '
<input type=checkbox id="show">
<label id="dev" for="show">Raspuns: </label>
<span id="content">Pentru ca este un limbaj cross-platforma.</span>
');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('De ce Java nu se socoate 100% orientata pe obiecte?',
        '<a href="http://localhost:7777/primitive">Pentru ca are variabile primitive.</a>');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Ce-i asta autoboxing/unboxing?',
        '<a href="http://localhost:7777/autoboxing">Atribuirea automata al variabilelor primitive la calse wrapper.</a>');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Care este diferența dintre o metodă și un <a http://localhost:7777/constructors">constructor?',
        '<p>Constructorul participă la crearea instanței, pe când metoda reprezintă o instrucțiune. </p>
<p><a href="classConstructor.html">Constructorul</a> obligatoriu are denumirea ca și clasa. Metoda are ori ce denumire.</p>
<p> Metodele pot fi suprascrise și supraâncărcate, pe cănd constructorul poate fi doar supraâncărcat.
Nu este sens să-l suprascrim, suprascrierea se face la metodele moștenite, dar
constructorul prea conportamentul de la constructorul superclasei și java, nu ne va permite să-l suprascrim.</p>
<p>constructorul apelează prin operatorul "new", metodele dacă sunt statice, prin denumirea clase, dacă nu, prin instansul obiectului.</p>');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Va fi apelat <a http://localhost:7777/constructors">constructorul</a> superclasei când este creat obiectul moștenit.',
        'Da.');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Ce este incapsularea?',
        'Un pilon al POO.');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Putem o pentru this sa setam null?',
        'Nu, deoarece obietul nu poate să-și piarda referința la el însuși.');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Care este diferenta dintre interface si clasa <a http://localhost:7777/abstractClass">abstracta</a>?',
        'Clasa abstracta poate avea variabile, <a http://localhost:7777/constructors">constructor</a> pentru aceste variabile, metode
implementate sau metode abstracte.</p>
<p>In <a href="http://localhost:7777/interfaceClass">interfata</a> sunt metode care obligatoriu vor vi implementate in clase care va implementa interfata.</p>
<p>Metodele in interfata sunt numai publice</p>
<p>Metodele in clase abstracta sunt cu toate tipuri de <a href="http://localhost:7777/modificators">modificator</a>.</p>
<p>Interfata reprezinta o abilitate. Clasa abstracta reprezint o stare a obiectului.</p>
<p>Clasa abstracta este mostenita de acelasi tip de obiecte.
De ex: tipuri de masine, sedan, coupe ect.
Interfatele pot fi implementate de diferite tipuri de obiect.
De ex: a merge, a zbura ect.</p>');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Cand avem posibilitatea de a folosi si <a href="http://localhost:7777/interfaceClass">interfata</a> si clasa <a href="http://localhost:7777/abstractClass">abstracta</a>, ce vom alege?',
        'Vom alege interfata, deoarece interfata reprezinta un contract care se va realiza in orce caz, deoarece are
metoda cu <a href="href="http://localhost:7777/modificators">modificatorul</a> public, pe cand in clase abstracte,
metodele pot avea toate tipurile, ce nu garanteaza ca vom putea realiza metoda in orice loc al proeictului.</p>');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Care este diferenta dintre HashSet si <a href="http://localhost:7777/treeSetInfo">TreeSet</a>',
        '<p>Unda dintre diferente este ca au diferite structuri de date, una are <a href="http://localhost:7777/hashTableInfo">HashTable?</a>, alta are RedBlackWhite.</p>
<p>Alta diferenta este in timpul de realizare a operatiilor, HashSet este mai rapid(constanta), TreeSet este mai lent(Logarifmica).</p> in ordine, HashSet nu.</p>
<p>In hashSet putem avea null, in TreeSet nu.</p>');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Cum se compara obiectele in <a href="http://localhost:7777/hashsets">HashSet</a>?',
        '<p>Cu ajutorul metodei equals si hashCode, le aranjam in lista pentru a le putea accesa in timp constant.</p>');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Poate <a href="http://localhost:7777/treeSetInfo">TreeSet</a> avea null?',
        '<p>Nu, deoarece in TreeSet elementele sunt sortate si in cazul dat,
seface comparatie intre obiecte, si daca se face comparatie cu null, atunci se arunca exceptie.
<a href="collectionTreeSet.html">TreeSet</a> este de tip homogeneous objects.</p>');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Ce fel de metode se folosesc pentru sortare si comparare obiectelor <a href="http://localhost:7777/treeSetInfo">TreeSet</a>?',
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
VALUES ('Care este diferenta intre HashMap si <a href="http://localhost:7777/hashTableInfo">HashTable?',
        '<p>In HashTable nu poate sa salva null, toate metodele sunt sincronizate din cauza data ea lucreaza mai lent. </p>
<p><a href="OOPStrucDataHashTable.html">HashTable</a> nu este recomandata pentru folosinta, este invechita, mai bine de folosit HashMap </p>
<p>Daca avem nevoie de a folosi pentru paralelism putem folosi ConcurrentHashMap</p>');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Cum putem crea o <a href="http://localhost:7777/immutable§">clasa immutable?</a>',
        '<img class="center" alt="" src="../../../../photo/interviewPractice/1.png" ">');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Ce o safiseze in codul de mai jos?',
        '<img class="center" alt="" src="../../../../photo/interviewPractice/img_1.png" ">
<p>Raspuns:</p>
<p>Se va afisa "Not Equal", deoarece char daca sunt obiecte diferite, ele se adreseaza la aceleiasi referinta din heap</p>');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Ce este un <a href="http://localhost:7777/enumInfo">enum</a>?',
        'Este o structura de date care contine o lista de valori predefinite, care nu pot fi modificate.');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Care este avantajul <a href="http://localhost:7777/enumInfo">enum</a> faca de constante?',
        'Avantajul este ca putem sa folosim <a href="http://localhost:7777/enumInfo">enum</a> in switch, in comparatie cu constante, care nu pot fi folosite in switch.
Enum are restrictii fata de tip, pe cand constantele nu au restrictii. De exemplu dorim sa primimt un tip de date, dar cand folosim constante, noi nu stim ce tip de date primim. ');

INSERT INTO `LearnJavaDB`.`interview` (`title`, `description`)
VALUES ('Care este diferenta intre <a href="http://localhost:7777/scopeInfo">scope</a> singletone si prototype?',
        'Scope singletone este un singur obiect, care este creat o singura data, si este folosit de toate clasele pana la stoparea programului.
Pe cand prototype este creat la request si durata de viata este pana la sfarsitul requestului.');
