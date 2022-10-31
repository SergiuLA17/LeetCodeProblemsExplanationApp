package com.example.leetcodeproblems.Interview.Collections.C_List;

import org.springframework.stereotype.Component;

@Component
public class AbstractList {
    public void theory() {
        String theory = """
                AbstractList este clasa abstracta care extinde clasa AbstractCollection.
                AbstractList implementeaza interfata List.
                De la Abstractlist  se extinde clasa AbstractSequentialList.
               
             
                """;
        System.out.println(theory);
    }

    public void practice(){
        String practice = """
                Exemplu
                import java.util.LinkedList;
                import java.util.AbstractList;
                public class Demo {
                   public static void main(String[] args) {
                      AbstractList<Integer> myList = new LinkedList<Integer>();
                      myList.add(50);
                      myList.add(100);
                      myList.add(150);
                      myList.add(200);
                      myList.add(250);
                      myList.add(300);
                      myList.add(350);
                      myList.add(400);
                      System.out.println("Elements in the AbstractList class = " + myList);
                   }
                }
                Output
                Elements in the AbstractList class = [50, 100, 150, 200, 250, 300, 350, 400]
                """;
        System.out.println(practice);
    }
}
