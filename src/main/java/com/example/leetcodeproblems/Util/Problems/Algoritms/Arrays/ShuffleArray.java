package com.example.leetcodeproblems.Util.Problems.Algoritms.Arrays;

import java.util.Arrays;

public class ShuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] arr1 = new int[nums.length/2];
        int[] arr2 = new int[nums.length/2];

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(i >= n){
                arr2[i-n] = nums[i];
            }else {
                arr1[i] = nums[i];
            }
        }

        int j = 0;
        for (int i = 0; i < nums.length; i+= 2) {
            result[i] = arr1[j];
            result[i+1] = arr2[j];
            j++;
        }

        return result;
    }

    public static void main(String[] args) {

        int [] arr = {2,5,1,3,4,7};
        int n = 3;

        for (int i : shuffle(arr, n)) {
            System.out.println(i);
        }

    }
}
