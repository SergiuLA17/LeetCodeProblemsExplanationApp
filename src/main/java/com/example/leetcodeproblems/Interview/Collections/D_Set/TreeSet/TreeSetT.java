package com.example.leetcodeproblems.Interview.Collections.D_Set.TreeSet;

public class TreeSetT {
    public void theory(){
        String theory = """
                TreeSet implementeaza interfata NavigationSet si SortedSet.
                NavigableSet este o interfata care extinde interfata SortedSet.
                Aici sunt adaugate metode pentre a naviga prin elementele din set.
                SortedSet este o interfata care extinde interfata Set.
                Aici sunt adaugate metode pentru a sorta elementele din set.
                
                TreeSet este clasa care implementeaza interfata Set.
                TreeSet sorteaza elementele in ordinea naturala.
                
                Stergerea si adugarea  se face mai lenta de catre TreeSet decat HashSet. 0(log n) in loc de 0(1).
                Deoarece TreeSet trebuie sa sorteze elementele.
                
                """;

        System.out.println(theory);
    }
}
