CREATE TABLE `LearnJavaDB`.`exception`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `LearnJavaDB`.`check`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `LearnJavaDB`.`exceptionanswer`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `LearnJavaDB`.`unchecked`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);




INSERT INTO `LearnJavaDB`.`exception` (`title`, `description`)
VALUES ('În Java, o excepție este un eveniment care are loc în timpul executării unui program care perturbă fluxul normal de instrucțiuni.
Excepțiile pot fi generate de sistemul de rulare Java sau pot fi generate manual de codul dvs.',
        '
În Java, gestionarea excepțiilor se face folosind o ierarhie a claselor de excepții.
În vârful ierarhiei se află clasa de bază aruncată. Aruncarea are două subclase principale: eroare și excepție.
Eroarea reprezintă probleme grave care nu ar trebui să fie prinse în codul dvs.,
în timp ce excepția reprezintă probleme care pot fi tratate.
');

INSERT INTO `LearnJavaDB`.`exception` (`title`, `description`)
VALUES ('',
        '
Există mai multe subclase de excepție, inclusiv RuntimeException și subclasele sale, care reprezintă excepții
care pot fi aruncate în timpul funcționării normale a mașinii virtuale Java (JVM). Există, de asemenea,
mai multe alte subclase de excepție care reprezintă mai multe tipuri de excepții specifice, cum ar fi IOException
pentru erori de intrare/ieșire, SQLException pentru erorile bazei de date și așa mai departe.
');

INSERT INTO `LearnJavaDB`.`exception` (`title`, `description`)
VALUES ('Iată un exemplu despre cum să prindeți și să gestionați o excepție în Java:',
        '
try {
    // code that might throw an exception
} catch (Exception e) {
    // code to handle the exception
}

Blocul de încercare conține codul care ar putea arunca o excepție. Blocul de captură conține codul care va gestiona excepția dacă este aruncat.

Puteți include, de asemenea, un bloc în cele din urmă după blocul de captură, care va executa dacă este aruncată sau nu o excepție.
În sfârșit, blocul este folosit adesea pentru a închide resursele, cum ar fi mânerele de fișiere sau conexiunile bazei de date,
care au fost deschise în blocul de încercare.
');

INSERT INTO `LearnJavaDB`.`check` (`title`, `description`)
VALUES ('In Java, o excepție verificată este o excepție care trebuie fie prinsă sau declarată a fi aruncată de metoda care o aruncă.
Excepțiile verificate sunt verificate de compilatorul Java la ora de compilare.',
        '
Iată un exemplu despre cum să declarați că o metodă aruncă o excepție verificată:
public void doSomething() throws IOException {
    // code that might throw an IOException
}
Dacă o metodă care aruncă o excepție verificată este apelată dintr -un bloc de încercare, atunci excepția trebuie să fie prinsă într -un
bloc de captură sau declarată a fi aruncată prin metoda de apelare.
');


INSERT INTO `LearnJavaDB`.`check` (`title`, `description`)
VALUES ('Iată un exemplu despre cum să prinzi o excepție verificată:',
        '
try {
    doSomething();
} catch (IOException e) {
    // code to handle the exception
}
Dacă nu este prinsă o excepție verificată, atunci metoda de apel trebuie să declare că aruncă excepția.
');

INSERT INTO `LearnJavaDB`.`check` (`title`, `description`)
VALUES ('',
        '
Excepțiile verificate sunt destinate să reprezinte situații excepționale care pot fi gestionate de codul de apel.
Exemple de excepții verificate includ ioexception, sqlexception și filenotfoundException.
');

INSERT INTO `LearnJavaDB`.`unchecked` (`title`, `description`)
VALUES ('unchecked exceptions sunt excepții care nu sunt verificate de compilatorul Java la ora de compilare.',
        '
Unchecked exceptions sunt excepții care nu sunt verificate de compilatorul Java la ora de compilare.
Excepțiile unchecked nu trebuie să fie prinse sau declarate aruncate de metoda care le aruncă.
Aceasta înseamnă că puteți alege dacă să gestionați sau nu o excepție necontrolată și nu este necesar să specificați că metoda dvs. aruncă excepția.
');


INSERT INTO `LearnJavaDB`.`exceptionanswer` (`title`, `description`)
VALUES ('Exceptions - sunt problemele care apar in timpul rularii programului.',
        '
In Java exceptiile sunt obiecte, astfel ele apar nu automat, dar si pot fi create de programator.
Clasele exceptiilor sunt mostenite de la clasa Throwable.
Clasa Throwable are doua subclase principale: Exception si Error.
In general Error se foloseste pentru erorile care apar in timpul rularii JVM, nu se recomanda sa le tratam, iar Exception pentru erorile care apar in timpul rularii programului, pe ele le putem trata.
In java exista 2 tipuri de exceptii: checked si unchecked.
Excepțiile controlate sunt excepții care pot fi сontrolate de catre programator,
iar unchecked nu pot sau sunt recomandate sa fie tratate, deoarece ele  sunt erori care apar in timpul rularii JVM.
');

INSERT INTO `LearnJavaDB`.`exceptionanswer` (`title`, `description`)
VALUES ('In java exista 2 tipuri de exceptii: checked si unchecked.',
        '
Excepțiile controlate sunt excepții care pot fi сontrolate de catre programator,
iar unchecked nu pot sau sunt recomandate sa fie tratate, deoarece ele  sunt erori care apar in timpul rularii JVM.
Clasa Exception este clasa de baza, se imparte tot in checked si unchecked.
CLasa unchecked este clasa RuntimeException, care raspunde pentru exceptiile care apar in timpul rularii programului si nu sunt controlate de programator.

');


