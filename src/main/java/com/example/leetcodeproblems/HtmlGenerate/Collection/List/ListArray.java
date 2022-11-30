package com.example.leetcodeproblems.HtmlGenerate.Collection.List;

import com.example.leetcodeproblems.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class ListArray {

    public static void generateCollectionListArrayList() throws IOException {
        String listArrayList = """
                <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                  <div class="col-md-6 text-center mb-5">
                                      <h2 class="heading-section">ArrayList</h2>
                                  </div>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                  
                <p>ArrayList este clasa care extinde clasa AbstractList.</p>
                <p>ArrayList implementeaza interfata List.</p>
                <p>De la ArrayList se extind clasa Stack si clasa Vector.</p>
                <p>ArrayList permite elemente duplicate si permite elemente nule.</p>
                <p>Permite de asi schimba dimensiunea.</p>        
                <p>Permite accesarea elementelor prin index.</p>
                <p>Permite accesarea elementelor random.</p>
                <p>Permite accesarea elementelor in ordinea in care sunt adaugate.</p>
                <p>ArrayList este reprezentat in memoria calculatorului ca un vector, ce ii permite procesorului de a 
                accesa foarte rapid elementele din memorie</p>
                                
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                    """;
        HtmlGenerate.taskDetailsView(listArrayList, "collectionListArrayList.html");
    }
}
