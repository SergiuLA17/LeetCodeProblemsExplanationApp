package com.example.leetcodeproblems.Util.SortAlghoritmsImpl;

import java.util.Arrays;

public class QuickSort {


    public static void main(String[] args) {
        int[] arr = {11, 52, 23, 44, 34, 76, 17, 28, 49, 10};
//        int testLen = 10000000;
//
//        int[] arr1 = new int[testLen];
//        int[] arr2 = new int[testLen];
//
//        System.out.println("\n-----Random array------");
//
//        for (int i = 0; i < testLen; i++) {
//            arr2[i] = arr1[i] = (int)Math.round(Math.random() * 100000);
//        }

        System.out.println("Quick sort:");
        measureTime(() -> quickSort(arr, 0, arr.length - 1));

        System.out.println("Arrays.sort:" + Arrays.toString(arr));


    }

    public static void quickSort(int[] arr, int from, int to) {

        if (from < to) {

            int divideIndex = partition(arr, from, to);

            quickSort(arr, from, divideIndex - 1);

            quickSort(arr, divideIndex, to);
        }
    }

    private static int partition(int[] arr, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;
        System.out.println("Current array: " + Arrays.toString(arr));
        System.out.println("Current array\n");
        for (int i = from; i <= to; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        int pivot = arr[from + (to - from) / 2];
        System.out.println("Pivot: " + pivot);
        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex++;
                //in acest while se cauta un element mai mare decat pivotul, care va fi mutat in dreapta
            }

            while (arr[rightIndex] > pivot) {
                rightIndex--;
                //in acest while se cauta un element mai mic decat pivotul, care va fi mutat in stanga
            }

            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
                //in acest if se face swap intre elementele gasite mai sus
            }
        }
        return leftIndex;
    }

    private static void swap(int[] array, int index1, int index2) {
        System.out.println("Swap "+array[index1]+" with "+array[index2]);
        int tmp  = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
        System.out.println("Current after swap: " + Arrays.toString(array));
    }


    private static void measureTime(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println("Затраченное время: " + elapsed + " ms");
    }
}
