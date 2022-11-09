package com.example.leetcodeproblems.Interview.Collections;

import com.example.leetcodeproblems.Interview.Collections.A_Iterable.Iterable;
import com.example.leetcodeproblems.Interview.Collections.B_Collection.Collection;
import com.example.leetcodeproblems.Interview.Collections.C_List.InterfaceListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CollectionService {
    @Autowired
    private InterfaceListService interfaceList;
    @Autowired
    private Collection interfaceCollection;
    @Autowired
    private Iterable interfaceIterable;

    public void collection(){
        String theory = """
                Colectia este un conteiner pentre a stoca si manipula grupuri de obiecte.
                Avantajul colectiilor in Java este ca programistul nu este nevoit sa implementeze anumite metode
                pentru a manipula colectiile, ci poate folosi metodele deja implementate in colectii.
                """;
    }

    public void interfaceList() {
        interfaceList.interfaceList();
        interfaceList.arrayList();
        interfaceList.linkedList();
        interfaceList.abstractList();
        interfaceList.abstractSequentialList();
    }

    public void interfaceCollection() {
        interfaceCollection.theory();
    }

    public void interfaceIterable() {
        interfaceIterable.theory();
        interfaceIterable.practice();
    }

}
