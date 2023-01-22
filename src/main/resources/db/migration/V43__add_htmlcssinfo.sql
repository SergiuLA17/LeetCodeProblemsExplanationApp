CREATE TABLE `LearnJavaDB`.`htmlcssinfo.`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);


INSERT INTO `LearnJavaDB`.`htmlcssinfo.` (`title`, `description`)
VALUES ('HTML - Hipertext Markup Language',
        '
HTML este limbaj de marcare pentru a crea aspectul si structura paginilor web.
Un Document html este creat din diferite sectii, fiecare sectiune fiind marcat cu un tag.
Exemplu: <html> </html> - tag-ul html este folosit pentru a marca inceputul si sfarsitul documentului html.
Tag-urile sunt insotite de atribute, care sunt informatii suplimentare despre tag.
Exemplu: <html lang="en"> </html> - atributele sunt insotite de valori, in acest caz valoarea atributului lang este "en".
Cateva exemple de taguri
<html> : definește începutul și sfârșitul unui document HTML
<head> : conține meta informații despre document, cum ar fi titlul și codificarea caracterelor
<body> : conține conținutul paginii web
<h1> până la <h6> : definește titluri de diferite niveluri
<p> : definește un paragraf de text
<img>: încorporează o imagine în pagina web
<a> : creează un hyperlink către o altă pagină web sau o anumită locație pe aceeași pagină
<div> : creează un container pentru elemente HTML, care poate fi folosit pentru a grupa elemente împreună și pentru a aplica stiluri
<form> : creează un formular care poate fi folosit pentru a colecta informații de la utilizator
<input>: creează diferite tipuri de câmpuri de intrare, cum ar fi casete de text, casete de selectare și butoane radio.

');

INSERT INTO `LearnJavaDB`.`htmlcssinfo.` (`title`, `description`)
VALUES ('CSS - Cascading Style Sheets',
        '
CSS este limbajul folosit pentru a crea stilurile pentru paginile web.
Exemplu: <style> </style> - tag-ul style este folosit pentru a marca inceputul si sfarsitul sectiunii de stiluri.
Exemplu: <style> body {background-color: yellow;} </style> - in acest exemplu se specifica culoarea de fundal a paginii web.
Cateva exemple de proprietati
background-color: specifica culoarea de fundal a unui element
color: specifica culoarea textului
font-family: specifica familia de fonturi
font-size: specifica marimea fontului

');



