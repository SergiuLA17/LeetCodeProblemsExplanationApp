CREATE TABLE `LearnJavaDB`.`maveninfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);


INSERT INTO `LearnJavaDB`.`maveninfo` (`title`, `description`)
VALUES ('Maven',
        '
Maven este un instrument automatizare care ajuta la constructia proiectelor Java.<br>
Maven se baza pe un model de obiecte si un set de obiecte predefinite care reprezinta proiectul java.<br>
Fisierul de configurare al proiectului se numeste pom.xml si este format din mai multe sectiuni.<br>
Sectiunile sunt: project, modelVersion, groupId, artifactId, version, packaging, name, description, url, dependencies, dependency, groupId, artifactId, version, scope, type, exclusions, exclusion, groupId, artifactId.<br>

');

INSERT INTO `LearnJavaDB`.`maveninfo` (`title`, `description`)
VALUES ('Unele dintre caracteristicile cheie ale Maven includ:',
        '
Gestionarea dependențelor: Maven facilitează gestionarea dependențelor, inclusiv descărcarea și actualizarea bibliotecilor și cadrelor necesare unui proiect.<br>
Ciclul de viață al construirii: Maven definește un ciclu de viață standard al construcției care poate fi utilizat pentru a automatiza sarcini precum compilarea, testarea și ambalarea.<br>
Pluginuri: Maven oferă o gamă largă de plugin-uri care pot fi utilizate pentru a efectua diverse sarcini, cum ar fi compilarea codului, rularea testelor și crearea documentației.<br>
Arhive: Maven folosește depozite pentru a stoca și a prelua dependențe și pluginuri. Maven Central este depozitul implicit folosit de Maven, care conține un număr mare de biblioteci și pluginuri, dar vă puteți configura și propriul depozit.<br>
Proiecte cu mai multe module: Maven acceptă proiecte cu mai multe module, ceea ce vă permite să vă organizați proiectul în mai multe module. Acest lucru facilitează gestionarea și reutilizarea codului în mai multe proiecte.<br>


');




