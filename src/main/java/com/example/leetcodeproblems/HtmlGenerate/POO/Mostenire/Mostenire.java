package com.example.leetcodeproblems.HtmlGenerate.POO.Mostenire;

import com.example.leetcodeproblems.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class Mostenire {

    public static void generateOOPMostenire() throws IOException {
        String mostenire = """
                <section class="ftco-section">
                      <div class="container">
                          <div class="row justify-content-center">
                              <div class="col-md-6 text-center mb-5">
                                  <h2 class="heading-section">Mostenire</h2>
                              </div>
                          </div>
                          <div class="row justify-content-center">
                              <div class="col-lg-10">
                                  <div class="wrapper">
                                      <div class="row no-gutters">
                                          <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                               <p>Este un mecanism de creare a clase pe baza altui clas, care permite utilizarea caracteristicilor si comportamentelor clasei de baza in clasa derivata.
                                              Clasa de baza se mai numeste super sau clasa parinte. </p>
                                              <p>Clasa derivata se mai numeste sub sau clasa copil.</p>
                                              <p>Se face mostenirea prin cuvantul cheie extends.</p>
                                              <p>Clasa copil nu poate mosteni varibile si metode private</p>
                                              <p>Pentru a rescrie o metoda din super clasa, se adauga cuvantul cheie @Override</p>
                                              <p>Putem apela o metoda din super clasa cu super.metoda()</p>
                                              <p>Nu putem mosteni de la mai multe clase.</p>
                                                                                  <p>Dece?</p>
                                                                                  <p>Deatata</p>
                                          
                                              <p>Cand se creaza un exemplar din clasa copil, se apeleaza constructorul din clasa parinte, iar apoi constructorul din clasa copil.</p> 
                                               <img class="center zoom" alt="" src="../../../../photo/mostenire/img.png" "> 
                                               <p></p>
                                               <img class="center zoom" alt="" src="../../../../photo/mostenire/img_1.png" "> 
                                               <p></p>
                                               <img class="center zoom" alt="" src="../../../../photo/mostenire/img_2.png" "> 
                                               
                                              
                                         
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                      </div>
                """;
        HtmlGenerate.taskDetailsView(mostenire, "OOPMostenire.html");
    }
}
