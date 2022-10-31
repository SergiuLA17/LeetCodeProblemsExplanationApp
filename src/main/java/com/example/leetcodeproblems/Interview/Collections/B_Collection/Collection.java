package com.example.leetcodeproblems.Interview.Collections.B_Collection;

import org.springframework.stereotype.Component;

@Component
public class Collection {
    public void theory() {
        String theory = """
                Collection este interfata care extinde Iterable si contine metode de adaugare,
                stergere, cautare si alte metode utile pentru manipularea colectiilor.
                Collection contine metodele:
                add() - adauga un element in colectie,
                remove() - sterge un element din colectie,
                contains() - verifica daca un element se afla in colectie,
                size() - returneaza numarul de elemente din colectie,
                isEmpty() - verifica daca colectia este goala,
                toArray() - returneaza un array cu elementele din colectie,
                clear() - sterge toate elementele din colectie.
                addAll() - adauga toate elementele dintr-o colectie in alta colectie,
                containsAll() - verifica daca toate elementele dintr-o colectie se afla in alta colectie,
                equals() - verifica daca doua colectii contin aceleasi elemente,
                hashCode() - returneaza un hashcode pentru colectie.
                De la Collection se extind interfetele List, Set si Queue si clasa abstracta AbstractCollection.
                AbstractCollection este clasa abstracta care implementeaza metodele din interfata Collection, 
                de aceea nu este nevoie sa le implementam noi. 
                """;
        System.out.println(theory);
    }

}
