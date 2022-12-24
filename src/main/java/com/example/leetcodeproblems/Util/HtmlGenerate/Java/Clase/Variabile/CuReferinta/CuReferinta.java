package com.example.leetcodeproblems.Util.HtmlGenerate.Java.Clase.Variabile.CuReferinta;

import com.example.leetcodeproblems.Util.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class CuReferinta {

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
        HtmlGenerate.taskDetailsView(referinta, "clasVariabileReferinta.html");
    }
}
