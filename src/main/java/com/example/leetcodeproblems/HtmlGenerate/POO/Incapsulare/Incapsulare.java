package com.example.leetcodeproblems.HtmlGenerate.POO.Incapsulare;

import com.example.leetcodeproblems.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class Incapsulare {

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
        HtmlGenerate.taskDetailsView(incapsulare, "OOPincapsulare.html");
    }
}
