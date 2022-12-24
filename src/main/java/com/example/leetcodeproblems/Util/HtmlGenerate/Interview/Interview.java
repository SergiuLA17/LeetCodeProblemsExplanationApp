package com.example.leetcodeproblems.Util.HtmlGenerate.Interview;

import com.example.leetcodeproblems.Util.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class Interview {
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
                                                <a href="classConstructor.html">constructor</a>. </font></h3>
                                            <p><a href="classConstructor.html">Constructorul</a> participă la crearea instanței, pe când
                                                metoda reprezintă o
                                                instrucțiune. </p>
                                            <p><a href="classConstructor.html">Constructorul</a> obligatoriu are denumirea ca și clasa.
                                                Metoda are ori ce denumire.</p>
                                            <p> Metodele pot fi suprascrise și supraâncărcate, pe cănd <a href="classConstructor.html">constructorul</a>
                                                poate fi doar
                                                supraâncărcat.
                                                Nu este sens să-l suprascrim, suprascrierea se face la metodele moștenite, dar
                                                <a href="classConstructor.html">constructorul</a> prea
                                                conportamentul de la <a href="classConstructor.html">constructorul</a> superclasei și
                                                java, nu ne va permite să-l
                                                suprascrim.</p>
                                            <p><a href="classConstructor.html">constructorul</a> apelează prin operatorul "new",
                                                metodele dacă sunt statice, prin denumirea
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
                                            <h3 class="mb-4"><font size="3">Va fi apelat <a
                                                    href="classConstructor.html">constructorul</a> superclasei când este creat obiectul
                                                moștenit. </font></h3>
                                            <p> Da.</p>
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
                                            <p> Nu, deoarece obietul nu poate să-și piarda referința la el însuși </p>
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
                                            <h3 class="mb-4"><font size="3">Care este diferenta dintre interface si clasa <a
                                                    href="OOPMostenireAbstract.html">abstracta</a>?</font></h3>
                                            <p>Clasa <a href="OOPMostenireAbstract.html">abstracta</a> poate avea variabile, <a
                                                    href="classConstructor.html">constructor</a> pentru aceste variabile, metode
                                                implementate sau metode abstracte.</p>
                                            <p>In interfate sunt metode care obligatoriu vor vi implementate in clase care va implementa
                                                interfata.</p>
                                
                                            <p>Metodele in <a href="OOPMostenireInterface.html">interfata</a> sunt numai publice</p>
                                            <p>Metodele in clase <a href="OOPMostenireAbstract.html">abstracta</a> sunt cu toate tipuri
                                                de <a href="OOPIncapsulareModificators.html">modificatpor</a>.</p>
                                
                                            <p><a href="OOPMostenireInterface.html">Interfata</a> reprezinta o abilitate.
                                                Clasa abstracta reprezint o stare a obiectului.</p>
                                
                                            <p>Clasa <a href="OOPMostenireAbstract.html">abstracta</a> este mostenita de acelasi tip de
                                                obiecte.
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
                                            <h3 class="mb-4"><font size="3">Cand avem posibilitatea de a folosi si <a
                                                    href="OOPMostenireInterface.html">interfata</a> si clasa <a
                                                    href="OOPMostenireAbstract.html">abstracta</a>, ce vom alege?</font></h3>
                                            <p>Vom alege <a href="OOPMostenireInterface.html">interfata</a>, deoarece <a
                                                    href="OOPMostenireInterface.html">interfata</a> reprezinta un contract care se va
                                                realiza in orce caz, deoarece are
                                                metoda cu <a href="OOPIncapsulareModificators.html">modificatorul</a> <a
                                                        href="OOPIncapsulareModificators.html">public</a>, pe cand in clase abstracte,
                                                metodele pot avea toate tipurile, ce nu garanteaza ca vom putea realiza metoda in orice
                                                loc al proeictului.</p>
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
                                            <h3 class="mb-4"><font size="3">Care este diferenta dintre HashSet si <a
                                                    href="collectionTreeSet.html">TreeSet</a></font></h3>
                                            <p>Unda dintre diferente este ca au diferite structuri de date, una are <a
                                                    href="OOPStrucDataHashTable.html">HashTable?</a>, alta are RedBlackWhite.</p>
                                            <p>Alta diferenta este in timpul de realizare a operatiilor, HashSet este mai
                                                rapid(constanta), <a href="collectionTreeSet.html">TreeSet</a> este mai
                                                lent(Logarifmica).</p>
                                            <p>Alta diferenta este ca <a href="collectionTreeSet.html">TreeSet</a> pastreaza elementele
                                                in ordine, HashSet nu.</p>
                                            <p>In hashSet putem avea null, in <a href="collectionTreeSet.html">TreeSet</a> nu.</p>
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
                                            <h3 class="mb-4"><font size="3">Cum se compara obiectele in <a
                                                    href="collectionHashSet.html">HashSet</a>?</font></h3>
                                            <p>Cu ajutorul metodei equals si hashCode, le aranjam in lista pentru a le putea accesa in
                                                timp constant.</p>
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
                                            <h3 class="mb-4"><font size="3">Poate <a href="collectionTreeSet.html">TreeSet</a> avea
                                                null?</font></h3>
                                            <p>Nu, deoarece in <a href="collectionTreeSet.html">TreeSet</a> elementele sunt sortate si
                                                in cazul dat,
                                                seface comparatie intre obiecte, si daca se face comparatie cu null, atunci se arunca
                                                exceptie.
                                                <a href="collectionTreeSet.html">TreeSet</a> este de tip homogeneous objects.</p>
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
                                            <h3 class="mb-4"><font size="3">Ce fel de metode se folosesc pentru sortare si comparare
                                                obiectelor <a href="collectionTreeSet.html">TreeSet</a>?</font></h3>
                                            <p>Putem sa folosim interfata Comparable, care are 2 metode, compare so compare to. Daca nu
                                                folosim interfata Comparable, atunci se foloseste natural-ordering.</p>
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
                                            <h3 class="mb-4"><font size="3">Ce este JRE?</font></h3>
                                            <p>JRE este Java Runtime Environment, este un mediu de executie pentru a rula aplicatii
                                                Java.</p>
                                            <p>Se foloseste pentru a rula aplicatii deja gata.</p>
                                            <p>Pe
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
                                            <h3 class="mb-4"><font size="3">Ce este JDK?</font></h3>
                                            <p>JDK contine: JRE, compilator Java, intrumente pentru dezvoltare. </p>
                                            <p>Se foloseste pentru a dezvolta aplicatii Java.</p>
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
                                            <h3 class="mb-4"><font size="3">Cum de procedat cand avem de lucrat cu o parola si cum sa ne
                                                asiguram ca in heap nu a ramas parola?</font></h3>
                                            <p>Putem parola sa o inscrim intr-un char array si dupa ce am termita de lucru cu parola,
                                                in char array putem schimba valorile in care vrem, deoarece char array nu este mutabil
                                                in comparatie cu String. </p>
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
                                            <h3 class="mb-4"><font size="3">Care este diferenta intre HashMap si <a
                                                    href="OOPStrucDataHashTable.html">HashTable?</a>?</font></h3>
                                            <p>In <a href="OOPStrucDataHashTable.html">HashTable</a> nu poate sa salva null, toate
                                                metodele sunt sincronizate din cauza data ea lucreaza mai lent. </p>
                                            <p><a href="OOPStrucDataHashTable.html">HashTable</a> nu este recomandata pentru folosinta,
                                                este invechita, mai bine de folosit HashMap </p>
                                            <p>Daca avem nevoie de a folosi pentru paralelism putem folosi ConcurrentHashMap</p>
                                
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
                                            <h3 class="mb-4"><font size="3">Cum putem crea o <a href="classImmutableClass.html">clasa
                                                immutable?</a></font></h3>
                                            <img class="center" alt=""
                                                 src="../../../../photo/interviewPractice/1.png" ">
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
                                            <h3 class="mb-4"><font size="3">Ce o safiseze in codul de mai jos?</h3>
                                            <img class="center" alt=""
                                                 src="../../../../photo/interviewPractice/img_1.png" ">
                                            <p>Raspuns:</p>
                                            <p>Se va afisa "Not Equal", deoarece char daca sunt obiecte diferite, ele se adreseaza la
                                                aceleiasi referinta din heap</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
                """;
        HtmlGenerate.taskDetailsView(question, "interviewQuestion.html");
    }
}
