package com.example.leetcodeproblems.Util.HtmlGenerate.Java.Clase.Variabile.Primitive;

import com.example.leetcodeproblems.Util.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class Primitive {
    public static void generateClaseVariabilePrimitive() throws IOException {
        String variabilePrimitive = """
                                
                <section class="ftco-section">
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-md-6 text-center mb-5">
                                <h2 class="heading-section" id="variabile_primitive">Variabile de tip primitiv</h2>
                            </div>
                        </div>
                        <div class="row justify-content-center">
                            <div class="col-lg-10">
                                <div class="wrapper">
                                    <div class="row no-gutters">
                                        <div class="col-md-6 d-flex align-items-stretch">
                                            <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                <p>Variabilele primitive se stochează in <a href="OOPStrucDataStack.html#stack">stack</a>.</p>
                                                <p>• Un bit este o unitate de informație, care poate avea doar două valori: 0 sau
                                                    1. </p>
                                                <p>• In Java există 8 tipuri de variabile primitive, care sunt: byte, short, int, long,
                                                    float, double, boolean si char.</p>
                                                <p>• Un <a href="claseVariabilePrimitiveByte.html#byte">byte</a> este o unitate de
                                                    informație, care poate avea 256 valori diferite. De la -128 la 127.</p>
                                                <p>• Un short este o unitate de informație, care poate avea 65536 valori diferite. De la
                                                    -32768 la 32767. Se folosesc mai des când este nevoie de salvat memorie in lucrul cu
                                                    tablouri mari.</p>
                                                <p>• Un int este o unitate de informație, care poate avea 2^32 valori diferite. De la
                                                    -2147483648 la 2147483647.</p>
                                                <p>• Fiecare variabila primitivă are o clasă ambalaj(wrapper). Ele sunt create din cauza
                                                    că colecțiile nu pot lucra cu primitivele.</p>
                                
                                            </div>
                                        </div>
                                        <div class="col-md-6 d-flex align-items-stretch">
                                            <div class="info-wrap w-100 p-md-5 p-4 py-5 img">
                                                <p>• Un long este o unitate de informație, care poate avea 2^64 valori diferite. De la
                                                    -9223372036854775808 la 9223372036854775807.</p>
                                                <p>• Un float este o unitate de informație, care poate avea 2^32 valori diferite. De la
                                                    -3.4028235E38 la 3.4028235E38. Are o precizie de 7 cifre dupa virgula.</p>
                                                <p>• Un double este o unitate de informație, care poate avea 2^64 valori diferite. De la
                                                    -1.7976931348623157E308 la 1.7976931348623157E308. Are o precizie de 16 cifre dupa
                                                    virgula.</p>
                                                <p>• Un boolean este o unitate de informație, care poate avea doar doua valori: true sau
                                                    false.</p>
                                                <p>• Un char este o unitate de informație, care poate avea 2^16 valori diferite. De la 0
                                                    la 65535.</p>
                                                <p>• Diferența dinte float si double este, float are o precizie mai mica, dar are și
                                                    ocupă o memorie mai mica. </p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
                """;
        HtmlGenerate.taskDetailsView(variabilePrimitive, "claseVariabilePrimitive.html");
    }
}
