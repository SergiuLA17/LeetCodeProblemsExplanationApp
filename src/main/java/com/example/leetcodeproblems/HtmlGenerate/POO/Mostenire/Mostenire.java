package com.example.leetcodeproblems.HtmlGenerate.POO.Mostenire;

import com.example.leetcodeproblems.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class Mostenire {

    public static void generateOOPMostenire() throws IOException {
        String mostenire = """
                    <section class="ftco-section">
                                     <div class="container">
                                         <div class="row justify-content-center">
                                              <div class="col-md-6 text-center mb-5">
                                                       <h2 id="stack" class="heading-section">Stack</h2>
                                                           
                                                     <div class="row justify-content-center">
                                               <div class="col-lg-10">
                                           <div class="wrapper">
                                         <div class="row no-gutters">
                                      <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                      <p>mostenire</p>
                                   </div>
                                 </div>
                               </div>
                           </div>
                      </div>
                    </div>
                </section>
                    """;
        HtmlGenerate.taskDetailsView(mostenire, "OOPMostenire.html");
    }
}
