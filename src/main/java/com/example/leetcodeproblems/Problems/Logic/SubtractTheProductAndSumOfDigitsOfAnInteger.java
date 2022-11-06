package com.example.leetcodeproblems.Problems.Logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            product *= n % 10;
            n = n / 10;

        }
        return product - sum;
    }
    @Test
    void test() {
        int test = subtractProductAndSum(234);
        assertEquals(15, test);
        int test1 = subtractProductAndSum(705);
        assertEquals(-12, test1);
    }
}
