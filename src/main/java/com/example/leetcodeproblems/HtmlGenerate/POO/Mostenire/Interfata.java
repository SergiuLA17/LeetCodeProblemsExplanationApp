package com.example.leetcodeproblems.HtmlGenerate.POO.Mostenire;

import com.example.leetcodeproblems.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class Interfata {

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
        HtmlGenerate.taskDetailsView(interfaceInfo, "OOPMostenireInterface.html");
    }
}
