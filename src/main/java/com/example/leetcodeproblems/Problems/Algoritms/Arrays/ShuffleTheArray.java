package com.example.leetcodeproblems.Problems.Algoritms.Arrays;

import java.util.Arrays;

public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int start = nums.length/2;
        int tmp;
        for (int i = 0; i< nums.length-1; i++){
            if(i <= n ) {
                res[i] = nums[i];
                res[i+1] = nums[start++];
            }else
                res[i] = nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] test = shuffle(new int[]{2,5,1,3,4,7},3);
        System.out.println(Arrays.toString(test));
    }
}
