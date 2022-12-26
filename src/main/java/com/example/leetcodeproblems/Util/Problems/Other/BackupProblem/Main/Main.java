package com.example.leetcodeproblems.Util.Problems.Other.BackupProblem.Main;

public class Main {

    public int sum(int[] array) {
        int pwo = 1;
        int low = 0;
        int high = array.length - 1;
        int sum = 0;
        int sum2 = 0;
        int length = (array.length / 2) + 1;
        for (int i = 0; i < length; i++) {
            if (low >= high) {
                sum2 += array[low];
                sum += array[low] * pwo;
                break;
            }

            sum += array[low] * pwo + array[high] * pwo;
            sum2 += array[low] + array[high];
            low++;
            high--;
            pwo++;
        }
        return sum+(sum2*2);
    }

}
