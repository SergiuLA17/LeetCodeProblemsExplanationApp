package com.example.leetcodeproblems.Interview.OOP.Collections.C_List;


import org.springframework.stereotype.Component;

@Component
public class LinkedList {
    public void theory(){
        String theory = """
                LinkedList este clasa care extinde clasa AbstractSequentialList.
                LinkedList implementeaza interfata List, Queque si Deque.
                De la LinkedList se extinde clasa Stack si clasa Vector.
                LinkedList permite elemente duplicate si permite elemente nule.
                Permite de asi schimba dimensiunea.             
                Permite accesarea elementelor prin index.
                Este implementata ca o lista dublu inlantuita. (contine un pointer catre urmatorul si un pointer catre precedentul element)
                Nu este sincronizata.
                Nu este serializabila.
                Permite accesarea elementelor random.
                Permite accesarea elementelor in ordinea in care sunt adaugate.
                Nu este clasa care permite accesarea elementelor in ordinea inversa in care sunt adaugate.                       
                """;

        System.out.println(theory);
    }

    public void practice(){
        String practice = """
                Exemplu 
                public class Demo {
                                   public static void main(String[] args) {
                                      LinkedList<Integer> myList = new LinkedList<Integer>();
                                      myList.add(50);
                                      myList.add(100);
                                      myList.add(150);
                                      myList.add(200);
                                      myList.add(250);
                                      myList.add(300);
                                      myList.add(350);
                                      myList.add(400);
                                      System.out.println("Elements in the LinkedList class = " + myList);
                                   }
                                }
                                Output
                                Elements in the LinkedList class = [50, 100, 150, 200, 250, 300, 350, 400]
                """;
        System.out.println(practice);
    }

}
