package com.example.leetcodeproblems.HtmlGenerate.Java;

import com.example.leetcodeproblems.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class Java {
    public static void generateJava() throws IOException {
        String java = """
                <section class="ftco-section">
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-md-6 text-center mb-5">
                                <h2 class="heading-section">Informație generală</h2>
                            </div>
                        </div>
                        <div class="row justify-content-center">
                            <div class="col-lg-10">
                                <div class="wrapper">
                                    <div class="row no-gutters">
                                        <div class="col-md-6 d-flex align-items-stretch">
                                            <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                <h3 id="1question" class="mb-4">Java ca cross-platformă</h3>
                                                <p class="mb-4">Java se pornește pe Java Virtual Machine(JVM).
                                                    Noi scriem cod, care este transformat in bite cod.
                                                    Realizara JMV este aproape pe toate sistemele de operare.
                                                    Și Java scrisă o dată, poate fi folosită pe orce dispozitiv. << Sloganul
                                                    limbajului</p>
                                
                                
                                            </div>
                                        </div>
                                        <div class="col-md-6 d-flex align-items-stretch">
                                            <div class="info-wrap w-100 p-md-5 p-4 py-5 img">
                                                <h3 class="mb-4">Nu este 100% bazată OOP</h3>
                                                <p class="mb-4">Java are date primitive care nu sunt obiecte și se salvează în stack și
                                                    nu este nevoie de a le elimina din limbaj.
                                                    Sunt bune pentru optimizare.
                                                    Dar si ele au clase care prezintă adaptarea acestor primitive la obiecte, ele sunt
                                                    numite wrapper class,
                                                    aceste clase sunt create din cauza, ca că collecții nu este posibilitatea de a lucra
                                                    cu primitive.
                                                    Și aceste wrapper classe le inlocuește.</p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
                """;
        HtmlGenerate.taskDetailsView(java, "java.html");
    }
}
