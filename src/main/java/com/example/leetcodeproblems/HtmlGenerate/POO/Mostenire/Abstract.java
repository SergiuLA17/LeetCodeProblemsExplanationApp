package com.example.leetcodeproblems.HtmlGenerate.POO.Mostenire;

import com.example.leetcodeproblems.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class Abstract {

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
        HtmlGenerate.taskDetailsView(abstractInfo, "OOPMostenireAbstract.html");
    }
}
