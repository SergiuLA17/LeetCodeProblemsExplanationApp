package com.example.leetcodeproblems.HtmlGenerate.Collection.List;

import com.example.leetcodeproblems.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class ListInter {
    public static void generateCollectionList() throws IOException {
        String iterable = """
                <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                  <div class="col-md-6 text-center mb-5">
                                      <h2 class="heading-section">Iterable</h2>
                                  </div>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                
                                                <p>List este interfata care extinde interfata Collection.
                                                    <p>List este o colectie care permite elemente duplicate si permite accesarea elementelor
                                                    prin index.
                                                                </p>
                                                    <ul>List contine metodele:
                                                    <li>get() - returneaza elementul de pe pozitia index,</li>
                                                    <li>set() - seteaza elementul de pe pozitia index,</li>
                                                    <li>add() - adauga un element in colectie,</li>
                                                    <li>indexOf() - returneaza indexul primului element egal cu elementul dat,</li>
                                                    <li>lastIndexOf() - returneaza indexul ultimului element egal cu elementul dat,</li>
                                                    <li>listIterator() - returneaza un obiect de tip ListIterator,</li>
                                                    <li>subList() - returneaza o sublista cu elementele din intervalul (fromIndex, toIndex).</li>
                                                                </ul>
                                                    <p>List extinde interfetele RandomAccess, Cloneable si Serializable.
                                                    RandomAccess este o interfata marker care indica ca lista este accesata random,
                                                    adica elementele nu sunt accesate in ordinea in care sunt adaugate.
                                                    Cloneable este o interfata marker care indica ca lista poate fi clonata.
                                                    Serializable este o interfata marker care indica ca lista poate fi serializata.
                                                    Serializarea representeaza procesul de transformare a unui obiect intr-un sir de biti.
                                                    Pentru al pastra intr-un file sau pentru a-l transmite pe retea.
                                                    De la List se extind interfetele ArrayList, LinkedList, Vector si Stack.    </p>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                      
                    """;
        HtmlGenerate.taskDetailsView(iterable, "collectionIterable.html");
    }
}
