INSERT INTO `LearnJavaDB`.`solidinfo` (`title`, `description`)
VALUES ('SOLID - este un set de recomadari pentru programare in POO.',
        '
Principiile SOLID pot ajuta dezvoltatorii să creeze software ușor de întreținut, extins și înțeles.<br>
Iată o scurtă explicație a fiecăruia dintre principiile SOLID:<br>
Principiul Single Responsibility Principle: O clasă ar trebui să aibă un singur motiv pentru a se schimba. Aceasta înseamnă că o clasă ar trebui să aibă o singură responsabilitate bine definită și nu ar trebui să fie responsabilă pentru mai mult de un lucru.<br>
Principiul Open-Closed Principle: entitățile software (clase, module, funcții etc.) ar trebui să fie deschise pentru extindere, dar închise pentru modificare. Aceasta înseamnă că ar trebui să puteți adăuga o nouă funcționalitate unei clase fără a modifica codul existent.<br>
Principiul Liskov Substitution Principle: Principiul de substituție Liskov (LSP) este un principiu în proiectarea orientată pe obiecte care afirmă că, dacă un program folosește o superclasă, ar trebui să poată folosi o subclasă fără a o ști. Cu alte cuvinte, subclasele ar trebui să poată fi utilizate în același mod ca și superclasa lor și nu ar trebui să schimbe comportamentul programului într-un mod neașteptat.<br>
Principiul Interface Segregation Principle: Clienții nu ar trebui să fie forțați să depindă de interfețele pe care nu le folosesc. Aceasta înseamnă că o clasă nu ar trebui să implementeze metode de care nu are nevoie.<br>
Principiul Dependency Inversion Principle: modulele de nivel înalt nu ar trebui să depindă de modulele de nivel scăzut. Ambele ar trebui să depindă de abstracții. Aceasta înseamnă că software-ul dvs. ar trebui să fie proiectat astfel încât componentele de nivel înalt să nu fie dependente de componentele de nivel scăzut, ci mai degrabă ambele să fie dependente de abstracții.<br>
Aderarea la principiile SOLID vă poate ajuta să creați software mai ușor de întreținut, mai extensibil și mai ușor de înțeles. De asemenea, poate facilita colaborarea cu alți dezvoltatori, deoarece principiile SOLID ajută la stabilirea unui set de bune practici pentru proiectarea orientată pe obiecte.<br>

');
INSERT INTO `LearnJavaDB`.`solidsrp` (`title`, `description`)
VALUES ('Exemplu de aplicare a principiului Single Responsibility Principle',
        '
<img class = "center zoom"alt="" src="../photo/solidsrp/img.png">
<img class = "center zoom"alt="" src="../photo/solidsrp/img_1.png">

În acest exemplu, clasa Angajat are o singură responsabilitate: reprezentarea unui angajat într-o companie. Are câmpuri pentru stocarea numelui, e-mailului, salariului și zilelor de concediu ale angajatului și are metode de accesare și actualizare a acestor câmpuri. Toate metodele și câmpurile din clasa Angajat sunt direct legate de responsabilitatea de a reprezenta un angajat, astfel încât SRP este respectat.<br>

Dacă dorim să adăugăm responsabilități suplimentare la clasa Angajat, cum ar fi înregistrarea datelor sau trimiterea de e-mailuri, ar fi mai bine să creăm clase separate pentru aceste responsabilități, decât să le adăugăm la clasa Angajat. Acest lucru ar ajuta la respectarea SRP și la crearea unui design mai modular și mai ușor de întreținut pentru aplicația noastră.<br>

');

INSERT INTO `LearnJavaDB`.`solidocp` (`title`, `description`)
VALUES ('Exemplu de aplicare a principiului Open-Closed Principle',
        '
<img class = "center zoom"alt="" src="../photo/solidocp/img.png">
<img class = "center zoom"alt="" src="../photo/solidocp/img_1.png">

În acest exemplu, interfața Shape este deschisă pentru extensie (puteți crea noi clase care implementează Shape), dar închisă pentru modificare (nu trebuie să schimbați interfața Shape în sine pentru a adăuga o nouă funcționalitate). Clasa AreaCalculator este, de asemenea, închisă pentru modificare (nu trebuie să o modificați pentru a adăuga noi forme sau calcule noi), dar deschisă pentru extindere (puteți adăuga noi metode de calcul dacă este necesar).<br>

');

INSERT INTO `LearnJavaDB`.`solidisp` (`title`, `description`)
VALUES ('Exemplu de aplicare a principiului Interface Segregation ',
        '
Principiul de segregare a interfeței (ISP) este un principiu din designul orientat pe obiecte care afirmă că clienții nu ar trebui să fie forțați să depindă de interfețele pe care nu le folosesc. Acesta sugerează că o clasă ar trebui să aibă mai multe interfețe specifice, mai degrabă decât o singură interfață cu scop general.<br>

Iată un exemplu despre cum poate fi aplicat ISP-ul:<br>
<img class = "center zoom"alt="" src="../photo/solidlip/img.png">
<img class = "center zoom"alt="" src="../photo/solidlip/img_1.png">
În acest exemplu, clasele Dog și Cat sunt subclase ale superclasei Animal și ambele suprascriu metoda makeNoise(). Metoda makeAnimalsNoise() preia o listă de obiecte Animal și apelează metoda makeNoise() pe fiecare. Deoarece clasele Dog și Cat au suprascris în mod corespunzător metoda makeNoise(), acestea pot fi folosite ca substituții pentru obiectele Animal fără a afecta corectitudinea programului. Acest lucru demonstrează principiul substituției Liskov în acțiune.

');

INSERT INTO `LearnJavaDB`.`soliddip` (`title`, `description`)
VALUES ('Exemplu de aplicare a principiului Dependency Inversion Principle',
        '
Principiul inversării dependenței (DIP) este un principiu din proiectarea orientată pe obiecte care afirmă că modulele de nivel înalt nu ar trebui să depindă de modulele de nivel scăzut, ci mai degrabă ambele ar trebui să depindă de abstracții. Acest principiu ajută la decuplarea diferitelor părți ale unui sistem și îl face mai flexibil și mai ușor de întreținut.<br>
<img class = "center zoom"alt="" src="../photo/soliddip/img.png">
<img class = "center zoom"alt="" src="../photo/soliddip/img_1.png">
În acest exemplu, clasa UserDataAccessObject este un modul de nivel înalt care depinde de interfața DataAccessObject, care reprezintă o abstractizare. Clasa DatabaseConnection este un modul de nivel scăzut care implementează detaliile modului de conectare la o bază de date. Clasa UserDataAccessObject depinde de clasa DatabaseConnection, dar o face prin interfața DataAccessObject, care reprezintă o abstracție. Acest lucru permite clasei UserDataAccessObject să fie decuplată de detaliile clasei DatabaseConnection, facilitând modificarea implementării clasei DatabaseConnection fără a afecta clasa UserDataAccessObject.<br>
');

INSERT INTO `LearnJavaDB`.`solidlsp` (`title`, `description`)
VALUES ('Exemplu de aplicare a principiului Liskov Substitution Principle',
        '
Principul consta in idea, daca 2 clase care nu au legatura prin mostenire, dar au comportament asemantor, ele obligatoriu trebuie sa folosesasca mostenirea.<br>
');


