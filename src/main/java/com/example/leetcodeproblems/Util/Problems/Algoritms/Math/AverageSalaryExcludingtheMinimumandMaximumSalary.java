package com.example.leetcodeproblems.Util.Problems.Algoritms.Math;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageSalaryExcludingtheMinimumandMaximumSalary {
    public static double average(int[] salary) {
        double sum = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, n = salary.length;
        //initializam min si max cu valoarea maxima si minima,
        //pentru ca sa detectam valoarea minima si maxima la initializare
        for (int num : salary) {
            sum += num;
            min = Math.min(min, num); // min la sfarsit va reprezenta cel mai mic din array
            max = Math.max(max, num);//max reprezinta la sfarsit cel mai mare element din array
        }
        //n reprezinta cate elemente valide sunt pentru impartire sunt
        // (in cazul ca sunt 3 elemente in array, doar 1 o safie valid)
        return (sum - min - max) / (n - 2);
    }

    @Test
    void test(){
        double test = average(new int[]{1000,2000,3000});
        assertEquals(2000, test);
    }
}
