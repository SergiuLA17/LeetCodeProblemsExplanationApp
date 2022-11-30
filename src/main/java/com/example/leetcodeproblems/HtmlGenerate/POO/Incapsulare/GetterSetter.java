package com.example.leetcodeproblems.HtmlGenerate.POO.Incapsulare;

import com.example.leetcodeproblems.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class GetterSetter {

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
        HtmlGenerate.taskDetailsView(gettersetter, "OOPIncapsulareGetterSetter.html");
    }
}
