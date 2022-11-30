package com.example.leetcodeproblems.HtmlGenerate.Collection.Set;

import com.example.leetcodeproblems.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class TreeSetCol {

    public static void generateCollectionTreeSet() throws IOException {
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
                    <p>In clasa HashSet se foloseste structura de date HashTable pentru a stoca elementele.</p>
                    <p>Timpul de executie pentru operatiile de adaugare, stergere si cautare este O(1)(constanta).</p>
                    <p>In HashSet putem adauga valoarea null. Odata ca key si cate vrem pentru valoare.</p>
                    <p>Compararea, stergerea si cautarea se face ca si in <a OOPStrucDataHashTable.html">HashTable</a></p>
                    <p>In TreeSet putem salva doar elmente de acelasi tip, deoarece se foloseste un comparator pentru a compara elementele, si daca nu sunt la fec, compilatorul o sa genereze eroare.</p>
                    
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>    
                    """;
        HtmlGenerate.taskDetailsView(treeset, "collectionTreeSet.html");
    }
}
