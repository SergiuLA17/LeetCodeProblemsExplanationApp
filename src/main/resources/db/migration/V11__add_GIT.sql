CREATE TABLE `LearnJavaDB`.`gitcommands`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `LearnJavaDB`.`mergevsrebase`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);


INSERT INTO `LearnJavaDB`.`gitcommands` (`title`, `description`)
VALUES ('GIT',
        '
git status - arata statusul proiectului
git add - adauga fisierele in staging area
git commit - salveaza modificarile
git push <remote> <branch> - trimite modificarile pe server
git pull <remote> <branch> - ia modificarile de pe server
git checkout <branch> - schimba branch-ul
git checkout -b <branch> - creeaza un nou branch
git branch - afiseaza branch-urile
git clone <url> - clona un proiect de pe server
git merge <branch> - face merge intre branch-urim, adica adauga modificarile dintr-un branch in altul

');

INSERT INTO `LearnJavaDB`.`mergevsrebase` (`title`, `description`)
VALUES ('merge vs rebase',
        '
In Git, o „fusionare” este actul de integrare a modificărilor de la o ramură în alta.
Când efectuați o îmbinare, luați modificările care au fost făcute pe o ramură separată și le aplicați la ramura principală, creând un nou commit care aduce cele două ramuri împreună.

„Rebase” este o operație similară cu o îmbinare, dar funcționează diferit.
În loc să creeze un nou commit care adună cele două ramuri împreună, o rebază redă modificările dintr-o ramură deasupra altei ramuri.
Acest lucru are ca rezultat o istorie liniară, în care se pare că schimbările s-au produs deodată, mai degrabă decât pe o ramură separată.

Atât merge cât și rebase pot fi folosite pentru a integra modificări de la o ramură în alta, dar fac acest lucru în moduri diferite și au implicații diferite pentru istoricul ramurului.

O diferență esențială între merge și rebase este că o îmbinare creează o nouă comitere care înregistrează faptul că cele două ramuri au fost îmbinate, în timp ce o rebază reluează modificările de la o ramură peste alta și elimină comiterile originale.
Acest lucru poate face ca istoricul ramurilor să pară mai liniar, dar poate face și mai dificilă înțelegerea istoricului proiectului și a vedea când s-au făcut anumite modificări.

Este important să luați în considerare cu atenție ce metodă este potrivită pentru fluxul dvs. de lucru, deoarece alegerea poate avea implicații semnificative asupra modului în care istoria proiectului dvs. este înregistrată și partajată cu alții.

');