package com.example.leetcodeproblems.Util.Problems.Algoritms.Arrays.Search;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int low, high, mid;
        low = 0;
        high = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            mid = (high + low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) low = mid;
            else high = mid;
        }
        return -1;
    }

    @Test
    void test() {
        int test = binarySearch(new int[]{1, 2, 4, 6, 7, 8}, 5);
        assertEquals(-1, test);
    }
}
