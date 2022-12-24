package com.example.leetcodeproblems.Util.HtmlGenerate.Collection;

import com.example.leetcodeproblems.Util.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class Colectie {

    public static void generateCollection() throws IOException {
        String collection = """
                <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                  <div class="col-md-6 text-center mb-5">
                                      <h2 class="heading-section">Collection</h2>
                                  </div>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                  <p>Collection este interfata care extinde Iterable si contine metode de adaugare,
                stergere, cautare si alte metode utile pentru manipularea colectiilor.
                <p>Collection contine metodele:</p>
                <p>add() - adauga un element in colectie,</p>
                <p>remove() - sterge un element din colectie,</p>
                <p>contains() - verifica daca un element se afla in colectie,</p>
                <p>size() - returneaza numarul de elemente din colectie,</p>
                <p>isEmpty() - verifica daca colectia este goala,</p>
                <p>toArray() - returneaza un array cu elementele din colectie,</p>
                <p>clear() - sterge toate elementele din colectie.</p>
                <p>addAll() - adauga toate elementele dintr-o colectie in alta colectie,</p>
                <p>containsAll() - verifica daca toate elementele dintr-o colectie se afla in alta colectie,</p>
                <p>equals() - verifica daca doua colectii contin aceleasi elemente,</p>
                <p>hashCode() - returneaza un hashcode pentru colectie.</p>
                De la Collection se extind interfetele List, Set si Queue si clasa abstracta AbstractCollection.
                AbstractCollection este clasa abstracta care implementeaza metodele din interfata Collection, 
                de aceea nu este nevoie sa le implementam noi. </p>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                      
                    """;
        HtmlGenerate.taskDetailsView(collection, "collection.html");
    }
}
