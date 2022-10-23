package com.example.leetcodeproblems.Problems.Algoritms.Math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseInteger {
    public static int reverse(int x) {

        int reverse = 0;

        while (x != 0) {
            int remainder = x % 10;
            reverse = reverse * 10 + remainder;
            x = x / 10;
        }
        return reverse;
    }

    @Test
    void test(){
        int test = reverse(1534236468);
        System.out.println( test);

    }
}
