CREATE TABLE `LearnJavaDB`.`gofinfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `LearnJavaDB`.`gofanswer`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `LearnJavaDB`.`graspinfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `LearnJavaDB`.`graspanswer`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO `LearnJavaDB`.`gofinfo` (`title`, `description`)
VALUES ('GOF - Gang of Four',
        '
Modelele de design Gang of Four (GOF) sunt un set de modele de design software care au fost descrise în cartea „Design Patterns: Elements of Reusable Object-Oriented Software” de Erich Gamma, John Vlissides, Ralph Johnson și Richard Helm.
Cartea a fost publicată în 1995 și este considerată un clasic în domeniul ingineriei software.
Există 23 de modele de design în cartea GOF, care sunt organizate în trei categorii: modele creaționale, structurale și comportamentale.
Aceste modele oferă un vocabular comun pentru discutarea soluțiilor de proiectare și vă pot ajuta să proiectați sisteme software flexibile și care pot fi întreținute.
');

INSERT INTO `LearnJavaDB`.`gofinfo` (`title`, `description`)
VALUES ('Iată o scurtă prezentare generală a fiecăreia dintre categorii:',
        '
Modele de creație: Aceste modele se ocupă de mecanismele de creare a obiectelor, încercând să creeze obiecte într-o manieră potrivită situației.
Modele de creație:

Fabrică abstractă: oferă o interfață pentru crearea familiilor de obiecte înrudite sau dependente fără a specifica clasele lor concrete.
Builder: Separă construcția unui obiect complex de reprezentarea acestuia, permițând aceluiași proces de construcție să creeze diferite reprezentări.
Metoda fabrică: definește o interfață pentru crearea unui obiect, dar lasă subclaselor să decidă ce clasă să instanțieze.
Prototip: specifică tipurile de obiecte de creat folosind o instanță prototip și creează obiecte noi prin copierea acestui prototip.
Singleton: Se asigură că o clasă are o singură instanță și oferă un punct de acces global la aceasta.


');

INSERT INTO `LearnJavaDB`.`gofinfo` (`title`, `description`)
VALUES ('Iată o scurtă prezentare generală a fiecăreia dintre categorii:',
        '
Modele de creație: Aceste modele se ocupă de mecanismele de creare a obiectelor, încercând să creeze obiecte într-o manieră potrivită situației.
Modele de creație:

Fabrică abstractă: oferă o interfață pentru crearea familiilor de obiecte înrudite sau dependente fără a specifica clasele lor concrete.
Builder: Separă construcția unui obiect complex de reprezentarea acestuia, permițând aceluiași proces de construcție să creeze diferite reprezentări.
Metoda fabrică: definește o interfață pentru crearea unui obiect, dar lasă subclaselor să decidă ce clasă să instanțieze.
Prototip: specifică tipurile de obiecte de creat folosind o instanță prototip și creează obiecte noi prin copierea acestui prototip.
Singleton: Se asigură că o clasă are o singură instanță și oferă un punct de acces global la aceasta.

');


INSERT INTO `LearnJavaDB`.`gofinfo` (`title`, `description`)
VALUES ('Modele structurale: Aceste modele se ocupă de compoziția obiectelor, creând relații între obiecte pentru a forma structuri mai mari.',
        '
Modele structurale:

Adaptor: permite claselor cu interfețe incompatibile să lucreze împreună, înglobând propria interfață în jurul unei clase incompatibile.
Bridge: Decuplează o abstracție de la implementarea sa, permițând celor două să varieze independent.
Compozit: Compuneți obiecte în structuri arborescente pentru a reprezenta ierarhii parțial-întreg. Compozit permite clienților să trateze uniform obiectele individuale și compozițiile de obiecte.
Decorator: Atașează responsabilități suplimentare unui obiect în mod dinamic. Decoratorii oferă o alternativă flexibilă la subclasare pentru extinderea funcționalității.
Fațadă: oferă o interfață unificată unui set de interfețe dintr-un subsistem. Fațada definește o interfață de nivel superior care face subsistemul mai ușor de utilizat.
Flyweight: folosește partajarea pentru a susține eficient un număr mare de obiecte cu granulație fină.
Proxy: furnizează un substitut sau un substituent pentru alt obiect pentru a controla accesul la acesta.

');

INSERT INTO `LearnJavaDB`.`gofinfo` (`title`, `description`)
VALUES ('Behavioral patterns: These patterns focus on communication between objects, what goes on between objects and how they operate together.
',
        '
Tipare comportamentale:

Lanț de responsabilitate: permite unei cereri să transmită un lanț de obiecte până când este tratată.
Comandă: încapsulează o solicitare ca obiect, permițându-vă astfel să parametrizați clienții cu diferite solicitări, solicitări în coadă sau în jurnal și să suportați operațiuni care nu pot fi anulate.
Interpret: dată fiind o limbă, definește o reprezentare pentru gramatica acesteia împreună cu un interpret care folosește reprezentarea pentru a interpreta propoziții în limbă.
Iterator: Oferă o modalitate de a accesa secvențial elementele unui obiect agregat fără a expune reprezentarea de bază.
Mediator: definește un obiect care încapsulează modul în care un set de obiecte interacționează. Mediator promovează cuplarea liberă, împiedicând obiectele să se refere unul la celălalt în mod explicit și vă permite să variați interacțiunea lor în mod independent.
Memento: Fără a încălca încapsularea, captează și exteriorizează starea internă a unui obiect, astfel încât obiectul să poată fi restabilit mai târziu în această stare.
Observator: definește o dependență unu-la-mulți între obiecte, astfel încât atunci când un obiect își schimbă starea, toți dependenții săi sunt notificați și actualizați automat.
Stare: Permite unui obiect să-și modifice comportamentul atunci când starea sa internă se schimbă. Obiectul va părea să-și schimbe clasa.
Strategie: definește o familie de algoritmi, îi încapsulează pe fiecare și îi face interschimbabili. Strategia permite algoritmului să varieze independent de clienții care îl folosesc.
Metoda șablon: Definește scheletul unui algoritm într-o metodă, amânând unii pași către subclase. Metoda șablon permite subclaselor să redefinească anumiți pași ai unui algoritm fără a modifica structura algoritmului.
Vizitator: Reprezintă o operație care trebuie efectuată asupra elementelor unei structuri obiect. Visitor vă permite să definiți o nouă operație fără a modifica clasele elementelor pe care operează.

');

INSERT INTO `LearnJavaDB`.`gofanswer` (`title`, `description`)
VALUES ('Gof - Gang of Four',
        '
Este un pattern de dseigne a aplicatiei, care descrie 23 modele de designe, care sunt folosite in proiectarea de aplicatii.
Fiecare modul de designe are un scop si o aplicatie, care este descrisa in detaliu in documentatie.
Fiecare model are o descriere, care este descrisa in detaliu in documentatie, care este util pentru alti programatori.
');

INSERT INTO `LearnJavaDB`.`gofinfo` (`title`, `description`)
VALUES ('GRASP (General Responsibility Assignment Software Patterns)',
        '
Este un set de linii directoare pentru atribuirea responsabilității claselor și obiectelor într-un design orientat pe obiecte.
Ideea din spatele GRASP este de a atribui responsabilități într-un mod care urmează principiile SOLID, care sunt un set de linii directoare pentru proiectarea software-ului care este ușor de întreținut și extins.
');

INSERT INTO `LearnJavaDB`.`gofinfo` (`title`, `description`)
VALUES ('Iată câteva modele GRASP comune:',
        '
Creator: atribuie responsabilitatea pentru crearea unui obiect clasei care este cel mai potrivită pentru a-l crea.
Controler: Atribuie responsabilitatea pentru gestionarea intrărilor și ieșirii unei singure clase, numită controler.
Cuplare scăzută: Atribuie responsabilități într-un mod care minimizează dependențele dintre clase.
Coeziune ridicată: atribuie responsabilități într-un mod care maximizează „responsabilitatea unică” a unei clase, adică clasa ar trebui să aibă un scop clar, bine definit.
Tiparele GRASP sunt un instrument util de utilizat de către designeri atunci când proiectează software orientat pe obiecte. Ele vă pot ajuta să creați un design ușor de înțeles, întreținut și extins.
');

INSERT INTO `LearnJavaDB`.`gofinfo` (`title`, `description`)
VALUES ('',
        '
Tiparele GRASP sunt un instrument util de utilizat de către designeri atunci când proiectează software orientat pe obiecte.
Ele vă pot ajuta să creați un design ușor de înțeles, întreținut și extins.
Este important să rețineți că modelele GRASP sunt linii directoare, nu reguli stricte și rapide. Ar trebui să vă folosiți raționamentul și experiența atunci când le aplicați designului dvs.
În plus, este posibil să descoperiți că unele modele sunt mai aplicabile designului dvs. decât altele sau că trebuie să combinați mai multe modele pentru a rezolva o anumită problemă de design.
');

INSERT INTO `LearnJavaDB`.`graspanswer` (`title`, `description`)
VALUES ('GRASP - General Responsibility Assignment Software Patterns',
        '
Resprezinta modele de designe, care sunt folosite in proiectarea de aplicatii. Fiecare modul de designe are un scop si o aplicatie, care este descrisa in detaliu in documentatie.
De exemple, Controller - este folosirea pentru gestionarea si controlarea intrarilor si iesirilor din aplicatie.
Sau Creator - este folosit pentru a crea un obiect de o clasa care este cea mai potrivita pentru a-l crea.
');





