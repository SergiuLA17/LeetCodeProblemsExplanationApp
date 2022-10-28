package com.example.leetcodeproblems.Problems.Algoritms.Arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]);
            ans[1] ^= (i+1) ^ val;
            if (nums[val-1] < 0) ans[0] = val;
            else nums[val-1] = -nums[val-1];
        }
        ans[1] ^= ans[0];
        return ans;
    }
    @Test
    void test(){
        int[] test = findErrorNums(new int[]{1,2,3,3});
        assertEquals(Arrays.toString(new int[]{3,4}),Arrays.toString(test));
    }
}
