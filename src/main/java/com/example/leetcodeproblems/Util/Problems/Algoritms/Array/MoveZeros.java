package com.example.leetcodeproblems.Util.Problems.Algoritms.Array;

public class MoveZeros {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int distance = 0;
        while (xor != 0){
            distance += (xor & 1);
            xor = xor >> 1;
        }
        return distance;
    }
}
