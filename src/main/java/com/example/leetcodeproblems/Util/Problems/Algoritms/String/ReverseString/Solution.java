package com.example.leetcodeproblems.Util.Problems.Algoritms.String.ReverseString;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public  static char[] reverseString(char[] s) {
        int secInd = 0;
        int firstInd = s.length-1;
        while (secInd < firstInd ){
            char tmp = s[firstInd];
            s[firstInd] = s[secInd];
            s[secInd] = tmp;
            firstInd--;
            secInd++;
        }

        return s;
    }

    @Test
    void test(){
        char[] test = reverseString(new char[]{'a', 'b', 'c'});
        assertEquals(Arrays.toString(new char[]{'c', 'b', 'a'}), Arrays.toString(test));
    }
}
