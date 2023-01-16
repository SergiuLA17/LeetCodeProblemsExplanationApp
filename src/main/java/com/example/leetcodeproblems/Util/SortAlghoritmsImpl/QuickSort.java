package com.example.leetcodeproblems.Util.SortAlghoritmsImpl;


public class QuickSort {

    public static void quickSort(int[] arr, int from, int to) {

        if (from < to) {

            int divideIndex = partition(arr, from, to); //indexul care va impari array-ul in 2

            quickSort(arr, from, divideIndex - 1);  // partea din stanga

            quickSort(arr, divideIndex, to);            // partea din dreapta
        }
    }

    private static int partition(int[] arr, int from, int to) {
        int rightIndex = to;                                            //indexul pana la care se parcurge vectorul
        int leftIndex = from;                                           //indexul de la care se parcurge vectorul
//        System.out.println("Current array: " + Arrays.toString(arr));
//        System.out.println("Current array\n");
        for (int i = from; i <= to; i++) {
//            System.out.print(arr[i]+" ");
        }
//        System.out.println("\n");
        int pivot = arr[from + (to - from) / 2]; //reprezinta elementul dupa care se face
//        System.out.println("Pivot: " + pivot);
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
        //se returneaza indexul care va fi folosit pentru a imparti vectorul in 2
    }

    private static void swap(int[] array, int index1, int index2) {
//        System.out.println("Swap "+array[index1]+" with "+array[index2]);
        int tmp  = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
//        System.out.println("Current after swap: " + Arrays.toString(array));
    }


    private static void measureTime(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println("Затраченное время: " + elapsed + " ms");
    }
}
