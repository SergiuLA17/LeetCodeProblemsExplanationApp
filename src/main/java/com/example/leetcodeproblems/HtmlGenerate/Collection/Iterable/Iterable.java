package com.example.leetcodeproblems.HtmlGenerate.Collection.Iterable;

import com.example.leetcodeproblems.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class Iterable {

    public static void generateCollectionIterable() throws IOException {
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
                                                  <p>Iterable este interfata care contine o metoda iterator(),
                aceasta metoda returneaza un obiect de tip Iterator.
                Interfata Iterator contine metode hasNext() si next().
                hasNext() returneaza true daca mai exista elemente in colectie,
                next() returneaza elementul curent si muta cursorul la urmatorul element,
                daca nu mai exista elemente in colectie, next() va arunca exceptia NoSuchElementException. </p>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
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
                                                  <p><img class="center"  src="../../../../photo/collections/iterable.png"
                                                       alt="inheritance"></p>
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
