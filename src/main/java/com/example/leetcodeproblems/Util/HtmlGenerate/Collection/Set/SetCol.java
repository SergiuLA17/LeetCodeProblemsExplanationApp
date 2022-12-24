package com.example.leetcodeproblems.Util.HtmlGenerate.Collection.Set;

import com.example.leetcodeproblems.Util.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class SetCol {

    public static void generateCollectionSet() throws IOException {
        String set = """
                <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                  <div class="col-md-6 text-center mb-5">
                                      <h2 class="heading-section">Set</h2>
                                  </div>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                  
                <p>Set mosteneste Collection</p>
                <p>Set este o colectie de elemente care nu sunt ordonate si nu sunt indexate.</p>
                <p>Set nu permite duplicate.</p>
                <p>-metoda add() este suprascrisa pentru a nu permite duplicate.</p>
                <p>In set nu putem accesa un element prin index, deoarece nu sunt indexate.</p>
                <p>Set sunt de tipul HashSet, LinkedHashSet si TreeSet.</p>
                <p>HashSet este cel mai rapid, dar nu este ordonat.</p>
                <p>LinkedHashSet este ordonat, dar nu este cel mai rapid.</p>
                <p>TreeSet este ordonat si este cel mai lent.</p>
                                
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                    """;
        HtmlGenerate.taskDetailsView(set, "collectionSet.html");
    }
}
