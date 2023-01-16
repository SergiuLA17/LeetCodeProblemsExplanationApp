package com.example.leetcodeproblems.Util.SortAlghoritmsImpl;

public class SortTest {

    public static void main(String[] args) {
        int testLen = 10;

        int[] arr1 = new int[testLen];
        int[] arr2 = new int[testLen];
        int[] arr3 = new int[testLen];


        System.out.println("\n-----Random array------");

        for (int i = 0; i < testLen; i++) {
            arr3[i] = arr2[i] = arr1[i] = (int) Math.round(Math.random() * 10);
        }

        System.out.println("Bubble sort:");
        measureTime(() -> Bubble.bubbleSortOptimized(arr1));
        measureTime(() -> BinarSearch.binarysearch(arr1,8));
//        System.out.println("Quick sort:");
//        measureTime(() -> QuickSort.quickSort(arr2, 0, arr2.length - 1));
//        System.out.println("Merge sort:");
//        measureTime(() -> MergeSort.mergeSort(arr3));

    }

    private static void measureTime(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println("Затраченное время: " + elapsed + " ms");
    }
}
