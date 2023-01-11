CREATE TABLE `LearnJavaDB`.`sortmerge`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `LearnJavaDB`.`quicksort`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);



INSERT INTO `LearnJavaDB`.`sortmerge` (`title`, `description`)
VALUES ('Sort merge ',
        '
Sortarea merge , consta in faptul de a imparti in doua array-ul, pana cand avem un array cu un singur element. <br>
Apoi incepem sa le combinam inapoi in ordine crescatoare.<br>
Se executa aceasta impartire cu ajutorul recursiei.<br>
Are timp de executie O(n log n).<br>
Este buna de folosit cand avem date care vin grupate si trebuie sa le unim cu alte date deja sortate.<br>
De exemplu in retea, unde avem deja date sortate, si vin alte date, care trebui unite cu cele sortate.<br>
<br>
Nu este recomandata de a fi filosit cand vrem sa sortam un array deja sortat, deoarece are timp de executie O(n log n).<br>

');


INSERT INTO `LearnJavaDB`.`quicksort` (`title`, `description`)
VALUES ('Quick sort ',
        '
Sortarea merge , consta in faptul de a imparti in doua array-ul, pana cand avem un array cu un singur element. <br>
Apoi incepem sa le combinam inapoi in ordine crescatoare.<br>
Se executa aceasta impartire cu ajutorul recursiei.<br>
Are timp de executie O(n log n).<br>
Este buna de folosit cand avem date care vin grupate si trebuie sa le unim cu alte date deja sortate.<br>
De exemplu in retea, unde avem deja date sortate, si vin alte date, care trebui unite cu cele sortate.<br>
<br>
Nu este recomandata de a fi filosit cand vrem sa sortam un array deja sortat, deoarece are timp de executie O(n log n).<br>

');


