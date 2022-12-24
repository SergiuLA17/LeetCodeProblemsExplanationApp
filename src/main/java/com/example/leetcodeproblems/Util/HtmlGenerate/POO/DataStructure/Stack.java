package com.example.leetcodeproblems.Util.HtmlGenerate.POO.DataStructure;

import com.example.leetcodeproblems.Util.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class Stack {

    public static void generateStructData() throws IOException {
        String dataStructure = """
                                
                <section class="ftco-section">
                                                                                                              <div class="container">
                                                                                                                  <div class="row justify-content-center">
                                                                                                                      <div class="col-md-6 text-center mb-5">
                                                                                                                          <h2 id="stack" class="heading-section">Stack</h2>
                                                                                                                      </div>
                                                                                                                  </div>
                                                                                                                  <div class="row justify-content-center">
                                                                                                                      <div class="col-lg-10">
                                                                                                                          <div class="wrapper">
                                                                                                                              <div class="row no-gutters">
                                                                                                                                  <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                                                                                                      Stack este o structura de datae cu principiul de lucru, ultimul a venit - ultimul a iesit(LIFO).
                                                                                                                                      In stack se stocheaza
                                                                                                                                      Pentru manipularea cu stack sunt 2 metode:
                                                                                                                                      <p>1)Pop - scoaterea datelor</p>
                                                                                                                                      <p>2)Push - introducrea datelor. Cand se foloseste metoda pop() se face controlul daca marimea stackului
                                                                                                                                          nu depaseste dcat cea curenta, daca depaseste, atunci se mareste lungimea.</p>
                                                                                                                                  </div>
                                                                                                                              </div>
                                                                                                                          </div>
                                                                                                                      </div>
                                                                                                                  </div>
                                                                                                              </div>
                                                                                                          </section>
                """;
        HtmlGenerate.taskDetailsView(dataStructure, "OOPStrucDataStack.html");
    }
}
