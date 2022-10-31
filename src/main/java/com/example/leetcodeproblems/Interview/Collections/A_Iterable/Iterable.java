package com.example.leetcodeproblems.Interview.Collections.A_Iterable;

import org.springframework.stereotype.Component;

@Component
public class Iterable {
    public void theory() {
        String theory = """
                Iterable este interfata care contine o metoda iterator(),
                aceasta metoda returneaza un obiect de tip Iterator.
                Interfata Iterator contine metode hasNext() si next().
                hasNext() returneaza true daca mai exista elemente in colectie,
                next() returneaza elementul curent si muta cursorul la urmatorul element,
                daca nu mai exista elemente in colectie, next() va arunca exceptia NoSuchElementException.
                """;
        System.out.println(theory);
    }

    public void practice() {

        String exemple = """
                List<String> list = new ArrayList<>();
                        list.add("a");
                        list.add("b");
                        list.add("c");
                        Iterator<String> iterator = list.iterator();
                        while (iterator.hasNext()) {
                            System.out.println(iterator.next());
                            //ciclul dat va lucra pana cand hasNext() va returna false
                            //si va arunca exceptia NoSuchElementException
                            //iterator.next() va returna elementul curent si va muta cursorul la urmatorul element
                            //daca nu mai exista elemente in colectie, next() va arunca exceptia NoSuchElementException
                            //iterator.remove() va sterge elementul curent
                            //iterator.forEachRemaining() va executa o functie pentru fiecare element ramas
                """;
        System.out.println(exemple);
    }

}
