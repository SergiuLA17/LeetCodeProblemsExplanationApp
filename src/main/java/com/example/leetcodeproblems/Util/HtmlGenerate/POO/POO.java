package com.example.leetcodeproblems.Util.HtmlGenerate.POO;

import com.example.leetcodeproblems.Util.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class POO {

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
        HtmlGenerate.taskDetailsView(poo, "OOPGeneralInfo.html");
    }
}
