INSERT INTO `LearnJavaDB`.`kissinfo` (`title`, `description`)
VALUES ('Principiul KISS este un acronim care înseamnă „Keep It Simple, Stupid.',
        '
Este un principiu de proiectare care sugerează că sistemele trebuie menținute cât mai simple posibil pentru a fi eficiente și eficiente.
Ideea din spatele principiului KISS este că sistemele complexe sunt mai predispuse la erori și sunt mai greu de înțeles și întreținut.
Păstrând lucrurile simple, este mai ușor să înțelegeți cum funcționează un sistem și este mai ușor să identificați și să remediați problemele atunci când apar.
Principiul KISS poate fi aplicat la proiectarea și dezvoltarea de software scris în Java, la fel ca orice alt limbaj de programare.
Iată câteva moduri în care principiul KISS poate fi aplicat atunci când scrieți cod Java:

');
INSERT INTO `LearnJavaDB`.`kissinfo` (`title`, `description`)
VALUES ('Păstrați codul simplu și ușor de citit',
        '
Evitați să utilizați structuri de cod complexe sau caracteristici avansate ale limbajului, dacă nu sunt necesare.
Folosiți nume de variabile clare și concise și asigurați-vă că codul dvs. este bine documentat, astfel încât ceilalți să îl poată înțelege cu ușurință.

');

INSERT INTO `LearnJavaDB`.`kissinfo` (`title`, `description`)
VALUES ('Evitați suprainginerirea',
        '
Nu încercați să rezolvați o problemă cu o soluție care este mai complexă decât trebuie.
Rețineți că cea mai simplă soluție este adesea cea mai bună.
');

INSERT INTO `LearnJavaDB`.`kissinfo` (`title`, `description`)
VALUES ('Nu te repeta',
        '
Evitați să scrieți același cod de mai multe ori. În schimb, utilizați funcții și metode pentru a reutiliza codul după cum este necesar.

');

INSERT INTO `LearnJavaDB`.`kissinfo` (`title`, `description`)
VALUES ('Păstrați codul modular',
        '
Împărțiți codul în module mai mici, independente, care pot fi testate și întreținute cu ușurință.
Acest lucru va face codul dvs. mai reutilizabil și mai ușor de înțeles.
');

INSERT INTO `LearnJavaDB`.`kissinfo` (`title`, `description`)
VALUES ('Păstrați-vă codul eficient',
        '
Asigurați-vă că codul este cât mai eficient posibil utilizând algoritmi și structuri de date eficiente.
Evitați utilizarea resurselor sau operațiunilor inutile, deoarece acest lucru vă poate încetini codul și îl poate face mai puțin eficient.
<br>
<br>
Urmând principiul KISS, puteți scrie cod Java care este simplu, ușor de înțeles și eficient.
Acest lucru va face codul mai ușor de întreținut și îmbunătățit în timp și va fi mai probabil să funcționeze corect.
');

INSERT INTO `LearnJavaDB`.`dryinfo` (`title`, `description`)
VALUES ('DRY înseamnă „Don’t Repeat Yourself”.',
        '
Este un principiu în programare care urmărește să reducă redundanța și să îmbunătățească mentenabilitatea, asigurându-se că funcționalitatea similară nu este duplicată în diferite părți ale unei baze de cod.
<br>
<br>
În Java, puteți urma principiul DRY utilizând clase și interfețe abstracte pentru a defini un comportament comun care poate fi partajat între mai multe clase.
De asemenea, puteți utiliza moștenirea și polimorfismul pentru a reutiliza codul.
În plus, puteți utiliza clase și funcții de utilitate pentru a centraliza funcționalitatea obișnuită și pentru a reduce cantitatea de duplicare a codului dvs.
Este important să rețineți că respectarea principiului DRY nu înseamnă neapărat că nu trebuie să repetați niciodată niciun cod. În unele cazuri, poate fi adecvat să repetați cantități mici de cod pentru a îmbunătăți lizibilitatea sau mentenabilitatea. Cu toate acestea,
în general, este o idee bună să minimizați redundanța și să urmăriți o bază de cod curată și coerentă.
');


INSERT INTO `LearnJavaDB`.`dryanswer` (`title`, `description`)
VALUES ('DRY - Don’t Repeat Yourself',
        '
Este principiul care spune ca codul trebue sa fie scris fara a se repeta.
In Java pentru a resprecta principiul dat putem folosi clase abstracte si interfete. De asemenea putem folosi mostenirea si poliformizmul.
Dar nu este de fie care data sa respectam principiul dat, cate o data este bine sa repetam codul pentru a face codul mai usor de inteles.
Principalul avantaj este minimalizarea redundantei si lizibilitatea codului.
');

INSERT INTO `LearnJavaDB`.`yagniinfo` (`title`, `description`)
VALUES ('YAGNI este un acronim care înseamnă „You Ain’t Gonna Need It”.',
        '
Este un principiu al programării extreme (XP) care sugerează că dezvoltatorii de software nu ar trebui să adauge funcționalități unui proiect decât dacă este imediat necesar.
Ideea din spatele YAGNI este de a evita adăugarea de complexitate inutilă unui proiect, deoarece acest lucru poate duce la creșterea costurilor de întreținere și la scăderea flexibilității.
');

INSERT INTO `LearnJavaDB`.`yagniinfo` (`title`, `description`)
VALUES ('În contextul Java, YAGNI înseamnă',
        '
Poate fi aplicat concentrându-se pe implementarea doar a funcționalității necesare pentru iterația curentă a unui proiect, mai degrabă decât încercarea de a anticipa și implementa caracteristici care ar putea să nu fie necesare decât mai târziu.
Acest lucru poate ajuta la menținerea bazei de cod redusă și de întreținere și, de asemenea, poate ajuta la prevenirea dezvoltatorilor să piardă timpul cu funcții care s-ar putea să nu fie folosite niciodată.
');

INSERT INTO `LearnJavaDB`.`yagniinfo` (`title`, `description`)
VALUES ('Iată un exemplu despre cum ar putea fi aplicat YAGNI într-un proiect Java:',
        '
Să presupunem că lucrați la un proiect pentru a construi o aplicație simplă pentru lista de activități.
Ați fost însărcinat să implementați caracteristica care permite utilizatorilor să adauge sarcini noi la lista lor.
');

INSERT INTO `LearnJavaDB`.`yagniinfo` (`title`, `description`)
VALUES ('',
        '
Pentru început, puteți crea o clasă Java numită Sarcină pentru a reprezenta o singură sarcină, cu câmpuri pentru descrierea sarcinii și un boolean care indică dacă sarcina a fost finalizată.
De asemenea, puteți crea o clasă TaskList pentru a gestiona o colecție de sarcini.
');

INSERT INTO `LearnJavaDB`.`yagniinfo` (`title`, `description`)
VALUES ('',
        '
Pe măsură ce lucrați la proiect, puteți fi tentat să adăugați funcționalități suplimentare la clasa de sarcini, cum ar fi capacitatea de a seta o dată limită pentru o sarcină sau de a atribui un nivel de prioritate.
Cu toate acestea, aceste caracteristici nu sunt strict necesare pentru iterația actuală a proiectului, iar adăugarea lor ar crește complexitatea bazei de cod fără a oferi niciun beneficiu imediat.
');

INSERT INTO `LearnJavaDB`.`yagniinfo` (`title`, `description`)
VALUES ('',
        '
Urmând principiul YAGNI, vă veți concentra pe implementarea doar a funcționalității necesare pentru a susține iterația curentă a proiectului și amânați adăugarea de caracteristici suplimentare până când acestea sunt cu adevărat necesare.
Acest lucru poate ajuta la menținerea bazei de cod simplă și de întreținut și, de asemenea, vă poate ajuta să vă preveniți să pierdeți timpul cu funcții care ar putea fi niciodată folosite
');

INSERT INTO `LearnJavaDB`.`yagnianswer` (`title`, `description`)
VALUES ('YAGNI - You Ain’t Gonna Need It',
        '
Principiul YAGNI in Java este aplicat ca sa nu adaugam functii care nu sunt necesare pentru proiectul nostru.
Se aplica pentru a nu adauga complexitate inutila proiectului nostru.
APlicand principiul YAGNI putem ne concentra pe sarcina principala a etapei curente a proiectului.
');





