package com.example.leetcodeproblems.Interview.OOP.Collections.HashTable;

public class HashTableT {

    public void hashTableTheory() {
        System.out.println(
                "-HashTable este o colectie de date care stocheaza perechi de cheie si valoare" +
                        "-Datele in hashtable sunt stocare in dependenta de cheie, multe celule pot fi goale in cazul dat" +
                        "-indexul este calculat pe baza cheii, cheia este transformata in index " +
                        "cu ajutorul functiei hash(hasuita), indexul depinde de functia " +
                        " " +
                        "un exemplu de hashuire este:" +
                        "hashcode = key.hashCode() % table.length" +
                        "hashcode = 213124%100=24" +
                        "dupa formula de mai sus, este probabilitatea ca 2 chei sa aiba acelasi index, numita colizie" +
                        "sunt 2 tipuri de colizii: " +
                        "1. coliziunea de tip open addressing, unde se cauta un index liber in hashtable" +
                        " coliziunea de tip open addressing: " +
                        "in cazul dat se cauta de la stanga la dreapta in hashtable, pana cand se gaseste o celula goala" +
                        "coliziunea de tip chaining"+
                        "elementul se adauga in celeula, ast fel se creaza o lista linkata in celula" +
                        " "+
                        "cautarea in hashtable: se hasueste keya si se cauta dupa index" +
                        "in cazul in care keya nu corespunde, se cauta urmatoarea celula goala, pana gasit obiectul" +
                        "in cazul in care nu se gaseste keya corespunzatoare, inseamna ca obiectul nu exista" +
                        "in cazul cand stergem din hashtable, se cauta keya si se sterge obiectul corespunzator" +
                        "celula care a fost stearsa, se marcheaza ca goala" +
                        " " +
                        "pentru metoda care adauga in hashtable, se cauta celula goala si se adauga obiectul" +
                        "pentru metoda care cauta in hashtable, celula este marcata ca nu este goala" +
                        "in cazul cand capacitatea este depasita, se creste capacitatea hashtable-ului de doua ori" +
                        " "+
                        "-Hash-codu pentru String: se ia valoarea ascii a fiecarui caracter si se aduna" +
                        "-Hash-codu pentru Integer: se ia valoarea integer-ului"+
                        "-Hash-codul pentru obiecte: se ea toate campurile obiectului si se ia hashcode-ul fiecarui camp si se aduna, pentru " +
                        "a nu avea colizii,  fiecare canm se inmulteste la un numar impar, mai des 31"

        );
    }

}
