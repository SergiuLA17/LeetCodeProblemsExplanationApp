package com.example.leetcodeproblems.HtmlGenerate.POO.DataStructure;

import com.example.leetcodeproblems.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class RedBlackTree {

    public static void OOPStrucDataRedBlckTree() throws IOException {
        String treeset = """
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
                    <p>Reprezinta o substructura in forma de tree, modelul de structura tree este des folosit in programare si in viata.</p>
                    <p>De exemplu, cand avem o lista cu numere de telefoane, ca sa ne fie mai usro de gasit numarul dorit, le impartim dopa prima litera,
                     daca sunt telefoane tot multe, le imparti, dupa primele 2 litere si asa mai departe, astfel se reduce consecutiv timpul de cautare</p>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>   
                    """;
        HtmlGenerate.taskDetailsView(treeset, "OOPStructDataRedBlackTree.html");
    }
}
