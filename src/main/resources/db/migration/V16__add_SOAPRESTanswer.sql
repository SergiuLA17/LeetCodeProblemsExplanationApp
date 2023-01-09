
INSERT INTO `LearnJavaDB`.`soapanswer` (`title`, `description`)
VALUES ('SOAP -  Simple Object Access Protocol ',
        '
SOAP este un protocol de comunicare intre aplicatii sau cu clientii, bazat pe limbak XLM. XML este limbaj de marcare, care este folosit pentru a descrie informatiile.
Este independent, adica nu depinde de sistemul de operare, limbajul de programare, etc.
Este neutru, adica poate functiona cu o multime de protocoale de transport, cum ar fi: HTTP, SMTP, FTP, etc.
Este extensibil, adica poate fi extins prin adaugarea de noi elemente.
SOAP contine cateva elemente de baza, cum ar fi: Envelope, Header, Body, Fault.
Envelope este elementul de baza al unui mesaj SOAP. El contine Header si Body.
Header contine informatii despre mesajul SOAP, cum ar fi: numele aplicatiei care a trimis mesajul, data si ora la care a fost trimis mesajul, etc.
Body contine informatiile propriu-zise ale mesajului SOAP.
Fault este un element care contine informatii despre o eroare care a aparut in timpul procesarii mesajului SOAP.

');

INSERT INTO `LearnJavaDB`.`restanswer` (`title`, `description`)
VALUES ('Rest - Representational State Transfer',
        '
REST este un stil de arhitectura pentru a crea aplicatii web, care se bazeaza pe HTTP.
Este usor scalabil, adica poate fi extinsa cu usurinta.
usor de utiliza si flexibil.
REST se foloseste practic ori unde, REST a inlocuit SOAP.
REST nu are un standard definit, iar acest lucru face ca REST sa fie mai flexibil decat SOAP.
Are cateva principii:
Client-server: clientul trimite o cerere catre server si serverul raspunde cu o cerere.
Stateless: serverul nu retine informatii despre client.
Cacheable: serverul poate retine informatii despre client, daca acesta doreste.
Layered system: serverul poate fi un sistem de mai multe straturi, iar fiecare strat poate fi un server.
Code on demand: serverul poate trimite cod catre client, care poate fi executat de acesta, daca acesta doreste.
Starting with the Null Style: clientul stie doar o intrare in server, iar restul interacțiunii se face prin intermediul serverului.


');

INSERT INTO `LearnJavaDB`.`restanswer` (`title`, `description`)
VALUES ('Rest vs Soap',
        '
Diferenta intre REST si SOAP este ca REST este un stil de arhitectura, iar SOAP este un protocol.
Rest este mai usor de utilizat decat SOAP, deoarece nu are un standard definit, iar acest lucru face ca REST sa fie mai flexibil decat SOAP.

');

