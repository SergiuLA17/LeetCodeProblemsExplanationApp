package com.example.leetcodeproblems.HtmlGenerate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HtmlGenerate {
    public static void taskDetailsView(String component, String name) throws IOException {
        File f = new File("src/main/resources/templates/Java/" + name);
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write(Templates.menu);
        bw.write(component);
        bw.write(Templates.component);

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
                                                                                                        <p>null</p>
                                                                                                        
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
                                                                                                                                  <div class="contact-wrap w-100 p-md-5 p-4 py-5">
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

    public static void generateVariabileReferinta() throws IOException {
        String referinta = """
                <section class="ftco-section">
                                                                                                              <div class="container">
                                                                                                                  <div class="row justify-content-center">
                                                                                                                      <div class="col-md-6 text-center mb-5">
                                                                                                                          <h2 id="referinta" class="heading-section">Variabile cu referinta</h2>
                                                                                                                      </div>
                                                                                                                  </div>
                                                                                                                  <div class="row justify-content-center">
                                                                                                                      <div class="col-lg-10">
                                                                                                                          <div class="wrapper">
                                                                                                                              <div class="row no-gutters">
                                                                                                                                  <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                                                                                                  <p>~La crearea acestor date, referinta se salveaza in stack ear obietul se salveaza in heap. </p>
                                                                                                                                      <p>~Pentru a crea astfel de obiect, folosim operatorul "new". </p>
                                                                                                                                      <p>~Aceste obiecte in memorie var raspunde garbage collector, el va avea grija in caz ca obiectul care mai are referinta, sa fie sters din memorie.</p>
                                                                                                                                      <hr style="width:max" class="w3-opacity">
                                                                                                                                      <p id="wrapper">~Nu pentru toate obiecte cu referinta este nevoie de folsit operatorul "new". Se vorbeste despre clase wrapper.
                                                                                                                                          Ex: String var = hi;</p>
                                                                                                                                  </div>
                                                                                                                              </div>
                                                                                                                          </div>
                                                                                                                      </div>
                                                                                                                  </div>
                                                                                                              </div>
                                                                                                          </section>              
                """;
        taskDetailsView(referinta, "clasVariabileReferinta.html");
    }

    public static void generateOOPMostenire() throws IOException {
        String mostenire = """
                    <section class="ftco-section">
                                     <div class="container">
                                         <div class="row justify-content-center">
                                              <div class="col-md-6 text-center mb-5">
                                                       <h2 id="stack" class="heading-section">Stack</h2>
                                                           
                                                     <div class="row justify-content-center">
                                               <div class="col-lg-10">
                                           <div class="wrapper">
                                         <div class="row no-gutters">
                                      <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                      <p>mostenire</p>
                                   </div>
                                 </div>
                               </div>
                           </div>
                      </div>
                    </div>
                </section>
                    """;
        taskDetailsView(mostenire, "OOPMostenire.html");
    }

    public static void generateCuvantCheieStatic() throws IOException {
        String cuvantStatic = """
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
                                                                                                        <p>static</p>
                                                                                                        
                                                                                                    </div>
                                                                                                </div>
                                                                                            </div>
                                                                                        </div>
                                                                                    </div>
                                                                                </div>
                                                                            </section>           
                """;
        taskDetailsView(cuvantStatic, "javaCuvantCheieStatic.html");
    }

    public static void generateOOPMostenireInterface() throws IOException {
        String interfaceInfo = """
                <section class="ftco-section">
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-md-6 text-center mb-5">
                                <h2 id="interface" class="heading-section">Interface</h2>
                            </div>
                        </div>
                        <div class="row justify-content-center">
                            <div class="col-lg-10">
                                <div class="wrapper">
                                    <div class="row no-gutters">
                                        <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                            <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                <p>Interfața are scop de care lega 2 obiecte care interacționează între ele. </p>
                                                <p>Interfața a fost creata pentru a rezolva problema mostenirii multipla. </p>
                                                <p>Interfața nu poate avea constructori. </p>
                                                
                                            </div>
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
                                            <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                Modelam o situație.
                                                Avem o familie, mama, tata și copil.
                                                Mama si tata au cate ceva, ce copilul ar dori sa moștenească, în cazul dat culoarea
                                                parului al tatălui si culoarea ochilor al mamei.
                                                Realizarea doar cu clase nu este posibilă, deoarece moștenirea multiplă nu este permisă
                                                în Java.
                                                <div><img width="230" height="100" src="../../../../photo/interface/1.png"
                                                          alt="inheritance">
                                                    <img width="230" height="100" src="../../../../photo/interface/2.png"
                                                         alt="inheritance">
                                                    <img width="230" height="100" src="../../../../photo/interface/3.png"
                                                         alt="inheritance">
                                                </div>
                                            </div>
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
                                            <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                Pentru a rezolva problema data, au fost create interfețele.
                                                Vom crea 2 interfecte, una pentru culoarea parului și una pentru culoarea ochilor.
                                                Și vom crea în ele câte o metodă default, unde vom scri ce culoare are părul si ce culoare al părinților.
                                                Și le vom implementa în clasele copi.
                                                <div><img width="230" height="100" src="../../../../photo/interface/4.png"
                                                          alt="inheritance">
                                                    <img width="230" height="100" src="../../../../photo/interface/5.png"
                                                         alt="inheritance">
                                                    <img width="230" height="100" src="../../../../photo/interface/6.png"
                                                         alt="inheritance">
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>         
                """;
        taskDetailsView(interfaceInfo, "OOPMostenireInterface.html");
    }

    public static void generateOOPMostenireAbstract() throws IOException {
        String abstractInfo = """
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
                                                  Clasa abstracta este o clasa care reprezinta o varianta generala a unui obiect.
                                                  In clasa abstracta nu putem crea obiecte, dar putem sa o mostenim.
                                                  Pentru a crea o clasa abstracta, folosim cuvantul cheie abstract.
                                                  In clasa abstracta putem ave metode cat abstracte, care nu au o implementare si prezinta
                                                  abilitatile obiectului, dar si metode care au implementare.
                                                  Putem crea variabile si sa le initializam in clasa abstracta. Putem crea constructori.
                                                  Clasa abstracta nu poate fi finala deoarece clasa abstracta numai decat trebuie sa fie
                                                  mostenita.
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
                      
                                                  <p> </p>
                                                  <img class="center"  src="../../../../photo/abstract/1.png"
                                                       alt="inheritance">
                                                  <p> </p>
                                                  <img class="center" src="../../../../photo/abstract/2.png"
                                                       alt="inheritance">
                      
                                                  <p> </p>
                                                  <img class="center" src="../../../../photo/abstract/3.png"
                                                       alt="inheritance">
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                      </section>
                    """;
        taskDetailsView(abstractInfo, "OOPMostenireAbstract.html");
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
        generateVariabileReferinta();
        generateCuvantCheieStatic();
        generateOOPMostenire();
        generateOOPMostenireInterface();
        generateOOPMostenireAbstract();

    }
}
