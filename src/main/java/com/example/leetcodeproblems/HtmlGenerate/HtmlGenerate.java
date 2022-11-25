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
                                                                            <section class="ftco-section">
                                                                                <div class="container">
                                                                                    <div class="row justify-content-center">
                                                                                        <div class="col-lg-10">
                                                                                            <div class="wrapper">
                                                                                                <div class="row no-gutters">
                                                                                                    <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                                                                        <h3 class="mb-4"><font size="3">Care este diferenta dintre interface si clasa abstracta?</font></h3>
                                                                                                        <p>Clasa abstracta poate avea variabile, constructor pentru aceste variabile, metode implementate sau metode abstracte.</p>
                                                                                                        <p>In interfate sunt metode care obligatoriu vor vi implementate in clase care va implementa interfata.</p>
                                                                                                        
                                                                                                        <p>Metodele in interfata sunt numai publice</p>
                                                                                                        <p>Metodele in clase abstracte sunt cu toate tipuri de modificator.</p>
                                                                                                        
                                                                                                        <p> Interfacta reprezinta o abilitate.
                                                                                                         Clasa abstracta reprezint o stare a obiectului.</p>
                                                                                                         
                                                                                                         <p>Clasa abstracta este mostenita de acelasi tip de obiecte.
                                                                                                         De ex: tipuri de masine, sedan, coupe ect.
                                                                                                         Interfatele pot fi implementate de diferite tipuri de obiect.
                                                                                                         De ex: a merge, a zbura ect.</p>
                                                                                                       
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
                                                                                                        <h3 class="mb-4"><font size="3">Cand avem posibilitatea de a folosi si interfata si clasa abstracta, ce vom alege?</font></h3>
                                                                                                        <p>Vom alege interfata, deoarece interfata reprezinta un contract care se va realiza in orce caz, deoarece are 
                                                                                                        metoda cu modificatrul public, pe cant in clase abstracte, metodele pot avea toate tipurile, ce nu garanteaza ca vom putea realiza metoda in orice loc al proeictului.</p>
                                                                                                        
                                                                                                       
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

    public static void generateCollection() throws IOException {
        String collection = """
                <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                  <div class="col-md-6 text-center mb-5">
                                      <h2 class="heading-section">Collection</h2>
                                  </div>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                  <p>Collection este interfata care extinde Iterable si contine metode de adaugare,
                stergere, cautare si alte metode utile pentru manipularea colectiilor.
                <p>Collection contine metodele:</p>
                <p>add() - adauga un element in colectie,</p>
                <p>remove() - sterge un element din colectie,</p>
                <p>contains() - verifica daca un element se afla in colectie,</p>
                <p>size() - returneaza numarul de elemente din colectie,</p>
                <p>isEmpty() - verifica daca colectia este goala,</p>
                <p>toArray() - returneaza un array cu elementele din colectie,</p>
                <p>clear() - sterge toate elementele din colectie.</p>
                <p>addAll() - adauga toate elementele dintr-o colectie in alta colectie,</p>
                <p>containsAll() - verifica daca toate elementele dintr-o colectie se afla in alta colectie,</p>
                <p>equals() - verifica daca doua colectii contin aceleasi elemente,</p>
                <p>hashCode() - returneaza un hashcode pentru colectie.</p>
                De la Collection se extind interfetele List, Set si Queue si clasa abstracta AbstractCollection.
                AbstractCollection este clasa abstracta care implementeaza metodele din interfata Collection, 
                de aceea nu este nevoie sa le implementam noi. </p>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                      
                    """;
        taskDetailsView(collection, "collection.html");
    }

    public static void generateCollectionIterable() throws IOException {
        String iterable = """
                <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                  <div class="col-md-6 text-center mb-5">
                                      <h2 class="heading-section">Iterable</h2>
                                  </div>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                  <p>Iterable este interfata care contine o metoda iterator(),
                aceasta metoda returneaza un obiect de tip Iterator.
                Interfata Iterator contine metode hasNext() si next().
                hasNext() returneaza true daca mai exista elemente in colectie,
                next() returneaza elementul curent si muta cursorul la urmatorul element,
                daca nu mai exista elemente in colectie, next() va arunca exceptia NoSuchElementException. </p>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
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
                                                  <p><img class="center"  src="../../../../photo/collections/iterable.png"
                                                       alt="inheritance"></p>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                      
                    """;
        taskDetailsView(iterable, "collectionIterable.html");
    }

    public static void generateCollectionList() throws IOException {
        String listCollection = """
                <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                  <div class="col-md-6 text-center mb-5">
                                      <h2 class="heading-section">Iterable</h2>
                                  </div>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                  
                                                <p>List este interfata care extinde interfata Collection.
                                                    <p>List este o colectie care permite elemente duplicate si permite accesarea elementelor
                                                    prin index.
                                                                </p>
                                                    <ul>List contine metodele:
                                                    <li>get() - returneaza elementul de pe pozitia index,</li>
                                                    <li>set() - seteaza elementul de pe pozitia index,</li>
                                                    <li>add() - adauga un element in colectie,</li>
                                                    <li>indexOf() - returneaza indexul primului element egal cu elementul dat,</li>
                                                    <li>lastIndexOf() - returneaza indexul ultimului element egal cu elementul dat,</li>
                                                    <li>listIterator() - returneaza un obiect de tip ListIterator,</li>
                                                    <li>subList() - returneaza o sublista cu elementele din intervalul (fromIndex, toIndex).</li>
                                                                </ul>
                                                    <p>List extinde interfetele RandomAccess, Cloneable si Serializable.
                                                    RandomAccess este o interfata marker care indica ca lista este accesata random,
                                                    adica elementele nu sunt accesate in ordinea in care sunt adaugate.
                                                    Cloneable este o interfata marker care indica ca lista poate fi clonata.
                                                    Serializable este o interfata marker care indica ca lista poate fi serializata.
                                                    Serializarea representeaza procesul de transformare a unui obiect intr-un sir de biti.
                                                    Pentru al pastra intr-un file sau pentru a-l transmite pe retea.
                                                    De la List se extind interfetele ArrayList, LinkedList, Vector si Stack.    </p>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                      
                    """;
        taskDetailsView(listCollection, "collectionList.html");
    }

    public static void generateCollectionListArrayList() throws IOException {
        String listArrayList = """
                <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                  <div class="col-md-6 text-center mb-5">
                                      <h2 class="heading-section">ArrayList</h2>
                                  </div>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                  
                <p>ArrayList este clasa care extinde clasa AbstractList.</p>
                <p>ArrayList implementeaza interfata List.</p>
                <p>De la ArrayList se extind clasa Stack si clasa Vector.</p>
                <p>ArrayList permite elemente duplicate si permite elemente nule.</p>
                <p>Permite de asi schimba dimensiunea.</p>        
                <p>Permite accesarea elementelor prin index.</p>
                <p>Permite accesarea elementelor random.</p>
                <p>Permite accesarea elementelor in ordinea in care sunt adaugate.</p>
                <p>ArrayList este reprezentat in memoria calculatorului ca un vector, ce ii permite procesorului de a 
                accesa foarte rapid elementele din memorie</p>
                                
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                    """;
        taskDetailsView(listArrayList, "collectionListArrayList.html");
    }

    public static void generateCollectionSet() throws IOException {
        String set = """
                <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                  <div class="col-md-6 text-center mb-5">
                                      <h2 class="heading-section">Set</h2>
                                  </div>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                  
                <p>Set mosteneste Collection</p>
                <p>Set este o colectie de elemente care nu sunt ordonate si nu sunt indexate.</p>
                <p>Set nu permite duplicate.</p>
                <p>-metoda add() este suprascrisa pentru a nu permite duplicate.</p>
                <p>In set nu putem accesa un element prin index, deoarece nu sunt indexate.</p>
                <p>Set sunt de tipul HashSet, LinkedHashSet si TreeSet.</p>
                <p>HashSet este cel mai rapid, dar nu este ordonat.</p>
                <p>LinkedHashSet este ordonat, dar nu este cel mai rapid.</p>
                <p>TreeSet este ordonat si este cel mai lent.</p>
                                
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                    """;
        taskDetailsView(set, "collectionSet.html");
    }

    public static void generateHashTable() throws IOException {
        String hashtable = """
                <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                  <div class="col-md-6 text-center mb-5">
                                      <h2 class="heading-section">HashTable</h2>
                                  </div>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                  
                <p>HashTable este o colectie de date care stocheaza perechi de cheie si valoare.</p>
                <p>Este posibila introducerea valorii null pentru cheie sau valoare.</p>
                <p>Un exemplar are 2 parametri, care afecteaza performanta: initialCapacity si loadFactor.</p>
                <ul>
                    <li>initialCapacity - capacitatea initiala a tabelei hash.</li>
                    <li>loadFactor - factorul de incarcare al tabelei hash. De baza este 0.75.</li>
                </ul>
                               
                <p>Datele in hashtable sunt stocare in dependenta de cheie, multe celule pot fi goale in cazul dat,
                   indexul este calculat pe baza cheii, cheia este transformata in index cu ajutorul functiei hash(hasuita).</p>
                                
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                          <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                <p>Coleziune</p>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                  
                <p>hashcode = key.hashCode() % table.length</p>
                                 <p>hashcode = 213124%100=24</p>
                                 <p>Dupa formula de mai sus, este probabilitatea ca 2 chei sa aiba acelasi index, numita colizie</p>
                                 <ul>Sunt 2 tipuri de coleziuni:
                                     <li>open addressing</li>
                                     <p>in cazul dat se cauta de la stanga la dreapta in hashtable, pana cand se gaseste o celula goala</p>
                                     <li>separate chaining</li>
                                     <p>elementul se adauga in celula, ast fel se creaza o lista linkata in celula</p>
                                 </ul>
                                
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                          <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                <p>Cautarea/stergerea elementului</p>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                  
                <p>Cautarea in hashtable:</p>
                <p>se hasueste keya si se cauta dupa index, se verifica daca keya este egala cu keya din hashtable,
                in cazul in care keya nu corespunde, se cauta urmatoarea celula goala, pana se gaseste obiectul
                ,in cazul in care nu se gaseste keya corespunzatoare, inseamna ca obiectul nu exista.
                In cazul cand stergem din hashtable, se cauta keya si se sterge obiectul corespunzator.        
                Celula care a fost stearsa, se marcheaza ca goala.</p>
                                
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                          
                          <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                <p></p>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                <p>pentru metoda de cautare se cauta o celula goala si se adauga obiectul in hashtable</p>
                <p>pentru metoda de adaugare, se ia in vigoare ca celulele pot avea marcajul de celula goala</p>
                                
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                          
                          <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                <p>
                                Hashuierea </p>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                  
                                               <ul>
                                               <li>Hash-codu pentru String: se ia valoarea ascii a fiecarui caracter si se aduna</li>
                                               <li>Hash-codu pentru Integer: se ia valoarea integer-ului</li>
                                               <li>Hash-codul pentru obiecte: se ea toate campurile obiectului si se ia hashcode-ul fiecarui camp si se aduna, pentru 
                                               a nu avea colizii,  fiecare canm se inmulteste la un numar impar, mai des 31</li>
                                               </ul>
                                
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                    """;
        taskDetailsView(hashtable, "OOPStrucDataHashTable.html");
    }

    public static void generateOOPIncapsulareGetterSetter() throws IOException {
        String gettersetter = """
                <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                  <div class="col-md-6 text-center mb-5">
                                      <h2 class="heading-section">Getter & Setter</h2>
                                  </div>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                  <p>Sunt folosite pentru a face legatura proiectul in care lucram si obiect de care avem nevoie.
                                                  Si in caz cand se fac modificari in obiect, proiectul nu este afectat de erori.
                </p>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                  <div class="col-md-6 text-center mb-5">
                                      <h2 class="heading-section">Setter</h2>
                                  </div>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                 
                    <p>Putem adauga oarecare logica</p>
                    <p>Putem verifica daca valoarea este corecta.</p>
                    <p>Putem face conversii de tipuri.</p>
                    <p>Putem face conversii de unitati de masura.</p>
                    <p>Putem face conversii de valori.</p>
                                
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                          
                          <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                  <div class="col-md-6 text-center mb-5">
                                      <h2 class="heading-section">Getter</h2>
                                  </div>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                 
                    <p>Putem sa folosim getteri pentru a accesa variabilele private</p>
                   
                                
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>

                    """;
        taskDetailsView(gettersetter, "OOPIncapsulareGetterSetter.html");
    }

    public static void generateOOPIncapsulareModificators() throws IOException {
        String gettersetter = """
                <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                  <div class="col-md-6 text-center mb-5">
                                      <h2 class="heading-section">private</h2>
                                  </div>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                    <p>pentru  clasele mostenite variabilele nu sunt vizibile</p>
                    <p>pentru clasele din acelasi pachet variabilele nu sunt vizibile</p>
                    <p>pentru clasele din alte pachete variabilele nu sunt vizibile</p>
                    <p>pentru clasele din alte proiecte variabilele nu sunt vizibile</p>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                          
                          <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                  <div class="col-md-6 text-center mb-5">
                                      <h2 class="heading-section">public</h2>
                                  </div>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                  
                   <p> pentru  clasele mostenite variabilele sunt vizibile</p>
                   <p> pentru clasele din acelasi pachet variabilele sunt vizibile</p>
                   <p> pentru clasele din alte pachete variabilele sunt vizibile</p>
                   <p>pentru clasele din alte proiecte variabilele sunt vizibile</p>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                          
                          <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                  <div class="col-md-6 text-center mb-5">
                                      <h2 class="heading-section">default</h2>
                                  </div>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                  
                    <p>pentru  clasele mostenite variabilele nu sunt vizibile</p>
                    <p>pentru clasele din acelasi pachet variabilele sunt vizibile</p>
                    <p>pentru clasele din alte pachete variabilele nu sunt vizibile</p>
                    <p>pentru clasele din alte proiecte variabilele nu sunt vizibile</p>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                          
                          <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                  <div class="col-md-6 text-center mb-5">
                                      <h2 class="heading-section">protected</h2>
                                  </div>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                  
                    <p>pentru  clasele mostenite variabilele sunt vizibile</p>
                    <p>pentru clasele din acelasi pachet variabilele sunt vizibile</p>
                    <p>pentru clasele din alte pachete variabilele nu sunt vizibile</p>
                    <p>pentru clasele din alte proiecte variabilele nu sunt vizibile</p>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                          
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
                    <p class ="center">Avem Clasa1 cu variabule cu toate tipurile de modificator.</p>
                    <img class ="center" alt="" height="200" src="../../../../photo/modificators/1.png"
                    <p class ="center">Avem Clasa3 care mosteneste CLasa1 si nu avem acces doar la variabila cu modificator private.</p>
                    <img class ="center" alt="" height="200" src="../../../../photo/modificators/2.png"    
                    <p class ="center">Avem Clasa4 care nu mosteneste Clasa1 si to are acees la variabile in afara de private.</p>
                    <img class ="center" alt="" height="200" src="../../../../photo/modificators/3.png"    
                    <p class ="center">Avem Clasa2 care nu mosteneste Clasa1 si este in alt packeage, in cazul dat avem doar acces la variabila cu modificator private.</p>
                    <img class ="center" alt="" height="200" src="../../../../photo/modificators/4.png"                
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                          
                    """;
        taskDetailsView(gettersetter, "OOPIncapsulareModificators.html");
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
        generateCollection();
        generateCollectionIterable();
        generateCollectionList();
        generateCollectionListArrayList();
        generateCollectionSet();
        generateHashTable();
        generateOOPIncapsulareGetterSetter();
        generateOOPIncapsulareModificators();


    }
}
