CREATE TABLE `LearnJavaDB`.`multithreadinginfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `LearnJavaDB`.`happensbefore`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `LearnJavaDB`.`multithreadinglist`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);


INSERT INTO `LearnJavaDB`.`multithreadinginfo` (`title`, `description`)
VALUES ('MuliThreading',
        '
Permite executarea mai multor fire in paralel. <br>
Acest lucru este util atunci cand avem nevoie de executie rapida a unor operatii care nu depind una de alta.<br>
In Java un fir poate fi creat prin clasa Thread apoi prin suprascrierea metodei run().<br>
class MyThread extends Thread {<br>
  public void run() {<br>
    // code to be executed by the thread<br>
  }<br>
}<br>
<br>
MyThread myThread = new MyThread();<br>
myThread.start();<br>
<br>
Putem si prin implementarea interfetei Runnable.<br>
class MyRunnable implements Runnable {<br>
  public void run() {<br>
    // code to be executed by the thread<br>
  }<br>
}<br>
<br>
MyRunnable myRunnable = new MyRunnable();<br>
Thread thread = new Thread(myRunnable);<br>
thread.start();<br>
<br>
În general, se recomandă implementarea interfeței Runnable, deoarece vă permite să moșteniți din altă clasă.<br>
');

INSERT INTO `LearnJavaDB`.`happensbefore` (`title`, `description`)
VALUES ('Happens-before',
        '
Relaita interzice procesorului sa schimbe ordinea executiei a doua operatii care nu sunt legate intre ele.<br>
Adica daca avem doua operatii care nu sunt legate intre ele, procesorul nu va schimba ordinea lor.<br>
Exista mai multe modalitati de a crea relatia Happens-before.<br>

Aceasta relatie ajuta la faptul ca modificarile facute de un fir vor fi vizibile de alt fir.<br>


');
INSERT INTO `LearnJavaDB`.`happensbefore` (`title`, `description`)
VALUES ('Ordinea programului',
        '
Orice acțiune dintr-un fir are loc înaintea oricărei acțiuni din acel fir care vine mai târziu în ordinea programului. <br>

');
INSERT INTO `LearnJavaDB`.`happensbefore` (`title`, `description`)
VALUES ('Synchronization',
        '
Acest principiu constă în faptul că dacă un fir deblochează un monitor,
atunci niciun alt fir nu poate bloca acel monitor până când primul fir nu a terminat de lucrat cu monitorul. <br>
');

INSERT INTO `LearnJavaDB`.`happensbefore` (`title`, `description`)
VALUES ('volatile variables',
        '
O variabila volotile este o variabila care este accesata de mai multe fire de executie.<br>
Adica datele din variabile se vor scrie in memorie imediat dupa ce sunt modificate.<br>
Si vor fi vazute de toate firele de executie.<br>
');

INSERT INTO `LearnJavaDB`.`happensbefore` (`title`, `description`)
VALUES ('Thread start',
        '
Este garantat ca un fir va porni dupa ce metoda start() a fost apelata.<br>

Presupunem ca avem doua fire de executie, A si B.<br>
Daca firul A apeleaza metoda start() asupra firului B,
atunci firul B va fi pornit inainte ca firul A sa isi termine executia.<br>

');

INSERT INTO `LearnJavaDB`.`happensbefore` (`title`, `description`)
VALUES ('Interrupts',
        '
Este garantat ca un fir va fi intrerupt dupa ce metoda interrupt() a fost apelata.<br>

Presupunem ca avem doua fire de executie, A si B.<br>
Daca firul A apeleaza metoda interrupt() asupra firului B,
atunci firul B va fi intrerupt inainte ca firul A sa isi termine executia.<br>


');



INSERT INTO `LearnJavaDB`.`multithreadinglist` (`title`, `description`)
VALUES ('MuliThreading',
        '
<ul>
    <li><a href="http://localhost:7777/MultiThreading">Info</a></li>
    <li><a href="http://localhost:7777/HappensBefore">happens-before</a></li>

</ul>
');


