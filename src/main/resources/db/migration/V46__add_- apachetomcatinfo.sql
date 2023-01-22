CREATE TABLE `LearnJavaDB`.`apachetomcatinfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);


INSERT INTO `LearnJavaDB`.`apachetomcatinfo` (`title`, `description`)
VALUES ('Apach Tomcat',
        '
Apache Tomcat este un open source server pentru rularea aplicatiilor web.<br>
Tomcat implementează specificațiile Java Servlet, JavaServer Pages (JSP) și Java Expression Language (EL) de la Oracle Corporation
și oferă un mediu de server web HTTP „pur Java” pentru rularea codului Java.<br>

');

INSERT INTO `LearnJavaDB`.`apachetomcatinfo` (`title`, `description`)
VALUES ('JUnit',
        '
Unele dintre caracteristicile cheie ale Apache Tomcat includ:<br>
<br>
Suport Servlet și JSP: Tomcat acceptă specificațiile Java Servlet și JSP, care le permit dezvoltatorilor să scrie aplicații web folosind aceste tehnologii.<br>
Ușor: Tomcat este un container ușor, are o amprentă mică și necesită resurse minime pentru a rula.<br>
Scalabil: Tomcat poate fi scalat cu ușurință pentru a sprijini un număr mare de utilizatori și a gestiona traficul ridicat.<br>
Personalizabil: arhitectura Tomcat este foarte modulară și poate fi extinsă cu ușurință cu componente personalizate.<br>
Securizat: Tomcat oferă o serie de funcții de securitate din cutie, cum ar fi autentificarea și autorizarea, și poate fi configurat cu ușurință pentru a utiliza SSL pentru comunicații securizate.<br>
Încorporabil: Tomcat poate fi încorporat în alte aplicații și utilizat ca componentă într-un sistem mai mare.');

INSERT INTO `LearnJavaDB`.`apachetomcatinfo` (`title`, `description`)
VALUES ('JUnit',
        '
Apache Tomcat este utilizat pe scară largă în comunitatea de dezvoltare Java și este o alegere populară pentru implementarea și rularea aplicațiilor web bazate pe Java.<br>
Suportul său pentru specificațiile Java Servlet și JSP și arhitectura sa ușoară, scalabilă și personalizabilă îl fac un instrument puternic pentru construirea și implementarea aplicațiilor web.
');




