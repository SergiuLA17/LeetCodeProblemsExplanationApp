package com.example.leetcodeproblems.HtmlGenerate.Java.Clase.Variabile.CuReferinta;

import com.example.leetcodeproblems.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class AutoboxingUnboxing {

    public static void generateClaseVariabileReferintaAutobox() throws IOException {
        String variabileReferintaAutobox = """
                                
                <section class="ftco-section">
                                        <div class="container">
                                            <div class="row justify-content-center">
                                                <div class="col-md-6 text-center mb-5">
                                                    <h2 class="heading-section">Autoboxing/unboxing</h2>
                                                </div>
                                            </div>
                                            <div class="row justify-content-center">
                                                <div class="col-lg-10">
                                                    <div class="wrapper">
                                                        <div class="row no-gutters">
                                                            <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                                <p>Atunci cand o variabila primitiva este atribuita la o variabila de clasa wrapper si
                                                                    invers</p>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </section>
                """;
        HtmlGenerate.taskDetailsView(variabileReferintaAutobox, "claseVariabileReferintaAutoBox_Unbox.html");
    }
}
