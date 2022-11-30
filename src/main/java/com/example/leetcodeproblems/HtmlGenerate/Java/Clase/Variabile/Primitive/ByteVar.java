package com.example.leetcodeproblems.HtmlGenerate.Java.Clase.Variabile.Primitive;

import com.example.leetcodeproblems.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class ByteVar {
    public static void generateClaseVariabilePrimitiveByte() throws IOException {
        String variabilePrimitivebyte = """
                                
                <section class="ftco-section">
                              <div class="container">
                                  <div class="row justify-content-center">
                                      <div class="col-md-6 text-center mb-5">
                                          <h2 class="heading-section">Variabile primitive de tip byte</h2>
                                      </div>
                                  </div>
                                  <div class="row justify-content-center">
                                      <div class="col-lg-10">
                                          <div class="wrapper">
                                              <div class="row no-gutters">
                                                  <div class="col-md-6 d-flex align-items-stretch">
                                                      <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                          <p id="byte"> De obicei nu se lucreaza cu byte la nivel inalt.
                                                              Byte se foloseste de exemplu la transmiterea infoematiei prin retea, la citirea sau
                                                              inscrierea datelor din fisiere. Se folosesc la lucrul cu String si codificare.</p>
                          
                                                      </div>
                                                  </div>
                                                  <div class="col-md-6 d-flex align-items-stretch">
                                                      <div class="info-wrap w-100 p-md-5 p-4 py-5 img">
                                                          <p> Ca regula byte se folosesc pentru stocarea datelor, pentru a limita folosirea
                                                              memoriei, dar daca o sa le procesam memoria va fi folosita ca si la date de tip int.
                                                              Deoarece sistema de operare sunt majoritatea pe 32/64 biti, byte si short, vor fi
                                                              trasnformate in int de 32 de biti.</p>
                                                      </div>
                                                  </div>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </section>
                """;
        HtmlGenerate.taskDetailsView(variabilePrimitivebyte, "claseVariabilePrimitiveByte.html");
    }
}
