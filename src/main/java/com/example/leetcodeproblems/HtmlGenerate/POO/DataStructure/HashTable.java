package com.example.leetcodeproblems.HtmlGenerate.POO.DataStructure;

import com.example.leetcodeproblems.HtmlGenerate.HtmlGenerate;

import java.io.IOException;

public class HashTable {

    public static void generateHashTable() throws IOException {
        String hashtable = """
                <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                  <div class="col-md-6 text-center mb-5">
                                      <h2 id="hashtable" class="heading-section">HashTable</h2>
                                  </div>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                <p>Este o structura de date abstracta, inseamna ca nu are un model standatizat de implementare, implementarea depinde de in mare parte de limbajul de programare.</p>                              
                <p>HashTable este o colectie de date care stocheaza perechi de cheie si valoare.</p>
                <p>Este posibila introducerea valorii null pentru cheie sau valoare.</p>
                <p>Un exemplar are 2 parametri, care afecteaza performanta, acesti parametri sunt: initialCapacity si loadFactor.</p>
                <ul>
                    <li>initialCapacity - capacitatea initiala a tabelei hash.</li>
                    <li>loadFactor - factorul de incarcare al tabelei hash. De baza este 0.75.</li>
                </ul>
                              
                <p>La intrare in HashTable se transmite chesi si valoarea. Valoarea se vor stoca intr-un array care se va crea la initializare,
                se trec prin hash-functie, care pe urma in alta functie se transforma in index din array</p>
                                
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                           <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                  <div class="col-md-6 text-center mb-5">
                                      <h2 class="heading-section">Hash functie</h2>
                                  </div>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                              <p> In exemplul dat avem cheie de tip string, se aduna toate codurile ale caracterilor 
                                              si se imparte la capacitatea initiala a tabelei hash si se ea restul ca index .</p>
                                                <p>In cazul ca avem o cheie de tip int, putem doar sa folosim acest int ca index.</p>
                                                  <img class="center zoom" alt="" src="../../../../photo/hashTable/img.png" "> 
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                          <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                <p>Coleziune</p>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                  
                <p>hashcode = key.hashCode() % table.length</p>
                                 <p>hashcode = 213124%100=24</p>
                                 <p>Dupa formula de mai sus, este probabilitatea ca 2 chei sa aiba acelasi index, numita colizie</p>
                                 <ul>Sunt 2 tipuri de coleziuni:
                                     <li>open addressing</li>
                                     <p>in cazul dat se cauta de la stanga la dreapta in hashtable, pana cand se gaseste o celula goala</p>
                                     <p>Exemplu:</p>
                                     In exemplul dat avem index-ul deja ocupat. Se va cauta cea mai apropiata celula goala si se va adauga acolo.
                                      <img class="center zoom" alt="" src="../../../../photo/hashTable/img_1.png" "> 
                                      <p>Daca dorim sa stergem un element, celula de unde a fost sters va fi marcat ca goala. 
                                      Si cand vom face cautarea pentru un element, vom trece peste acele celule marcate "goala". Dar cand vom adauga un element, celulele marcate "goala" vor fi folosite.</p>
                                      <p>
                                      <p>Daca sau acumulat multe celule "goale", atunci performanta va fi scazuta. Si pentru a rezolva aceasta problema, se va face rehashing. 
                                      Adica se va crea o noua tabela hash, cu o capacitate mai mare, si se vor muta toate elementele in noua tabela hash.</p>
                                      <p>Plusuri ale open addressing:</p>
                                        <ul>
                                            <li>Parcurgerea rapida, deoarece sunt plasate aproape unul de altul in memorie.</li>
                                            <li>Se foloseste mai pitina memorie, din cauza ca nu sunt folosite pointeri.</li>
                                           
                                        </ul>
                                      <p>Minusuri ale open addressing:</p>
                                        <ul>
                                            <li>Cautarea, adaugarea si stergerea depind de modul de parcurs al tabelei hash.</li>
                                            <li>Depinde de marimea tabelei. Daca vom folosi mic, avem  o performanta mai buna, 
                                            dar este riscul sa nu ajunca, dar daca vom folosi mare, avem o performanta mai mica.</li> 
                                        </ul>
                                        
                                     <li>separate chaining</li>
                                     <p>elementul se adauga in celula, ast fel se creaza o lista linkata in celula</p>
                                     <p>Exemplu:</p>
                                     <img class="center zoom" alt="" src="../../../../photo/hashTable/img_2.png" "> 
                                     <p>In cazul dat in celula se salveaza referinta la obiectul de tip Node, care contine cheia si valoarea.</p>
                                     <p>Daca in indexul deja exista un element, se va adauga in lista linkata.</p>
                                     <p>Plusuri ale separate chaining:</p>
                                        <ul>
                                            <li>Realizare mai simpla. Mai putine niunsuri care pot duce la distabilizare a lucrului hashTable.</li>                                       
                                           
                                        </ul>
                                      <p>Minusuri ale separate chaining:</p>
                                        <ul>
                                            <li>Se foloseste memorie adaugatoare, din cauza pointerilor.</li>
                                            <li>Parcurgere lenta, deoarece elementele stau in parti diferite ale memoriei</li> 
                                        </ul>
                                 </ul>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                          <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                <p>Cautarea/stergerea elementului</p>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                  
                <p>Cautarea in hashtable:</p>
                <p>se hasueste keya si se cauta dupa index, se verifica daca keya este egala cu keya din hashtable,
                in cazul in care keya nu corespunde, se cauta urmatoarea celula goala, pana se gaseste obiectul
                ,in cazul in care nu se gaseste keya corespunzatoare, inseamna ca obiectul nu exista.
                In cazul cand stergem din hashtable, se cauta keya si se sterge obiectul corespunzator.        
                Celula care a fost stearsa, se marcheaza ca goala.</p>
                                
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                  
                          <section class="ftco-section">
                          <div class="container">
                              <div class="row justify-content-center">
                                <p>
                                Hashuierea </p>
                              </div>
                              <div class="row justify-content-center">
                                  <div class="col-lg-10">
                                      <div class="wrapper">
                                          <div class="row no-gutters">
                                              <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                                  
                                               <ul>
                                               <li>Hash-codu pentru String: se ia valoarea ascii a fiecarui caracter si se aduna</li>
                                               <li>Hash-codu pentru Integer: se ia valoarea integer-ului</li>
                                               <li>Hash-codul pentru obiecte: se ea toate campurile obiectului si se ia hashcode-ul fiecarui camp si se aduna, pentru 
                                               a nu avea colizii,  fiecare canm se inmulteste la un numar impar, mai des 31</li>
                                               </ul>
                                               
                                               <p>O hash function trebuie sa indeplineasca urmatoarele conditii:</p>
                                               <ul>
                                               <li>Pentru una si aceiasi cheie, hash function trebuie sa returneze aceelasi index</li>
                                                  <li>Pentru doua chei diferite, hash function trebuie sa returneze indexe diferite, astfel incat sa nu se produca coliziuni</li>
                                                    <li>Hash function trebuie sa fie rapida, adica sa nu fie prea complexa, pentru a nu afecta performanta</li>
                                                    <li>Hash function trebuie sa nu returneze index care sa depaseasca capacitatea tabelei</li>
                                              
                                               </ul>
                                               
                                
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                    """;
        HtmlGenerate.taskDetailsView(hashtable, "OOPStrucDataHashTable.html");
    }
}
