CREATE TABLE `LearnJavaDB`.`sets`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO `LearnJavaDB`.`sets` (`title`, `description`)
VALUES ('Sets',
        '
Set este o colectie care stocheaza elemente unice, oridnea lor nu este garantata.<br>
Clasese care implementeaza interfata Set sunt HashSet, LinkedHashSet si TreeSet.<br>
Avantajele set sunt:<br>
-Seturile nu permit elemente duplicate.<br>
-Elementele din set sunt imutabile, prezinta avantak cand avem nevoie sa elemente neschimbate.<br>
-Set se foloseste cu alte colectii ca list si map, pentru a efectua operatie de intersectie, reuniune, diferenta.<br>

Din dezavantaje putem evidentia:<br>
-Nu este compatibila cu alte stuclute de date, deoarece nu mentine ordinea elementelor.<br>
-Seturile nu permit accesarea elementelor dupa index.<br>
-Au aceleasi dezavantaje ca si listele, adica pot folosi multa memorie si pot fi mai lente in unele operatii.<br>
<br>
<br>
');