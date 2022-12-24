package com.example.leetcodeproblems.Util.HtmlGenerate.Java.Clase;

import com.example.leetcodeproblems.Util.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class Clase {
    public static void generateJavaClass() throws IOException {
        String javaClass = """
                <section class="ftco-section">
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-md-6 text-center mb-5">
                                <h2 class="heading-section">Clase</h2>
                            </div>
                        </div>
                        <div class="row justify-content-center">
                            <div class="col-lg-10">
                                <div class="wrapper">
                                    <div class="row no-gutters">
                                        <div class="col-md-6 d-flex align-items-stretch">
                                            <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                <h3 class="mb-4">Clasele sunt modele</h3>
                                                <p class="mb-4">Clasele sunt modele pentru obiecte.
                                                    Clasele sunt definite prin cuvântul cheie class.
                                                    Clasele pot conține:
                                                    <ul>
                                                        <li>date</li>
                                                        <li>metode</li>
                                                    </ul>
                                                </p>
                                
                                
                                            </div>
                                        </div>
                                        <div class="col-md-6 d-flex align-items-stretch">
                                            <div class="info-wrap w-100 p-md-5 p-4 py-5 img">
                                                <h3 class="mb-4">Clasele sunt modele pentru obiecte</h3>
                                                <p class="mb-4">Clasele sunt modele pentru obiecte.
                                                    Clasele sunt definite prin cuvântul cheie class.
                                                    Clasele pot conține:
                                                    <ul>
                                                        <li>date</li>
                                                        <li>metode</li>
                                                    </ul>
                                                </p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
                """;
        HtmlGenerate.taskDetailsView(javaClass, "javaClass.html");

    }
}
