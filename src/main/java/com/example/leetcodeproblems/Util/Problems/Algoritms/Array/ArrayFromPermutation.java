package com.example.leetcodeproblems.Util.Problems.Algoritms.Array;

public class ArrayFromPermutation {
    public static void main(String[] args) {
        ArrayFromPermutation arrayFromPermutation = new ArrayFromPermutation();
        int[] nums = {1, 2, 3, 4};
        System.out.println(arrayFromPermutation.buildArray(nums));
    }

    public int buildArray(int[] nums) {
        int sum = 0, sum2 = 0;
        for (int num : nums) {
            sum += num;
                while (num != 0) {
                    sum2 += num % 10;
                    num /= 10;
                }

        }
        return Math.abs(sum2-sum);
    }
}
