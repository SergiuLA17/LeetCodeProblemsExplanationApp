package com.example.leetcodeproblems.HtmlGenerate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

;

public class HtmlGenerate {
    static String html = """
            <!DOCTYPE html>
            <html class="no-js" lang="en">
            <head>
                <meta charset="UTF-8"/>
                <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
                <meta content="width=device-width, initial-scale=1.0" name="viewport">
                <title>Java Learn. Pet Project</title>
                <meta content="Blueprint: Horizontal Drop-Down Menu" name="description"/>
                <meta content="horizontal menu, microsoft menu, drop-down menu, mega menu, javascript, jquery, simple menu"
                      name="keywords"/>
                <meta content="Codrops" name="author"/>
                <link href="../favicon.ico" rel="shortcut icon">
                <link href="css/default.css" rel="stylesheet" type="text/css"/>
                <link href="css/component.css" rel="stylesheet" type="text/css"/>
                <script src="js/modernizr.custom.js"></script>

            </head>
            <body>
                        <div class="container">
                            <header class="clearfix">
                            </header>
                            <div class="main">
                                <nav class="cbp-hrmenu" id="cbp-hrmenu">
                                    <ul>
                                        <li>
                                            <a href="#">Java</a>
                                            <div class="cbp-hrsub">
                                                <div class="cbp-hrsub-inner">
                                                    <div>
                                                        <h4><a href="java.html"><h3 class="whiteTextOverride">General Info</h3></a></h4>
                                                    </div>
                                                    <div class="cbp-hrsub-inner"> <h4><a href="javaClass.html"><h3 class="whiteTextOverride">Clase</h3></a></h4>
                                                        <ul>
                                                            <li><h6><a href="claseVariblesMainGeneraInfo.html"><h6>Variabile</h6></a></h6></li>
                                                            <ul>
                                                                <li><a href="claseVariabilePrimitive.html">- Primitive</a></li>
                                                                <ul>
                                                                    <li><a href="claseVariabilePrimitiveByte.html">•Byte</a></li>
                                                                </ul>
                                                                <li><a href="#">- Cu referință</a></li>
                                                                <ul>
                                                                    <li><a href="claseVariabileReferintaAutoBox_Unbox.html">•Autoboxing/Unboxing</a></li>
                                                                </ul>
                                                            </ul>
                                                            <li><h6><a href="classConstructor.html"><h6>Constructor</h6></a></h6></li>
                                                            <li><h6><a href="claseMetode.html"><h6>Metode</h6></a></h6></li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div><!-- /cbp-hrsub -->
                                        </li>
                                        <li>
                                            <a href="OOPGeneralInfo.html">OOP</a>
                                            <div class="cbp-hrsub">
                                                <div class="cbp-hrsub-inner">
                                                    <div>
                                                        <h4><a href="OOPGeneralInfo.html"><h3 class="whiteTextOverride">Date generale</h3></a>
                                                        </h4>
                                                    </div>
                                                    <div>
                                                        <h4>Data Structure</h4>
                                                        <ul>
                                                            <li><a href="OOPStrucDataStack.html">Stack</a></li>
                                                            <li><a href="#">Queque</a></li>
                                                            <li><a href="#">Heap</a></li>
                                                        </ul>
                                                    </div>
                                                    <div>
                                                        <h4><a href="OOPincapsulare.html"><h3 class="whiteTextOverride">Incapsulare</h3></a></h4>
                                                    </div>
                                                </div><!-- /cbp-hrsub-inner -->
                                            </div><!-- /cbp-hrsub -->
                                        </li>
                                        <li>
                                            <a href="#">Interview</a>
                                            <div class="cbp-hrsub">
                                                <div class="cbp-hrsub-inner">
                                                    <div>
                                                        <h4><a href="interviewQuestion.html"><h3 class="whiteTextOverride">Questions</h3></a>
                                                        </h4>
                                                    </div>
                                                </div><!-- /cbp-hrsub-inner -->
                                            </div><!-- /cbp-hrsub -->
                                        </li>
                                    </ul>
                                </nav>
                            </div>
                        </div>
                      
                        """;
    static String footer = """
            <footer class="w3-content w3-padding-64 w3-text-grey w3-xlarge">
                           <a href="https://wakatime.com/@1c67ce54-d05a-440d-87af-38b7397cfd18"><img align="center"
                                                                                                     alt="Total time coded since Oct 13 2022"
                                                                                                     src="https://wakatime.com/badge/user/1c67ce54-d05a-440d-87af-38b7397cfd18.svg"/></a>
                       </footer>
                                   
                                   
                       <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
                       <script src="js/cbpHorizontalMenu.min.js"></script>
                       <script>
                       			$(function() {
                       				cbpHorizontalMenu.init();
                       			});
                       </script>
                                   
                       </body>
                       </html>""";

    public static void taskDetailsView(String component, String name) throws IOException {
        File f = new File("src/main/resources/templates/Java/" + name);
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write(html);
        bw.write(component);
        bw.write(footer);

        bw.close();

    }

    public static void main(String[] args) throws IOException {
        HtmlGenerate.generateAllFiles();
    }

    public static void generateJava() throws IOException {
        String java = """
                <section class="ftco-section">
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-md-6 text-center mb-5">
                                <h2 class="heading-section">Informație generală</h2>
                            </div>
                        </div>
                        <div class="row justify-content-center">
                            <div class="col-lg-10">
                                <div class="wrapper">
                                    <div class="row no-gutters">
                                        <div class="col-md-6 d-flex align-items-stretch">
                                            <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                <h3 id="1question" class="mb-4">Java ca cross-platformă</h3>
                                                <p class="mb-4">Java se pornește pe Java Virtual Machine(JVM).
                                                    Noi scriem cod, care este transformat in bite cod.
                                                    Realizara JMV este aproape pe toate sistemele de operare.
                                                    Și Java scrisă o dată, poate fi folosită pe orce dispozitiv. << Sloganul
                                                    limbajului</p>
                                
                                
                                            </div>
                                        </div>
                                        <div class="col-md-6 d-flex align-items-stretch">
                                            <div class="info-wrap w-100 p-md-5 p-4 py-5 img">
                                                <h3 class="mb-4">Nu este 100% bazată OOP</h3>
                                                <p class="mb-4">Java are date primitive care nu sunt obiecte și se salvează în stack și
                                                    nu este nevoie de a le elimina din limbaj.
                                                    Sunt bune pentru optimizare.
                                                    Dar si ele au clase care prezintă adaptarea acestor primitive la obiecte, ele sunt
                                                    numite wrapper class,
                                                    aceste clase sunt create din cauza, ca că collecții nu este posibilitatea de a lucra
                                                    cu primitive.
                                                    Și aceste wrapper classe le inlocuește.</p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
                """;
        taskDetailsView(java, "java.html");
    }

    public static void generateJavaClass() throws IOException {
        String javaClass = """
                <section class="ftco-section">
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-md-6 text-center mb-5">
                                <h2 class="heading-section">Clase</h2>
                            </div>
                        </div>
                        <div class="row justify-content-center">
                            <div class="col-lg-10">
                                <div class="wrapper">
                                    <div class="row no-gutters">
                                        <div class="col-md-6 d-flex align-items-stretch">
                                            <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                <h3 class="mb-4">Clasele sunt modele</h3>
                                                <p class="mb-4">Clasele sunt modele pentru obiecte.
                                                    Clasele sunt definite prin cuvântul cheie class.
                                                    Clasele pot conține:
                                                    <ul>
                                                        <li>date</li>
                                                        <li>metode</li>
                                                    </ul>
                                                </p>
                                
                                
                                            </div>
                                        </div>
                                        <div class="col-md-6 d-flex align-items-stretch">
                                            <div class="info-wrap w-100 p-md-5 p-4 py-5 img">
                                                <h3 class="mb-4">Clasele sunt modele pentru obiecte</h3>
                                                <p class="mb-4">Clasele sunt modele pentru obiecte.
                                                    Clasele sunt definite prin cuvântul cheie class.
                                                    Clasele pot conține:
                                                    <ul>
                                                        <li>date</li>
                                                        <li>metode</li>
                                                    </ul>
                                                </p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
                """;
        taskDetailsView(javaClass, "javaClass.html");

    }

    public static void generateClaseMetode() throws IOException {
        String metode = """
                <section class="ftco-section">
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-md-6 text-center mb-5">
                                <h2 id="stack" class="heading-section">Metode</h2>
                            </div>
                        </div>
                        <div class="row justify-content-center">
                            <div class="col-lg-10">
                                <div class="wrapper">
                                    <div class="row no-gutters">
                                        <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                            <p>Metoda reprezintă o instrucțiune pentru rezolvarea anumitei sarcini.</p>
                                            <p>Daca metoda este statică, ea poate fi apelată print denumirea clasei, iar daca nu,
                                                ea poate fi apelată prin instanța clasei.</p>
                                            </p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
                """;

        taskDetailsView(metode, "claseMetode.html");
    }

    public static void generateClaseVariabilePrimitive() throws IOException {
        String variabilePrimitive = """
                                
                <section class="ftco-section">
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-md-6 text-center mb-5">
                                <h2 class="heading-section" id="variabile_primitive">Variabile de tip primitiv</h2>
                            </div>
                        </div>
                        <div class="row justify-content-center">
                            <div class="col-lg-10">
                                <div class="wrapper">
                                    <div class="row no-gutters">
                                        <div class="col-md-6 d-flex align-items-stretch">
                                            <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                <p>Variabilele primitive se stochează in <a href="OOPStrucDataStack.html#stack">stack</a>.</p>
                                                <p>• Un bit este o unitate de informație, care poate avea doar două valori: 0 sau
                                                    1. </p>
                                                <p>• In Java există 8 tipuri de variabile primitive, care sunt: byte, short, int, long,
                                                    float, double, boolean si char.</p>
                                                <p>• Un <a href="claseVariabilePrimitiveByte.html#byte">byte</a> este o unitate de
                                                    informație, care poate avea 256 valori diferite. De la -128 la 127.</p>
                                                <p>• Un short este o unitate de informație, care poate avea 65536 valori diferite. De la
                                                    -32768 la 32767. Se folosesc mai des când este nevoie de salvat memorie in lucrul cu
                                                    tablouri mari.</p>
                                                <p>• Un int este o unitate de informație, care poate avea 2^32 valori diferite. De la
                                                    -2147483648 la 2147483647.</p>
                                                <p>• Fiecare variabila primitivă are o clasă ambalaj(wrapper). Ele sunt create din cauza
                                                    că colecțiile nu pot lucra cu primitivele.</p>
                                
                                            </div>
                                        </div>
                                        <div class="col-md-6 d-flex align-items-stretch">
                                            <div class="info-wrap w-100 p-md-5 p-4 py-5 img">
                                                <p>• Un long este o unitate de informație, care poate avea 2^64 valori diferite. De la
                                                    -9223372036854775808 la 9223372036854775807.</p>
                                                <p>• Un float este o unitate de informație, care poate avea 2^32 valori diferite. De la
                                                    -3.4028235E38 la 3.4028235E38. Are o precizie de 7 cifre dupa virgula.</p>
                                                <p>• Un double este o unitate de informație, care poate avea 2^64 valori diferite. De la
                                                    -1.7976931348623157E308 la 1.7976931348623157E308. Are o precizie de 16 cifre dupa
                                                    virgula.</p>
                                                <p>• Un boolean este o unitate de informație, care poate avea doar doua valori: true sau
                                                    false.</p>
                                                <p>• Un char este o unitate de informație, care poate avea 2^16 valori diferite. De la 0
                                                    la 65535.</p>
                                                <p>• Diferența dinte float si double este, float are o precizie mai mica, dar are și
                                                    ocupă o memorie mai mica. </p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
                """;
        taskDetailsView(variabilePrimitive, "claseVariabilePrimitive.html");
    }

    public static void generateClaseVariabilePrimitiveByte() throws IOException {
        String variabilePrimitivebyte = """
                                
                <section class="ftco-section">
                              <div class="container">
                                  <div class="row justify-content-center">
                                      <div class="col-md-6 text-center mb-5">
                                          <h2 class="heading-section">Variabile primitive de tip byte</h2>
                                      </div>
                                  </div>
                                  <div class="row justify-content-center">
                                      <div class="col-lg-10">
                                          <div class="wrapper">
                                              <div class="row no-gutters">
                                                  <div class="col-md-6 d-flex align-items-stretch">
                                                      <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                          <p id="byte"> De obicei nu se lucreaza cu byte la nivel inalt.
                                                              Byte se foloseste de exemplu la transmiterea infoematiei prin retea, la citirea sau
                                                              inscrierea datelor din fisiere. Se folosesc la lucrul cu String si codificare.</p>
                          
                                                      </div>
                                                  </div>
                                                  <div class="col-md-6 d-flex align-items-stretch">
                                                      <div class="info-wrap w-100 p-md-5 p-4 py-5 img">
                                                          <p> Ca regula byte se folosesc pentru stocarea datelor, pentru a limita folosirea
                                                              memoriei, dar daca o sa le procesam memoria va fi folosita ca si la date de tip int.
                                                              Deoarece sistema de operare sunt majoritatea pe 32/64 biti, byte si short, vor fi
                                                              trasnformate in int de 32 de biti.</p>
                                                      </div>
                                                  </div>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </section>
                """;
        taskDetailsView(variabilePrimitivebyte, "claseVariabilePrimitiveByte.html");
    }

    public static void generateClaseVariabileReferintaAutobox() throws IOException {
        String variabileReferintaAutobox = """
                                
                <section class="ftco-section">
                                        <div class="container">
                                            <div class="row justify-content-center">
                                                <div class="col-md-6 text-center mb-5">
                                                    <h2 class="heading-section">Autoboxing/unboxing</h2>
                                                </div>
                                            </div>
                                            <div class="row justify-content-center">
                                                <div class="col-lg-10">
                                                    <div class="wrapper">
                                                        <div class="row no-gutters">
                                                            <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                                <p>Atunci cand o variabila primitiva este atribuita la o variabila de clasa wrapper si
                                                                    invers</p>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </section>
                """;
        taskDetailsView(variabileReferintaAutobox, "claseVariabileReferintaAutoBox_Unbox.html");
    }

    public static void generateVariabileMainGeneral() throws IOException {
        String variabileMainGeneral = """
                                
                <section class="ftco-section">
                                                            <div class="container">
                                                                <div class="row justify-content-center">
                                                                    <div class="col-md-6 text-center mb-5">
                                                                        <h2 class="heading-section">Informatie generala</h2>
                                                                    </div>
                                                                </div>
                                                                <div class="row justify-content-center">
                                                                    <div class="col-lg-10">
                                                                        <div class="wrapper">
                                                                            <div class="row no-gutters">
                                                                                <div class="col-md-6 d-flex align-items-stretch">
                                                                                    <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                                                        <h3 class="mb-4">iii</h3>
                                                        
                                                                                    </div>
                                                                                </div>
                                                                                <div class="col-md-6 d-flex align-items-stretch">
                                                                                    <div class="info-wrap w-100 p-md-5 p-4 py-5 img">
                                                                                        <h3>iii</h3>
                                                                                        <p class="mb-4">fghgh</p>
                                                                                    </div>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </section>
                """;
        taskDetailsView(variabileMainGeneral, "claseVariblesMainGeneraInfo.html");
    }

    public static void generateClassConstructor() throws IOException {
        String constructor = """
                                
                <section class="ftco-section">
                                                                      <div class="container">
                                                                          <div class="row justify-content-center">
                                                                              <div class="col-md-6 text-center mb-5">
                                                                                  <h2 id="stack" class="heading-section">Constructor</h2>
                                                                              </div>
                                                                          </div>
                                                                          <div class="row justify-content-center">
                                                                              <div class="col-lg-10">
                                                                                  <div class="wrapper">
                                                                                      <div class="row no-gutters">
                                                                                          <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                                                              <p>Un constructor al clasei reprezintă o metodă, care are ca scop, inițializarea varibilelor
                                                                                                  clasei.</p>
                                                                                              <p>Se apelează de fiecare dată când este creat obiectul.</p>
                                                                                              <p>Daca clasa nu are constructor, el va fi automat creat fix ca la superclasa.</p>
                                                                                              <p>Constructorul poate fi supraîncărcat, adică pot exista mai multe constructori cu același
                                                                                                  nume, dar cu parametri diferiți.</p>
                                                                                              <p>Costructorul nu paoate fi suprascris deoarece nu este sens, noi dorim ca el să aibă
                                                                                                  același comportament ca la superclasa.</p>
                                                                                              <p>Daca vom crea o instanță a clasei moștenite, atunci constructorul suprclasei va fi apelat
                                                                                                  și el.</p>
                                                                                          </div>
                                                                                      </div>
                                                                                  </div>
                                                                              </div>
                                                                          </div>
                                                                      </div>
                                                                  </section>
                """;
        taskDetailsView(constructor, "classConstructor.html");
    }

    public static void generateInterviewQuestion() throws IOException {
        String question = """
                                
                <section class="ftco-section">
                                                                                <div class="container">
                                                                                    <div class="row justify-content-center">
                                                                                        <div class="col-md-6 text-center mb-5">
                                                                                            <h2 class="heading-section">Intrebări pentru interview</h2>
                                                                                        </div>
                                                                                    </div>
                                                                                    <div class="row justify-content-center">
                                                                                        <div class="col-lg-10">
                                                                                            <div class="wrapper">
                                                                                                <div class="row no-gutters">
                                                                                                    <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                                                                        <h3 class="mb-4"><font size="3">De ce Java este un limbaj care poate lucra pe orce
                                                                                                            platform?</font></h3>
                                                                                                        <a href="java.html#1question">Pentru ca este un limbaj cross-platforma.</a>
                                                                            
                                                                                                    </div>
                                                                                                </div>
                                                                                            </div>
                                                                                        </div>
                                                                                    </div>
                                                                                </div>
                                                                            </section>
                                                                            <section class="ftco-section">
                                                                                <div class="container">
                                                                                    <div class="row justify-content-center">
                                                                                        <div class="col-lg-10">
                                                                                            <div class="wrapper">
                                                                                                <div class="row no-gutters">
                                                                                                    <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                                                                        <h3 class="mb-4"><font size="3">De ce Java nu se socoate 100% orientata pe obiecte?</font>
                                                                                                        </h3>
                                                                                                        <a href="claseVariabilePrimitive.html#variabile_primitive">Pentru ca are variabile
                                                                                                            primitive.</a>
                                                                                                    </div>
                                                                                                </div>
                                                                                            </div>
                                                                                        </div>
                                                                                    </div>
                                                                                </div>
                                                                            </section>
                                                                            <section class="ftco-section">
                                                                                <div class="container">
                                                                                    <div class="row justify-content-center">
                                                                                        <div class="col-lg-10">
                                                                                            <div class="wrapper">
                                                                                                <div class="row no-gutters">
                                                                                                    <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                                                                        <h3 class="mb-4"><font size="3">Ce-i asta autoboxing/unboxing? </font></h3>
                                                                                                        <a href="claseVariabileReferintaAutoBox_Unbox.html">Atribuirea automata al variabilelor
                                                                                                            primitive la calse
                                                                                                            wrapper.</a>
                                                                                                    </div>
                                                                                                </div>
                                                                                            </div>
                                                                                        </div>
                                                                                    </div>
                                                                                </div>
                                                                            </section>
                                                                            <section class="ftco-section">
                                                                                <div class="container">
                                                                                    <div class="row justify-content-center">
                                                                                        <div class="col-lg-10">
                                                                                            <div class="wrapper">
                                                                                                <div class="row no-gutters">
                                                                                                    <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                                                                        <h3 class="mb-4"><font size="3">Care este diferența dintre o metodă și un
                                                                                                            constructor. </font></h3>
                                                                                                        <p> Constructorul participă la crearea instanței, pe când metoda reprezintă o
                                                                                                            instrucțiune. </p>
                                                                                                        <p> Constructorul obligatoriu are denumirea ca și clasa. Metoda are ori ce denumire.</p>
                                                                                                        <p> Metodele pot fi suprascrise și supraâncărcate, pe cănd constructorul poate fi doar
                                                                                                            supraâncărcat.
                                                                                                            Nu este sens să-l suprascrim, suprascrierea se face la metodele moștenite, dar
                                                                                                            constructorul prea
                                                                                                            conportamentul de la constructorul superclasei și java, nu ne va permite să-l
                                                                                                            suprascrim.</p>
                                                                                                        <p> Constructorul apelează prin operatorul "new", metodele dacă sunt statice, prin denumirea
                                                                                                            clase,
                                                                                                            dacă nu, prin instansul obiectului.</p>
                                                                                                    </div>
                                                                                                </div>
                                                                                            </div>
                                                                                        </div>
                                                                                    </div>
                                                                                </div>
                                                                            </section>
                                                                            <section class="ftco-section">
                                                                                <div class="container">
                                                                                    <div class="row justify-content-center">
                                                                                        <div class="col-lg-10">
                                                                                            <div class="wrapper">
                                                                                                <div class="row no-gutters">
                                                                                                    <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                                                                        <h3 class="mb-4"><font size="3">Va fi apelat constructorul superclasei când este creat obiectul moștenit. </font></h3>
                                                                                                        <a> Da.</a>
                                                                                                    </div>
                                                                                                </div>
                                                                                            </div>
                                                                                        </div>
                                                                                    </div>
                                                                                </div>
                                                                            </section>
                                                                            <section class="ftco-section">
                                                                                <div class="container">
                                                                                    <div class="row justify-content-center">
                                                                                        <div class="col-lg-10">
                                                                                            <div class="wrapper">
                                                                                                <div class="row no-gutters">
                                                                                                    <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                                                                        <h3 class="mb-4"><font size="3">Ce este incapsularea? </font></h3>
                                                                                                        <a href="OOPincapsulare.html">Un pilon al POO.</a>
                                                                                                    </div>
                                                                                                </div>
                                                                                            </div>
                                                                                        </div>
                                                                                    </div>
                                                                                </div>
                                                                            </section>
                                                                            <section class="ftco-section">
                                                                                <div class="container">
                                                                                    <div class="row justify-content-center">
                                                                                        <div class="col-lg-10">
                                                                                            <div class="wrapper">
                                                                                                <div class="row no-gutters">
                                                                                                    <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                                                                        <h3 class="mb-4"><font size="3">Putem o pentru this sa setam null?</font></h3>
                                                                                                        <a> Nu, deoarece obietul nu poate să-și piarda referința la el însuși </a>
                                                                                                    </div>
                                                                                                </div>
                                                                                            </div>
                                                                                        </div>
                                                                                    </div>
                                                                                </div>
                                                                            </section>
                """;
        taskDetailsView(question, "interviewQuestion.html");
    }

    public static void generateJavaCuvantCheieNull() throws IOException {
        String cuvantNull = """
                                
                <section class="ftco-section">
                                                                                <div class="container">
                                                                                    <div class="row justify-content-center">
                                                                                        <div class="col-md-6 text-center mb-5">
                                                                                            <h2 id="stack" class="heading-section">Metode</h2>
                                                                                        </div>
                                                                                    </div>
                                                                                    <div class="row justify-content-center">
                                                                                        <div class="col-lg-10">
                                                                                            <div class="wrapper">
                                                                                                <div class="row no-gutters">
                                                                                                    <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                                                                        <p>Metoda reprezintă o instrucțiune pentru rezolvarea anumitei sarcini.</p>
                                                                                                        <p>Daca metoda este statică, ea poate fi apelată print denumirea clasei, iar daca nu,
                                                                                                            ea poate fi apelată prin instanța clasei.</p>
                                                                                                        </p>
                                                                                                    </div>
                                                                                                </div>
                                                                                            </div>
                                                                                        </div>
                                                                                    </div>
                                                                                </div>
                                                                            </section>
                """;
        taskDetailsView(cuvantNull, "javaCunvantCheieNULL.html");
    }

    public static void generatePooInfo() throws IOException {
        String poo = """
                                
                <section class="ftco-section">
                                                                                          <div class="container">
                                                                                              <div class="row justify-content-center">
                                                                                                  <div class="col-md-6 text-center mb-5">
                                                                                                      <h2 class="heading-section">Date generale</h2>
                                                                                                  </div>
                                                                                              </div>
                                                                                              <div class="row justify-content-center">
                                                                                                  <div class="col-lg-10">
                                                                                                      <div class="wrapper">
                                                                                                          <div class="row no-gutters">
                                                                                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                                                                                  <p>POO represinta o abordare in care un program este considerat o multime de obiecte care
                                                                                                                      interactioneaaz intre ele.
                                                                                                                      Fieacre avand proprietati si comportament. Permite scrierea codului mai rapida si mai
                                                                                                                      lizibila. </p>
                                                                                                                  <p> Poo are 4 piloni:</p>
                                                                                                                  <ul>
                                                                                                                      <li>Abstractizarea</li>
                                                                                                                      <li><a href="OOPincapsulare.html">Incapsularea</a></li>
                                                                                                                      <li>Mostenirea</li>
                                                                                                                      <li>Poliformizm</li>
                                                                                                                  </ul>
                                                                                                              </div>
                                                                                                          </div>
                                                                                                      </div>
                                                                                                  </div>
                                                                                              </div>
                                                                                          </div>
                                                                                      </section>
                                                                                      <section class="ftco-section">
                                                                                          <div class="container">
                                                                                              <div class="row justify-content-center">
                                                                                                  <div class="col-lg-10">
                                                                                                      <div class="wrapper">
                                                                                                          <div class="row no-gutters">
                                                                                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                                                                                  <p>Avantajele POO:</p>
                                                                                                                  <ul>
                                                                                                                      <li>Permite scrierea unui cod structurat, ceia ce permite altor programamtori sa-l
                                                                                                                          intaleaga.
                                                                                                                          Datorita incapsularii, se reduc numarul de greseli si permit crearea mai rapida a
                                                                                                                          programelor in grup.
                                                                                                                      </li>
                                                                                                                      <li>POO cod este foarte usor de schimbat, extins sau adaugat. Datorita poliformizmului
                                                                                                                          putem adapta codul la cerintele sarcinii fara a crea noi obiecte si functii.
                                                                                                                      </li>
                                                                                                                      <li>POO permite crearea de programe mai complexe, care sa poata fi folosite de cat mai
                                                                                                                          multe persoane.
                                                                                                                      </li>
                                                                                                                      <li>Datorita pilonilor sai, nu este nevoie de scris unul si acelasi cod de mai multe
                                                                                                                          ori. Interfatele si clasele pot fi transformate in biblioteci, care pot fi folosite
                                                                                                                          in alte proiecte.
                                                                                                                      </li>
                                                                                                                  </ul>
                                                                                                                  </ul>
                                                                                                              </div>
                                                                                                          </div>
                                                                                                      </div>
                                                                                                  </div>
                                                                                              </div>
                                                                                          </div>
                                                                                      </section>
                                                                                      <section class="ftco-section">
                                                                                          <div class="container">
                                                                                              <div class="row justify-content-center">
                                                                                                  <div class="col-lg-10">
                                                                                                      <div class="wrapper">
                                                                                                          <div class="row no-gutters">
                                                                                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                                                                                  <p>Dezavantajele POO:</p>
                                                                                                                  <ul>
                                                                                                                      <li>Greu de inteles.</li>
                                                                                                                      <li>Datorita particularitatilor accesului la date si a numarului mare de entitai,
                                                                                                                          programele scrise pot lucra mai lent.
                                                                                                                      </li>
                                                                                                                      <li>COdul scris este mai mare si ocupa mai mult loc. Astfel programele pot avea greutate
                                                                                                                          mare.
                                                                                                                      </li>
                                                                                                                  </ul>
                                                                                                              </div>
                                                                                                          </div>
                                                                                                      </div>
                                                                                                  </div>
                                                                                              </div>
                                                                                          </div>
                                                                                      </section>
                """;
        taskDetailsView(poo, "OOPGeneralInfo.html");
    }

    public static void generateIncapsulare() throws IOException {
        String incapsulare = """
                                
                <section class="ftco-section">
                                                                                                    <div class="container">
                                                                                                        <div class="row justify-content-center">
                                                                                                            <div class="col-md-6 text-center mb-5">
                                                                                                                <h2 class="heading-section" id="incapsulare">Incapsularea</h2>
                                                                                                            </div>
                                                                                                        </div>
                                                                                                        <div class="row justify-content-center">
                                                                                                            <div class="col-lg-10">
                                                                                                                <div class="wrapper">
                                                                                                                    <div class="row no-gutters">
                                                                                                                        <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                                                                                            <p>Idea încapsularii este - noi unim datele si metodele de lucru cu ele într-un obiect.
                                                                                                                                Încapsularea permite schimbarea obiectului fară a afecta alte parți ale programului.
                                                                                                
                                                                                                                            <p> Dacă nu folosim încapsularea alti programatori se vor lega de variabile publice,
                                                                                                                                si în caz când dorim să facem modificari in obiectul nostru,
                                                                                                                                o sa fie nevie de făcut schimbari și în codul care sa legat de aceste variabile.</p>
                                                                                                
                                                                                                                            <p>Chear daca codul va lucra si fară incapsulare, este recomandat de a folosi
                                                                                                                                incapsularea, pentru a preveni schimbari dese in cod.</p>
                                                                                                                        </div>
                                                                                                                    </div>
                                                                                                                </div>
                                                                                                            </div>
                                                                                                        </div>
                                                                                                    </div>
                                                                                                </section>
                                                                                                <section class="ftco-section">
                                                                                                    <div class="container">
                                                                                                        <div class="row justify-content-center">
                                                                                                            <div class="col-md-6 text-center mb-5">
                                                                                                                <h2 class="heading-section">Exemplu</h2>
                                                                                                            </div>
                                                                                                        </div>
                                                                                                        <div class="row justify-content-center">
                                                                                                            <div class="col-lg-10">
                                                                                                                <div class="wrapper">
                                                                                                                    <div class="row no-gutters">
                                                                                                                        <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                                                                                            <p>Avem o clasa cu 2 variabile, una privată si alta publică.</p>
                                                                                                                            <img alt="" height="300" src="../../../../photo/incaspulareExemplePhoto/firstFoto.jpg"
                                                                                                                                 width="820">
                                                                                                                        </div>
                                                                                                                    </div>
                                                                                                                </div>
                                                                                                            </div>
                                                                                                        </div>
                                                                                                    </div>
                                                                                                </section>
                                                                                                <section class="ftco-section">
                                                                                                    <div class="container">
                                                                                                        <div class="row justify-content-center">
                                                                                                            <div class="col-lg-10">
                                                                                                                <div class="wrapper">
                                                                                                                    <div class="row no-gutters">
                                                                                                                        <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                                                                                            <p>Accesul la aceste variabile îl vom avea indiferent, daca variabila este publică sau
                                                                                                                                privată.</p>
                                                                                                                            <img alt="" height="200" src="../../../../photo/incaspulareExemplePhoto/testClass.png"
                                                                                                                                 width="820">
                                                                                                                        </div>
                                                                                                                    </div>
                                                                                                                </div>
                                                                                                            </div>
                                                                                                        </div>
                                                                                                    </div>
                                                                                                </section>
                                                                                                <section class="ftco-section">
                                                                                                    <div class="container">
                                                                                                        <div class="row justify-content-center">
                                                                                                            <div class="col-lg-10">
                                                                                                                <div class="wrapper">
                                                                                                                    <div class="row no-gutters">
                                                                                                                        <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                                                                                            <p>
                                                                                                                                În cazu cand variabila are modificator privat, accesul la ea se face print metoda
                                                                                                                                get/set.
                                                                                                                                Si dacă facem care-va modificare asupra acestei variabile, toate locurile unde este
                                                                                                                                folosita variabila,
                                                                                                                                nu vor fi afectate. Toate schimbarile se vor face doar în interiorul clasei.
                                                                                                                            </p>
                                                                                                                            <img alt="" height="210px"
                                                                                                                                 src="../../../../photo/incaspulareExemplePhoto/stergereaNum.png" width="820px">
                                                                                                                            <p>În afara, clasei schimbari nu este nevoie de făcut</p>
                                                                                                                            <img alt="" height="210px"
                                                                                                                                 src="../../../../photo/incaspulareExemplePhoto/nochanges.png" width="820px">
                                                                                                                        </div>
                                                                                                                    </div>
                                                                                                                </div>
                                                                                                            </div>
                                                                                                        </div>
                                                                                                    </div>
                                                                                                </section>
                                                                                                <section class="ftco-section">
                                                                                                    <div class="container">
                                                                                                        <div class="row justify-content-center">
                                                                                                            <div class="col-lg-10">
                                                                                                                <div class="wrapper">
                                                                                                                    <div class="row no-gutters">
                                                                                                                        <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                                                                                            <p>În cazul când este publică, schimbari o sa fie nevoie
                                                                                                                                de facut în tot cod unde sa folosit vairiabila dată .</p>
                                                                                                                            <img alt="" height="200"
                                                                                                                                 src="../../../../photo/incaspulareExemplePhoto/outOfObjectChanges.png" width="800">
                                                                                                                        </div>
                                                                                                                    </div>
                                                                                                                </div>
                                                                                                            </div>
                                                                                                        </div>
                                                                                                    </div>
                                                                                                </section>
                """;
        taskDetailsView(incapsulare, "OOPincapsulare.html");
    }

    public static void generateStructData() throws IOException {
        String dataStructure = """
                                
                <section class="ftco-section">
                                                                                                              <div class="container">
                                                                                                                  <div class="row justify-content-center">
                                                                                                                      <div class="col-md-6 text-center mb-5">
                                                                                                                          <h2 id="stack" class="heading-section">Stack</h2>
                                                                                                                      </div>
                                                                                                                  </div>
                                                                                                                  <div class="row justify-content-center">
                                                                                                                      <div class="col-lg-10">
                                                                                                                          <div class="wrapper">
                                                                                                                              <div class="row no-gutters">
                                                                                                                                  <div" class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                                                                                                      Stack este o structura de datae cu principiul de lucru, ultimul a venit - ultimul a iesit(LIFO).
                                                                                                                                      In stack se stocheaza
                                                                                                                                      Pentru manipularea cu stack sunt 2 metode:
                                                                                                                                      <p>1)Pop - scoaterea datelor</p>
                                                                                                                                      <p>2)Push - introducrea datelor. Cand se foloseste metoda pop() se face controlul daca marimea stackului
                                                                                                                                          nu depaseste dcat cea curenta, daca depaseste, atunci se mareste lungimea.</p>
                                                                                                                                  </div>
                                                                                                                              </div>
                                                                                                                          </div>
                                                                                                                      </div>
                                                                                                                  </div>
                                                                                                              </div>
                                                                                                          </section>
                """;
        taskDetailsView(dataStructure, "OOPStrucDataStack.html");
    }

    public static void generateAllFiles() throws IOException {
        generateJava();
        generateJavaClass();
        generateClaseMetode();
        generateClaseVariabilePrimitive();
        generateClaseVariabilePrimitiveByte();
        generateClaseVariabileReferintaAutobox();
        generateVariabileMainGeneral();
        generateClassConstructor();
        generateInterviewQuestion();
        generateJavaCuvantCheieNull();
        generatePooInfo();
        generateIncapsulare();
        generateStructData();

    }
}
