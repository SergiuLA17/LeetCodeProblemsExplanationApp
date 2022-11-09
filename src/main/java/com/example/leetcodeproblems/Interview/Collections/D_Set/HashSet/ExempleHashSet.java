package com.example.leetcodeproblems.Interview.Collections.D_Set.HashSet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExempleHashSet {
    public static void setRemoveAddExemple(){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);//in cazul dat obiectul nu se va adauga deoarece set nu permite duplicate
        set.add(3);
        System.out.println(set); //[1, 2, 3]

        set.remove(1);
        System.out.println(set); //[2, 3]
    }

    public static void hashcodeExemple(){
        Set<String> set2 = new HashSet<>();
        set2.add("java");
        set2.add("python");
        set2.add("javascript");

        System.out.println(); //1

        int hashcode = set2.hashCode();//returneaza suma hashcode-urilor elementelor din set, pentru int se ia  valoarea, pentru string se ia valoarea ascii
        System.out.println(hashcode); //-780946325
    }
}
