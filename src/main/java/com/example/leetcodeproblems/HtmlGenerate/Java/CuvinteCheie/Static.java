package com.example.leetcodeproblems.HtmlGenerate.Java.CuvinteCheie;

import com.example.leetcodeproblems.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class Static {

    public static void generateCuvantCheieStatic() throws IOException {
        String cuvantStatic = """
                <section class="ftco-section">
                                                                                <div class="container">
                                                                                    <div class="row justify-content-center">
                                                                                        <div class="col-md-6 text-center mb-5">
                                                                                            <h2 id="stack" class="heading-section">Metode</h2>
                                                                                        </div>
                                                                                    </div>
                                                                                    <div class="row justify-content-center">
                                                                                        <div class="col-lg-10">
                                                                                            <div class="wrapper">
                                                                                                <div class="row no-gutters">
                                                                                                    <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                                                                        <p>static</p>
                                                                                                        
                                                                                                    </div>
                                                                                                </div>
                                                                                            </div>
                                                                                        </div>
                                                                                    </div>
                                                                                </div>
                                                                            </section>           
                """;
        HtmlGenerate.taskDetailsView(cuvantStatic, "javaCuvantCheieStatic.html");
    }
}
