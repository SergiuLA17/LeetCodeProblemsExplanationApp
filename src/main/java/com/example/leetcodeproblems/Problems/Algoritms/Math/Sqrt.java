package com.example.leetcodeproblems.Problems.Algoritms.Math;

public class Sqrt {
    public static int mySqrt(int x) {
        long result = x;

        while (result * result > x) {
            result = (result + x / result) / 2;
        }
        //ex
        //x = 36
        //result = 36
        //loop1
        //result = 36 * 36 = 1296 > x = 36 true
        //result = (36 + (36/36) / 2
        //result = 18
        //result = 18 * 18 = 324 > x = 36 true
        //loop2
        //result = (18 + (18/18) /2
        //result = 6
        //result = 6 * 6 = 36 > x = 36 false
        // answer  6
        return  (int) result;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(37));
        System.out.println(Math.sqrt(37));
    }
}
