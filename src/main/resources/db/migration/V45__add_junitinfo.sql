CREATE TABLE `LearnJavaDB`.`junitinfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);


INSERT INTO `LearnJavaDB`.`junitinfo` (`title`, `description`)
VALUES ('JUnit',
        '
JUnit este un framework pentru testarea. Este un framework open source, care permite testarea unitara a codului scris in Java.

');

INSERT INTO `LearnJavaDB`.`junitinfo` (`title`, `description`)
VALUES ('JUnit',
        '
Unele dintre caracteristicile cheie ale JUnit includ:

Configurare de testare bazată pe adnotări: JUnit utilizează adnotări pentru a configura metodele de testare și clasele de testare.<br>
Test runner: JUnit oferă un test runner care poate fi folosit pentru a executa testele.<br>
Metode de aserție: JUnit oferă un set de metode de aserție care pot fi utilizate pentru a verifica rezultatele așteptate ale unui test.<br>
Suite de teste: JUnit vă permite să vă organizați testele în suite de teste, care pot fi folosite pentru a rula mai multe teste împreună.<br>
Categorii de teste: JUnit vă permite să vă clasificați cazurile de testare, ceea ce ușurează rularea anumitor grupuri de teste.<br>
Raportare de testare: JUnit oferă rapoarte de testare în diferite formate, cum ar fi XML și HTML, care pot fi integrate cu instrumente de integrare continuă precum Jenkins.<br>
');

INSERT INTO `LearnJavaDB`.`junitinfo` (`title`, `description`)
VALUES ('JUnit',
        '
JUnit este utilizat pe scară largă în comunitatea de dezvoltare Java și este o alegere populară pentru scrierea de teste unitare automate pentru codul Java.
API-ul său simplu și ușor de utilizat și capacitatea de a executa cazuri de testare într-un mod repetabil și fiabil fac din JUnit un instrument puternic pentru îmbunătățirea calității codului Java.');




