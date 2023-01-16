CREATE TABLE `LearnJavaDB`.`syntaxinfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);


INSERT INTO `LearnJavaDB`.`syntaxinfo` (`title`, `description`)
VALUES ('Syntax',
        '
Java are o sintaxa specifica, care se bazeaza pe urmatoarele principii:<br>
');

INSERT INTO `LearnJavaDB`.`syntaxinfo` (`title`, `description`)
VALUES ('Structura clasei',
        '
Clasese sunt definite prin cuvantul cheie "new", urmat de numele clasei si in acolade sunt definite metodele clasei si proprietatile clasei.<br>
Exemplu:<br>
public class MyClass {<br>
    // class properties and methods go here<br>
}<br>
');

INSERT INTO `LearnJavaDB`.`syntaxinfo` (`title`, `description`)
VALUES ('Metode',
        '
Metodele sunt definite folosind modificatori de acces, urmat de tipul de returnare si un set de parametre care se scriu<br>
in paranteze. Daca metoda nu returneaza nimic, se foloseste cuvantul cheie "void".<br>
Exemplu:<br>
public void myMethod() {<br>
    // method code goes here<br>
}<br>

');

INSERT INTO `LearnJavaDB`.`syntaxinfo` (`title`, `description`)
VALUES ('Variabile',
        '
Variabilele sunt definite folosind un tip de date, urmat de numele variabilei si pot fi initializate cu o valoare.<br>
Exemplu:<br>
int myNum = 5;<br>

');

INSERT INTO `LearnJavaDB`.`syntaxinfo` (`title`, `description`)
VALUES ('Controlul fluxului',
        '
Java foloseste controlul fluxului prin intermediul instructiunilor if sau for.<br>
Exemplu:<br>
if (condition) {<br>
    // code block to be executed if the condition is true<br>
} else {<br>
    // code block to be executed if the condition is false<br>
}<br>

');

INSERT INTO `LearnJavaDB`.`syntaxinfo` (`title`, `description`)
VALUES ('Comentarii',
        '
Comentariile sunt folosite pentru a explica codul si sunt ignorate de compilator.<br>
Exemplu:<br>
// This is a single-line comment<br>
<br>
/*<br>
This is a<br>
multi-line comment<br>
*/<br>

');

INSERT INTO `LearnJavaDB`.`syntaxinfo` (`title`, `description`)
VALUES ('Package',
        '
Java voloseste package pentru a organiza codul in categorii.<br>
Un package este o colectie de clase si interfete care au ceva comun.<br>
Exemplu:<br>
package myPackage;<br>

');

INSERT INTO `LearnJavaDB`.`syntaxinfo` (`title`, `description`)
VALUES ('Generics',
        '
Generisc sunt folosire pentru a crea clase, interfete si metode care pot fi folosite cu orice tip de date.<br>
Exemplu:<br>
class MyClass<T> {<br>
    T myProperty;<br>
    public void setValue(T value) {<br>
        myProperty = value;<br>
    }<br>
}<br>
<br>
MyClass<Integer> myIntObject = new MyClass<Integer>();<br>
myIntObject.setValue(42);<br>
<br>
MyClass<String> myStringObject = new MyClass<String>();<br>
myStringObject.setValue("Hello");<br>
');

INSERT INTO `LearnJavaDB`.`syntaxinfo` (`title`, `description`)
VALUES ('Enum',
        '
Enum este folosit pentru a crea o colectie de constante.<br>
Exemplu:<br>
enum MyEnum {<br>
    VALUE1, VALUE2, VALUE3<br>
}<br>
MyEnum myEnumValue = MyEnum.VALUE1;<br>
<br>
');

INSERT INTO `LearnJavaDB`.`syntaxinfo` (`title`, `description`)
VALUES ('Annotation',
        '
Anotation este folosit pentru a adauga informatii despre codul Java.<br>
Sunt tipuri spreciale de comentarii care sunt folosite de compilator sau alte programe, pentru a oferi informatie<br>
despre codul Java.<br>
Exemplu:<br>
@Deprecated<br>
public void myMethod() {<br>
    // method code goes here<br>
}<br>

');

INSERT INTO `LearnJavaDB`.`syntaxinfo` (`title`, `description`)
VALUES ('Static and final',
        '
Sunt folosite pentru a crea metode si proprietati statice. Care pot fi accesate fara a crea un obiect.<br>
Exemplu:<br>
public class MyClass {<br>
    public static int myStaticProperty = 42;<br>
    public final int myFinalProperty = 42;<br>
    public static void myStaticMethod() {<br>
        // method code goes here<br>
    }<br>
}<br>

');

INSERT INTO `LearnJavaDB`.`syntaxinfo` (`title`, `description`)
VALUES ('Streams',
        '
Streams sunt folosite pentru a citi si scrie date in fisiere.<br>
Java foloseste un flux de intrare pentru a citi date dintr-un fisier si un flux de iesire pentru a scrie date in fisier.<br>
In Java exista framework-ul StreamAPI care ofera o interfata pentru a lucra cu fluxuri de date.<br>
Exemplu:<br>
List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5);<br>
myList.stream().filter(x -> x > 2).forEach(System.out::println);<br>
');




