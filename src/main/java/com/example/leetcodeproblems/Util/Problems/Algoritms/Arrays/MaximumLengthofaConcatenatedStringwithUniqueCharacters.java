package com.example.leetcodeproblems.Util.Problems.Algoritms.Arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumLengthofaConcatenatedStringwithUniqueCharacters {
    public int maxLength(List<String> A) {
        List<Integer> dp = new ArrayList<>();
        dp.add(0);
        int res = 0;
        for (String s : A) {
            int a = 0, dup = 0;
            //controlam daca in string nu sun dublicate
            //a  este pozitia caracterului
            //dup - daca e mai mare ca 0. inseamna ca sunt dublicate in string
            int iter = 0;
            int cToInt = 0;
            int aToInt = 0;
            for (char c : s.toCharArray()) {
                System.out.println("Iteratia " + iter++);
                System.out.println("Char: "+  c + " s: " + s);
                cToInt = c ;
                aToInt = 'a';
                System.out.println("Dup " + dup + " |= " + a + " & " + 1+ " (" + cToInt + " - " + aToInt + ")"  );
                dup |= a & (1 << (c - 'a'));
                System.out.println("Bitul unu se schimba cu " + (c - 'a') + " pozitii");
                a |= 1 << (c - 'a');
                System.out.println("Dup = " + dup + " a = " + a);
            }
            System.out.println("\n");
            if (dup > 0) { System.out.println("Dublicate in " + s + "sunt"); continue;}
            System.out.println("Dublicate in " + s + " nu sunt");
            for (int i = dp.size() - 1; i >= 0; --i) {
                if ((dp.get(i) & a) > 0) continue;
                dp.add(dp.get(i) | a);
                res = Math.max(res, Integer.bitCount(dp.get(i) | a));
            }
        }
        return res;
    }

    @Test
    void test() {
//        List<String> list5 = new ArrayList<>();
//        list5.add("abcdefghijklm");
//        list5.add("bcdefghijklmn");
//        list5.add("cdefghijklmno");
//        list5.add("defghijklmnop");
//        list5.add("efghijklmnopq");
//        list5.add("fghijklmnopqr");
//        list5.add("ghijklmnopqrs");
//        list5.add("hijklmnopqrst");
//        list5.add("ijklmnopqrstu");
//        list5.add("jklmnopqrstuv");
//        list5.add("klmnopqrstuvw");
//        list5.add("lmnopqrstuvwx");
//        list5.add("mnopqrstuvwxy");
//        list5.add("nopqrstuvwxyz");
//        list5.add("opqrstuvwxyza");
//        list5.add("pqrstuvwxyzab");
//
//        int test5 = maxLength(list5);
//        assertEquals(26, test5);
//
//        List<String> list4 = new ArrayList<>();
//        list4.add("cha");
//        list4.add("r");
//        list4.add("act");
//        list4.add("ers");
//
//        int test4 = maxLength(list4);
//        assertEquals(6, test4);
//
//        List<String> list3 = new ArrayList<>();
//        list3.add("ab");
//        list3.add("ba");
//        list3.add("cd");
//        list3.add("dc");
//        list3.add("ef");
//        list3.add("fe");
//        int test3 = maxLength(list3);
//        assertEquals(6, test3);

        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("iq");
        list.add("ue");
        int test = maxLength(list);
        assertEquals(4, test);

//        List<String> list2 = new ArrayList<>();
//        list2.add("a");
//        list2.add("b");
//        list2.add("c");
//        list2.add("d");
//        int test1 = maxLength(list2);
//        assertEquals(4, test1);
    }
}
