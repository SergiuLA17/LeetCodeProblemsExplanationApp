package com.example.leetcodeproblems.Util.HtmlGenerate.Java.Clase;

import com.example.leetcodeproblems.Util.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class Metode {
    public static void generateClaseMetode() throws IOException {
        String metode = """
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
                                            <p>Metoda reprezintă o instrucțiune pentru rezolvarea anumitei sarcini.</p>
                                            <p>Daca metoda este statică, ea poate fi apelată print denumirea clasei, iar daca nu,
                                                ea poate fi apelată prin instanța clasei.</p>
                                            </p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
                """;

        HtmlGenerate.taskDetailsView(metode, "claseMetode.html");
    }
}
