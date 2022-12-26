package com.example.leetcodeproblems.Util.Problems.Algoritms.Array;

import java.util.Arrays;

public class SquaresofaSortedArray {

    public static int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];
        int l = 0, r = A.length - 1;
        int left, right;
        int pos = A.length - 1;
        while (l <= r){
            left = Math.abs(A[l]);
            right = Math.abs(A[r]);
            if (left > right){
                res[pos] = (int)Math.pow(A[l], 2);
                l++;
            }
            else{
                res[pos] =(int) Math.pow(A[r], 2);
                r--;
            }
            pos--;
        }
        return res;
    }

    public static void main(String[] args) {
        sortedSquares(new int[]{-1,-4,0,3,10});
    }
}
