package com.example.leetcodeproblems.Util.Problems.Math;

import java.util.HashSet;
import java.util.Set;

public class Happy {

    private static void measureTime(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println("Затраченное время: " + elapsed + " ms");
    }

    public static void main(String[] args) {
        System.out.println(getDigit(88));
    }

    public static boolean  getDigit(int n){
        Set<Integer> inLoop = new HashSet<>();
        int squareSum,remain;
        while (inLoop.add(n)) {
            squareSum = 0;
            while (n > 0) {
                remain = n%10;
                squareSum += remain*remain;
                n /= 10;

            }
            if (squareSum == 1)
                return true;
            else
                n = squareSum;

        }

        return false;
        //consta in idea de a detecta algoritmul Floyd's cycle-finding algorithm, daca suma se repeta macar odata, atunci
        //lista sumelor va avea un ciclu, iar numarul nu este happy
    }

}
