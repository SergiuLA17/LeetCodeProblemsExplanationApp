CREATE TABLE `RoadMap`.`roadmap`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

# JMM - Java Memory Model
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('JMM',
        '
<pre2>
JMM(Java Memory Model) reprezinta un set de reguli care determina cum si cand valorile variabilelor sunt vizibile in memorie.
Astfel si comportamentul memoriei intr-un program multi-thread.
Astfel de reguli sunt:
1)Fiecare thread are propriul stack.
2)Operatiile de scriere in variabile sunt vazute de toate thread-urile.
3)Operatiile de citire returneaza cea mai recenta valoare scrisa in variabila.
4)JMM ofera relatia happens-before, care reprerzinta ordinea in care operatiile sunt executate.
Astfel, daca o operatie A are relatia happens-before cu o operatie B, atunci operatia A este executata inaintea operatiei B.

Daca mai pe scurt JMM ajuta la garantarea ca diferite thread-uri vor vedea aceleasi valori pentru variabilele comune.
Garanteaza ca inscrierea in variabile este vizibila pentru toate thread-urile.
Dar nu garanteaza ca nu vor fi curse intre thread-uri. Pentru asta se folosesc mecanisme de sincronizare.

</pre2>
');

# Garbage Collector
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('GarbageCollector',
        '
<pre2>
Garbage Collector este un mecanism care se ocupa de stergerea obiectelor care nu mai sunt folosite.
Garbage Collector-ul este un thread care ruleaza in background.
Garbage Collector-ul are 2 tipuri de colectare:
1)Colectare de tip mark and sweep, unde se marcheaza obiectele care nu mai sunt folosite si apoi se sterg.
2)Colectare de tip reference counting, unde se numara referintele catre un obiect si daca numarul de referinte este 0, atunci se sterge obiectul.

</pre2>
');

# Reflection
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('Reflection',
        '
<pre2>
Reflectia in Java este o tehnica prin care o clasa poate accesa informatii despre ea insasi, cum ar fi numele clasei, constructorii, metodele si campurile.
In plus, o clasa poate accesa informatii despre alte clase, cum ar fi numele clasei, constructorii, metodele si campurile.
Aceasta tehnica este foarte utila cand dorim sa cream aplicatii care sa fie extensibile, cum ar fi un framework de testare automatizat.
In plus, reflectia este folosita si in alte scopuri, cum ar fi: serializarea, deserializarea, proxy, etc.
</pre2>

<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<pre2>
<code class="!whitespace-pre-wrap hljs language-java"><span class="hljs-keyword">import</span> java.lang.reflect.Field;

<span class="hljs-keyword">public</span> <span class="hljs-keyword">class</span> <span class="hljs-title class_">ReflectExample</span> {
    <span class="hljs-keyword">private</span> String exampleField;

    <span class="hljs-keyword">public</span> <span class="hljs-keyword">static</span> <span class="hljs-keyword">void</span> <span class="hljs-title function_">main</span><span class="hljs-params">(String[] args)</span> {
        <span class="hljs-type">ReflectExample</span> <span class="hljs-variable">example</span> <span class="hljs-operator">=</span> <span class="hljs-keyword">new</span> <span class="hljs-title class_">ReflectExample</span>();
        Class&lt;?&gt; cls = example.getClass();

        <span class="hljs-comment">// Get all fields of the class</span>
        Field[] fields = cls.getDeclaredFields();
        <span class="hljs-keyword">for</span> (Field field : fields) {
            System.out.println(<span class="hljs-string">"Field name: "</span> + field.getName());
            System.out.println(<span class="hljs-string">"Field type: "</span> + field.getType().getName());
        }
    }
}
</code>
</pre2>
    </div>
    </div>

');

# Fields
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('Fields',
        '
<pre2>
In Java fileds sunt variabilele care sunt definite in interiorul unei clase.
Ele pot fi de orice tip, ele sunt folosite pentru a stoca date si pentru a le folosi in alte metode.
Fields pot fi modificate si folosite cu cuvantul cheie this. Pot avea si modificatori de acces.
Pot deasemenea fi definitive, ceia ce inseamna ca nu pot fi modificate in timpul rularii programului.
</pre2>

');

# Syntax
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('Syntax',
        '
<pre2>
Java are o sintaxa specifica, care se bazeaza pe urmatoarele principii:

1)Structura clasei:
Clasese sunt definite prin cuvantul cheie "new", urmat de numele clasei si in acolade sunt definite metodele clasei si proprietatile clasei.
Exemplu:
</pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<pre2>
<code class="!whitespace-pre-wrap hljs language-java">
<span class="hljs-keyword">public class </span><span class="hljs-title class_">MyClass</span> {
        // class properties and methods go here

}
</pre2>
</code>
</div>
</div>

<pre2>
2)Metode:
Metodele sunt definite folosind modificatori de acces, urmat de tipul de returnare si un set de parametre care se scriuin paranteze. Daca metoda nu returneaza nimic, se foloseste cuvantul cheie "void".
Exemplu:
</pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<pre2>
<code class="!whitespace-pre-wrap hljs language-java">
<span class="hljs-keyword">public void </span><span class="hljs-title class_">myMethod()</span> {

            // method code goes here

}
</pre2>
</code>
</div>
</div>

<pre2>
3)Variabile:
Variabilele sunt definite folosind un tip de date, urmat de numele variabilei si pot fi initializate cu o valoare.
Exemplu:
</pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<code class="!whitespace-pre-wrap hljs language-java">
<pre2>
<span class="hljs-keyword">int  </span><span class="hljs-title class_">myNum = 5;</span>
</pre2>
</code>
</div>
</div>

<pre2>
4)Controlul fluxului:
Java foloseste controlul fluxului prin intermediul instructiunilor if sau for.
Exemplu:
</pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<pre2>
<code class="!whitespace-pre-wrap hljs language-java">
<span class="hljs-keyword">if  </span><span class="hljs-title class_">(condition) {</span>
        // code block to be executed if the condition is true
</span><span class="hljs-title class_">} </span><span class="hljs-keyword">else  </span><span class="hljs-title class_">{</span>
        // code block to be executed if the condition is false
}
</pre2>
</code>
</div>
</div>
<pre2>
5)Comentarii:
Comentariile sunt folosite pentru a explica codul si sunt ignorate de compilator.
Exemplu:
</pre2>
<pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<pre2>
<code class="!whitespace-pre-wrap hljs language-java">
// This is a single-line comment

/*
This is a
multi-line comment
*/
</code>
</pre2>
</div>
</div>
<pre2>
6)Package:
Java voloseste package pentru a organiza codul in categorii.
Un package este o colectie de clase si interfete care au ceva comun.
Exemplu:
</pre2>
<pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<code class="!whitespace-pre-wrap hljs language-java">
<span class="hljs-keyword">import</span> myPackage;
</code>
</div>
</div>
</pre2>
<pre2>
7)Generics:
Generisc sunt folosire pentru a crea clase, interfete si metode care pot fi folosite cu orice tip de date.
Exemplu:
</pre2>
<pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<code class="!whitespace-pre-wrap hljs language-java">
<span class="hljs-keyword">class</span><span class="hljs-title class_"> MyClass<T></span> {
    T myProperty;
    <span class="hljs-keyword">public void</span> <span class="hljs-title class_">setValue(T value)</span> {
        myProperty = value;
    }
}

<span class="hljs-keyword">Myclass</span> myObject = <span class="hljs-keyword">new</span> MyClass();
myObject.setValue(42);

<span class="hljs-keyword">MyClass<Integer></span> myIntegerObject = <span class="hljs-keyword">new</span> MyClass<Integer>();
myIntegerObject.setValue(42);
</code>
</div>
</div>
</pre2>
<pre2>
8)Enum:
Enum este folosit pentru a crea o colectie de constante.
Exemplu:
</pre2>
<pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<code class="!whitespace-pre-wrap hljs language-java">
<span class="hljs-keyword">public enum</span> <span class="hljs-title class_">MyEnum</span> {
    VALUE1, VALUE2, VALUE3
}
<span class="hljs-keyword">MyEnum</span> myEnumValue = <span class="hljs-keyword">MyEnum</span>.VALUE1;
</code>
</div>
</div>
</pre2>
<pre2>
9)Annotations:
Anotation este folosit pentru a adauga informatii despre codul Java.
Sunt tipuri spreciale de comentarii care sunt folosite de compilator sau alte programe, pentru a oferi informatiedespre codul Java.
Exemplu:
</pre2>
<pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<code class="!whitespace-pre-wrap hljs language-java">
<span class="hljs-built_in">@Deprecated</span>
<span class="hljs-keyword">public</span> <span class="hljs-keyword"></span> <span class="hljs-keyword">void</span> <span class="hljs-title class_">myMethod()</span> {
    // method code goes here
}
</code>
</div>
</div>
</pre2>
<pre2>
10)Static and final:
Sunt folosite pentru a crea metode si proprietati statice. Care pot fi accesate fara a crea un obiect.
Exemplu:
</pre2>
<pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<code class="!whitespace-pre-wrap hljs language-java">
<span class="hljs-keyword">class</span><span class="hljs-title class_"> MyClass<T></span> {
    <span class="hljs-keyword">static</span> <span class="hljs-keyword">int</span> myStaticProperty = 42;
    <span class="hljs-keyword">final</span> <span class="hljs-keyword">int</span> myFinalProperty = 42;
    <span class="hljs-keyword">static</span> <span class="hljs-keyword">void</span> <span class="hljs-title class_">myStaticMethod()</span> {
        // method code goes here
    }
}
</code>
</div>
</div>
</pre2>
<pre2>
11)Streams:
Streams sunt folosite pentru a citi si scrie date in fisiere.
Java foloseste un flux de intrare pentru a citi date dintr-un fisier si un flux de iesire pentru a scrie date in fisier.
In Java exista framework-ul StreamAPI care ofera o interfata pentru a lucra cu fluxuri de date.
Exemplu:
</pre2>
<pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<code class="!whitespace-pre-wrap hljs language-java">
<span class="hljs-keyword">main</span> <span class="hljs-keyword">class</span> <span class="hljs-title class_">MyClass</span> {
    <span class="hljs-keyword">public static void</span> <span class="hljs-title class_">main(String[] args)</span> {
        <span class="hljs-keyword">List<Integer></span> myList = Arrays.asList(1, 2, 3, 4, 5);
        myList.stream().filter(x -> x > 2).forEach(System.out::println);
    }
}
</code>
</div>
</div>
</pre2>
');

# Object
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('Object',
        '
<pre2>
In Java un obiect reprezinta instanta unei clase. O clasa reprezinta un modul sau un sablon, care are anumite proprietati sau comportament.
Exemplu:
<pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<code class="!whitespace-pre-wrap hljs language-java">
<span class="hljs-keyword">Person</span> <span class="hljs-title class_">person</span> = <span class="hljs-keyword">new</span> <span class="hljs-keyword">Person</span>();

</code>
</div>
</div>
</pre2>
<pre2>
In exemplul de mai sus, person este un obiect de tipul Person.

Obiectele pot fi transmise ca argumente, returnate de la metode si stocate in structuri de date.
Java este un limbaj orientat pe obiecte, ceea ce inseamna ca toate datele sunt reprezentate ca obiecte.
In Java toate clasele sunt mostenite de la clasa Object.
</pre2>

');

# If-Else
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('IfElse',
        '
<pre2>
Este o instructiune pentru a controla fluxul unui program in anumite conditii.
Instructiunea "if" verifica o conditie booleana si daca este adevarata, atunci se va executa codul din blocul "if".
Daca este falsa, atunci din blocul "else".
Exemplu:
</pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<code class="!whitespace-pre-wrap hljs language-java">
<pre3>
<span class="hljs-number">if</span> (age >= 18) {<br>
        <span class="hljs-keyword">System.out.println</span>("You are an adult.");<br>
    } <span class="hljs-number">else</span> {<br>
        <span class="hljs-keyword">System.out.println</span>("You are not an adult.");<br>
}
</pre3>
</code>
</div>
</div>
</pre2>
<pre2>
Pot exista mai multe "if-else" in acelasi program, pentru a crea o conditie mai complexa.
Exemplu:
</pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<code class="!whitespace-pre-wrap hljs language-java">
<pre3>
<span class="hljs-number">if</span> (age >= 18) {<br>
    <span class="hljs-keyword">System.out.println</span>("You are an adult.");<br>
} <span class="hljs-number">else if</span> (age >= 13) {<br>
    <span class="hljs-keyword">System.out.println</span>("You are a teenager.");<br>
} <span class="hljs-number">else</span> {<br>
    <span class="hljs-keyword">System.out.println</span>("You are a child.");<br>
}
</pre3>
</code>
</div>
</div>
<pre2>
Deasemenea putem folosi operatorul ternar pentru a scrie cod mai scurt.
Exemplu:
</pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<code class="!whitespace-pre-wrap hljs language-java">
<pre3>
<span class="hljs-doctag">String</span> result = (age >= 18) ? "An adult." : "Not an adult.";
</pre3>
</code>
</div>
</div>
');

# For
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('For',
        '
<pre2>
For este folosit atunci cand stim exact cate iteratii trebuie sa faca un loop.
Exemplu:
</pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<code class="!whitespace-pre-wrap hljs language-java">
<pre3>
<span class="hljs-doctag">for</span> (int i = 0; i < 5; i++) {<br>
          <span class="hljs-keyword">System.out.println</span>("Hello, world!");<br>
}<br>
</pre3>
</code>
</div>
</div>

<li><a href="http://localhost:7777/roadmap/Loops">Other loops</a></li>
');

# While
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('While',
        '
<pre2>
While se foloseste atunci cand nu stim numarul de iteratii.
Conditia este verificata inainte de fiecare iteratie.
Exemplu:
</pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<code class="!whitespace-pre-wrap hljs language-java">
<pre3>
int i = 0;<br>
<span class="hljs-doctag">while</span> (i < 5) {<br>
     <span class="hljs-keyword">System.out.println</span>("Hello, world!");<br>
    i++;<br>
}<br>
</pre3>
</code>
</div>
</div>

<li><a href="http://localhost:7777/roadmap/Loops">Other loops</a></li>
');

# Do While
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('DoWhile',
        '
<pre2>
Do while este similar cu while, dar conditia este verificata dupa fiecare iteratie.
Exemplu:
</pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<code class="!whitespace-pre-wrap hljs language-java">
<pre3>

int i = 0;<br>
<span class="hljs-doctag">do</span> {<br>
     <span class="hljs-keyword">System.out.println</span>("Hello, world!");<br>
                               i++;<br>
} <span class="hljs-doctag">while</span> (i < 5);<br>
</pre3>
</code>
</div>
</div>

<li><a href="http://localhost:7777/roadmap/Loops">Other loops</a></li>
');

# For Each
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('ForEach',
        '
<pre2>
For each este folosit pentru a parcurge elementele unui array.
Exemplu:
</pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<code class="!whitespace-pre-wrap hljs language-java">
<pre3>
<span class="hljs-attr">int[]</span> numbers = {1, 2, 3, 4, 5};<br>
<span class="hljs-doctag">for</span> (int number : numbers) {<br>
    <span class="hljs-keyword">System.out.println</span>("Hello, world!");<br>
}<br>
</pre3>
</code>
</div>
</div>

<li><a href="http://localhost:7777/roadmap/Loops">Other loops</a></li>
');

# Loops
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('Loops',
        '
<pre2>
In Java loops sunt folosite pentru a executa o secventa de cod d mai multe ori.
In Java exista 4 tipuri de loop-uri:
<ul>
    <li><a href="http://localhost:7777/roadmap/For">For</a></li>
    <li><a href="http://localhost:7777/roadmap/While">While</a></li>
    <li><a href="http://localhost:7777/roadmap/DoWhile">DoWhile</a></li>
    <li><a href="http://localhost:7777/roadmap/ForEach">ForEach</a></li>
</ul>
</pre2>

');

# Classes
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('Classes',
        '
<pre2>
Clasa este un plan de baza pentru crearea unui obiect, care ofera starea si comportamentul obiectului.
</pre2>

');

# Construcotr
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('Constructor',
        '
<pre2>
Un constructor al clasei reprezintă o metodă, care are ca scop, inițializarea varibilelor clasei.
Se apelează de fiecare dată când este creat obiectul.
Daca clasa nu are constructor, el va fi automat creat fix ca la superclasa.
Constructorul poate fi supraîncărcat, adică pot exista mai multe constructori cu același nume, dar cu parametri diferiți.
Costructorul nu paoate fi suprascris deoarece nu este sens, noi dorim ca el să aibă același comportament ca la superclasa.
Daca vom crea o instanță a clasei moștenite, atunci constructorul suprclasei va fi apelat și el.
</pre2>
');

# Methods
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('Methods',
        '
<pre2>
Metoda reprezintă o instrucțiune pentru rezolvarea anumitei sarcini.
Daca metoda este statică, ea poate fi apelată print denumirea clasei, iar daca nu, ea poate fi apelată prin instanța clasei.
</pre2>
');

# Immutable
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('Immutable',
        '
<pre2>
Clasa imutabila este o clasa care nu poate fi modificata dupa ce a fost creata.
Chear daca facem ceva schimbari in obiect, obiectul va fi creat din nou.
In Java, clasa String este clasa imutabila. Daca se face o schimbare in obiectul String, se va crea un nou obiect String.
Clase imutabile in Java sunt toate wrapper classes (Integer, Long, Byte, Short, Character, Boolean, Float, Double), String si clasele enum.
</pre2>
');

# Variables
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('Variables',
        '
<pre2>
Variabilele sunt locuri de stocare pentru date.
In Java sunt 2 tipuri de variabile:
<ul>
    <li><a href="http://localhost:7777/roadmap/Primitives">Primitives</a></li>
    <li><a href="http://localhost:7777/roadmap/References">References</a></li>
</ul>
</pre2>
');

# Primitives
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('Primitives',
        '
<pre2>
Variabilele primitive se stochează in stack
Un bit este o unitate de informație, care poate avea doar două valori: 0 sau
In Java există 8 tipuri de variabile primitive, care sunt: byte, short, int, long, float, double, boolean si char.

<li><a href="http://localhost:7777/roadmap/Bytes">Bytes</a></li>
</pre2>
<pre2>
1)Un byte este o unitate de informație, care poate avea 256 valori diferite.
De la -128 la 127.

2)Un short este o unitate de informație, care poate avea 65536 valori diferite.
De la -32768 la 32стесняеться67.
Se folosesc mai des când este nevoie de salvat memorie in lucrul cu tablouri mari.

3)Un int este o unitate de informație, care poate avea 2^32 valori diferite.
De la -2147483648 la 2147483647.
Fiecare variabila primitivă are o clasă ambalaj(wrapper).
Ele sunt create din cauza că colecțiile nu pot lucra cu primitivele.

4)Un long este o unitate de informație, care poate avea 2^64 valori diferite.
De la -9223372036854775808 la 9223372036854775807.

Diferența dintre int și long este că int este mai rapid, dar long este mai precis.

5)Un float este o unitate de informație, care poate avea 2^32 valori diferite.
De la -3.4028235E38 la 3.4028235E38.
Se folosește pentru numerele cu virgulă mobilă.

6)Un double este o unitate de informație, care poate avea 2^64 valori diferite.
De la -1.7976931348623157E308 la 1.7976931348623157E308.
Se folosește pentru numerele cu virgulă mobilă.

Diferența dintre float și double este că float este mai rapid, dar double este mai precis.

7)Un boolean este o unitate de informație, care poate avea doar 2 valori: true sau false.
Se folosește pentru a stoca valori de adevar.

8)Un char este o unitate de informație, care poate avea 2^16 valori diferite.
De la 0 la 65535.
Se folosește pentru a stoca caractere.


</pre2>
');

# References
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('References',
        '
<pre2>
La crearea acestor date, referinta se salveaza in stack ear obietul se salveaza in heap.
Pentru a crea astfel de obiect, folosim operatorul "new".
Aceste obiecte in memorie var raspunde garbage collector, el va avea grija in caz ca obiectul care mai are referinta, sa fie sters din memorie.
Nu pentru toate obiecte cu referinta este nevoie de folsit operatorul "new". Se vorbeste despre clase wrapper.

Ex:
String var = hi;
</pre2>
');

# Bytes
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('Bytes',
        '
<pre2>
De obicei nu se lucreaza cu byte la nivel inalt.
Byte se foloseste de exemplu la transmiterea infoematiei prin retea, la citirea sa inscrierea datelor din fisiere. Se folosesc la lucrul cu String si codificare.
Ca regula byte se folosesc pentru stocarea datelor, pentru a limita folosirea memoriei dar daca o sa le procesam memoria va fi folosita ca si la date de tip int.
Deoarece sistema de operare sunt majoritatea pe 32/64 biti, byte si short, vor fi trasnformate in int de 32 de biti.
</pre2>
');

# Autoboxing/Unboxing
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('AutoboxingUnboxing',
        '
<pre2>
Atunci cand o variabila primitiva este atribuita la o variabila de clasa wrapper si invers, se face conversia automata.

<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<code class="!whitespace-pre-wrap hljs language-java">
<code class="!whitespace-pre-wrap hljs language-java"><span class="hljs-type">Integer</span> <span class="hljs-variable">wrappedInt</span> <span class="hljs-operator">=</span> <span class="hljs-keyword">new</span> <span class="hljs-title class_">Integer</span>(<span class="hljs-number">5</span>);
<span class="hljs-type">int</span> <span class="hljs-variable">primitiveInt</span> <span class="hljs-operator">=</span> wrappedInt; <span class="hljs-comment">//unboxing happens here</span>
</code>
</div>
</div>
</pre2>
');

# static
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('static',
        '
<pre2>
Cuvantul cheie static indica ca o clasa, metoda sau variabila, sunt legate de clasa, dar nu de instanta.
Ele se pot accesa fara crearea instantei, doar folosind numele clase urmat de operatorul punct.
Exemplu:
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
</pre2>
<pre2>
<code class="!whitespace-pre-wrap hljs language-csharp"><span class="hljs-keyword">class</span> <span class="hljs-title">Counter</span> {
    <span class="hljs-keyword">private</span> <span class="hljs-keyword">static</span> <span class="hljs-built_in">int</span> count = <span class="hljs-number">0</span>; <span class="hljs-comment">// class variable</span>

    <span class="hljs-function"><span class="hljs-keyword">public</span> <span class="hljs-title">Counter</span>()</span> {
        count++;
    }

    <span class="hljs-function"><span class="hljs-keyword">public</span> <span class="hljs-keyword">static</span> <span class="hljs-built_in">int</span> <span class="hljs-title">getCount</span>()</span> { <span class="hljs-comment">// class method</span>
        <span class="hljs-keyword">return</span> count;
    }
}
</pre2>
</code>
</div>
</div>
<pre2>
În acest exemplu, variabila count este o variabilă de clasă, declarată cu cuvântul cheie static.
Aceasta înseamnă că aparține clasei Counter, mai degrabă decât oricărei instanțe a clasei.
Metoda getCount() este, de asemenea, o metodă de clasă, declarată cu cuvântul cheie static.
Aceasta înseamnă că poate fi apelat direct pe clasă, fără a crea o instanță a clasei.

De asemenea exista si blocuri statice care vor fi accesate de fiecare data cand va fi creata instanta sau accesata clasa.

</pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<pre2>
<code class="!whitespace-pre-wrap hljs language-csharp"><span class="hljs-keyword">class</span> <span class="hljs-title">MyClass</span> {
    <span class="hljs-keyword">static</span> {
        <span class="hljs-comment">// this block will be executed only once while class loading</span>
        System.<span class="hljs-keyword">out</span>.println(<span class="hljs-string">"Static block executed!"</span>);
    }
}
</pre2>
</code>
</div>
</div>
');

# null
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('null',
        '
<pre2>
In Java null este un cuvânt cheie care poate fi folosit pentru a indica lipsa unei referinte sau a unei valori.
Exemplu:
</pre2>
<pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<pre2>
<code class="!whitespace-pre-wrap hljs language-javascript">
<span class="hljs-title class_">String</span> s = <span class="hljs-literal">null</span>;
</code>
</pre2>
</div>
</div>
<pre2>
În acest exemplu, variabila s este de tip String, care este un tip de referință.
Prin atribuirea valorii null lui s, indicăm că în prezent nu se referă la niciun obiect.
Încercarea de a apela o metodă pe o variabilă care are o valoare null va avea ca rezultat o excepție NullPointerException.
</pre2>
<pre2>
Este important să verificăm valorile nule înainte de a încerca să folosim obiecte,
mai ales când apelăm metode pe obiecte care provin din surse externe, cum ar fi intrarea utilizatorului sau o bază de date.

</pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<pre2>
<code class="!whitespace-pre-wrap hljs language-scss">String s = <span class="hljs-built_in">getStringFromDB</span>();
if (s != null) {
    s<span class="hljs-selector-class">.length</span>();
}
</code>
</pre2>
</div>
</div>
<pre2>
În acest exemplu, verificăm dacă șirul returnat de la metoda getStringFromDB este nul înainte de a apela metoda length() de pe el.

Valoarea implicită Java pentru o referință de obiect este nulă, deci dacă nu inițializați o referință de obiect, aceasta va fi nulă.

Pentru a gestiona valorile null, in Java exista frameworkul Optional.
</pre2>
');

# I/O Stream API
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('iostream',
        '
<pre2>
Sunt fluxuri de citire si scriere a datelor. Java ofera mai multe clase pentru a realiza acest lucru.
Exemplu:
-InputStream/OutputStream
-Reader/Writer
-BufferedReader/BufferedWriter
-FileInputStream/FileOutputStream
-DataInputStream/DataOutputStream
-ObjectInputStream/ObjectOutputStream

</pre2>
');


# InputStream/OutputStream
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('InputStreamOutputStream',
        '
<pre2>
În Java, clasele InputStream și OutputStream fac parte din API-ul Java I/O și oferă o interfață generală pentru citirea și scrierea datelor în diferite tipuri de surse de intrare și ieșire.
Exemplu InputStream:
</pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<pre2>
<code class="!whitespace-pre-wrap hljs language-java"><span class="hljs-keyword">import</span> java.io.*;
<span class="hljs-keyword">public</span> <span class="hljs-keyword">class</span> <span class="hljs-title class_">InputStreamExample</span> {
    <span class="hljs-keyword">public</span> <span class="hljs-keyword">static</span> <span class="hljs-keyword">void</span> <span class="hljs-title function_">main</span><span class="hljs-params">(String[] args)</span> {
        <span class="hljs-keyword">try</span> {
            <span class="hljs-type">FileInputStream</span> <span class="hljs-variable">fis</span> <span class="hljs-operator">=</span> <span class="hljs-keyword">new</span> <span class="hljs-title class_">FileInputStream</span>(<span class="hljs-string">"example.txt"</span>);
            <span class="hljs-type">int</span> <span class="hljs-variable">data</span> <span class="hljs-operator">=</span> fis.read();
            <span class="hljs-keyword">while</span> (data != -<span class="hljs-number">1</span>) {
                System.out.print((<span class="hljs-type">char</span>) data);
                data = fis.read();
            }
            fis.close();
        } <span class="hljs-keyword">catch</span> (IOException e) {
            e.printStackTrace();
        }
    }
}
</code>
</pre2>
</div>
</div>
<pre2>
În acest exemplu, creăm un nou obiect FileInputStream, trecând numele fișierului pe care vrem să-l citim ca parametru.
Metoda read() este folosită pentru a citi următorul octet de date din fluxul de intrare, iar valoarea returnată este turnată într-un caracter și imprimată pe consolă.
Bucla continuă până când se ajunge la sfârșitul fișierului, indicat de o valoare returnată de -1 din metoda read().
În cele din urmă, închidem fluxul de intrare pentru a elibera orice resurse pe care le folosea.

Exemplu OutputStream:
</pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<pre2>
<code class="!whitespace-pre-wrap hljs language-java"><span class="hljs-keyword">import</span> java.io.*;

<span class="hljs-keyword">public</span> <span class="hljs-keyword">class</span> <span class="hljs-title class_">OutputStreamExample</span> {
    <span class="hljs-keyword">public</span> <span class="hljs-keyword">static</span> <span class="hljs-keyword">void</span> <span class="hljs-title function_">main</span><span class="hljs-params">(String[] args)</span> {
        <span class="hljs-keyword">try</span> {
            <span class="hljs-type">FileOutputStream</span> <span class="hljs-variable">fos</span> <span class="hljs-operator">=</span> <span class="hljs-keyword">new</span> <span class="hljs-title class_">FileOutputStream</span>(<span class="hljs-string">"example.txt"</span>);
            <span class="hljs-type">String</span> <span class="hljs-variable">message</span> <span class="hljs-operator">=</span> <span class="hljs-string">"Hello, world!"</span>;
            <span class="hljs-type">byte</span>[] bytes = message.getBytes();
            fos.write(bytes);
            fos.close();
        } <span class="hljs-keyword">catch</span> (IOException e) {
            e.printStackTrace();
        }
    }
}
</code>
</pre2>
</div>
</div>
<pre2>
În acest exemplu, creăm un nou obiect FileOutputStream, trecând numele fișierului pe care vrem să-l scriem ca parametru.
Apoi creăm un obiect String cu mesajul pe care vrem să-l scriem și apelăm metoda getBytes() pentru a-l converti într-o matrice de octeți.
Folosim metoda write() pentru a scrie octeții în fluxul de ieșire și apoi închidem fluxul pentru a elibera orice resurse pe care le folosea.

Vă rugăm să rețineți că atunci când OutputStream este utilizat pentru scrierea datelor, dacă fișierul este deja prezent, datele vor fi suprascrise, altfel noul fișier va fi creat.
</pre2>
');

# Reader/Writer
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('ReaderWriter',
        '
<pre2>
În Java, clasele Reader și Writer fac, de asemenea, parte din Java I/O API și oferă o interfață generală pentru citirea și scrierea datelor de caractere către diferite tipuri de surse de intrare și ieșire.
Sunt folosite mai des pentru citirea si scrierea datelor in text.
Exemplu Reader:
</pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<pre2>
<code class="!whitespace-pre-wrap hljs language-java"><span class="hljs-keyword">import</span> java.io.*;

<span class="hljs-keyword">public</span> <span class="hljs-keyword">class</span> <span class="hljs-title class_">ReaderExample</span> {
    <span class="hljs-keyword">public</span> <span class="hljs-keyword">static</span> <span class="hljs-keyword">void</span> <span class="hljs-title function_">main</span><span class="hljs-params">(String[] args)</span> {
        <span class="hljs-keyword">try</span> {
            <span class="hljs-type">FileReader</span> <span class="hljs-variable">fr</span> <span class="hljs-operator">=</span> <span class="hljs-keyword">new</span> <span class="hljs-title class_">FileReader</span>(<span class="hljs-string">"example.txt"</span>);
            <span class="hljs-type">int</span> <span class="hljs-variable">data</span> <span class="hljs-operator">=</span> fr.read();
            <span class="hljs-keyword">while</span> (data != -<span class="hljs-number">1</span>) {
                System.out.print((<span class="hljs-type">char</span>) data);
                data = fr.read();
            }
            fr.close();
        } <span class="hljs-keyword">catch</span> (IOException e) {
            e.printStackTrace();
        }
    }
}
</code>
</pre2>
</div>
</div>
<pre2>
În acest exemplu, creăm un nou obiect FileReader, trecând numele fișierului pe care vrem să-l citim ca parametru.
Metoda read() este folosită pentru a citi următorul caracter de date din fluxul de intrare, iar valoarea returnată este transformată într-un caracter și tipărită pe consolă.
Bucla continuă până când se ajunge la sfârșitul fișierului, indicat de o valoare returnată de -1 din metoda read().
În cele din urmă, închidem cititorul pentru a elibera orice resurse pe care le folosea.

Exemplu Writer:

</pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<pre2>
<code class="!whitespace-pre-wrap hljs language-java"><span class="hljs-keyword">import</span> java.io.*;

<span class="hljs-keyword">public</span> <span class="hljs-keyword">class</span> <span class="hljs-title class_">WriterExample</span> {
    <span class="hljs-keyword">public</span> <span class="hljs-keyword">static</span> <span class="hljs-keyword">void</span> <span class="hljs-title function_">main</span><span class="hljs-params">(String[] args)</span> {
        <span class="hljs-keyword">try</span> {
            <span class="hljs-type">FileWriter</span> <span class="hljs-variable">fw</span> <span class="hljs-operator">=</span> <span class="hljs-keyword">new</span> <span class="hljs-title class_">FileWriter</span>(<span class="hljs-string">"example.txt"</span>);
            <span class="hljs-type">String</span> <span class="hljs-variable">message</span> <span class="hljs-operator">=</span> <span class="hljs-string">"Hello, world!"</span>;
            fw.write(message);
            fw.close();
        } <span class="hljs-keyword">catch</span> (IOException e) {
            e.printStackTrace();
        }
    }
}
</code>
</pre2>
</div>
</div>
<pre2>
În acest exemplu, creăm un nou obiect FileWriter, trecând numele fișierului pe care dorim să-l scriem ca parametru.
Apoi creăm un obiect String cu mesajul pe care vrem să-l scriem și apelăm metoda write() pentru a scrie șirul în fluxul de ieșire.
Apoi închidem scriitorul pentru a elibera orice resurse pe care le folosea.

Vă rugăm să rețineți că atunci când Writer-ul folosește pentru scrierea datelor, dacă fișierul este deja prezent, datele vor fi suprascrise, altfel noul fișier va fi creat.

Clasele Reader și Writer sunt utilizate în principal pentru a gestiona datele de caractere, în timp ce clasele InputStream și OutputStream sunt folosite pentru a gestiona datele binare.
</pre2>
');

# FileInputStream / FileOutputStream
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('FileInputStreamFileOutputStream',
        '
<pre2>
Sunt folosite pentru a citi si scrie datele dintr-un fisier.
Exemplu:
</pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<pre2>
<code class="!whitespace-pre-wrap hljs language-java"><span class="hljs-keyword">import</span> java.io.*;

<span class="hljs-keyword">public</span> <span class="hljs-keyword">class</span> <span class="hljs-title class_">FileStreamExample</span> {
    <span class="hljs-keyword">public</span> <span class="hljs-keyword">static</span> <span class="hljs-keyword">void</span> <span class="hljs-title function_">main</span><span class="hljs-params">(String[] args)</span> {
        <span class="hljs-comment">// File to read from</span>
        <span class="hljs-type">String</span> <span class="hljs-variable">inputFile</span> <span class="hljs-operator">=</span> <span class="hljs-string">"example.txt"</span>;

        <span class="hljs-comment">// File to write to</span>
        <span class="hljs-type">String</span> <span class="hljs-variable">outputFile</span> <span class="hljs-operator">=</span> <span class="hljs-string">"output.txt"</span>;

        <span class="hljs-keyword">try</span> {
            <span class="hljs-comment">// Create a FileInputStream to read from the input file</span>
            <span class="hljs-type">FileInputStream</span> <span class="hljs-variable">in</span> <span class="hljs-operator">=</span> <span class="hljs-keyword">new</span> <span class="hljs-title class_">FileInputStream</span>(inputFile);

            <span class="hljs-comment">// Create a FileOutputStream to write to the output file</span>
            <span class="hljs-type">FileOutputStream</span> <span class="hljs-variable">out</span> <span class="hljs-operator">=</span> <span class="hljs-keyword">new</span> <span class="hljs-title class_">FileOutputStream</span>(outputFile);

            <span class="hljs-comment">// Read bytes from the input file and write them to the output file</span>
            <span class="hljs-type">int</span> c;
            <span class="hljs-keyword">while</span> ((c = in.read()) != -<span class="hljs-number">1</span>) {
                out.write(c);
            }

            <span class="hljs-comment">// Close the input and output streams</span>
            in.close();
            out.close();

            System.out.println(<span class="hljs-string">"File copied successfully!"</span>);
        } <span class="hljs-keyword">catch</span> (IOException e) {
            System.out.println(<span class="hljs-string">"Error: "</span> + e.getMessage());
        }
    }
}
</code>
</pre2>
</div>
</div>
<pre2>
Acest exemplu citește un fișier numit „example.txt” folosind un FileInputStream și scrie conținutul acelui fișier într-un fișier nou numit „output.txt” folosind un FileOutputStream.
Bucla while ((c = in.read()) != -1) citește fiecare octet din fișierul de intrare pe rând și îl scrie în fișierul de ieșire.
În cele din urmă, fluxurile de intrare și de ieșire sunt închise.

Rețineți că este, de asemenea, posibil să citiți și să scrieți bucăți mai mari de date la un moment dat folosind metodele read(byte[] b) și write(byte[] b) ale claselor FileInputStream și, respectiv, FileOutputStream.
</pre2>

');

# BufferedReader / BufferedWriter
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('BufferedReaderBufferedWriter',
        '
<pre2>
Sunt folosite pentru a citi si scrie datele dintr-un fisier text.
Aceste clase sunt mai eficiente decat celelalte clase de citire si scriere a datelor. Deoarece citesc si scriu datele in blocuri.
Astfel, citesc si scriu datele mai rapid.
Exemplu :
</pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<pre2>
<code class="!whitespace-pre-wrap hljs language-java"><span class="hljs-keyword">import</span> java.io.*;

<span class="hljs-keyword">public</span> <span class="hljs-keyword">class</span> <span class="hljs-title class_">BufferedReaderWriterExample</span> {
    <span class="hljs-keyword">public</span> <span class="hljs-keyword">static</span> <span class="hljs-keyword">void</span> <span class="hljs-title function_">main</span><span class="hljs-params">(String[] args)</span> {
        <span class="hljs-comment">// File to read from</span>
        <span class="hljs-type">String</span> <span class="hljs-variable">inputFile</span> <span class="hljs-operator">=</span> <span class="hljs-string">"example.txt"</span>;

        <span class="hljs-comment">// File to write to</span>
        <span class="hljs-type">String</span> <span class="hljs-variable">outputFile</span> <span class="hljs-operator">=</span> <span class="hljs-string">"output.txt"</span>;

        <span class="hljs-keyword">try</span> {
            <span class="hljs-comment">// Create a FileReader to read from the input file</span>
            <span class="hljs-type">FileReader</span> <span class="hljs-variable">fileReader</span> <span class="hljs-operator">=</span> <span class="hljs-keyword">new</span> <span class="hljs-title class_">FileReader</span>(inputFile);

            <span class="hljs-comment">// Wrap the FileReader in a BufferedReader</span>
            <span class="hljs-type">BufferedReader</span> <span class="hljs-variable">bufferedReader</span> <span class="hljs-operator">=</span> <span class="hljs-keyword">new</span> <span class="hljs-title class_">BufferedReader</span>(fileReader);

            <span class="hljs-comment">// Create a FileWriter to write to the output file</span>
            <span class="hljs-type">FileWriter</span> <span class="hljs-variable">fileWriter</span> <span class="hljs-operator">=</span> <span class="hljs-keyword">new</span> <span class="hljs-title class_">FileWriter</span>(outputFile);

            <span class="hljs-comment">// Wrap the FileWriter in a BufferedWriter</span>
            <span class="hljs-type">BufferedWriter</span> <span class="hljs-variable">bufferedWriter</span> <span class="hljs-operator">=</span> <span class="hljs-keyword">new</span> <span class="hljs-title class_">BufferedWriter</span>(fileWriter);

            <span class="hljs-comment">// Read lines from the input file and write them to the output file</span>
            String line;
            <span class="hljs-keyword">while</span> ((line = bufferedReader.readLine()) != <span class="hljs-literal">null</span>) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            <span class="hljs-comment">// Close the readers and writers</span>
            bufferedReader.close();
            bufferedWriter.close();

            System.out.println(<span class="hljs-string">"File copied successfully!"</span>);
        } <span class="hljs-keyword">catch</span> (IOException e) {
            System.out.println(<span class="hljs-string">"Error: "</span> + e.getMessage());
        }
    }
}
</code>
</pre2>
</div>
</div>
<pre2>
Acest exemplu citește un fișier denumit „example.txt” utilizând un FileReader împachetat într-un BufferedReader și scrie conținutul acelui fișier într-un fișier nou numit „output.txt” folosind un FileWriter împachetat într-un BufferedWriter.
Bucla while ((line = bufferedReader.readLine()) != null) citește fiecare linie din fișierul de intrare pe rând și o scrie în fișierul de ieșire.
BufferedWriter.newLine(); este folosit pentru a scrie o nouă linie după fiecare linie citită. În cele din urmă, cititorii și scriitorii sunt închise.

Rețineți că clasele BufferedReader și BufferedWriter folosesc un buffer pentru a îmbunătăți performanța la citirea și scrierea unor cantități mari de date.
Acest lucru le face mai eficiente decât clasele FileReader și FileWriter atunci când lucrează cu fișiere mari.
</pre2>
');

# DataInputStream / DataOutputStream
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('DataInputStreamDataOutputStream',
        '
<pre2>
Sunt folosite pentru citirea unor tipuri de date specifice ca int, double, float, etc
Exemplu:
</pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<pre2>
<code class="!whitespace-pre-wrap hljs language-scss">import java<span class="hljs-selector-class">.io</span>.*;

public class DataStreamExample {
    public static void <span class="hljs-selector-tag">main</span>(String[] args) {
        <span class="hljs-comment">// File to read from</span>
        String inputFile = "example<span class="hljs-selector-class">.bin</span>";

        <span class="hljs-comment">// File to write to</span>
        String outputFile = "output<span class="hljs-selector-class">.bin</span>";

        try {
            <span class="hljs-comment">// Create a FileInputStream to read from the input file</span>
            FileInputStream fileInputStream = new <span class="hljs-built_in">FileInputStream</span>(inputFile);

            <span class="hljs-comment">// Wrap the FileInputStream in a DataInputStream</span>
            DataInputStream dataInputStream = new <span class="hljs-built_in">DataInputStream</span>(fileInputStream);

            <span class="hljs-comment">// Create a FileOutputStream to write to the output file</span>
            FileOutputStream fileOutputStream = new <span class="hljs-built_in">FileOutputStream</span>(outputFile);

            <span class="hljs-comment">// Wrap the FileOutputStream in a DataOutputStream</span>
            DataOutputStream dataOutputStream = new <span class="hljs-built_in">DataOutputStream</span>(fileOutputStream);

            <span class="hljs-comment">// Read data from the input file and write it to the output file</span>
            int anInt = dataInputStream<span class="hljs-selector-class">.readInt</span>();
            long aLong = dataInputStream<span class="hljs-selector-class">.readLong</span>();
            <span class="hljs-attribute">float</span> aFloat = dataInputStream<span class="hljs-selector-class">.readFloat</span>();
            double aDouble = dataInputStream<span class="hljs-selector-class">.readDouble</span>();
            String aString = dataInputStream<span class="hljs-selector-class">.readUTF</span>();

            dataOutputStream<span class="hljs-selector-class">.writeInt</span>(anInt);
            dataOutputStream<span class="hljs-selector-class">.writeLong</span>(aLong);
            dataOutputStream<span class="hljs-selector-class">.writeFloat</span>(aFloat);
            dataOutputStream<span class="hljs-selector-class">.writeDouble</span>(aDouble);
            dataOutputStream<span class="hljs-selector-class">.writeUTF</span>(aString);

            <span class="hljs-comment">// Close the data streams</span>
            dataInputStream<span class="hljs-selector-class">.close</span>();
            dataOutputStream<span class="hljs-selector-class">.close</span>();

            System<span class="hljs-selector-class">.out</span><span class="hljs-selector-class">.println</span>("File copied successfully!");
        } catch (IOException e) {
            System<span class="hljs-selector-class">.out</span><span class="hljs-selector-class">.println</span>("Error: " + e.getMessage());
        }
    }
}
</code>
</pre2>
</div>
</div>
<pre2>
Acest exemplu citește un fișier binar numit „example.bin” folosind un FileInputStream împachetat într-un DataInputStream și scrie conținutul acelui fișier într-un nou fișier binar numit „output.bin” folosind un FileOutputStream împachetat într-un DataOutputStream.
DataInputStream.readInt();,
dataInputStream.readLong();,
dataInputStream.readFloat();,
dataInputStream.readDouble(); și
dataInputStream.readUTF();
metode sunt folosite pentru a citi diferite tipuri de date din fișierul de intrare și
dataOutputStream.writeInt(anInt);,
dataOutputStream.writeLong(aLong);,
dataOutputStream.writeFloat(aFloat);,
dataOutputStream.writeDouble(aDouble); și
dataOutputStream.writeUTF(aString);
sunt folosite metode pentru a scrie datele citite în fișierul de ieșire.
În cele din urmă, fluxurile de date sunt închise.

Rețineți că clasele DataInputStream și DataOutputStream sunt folosite pentru a citi și scrie date binare, ele citesc și scriu datele într-un mod independent de mașină și oferă, de asemenea, metode pentru citirea și scrierea altor tipuri de date de bază, cum ar fi int, long, float, double și Şir.
</pre2>
');


# ObjectInputStream / ObjectOutputStream
INSERT INTO `RoadMap`.`roadmap` (`title`, `description`)
VALUES ('ObjectInputStreamObjectOutputStream',
        '
<pre2>
Sunt folosite pentru citirea unor tipuri de date specifice ca int, double, float, etc
Exemplu:
</pre2>
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<pre2>
<code class="!whitespace-pre-wrap hljs language-java"><span class="hljs-keyword">import</span> java.io.*;

<span class="hljs-keyword">class</span> <span class="hljs-title class_">Person</span> <span class="hljs-keyword">implements</span> <span class="hljs-title class_">Serializable</span> {
    <span class="hljs-keyword">private</span> <span class="hljs-keyword">static</span> <span class="hljs-keyword">final</span> <span class="hljs-type">long</span> <span class="hljs-variable">serialVersionUID</span> <span class="hljs-operator">=</span> <span class="hljs-number">1L</span>;
    String name;
    <span class="hljs-type">int</span> age;
    <span class="hljs-keyword">public</span> <span class="hljs-title function_">Person</span><span class="hljs-params">(String name, <span class="hljs-type">int</span> age)</span> {
        <span class="hljs-built_in">this</span>.name = name;
        <span class="hljs-built_in">this</span>.age = age;
    }
}

<span class="hljs-keyword">public</span> <span class="hljs-keyword">class</span> <span class="hljs-title class_">ObjectStreamExample</span> {
    <span class="hljs-keyword">public</span> <span class="hljs-keyword">static</span> <span class="hljs-keyword">void</span> <span class="hljs-title function_">main</span><span class="hljs-params">(String[] args)</span> {
        <span class="hljs-comment">// File to read from</span>
        <span class="hljs-type">String</span> <span class="hljs-variable">inputFile</span> <span class="hljs-operator">=</span> <span class="hljs-string">"example.obj"</span>;

        <span class="hljs-comment">// File to write to</span>
        <span class="hljs-type">String</span> <span class="hljs-variable">outputFile</span> <span class="hljs-operator">=</span> <span class="hljs-string">"output.obj"</span>;

        <span class="hljs-type">Person</span> <span class="hljs-variable">person</span> <span class="hljs-operator">=</span> <span class="hljs-keyword">new</span> <span class="hljs-title class_">Person</span>(<span class="hljs-string">"John Doe"</span>, <span class="hljs-number">30</span>);

        <span class="hljs-keyword">try</span> {
            <span class="hljs-comment">// Create a FileOutputStream to write the object to the output file</span>
            <span class="hljs-type">FileOutputStream</span> <span class="hljs-variable">fileOutputStream</span> <span class="hljs-operator">=</span> <span class="hljs-keyword">new</span> <span class="hljs-title class_">FileOutputStream</span>(outputFile);

            <span class="hljs-comment">// Wrap the FileOutputStream in an ObjectOutputStream</span>
            <span class="hljs-type">ObjectOutputStream</span> <span class="hljs-variable">objectOutputStream</span> <span class="hljs-operator">=</span> <span class="hljs-keyword">new</span> <span class="hljs-title class_">ObjectOutputStream</span>(fileOutputStream);

            <span class="hljs-comment">// Write the object to the output file</span>
            objectOutputStream.writeObject(person);

            <span class="hljs-comment">// Close the object output stream</span>
            objectOutputStream.close();

            <span class="hljs-comment">// Create a FileInputStream to read the object from the input file</span>
            <span class="hljs-type">FileInputStream</span> <span class="hljs-variable">fileInputStream</span> <span class="hljs-operator">=</span> <span class="hljs-keyword">new</span> <span class="hljs-title class_">FileInputStream</span>(inputFile);

            <span class="hljs-comment">// Wrap the FileInputStream in an ObjectInputStream</span>
            <span class="hljs-type">ObjectInputStream</span> <span class="hljs-variable">objectInputStream</span> <span class="hljs-operator">=</span> <span class="hljs-keyword">new</span> <span class="hljs-title class_">ObjectInputStream</span>(fileInputStream);

            <span class="hljs-comment">// Read the object from the input file</span>
            <span class="hljs-type">Person</span> <span class="hljs-variable">readPerson</span> <span class="hljs-operator">=</span> (Person) objectInputStream.readObject();

            <span class="hljs-comment">// Close the object input stream</span>
            objectInputStream.close();

            System.out.println(<span class="hljs-string">"Person: "</span> + readPerson.name + <span class="hljs-string">" is "</span> + readPerson.age + <span class="hljs-string">" years old."</span>);

        } <span class="hljs-keyword">catch</span> (IOException | ClassNotFoundException e) {
            System.out.println(<span class="hljs-string">"Error: "</span> + e.getMessage());
        }
    }
}
</code>
</pre2>
</div>
</div>
<pre2>
Acest exemplu creează un obiect de tip Person și îl scrie într-un fișier „example.obj” folosind un FileOutputStream înfășurat într-un ObjectOutputStream și apoi îl citește din fișier folosind un FileInputStream ambalat într-un ObjectInputStream.
ObjectOutputStream.writeObject(persoana); metoda este folosită pentru a scrie obiectul în fișierul de ieșire, iar Person readPerson = (Person) objectInputStream.readObject();
metoda este utilizată pentru a citi obiectul din fișierul de intrare.
În cele din urmă, fluxurile de intrare și de ieșire ale obiectului sunt închise.

Este important de menționat că, pentru a putea fi scrise într-un fișier, obiectele trebuie să implementeze interfața Serializable, această interfață este o interfață marker care îi spune ObjectOutputStream că obiectele acestei clase pot fi scrise.
</pre2>
');