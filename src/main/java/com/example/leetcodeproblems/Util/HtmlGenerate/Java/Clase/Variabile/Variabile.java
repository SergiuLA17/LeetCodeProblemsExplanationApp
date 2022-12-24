package com.example.leetcodeproblems.Util.HtmlGenerate.Java.Clase.Variabile;

import com.example.leetcodeproblems.Util.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class Variabile {
    public static void generateVariabileMainGeneral() throws IOException {
        String variabileMainGeneral = """
                                
                <section class="ftco-section">
                                                            <div class="container">
                                                                <div class="row justify-content-center">
                                                                    <div class="col-md-6 text-center mb-5">
                                                                        <h2 class="heading-section">Informatie generala</h2>
                                                                    </div>
                                                                </div>
                                                                <div class="row justify-content-center">
                                                                    <div class="col-lg-10">
                                                                        <div class="wrapper">
                                                                            <div class="row no-gutters">
                                                                                <div class="col-md-6 d-flex align-items-stretch">
                                                                                    <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                                                        <h3 class="mb-4">iii</h3>
                                                        
                                                                                    </div>
                                                                                </div>
                                                                                <div class="col-md-6 d-flex align-items-stretch">
                                                                                    <div class="info-wrap w-100 p-md-5 p-4 py-5 img">
                                                                                        <h3>iii</h3>
                                                                                        <p class="mb-4">fghgh</p>
                                                                                    </div>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </section>
                """;
        HtmlGenerate.taskDetailsView(variabileMainGeneral, "claseVariblesMainGeneraInfo.html");
    }
}
