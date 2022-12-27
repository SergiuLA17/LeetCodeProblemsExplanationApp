INSERT INTO `LearnJavaDB`.`oopanswer` (`title`, `description`)
VALUES ('PPO este un stip de programare, cu care putem transfera un obiect din realitate in cod,
cu toati parametrii lui, inclusiv si satrea lui.',
        '
POO are la baza 4 piloni, care ajuta sa realizam transformarea data.<br>
Ei sunt:<br>
1)Abstractizarea.<br>
2)Mostenirea.<br>
3)Polimorfizm.<br>
4)Incapsularea.<br>
');

INSERT INTO `LearnJavaDB`.`oopanswer` (`title`, `description`)
VALUES ('Incapsularea',
        '
Incapsularea este principiu care consta in restrictionarea accesului datelor, metodelor pentru utilizator sau alti programatori,
cu scopul de a mari securitatea progrmaei cat si controlarea schimbarilor a datelor.<br>
<br>
Daca ne referim la utilizator, ca exemplu putem sa luam un aparat de cafea, unde pentru utilizator sunt oferite cateva butoane,
pentru a alege tipul de facea si a da start prepararii,
dar restul mecanismului ca, volumul de apa pentru fiecare portie, sau volumul de cafea, este ascuns de ochii user-ului,
astfel, factorul uman asupra acestor mecanosme este redus la maximum. <br>

Daca sa vorbim de alto programatori, folosind asa mecanisme ca getter/setter sau modificatori, noi punem restricite altor programamtori,
adica noi le spunem, ca poti sa te folosesti de variabila, dar si usor putem face schimbari in proiect, daca o variabila dintr-o parte a programului
este folosita in mai multe parti ale proiectului. Ca exemplu, daca avem o variabila prin tot proiectul si ea nu este incapsulata,
atunci la schimbarea ei, se va portni efectul de cascada, adica tot se va strica si va fi nevoie de a schimba in fiecare loc unde a fost folosita aceasta variabile,
dar daca ea a fost incapsulata, atunci facad o schimbare, proiectul nu va fi afectat. <br>
O alta ideie a incapsiularii, este de a pune regulo pentru alti programatori, prin diferiti modificatori,
noi le spunem ca ei se pot folosi de variabilele noastre prin getter, dar nu au dreptul de a mofidica codul.

');

INSERT INTO `LearnJavaDB`.`oopanswer` (`title`, `description`)
VALUES ('Mostenire',
        '
Mostenirea este un principiu de a crea dintr-un obiect altul.<br>
Astfel noi ii transmitem starea si modul de comportare de la clasa parinte, cu scopul de a le schimba sau adauga altele noi.<br>

Ca exemplu:<br>
putem crea o clasa telefon, telefoane cu diferite tehnologii si module.<br>
Astfel putem crea o clasa telefon si deja de la ea de sa mostenim clase telfon mobil, telefon fix s.a.m.d.<br>
Cateva note despre mostenire in java:<br>
1)Constructorul clasei parinte permanent se va apela.<br>
2)Nu exista in Java mostenitre multipla.<br>
3)Se face prin cuvantul cheie extends.<br>

');

INSERT INTO `LearnJavaDB`.`oopanswer` (`title`, `description`)
VALUES ('Polimorfizm',
        '
Polimorfizmul este posibilitatea dea a folosi unul si acelasi cond in mai multe locuri ale programului,
sau in clase legate de mostenire. Polmorfizmul se poate realiza prin:<br>
1)Interfate.<br>
2)Suprascriere si supraincarcare.<br>
3)Clase abstracte.<br>

');


INSERT INTO `LearnJavaDB`.`oopanswer` (`title`, `description`)
VALUES ('Abstractizarea',
        '
Abstractizarea este posibilitatea de a ascunde detalii abstracte si de a se concentra pe functionalitatea obiectului.<br>
Abstractizarea se realizeaza cu ajutorul clasei abstracte si interfetelor.<br>
De exemplu:<br>
exemplu clasa abstracta defineste starea si functionalitatea pentru mostenotorii sau,dar nu realizeaza functionalitatea.<br>
Interfetele defineste niste metode care obligatoriu vor fi implementate in clase, dar singure interfete nu realizeaza functionalitatea data.<br>


');

