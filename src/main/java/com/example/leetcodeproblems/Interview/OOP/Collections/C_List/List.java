package com.example.leetcodeproblems.Interview.OOP.Collections.C_List;


import org.springframework.stereotype.Component;


@Component
public class List {
    public List() {
    }

    public void theory() {
        String theory = """
                List este interfata care extinde interfata Collection.
                List este o colectie care permite elemente duplicate si permite accesarea elementelor
                prin index.
                List contine metodele:
                get() - returneaza elementul de pe pozitia index,
                set() - seteaza elementul de pe pozitia index,
                add() - adauga un element in colectie,
                indexOf() - returneaza indexul primului element egal cu elementul dat,
                lastIndexOf() - returneaza indexul ultimului element egal cu elementul dat,
                listIterator() - returneaza un obiect de tip ListIterator,
                subList() - returneaza o sublista cu elementele din intervalul [fromIndex, toIndex).
                List extinde interfetele RandomAccess, Cloneable si Serializable.
                RandomAccess este o interfata marker care indica ca lista este accesata random,
                adica elementele nu sunt accesate in ordinea in care sunt adaugate.
                Cloneable este o interfata marker care indica ca lista poate fi clonata.
                Serializable este o interfata marker care indica ca lista poate fi serializata. 
                Serializarea representeaza procesul de transformare a unui obiect intr-un sir de biti. 
                Pentru al pastra intr-un file sau pentru a-l transmite pe retea. 
                De la List se extind interfetele ArrayList, LinkedList, Vector si Stack.    
                
                """;
        System.out.println(theory);

    }

    public void linkedListVSarrayList(){
        String linkedListVSarrayList = """
                -ArrayList este creat pe baza de array, care isi schimba dinamic dimensiunea.
                Cand se adauga un element in ArrayList, se aloca un nou array cu o dimensiune mai mare.         
                -LinkedList este creat pe baza de noduri, in fiecare nod se salveaza adresa elementului precedent si urmator si elementul.
                #adaugarea lementului
                -Cand adaugam in LinkedList un element, se cauta nodul dupa care trebuie de adaugat elementul si schimba adreele nodurilor.
                -Cand adaugam in ArrayList un element, se cauta pozitia dupa care trebuie de adaugat elementul 
                si se muta elementele de dupa pozitia respectiva. Daca array-ul nu are loc, se aloca un nou array.
                #cautarea elementului
                -pentru a gasi un element in LinkedList se parcurge lista de la inceput pana la final.
                -pentru a gasi un element in ArrayList se cauta elementul de la mijlocul(binary search) listei dupa index.
                #stergerea elementului
                -pentru a sterge un element in LinkedList se cauta nodul care contine elementul si se schimba adresele nodurilor.
                -pentru a sterge un element in ArrayList, se foloseste aceiasi metoda ca si adaugare.
                
                LinkedList este mai buna cand se adauga sau se sterge elemente din lista de la inceput sau de la final.
                In toate celalte cazuri ArrayList este mai buna.
                ArrayList este mai inteles pentru procesor, deoarece elementele sunt stocate unul dupa altul, 
                si este posibila folosita cache-ul procesorului. Procesorul nu asteapta sa se incarce datele din memorie.
                Cu LinkedList procesorul trebuie sa astepte sa se incarce datele din memorie.

                """;

        System.out.println(linkedListVSarrayList);

    }
}
