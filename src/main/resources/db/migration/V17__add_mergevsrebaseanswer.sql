CREATE TABLE `LearnJavaDB`.`mergevsrebaseanswer`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);



INSERT INTO `LearnJavaDB`.`mergevsrebaseanswer` (`title`, `description`)
VALUES ('Merge: ',
        '
git merge este o comandă simplă care preia modificările dintr-o ramură și le aplică în altă ramură.
Când rulați git merge, acesta creează un nou commit care reprezintă modificările combinate ale ambelor ramuri.
Acest lucru are ca rezultat un istoric liniar, noul commit fiind adăugat la sfârșitul ramurii.

');

INSERT INTO `LearnJavaDB`.`mergevsrebaseanswer` (`title`, `description`)
VALUES ('Rebase:',
        '

git rebase, pe de altă parte, rescrie istoricul de comitere al unei ramuri.
Când rulați git rebase, acesta aplică modificările de la o ramură peste o altă ramură, mai degrabă decât să creeze un nou commit.
Acest lucru are ca rezultat o istorie neliniară, commit-urile rebazate apărând ca și cum ar fi fost făcute la un moment ulterior în timp.



');

INSERT INTO `LearnJavaDB`.`mergevsrebaseanswer` (`title`, `description`)
VALUES ('Rebase Vs Merge:',
        '
git merge și git rebase sunt ambele folosite pentru a combina mai multe ramuri, dar fac acest lucru în moduri diferite.
Un avantaj al rebase, este ca istoricul de comitere este mai curat și mai ușor de urmărit.
Dar daca altcineva a lucrat pe aceeași ramură, rebase poate crea conflicte.

In general merge este mai sigur, deoarece doar adauga noi commituri in istoric, iar rebase poate modifica istoricul de comitere.
Rebese este mai util cand vrem sa pastram istoricul de comitere mai curat.


');

