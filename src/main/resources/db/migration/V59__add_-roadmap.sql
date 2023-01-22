CREATE TABLE `LearnJavaDB`.`roadmap`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO `LearnJavaDB`.`roadmap` (`title`, `description`)
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