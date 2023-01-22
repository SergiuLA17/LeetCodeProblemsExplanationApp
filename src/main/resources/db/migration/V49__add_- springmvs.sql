CREATE TABLE `LearnJavaDB`.`springmvsinfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);


INSERT INTO `LearnJavaDB`.`springmvsinfo` (`title`, `description`)
VALUES ('Spring MVS',
        '
Spring MVC este o componentă a Spring Framework care oferă un cadru flexibil și ușor de utilizat pentru construirea de aplicații web.
Urmează modelul arhitectural Model-View-Controller (MVC), care separă logica aplicației în componente distincte pentru manipularea modelului de date,
a interfeței cu utilizatorul și a fluxului de control. Spring MVC oferă o implementare specifică web a modelului Inversion of Control (IoC),
facilitând gestionarea ciclului de viață al componentelor web și conectarea lor împreună. De asemenea, oferă un sistem de rutare puternic și flexibil care mapează adresele URL către controlere și acceptă o gamă largă de tehnologii de vizualizare,
inclusiv JSP, Thymeleaf și Velocity.');






