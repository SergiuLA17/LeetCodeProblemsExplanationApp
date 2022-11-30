package com.example.leetcodeproblems.HtmlGenerate.POO.Incapsulare;

import com.example.leetcodeproblems.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class Modificator {
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
        HtmlGenerate.taskDetailsView(gettersetter, "OOPIncapsulareModificators.html");
    }
}
