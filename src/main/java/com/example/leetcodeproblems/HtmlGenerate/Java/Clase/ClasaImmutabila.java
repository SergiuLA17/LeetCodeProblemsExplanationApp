package com.example.leetcodeproblems.HtmlGenerate.Java.Clase;

import com.example.leetcodeproblems.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class ClasaImmutabila {
    public static void generateClassImmutableClass() throws IOException {
        String imutable = """
                                
                <section class="ftco-section">
                                                                      <div class="container">
                                                                          <div class="row justify-content-center">
                                                                              <div class="col-md-6 text-center mb-5">
                                                                                  <h2 id="stack" class="heading-section">Immutable Class</h2>
                                                                              </div>
                                                                          </div>
                                                                          <div class="row justify-content-center">
                                                                              <div class="col-lg-10">
                                                                                  <div class="wrapper">
                                                                                      <div class="row no-gutters">
                                                                                          <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                                                              <p>Clasa imutabila este o clasa care nu poate fi modificata dupa ce a fost creata.</p>
                                                                                              <p>Chear daca facem ceva schimbari in obiect, obiectul va fi creat din nou.</p>
                                                                                              <p> In Java, clasa String este clasa imutabila. Daca se face o schimbare in obiectul String, se va crea un nou obiect String.</p>
                                                                                              <p>Clase imutabile in Java sunt toate wrapper classes (Integer, Long, Byte, Short, Character, Boolean, Float, Double), String si clasele enum.</p>
                                                                                            
                                                                                          </div>
                                                                                      </div>
                                                                                  </div>
                                                                              </div>
                                                                          </div>
                                                                      </div>
                                                                  </section>
                """;
        HtmlGenerate.taskDetailsView(imutable, "classImmutableClass.html");
    }
}
