package com.example.leetcodeproblems.Util.HtmlGenerate.Java.Clase;

import com.example.leetcodeproblems.Util.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class Constructor {
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
        HtmlGenerate.taskDetailsView(constructor, "classConstructor.html");
    }
}
