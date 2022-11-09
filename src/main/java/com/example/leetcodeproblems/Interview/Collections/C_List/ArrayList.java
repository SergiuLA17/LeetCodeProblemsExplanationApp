package com.example.leetcodeproblems.Interview.Collections.C_List;


import org.springframework.stereotype.Component;

@Component
public class ArrayList<H> {
    public void theory(){
        String theory = """
                ArrayList este clasa care extinde clasa AbstractList.
                ArrayList implementeaza interfata List.
                De la ArrayList se extind clasa Stack si clasa Vector.
                ArrayList permite elemente duplicate si permite elemente nule.
                Permite de asi schimba dimensiunea.             
                Permite accesarea elementelor prin index.
                Este implementata ca un vector.
                Permite accesarea elementelor random.
                Permite accesarea elementelor in ordinea in care sunt adaugate.
                Este clasa care permite accesarea elementelor in ordinea inversa in care sunt adaugate.     
                
                """;

        System.out.println(theory);
    }

    public void practice(){
        String practice = """
                Exemplu
                import java.util.ArrayList;
                public class Demo {
                   public static void main(String[] args) {
                      ArrayList<Integer> myList = new ArrayList<Integer>();
                      myList.add(50);
                      myList.add(100);
                      myList.add(150);
                      myList.add(200);
                      myList.add(250);
                      myList.add(300);
                      myList.add(350);
                      myList.add(400);
                      System.out.println("Elements in the ArrayList class = " + myList);
                   }
                }
                Output
                Elements in the ArrayList class = [50, 100, 150, 200, 250, 300, 350, 400]
                """;
        System.out.println(practice);

    }
}
