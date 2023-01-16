package com.example.leetcodeproblems.Util.SortAlghoritmsImpl;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 4, 6, 7, 8, 9, 10};
        mergeSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

    }


    public static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) return;

        int middle = length / 2; //in this variable we will save the middle of array index
        int[] leftArray = new int[middle]; //in this variable we will save the left part of array
        int[] rightArray = new int[length - middle]; //in this variable we will save the right part of array

        int i = 0; //in this variable we will save the index of leftArray
        int j = 0; //in this variable we will save the index of rightArray

        //in for-ul dat de mai jos vom copia elementele din array in leftArray si rightArray
        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        //dupa aceasta vom apela recursiv functia mergeSort pentru a imparti array-ul in sub-array-uri,
        // pana cand nu mai putem imparti
        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length / 2; //in this variable we will save the size of leftArray
        int rightSize = array.length - leftSize; //in this variable we will save the size of rightArray
        int i = 0, l = 0, r = 0; //in this variable we will save the index of leftArray, rightArray and array

        //in this while we will merge the leftArray and rightArray in array
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                l++;
            } else {
                array[i] = rightArray[r];
                r++;
            }
            i++;
        }

        //in this while we will copy the remaining elements of leftArray in array
        while (l < leftSize) {
            array[i] = leftArray[l];
            l++;
            i++;
        }
        //in this while we will copy the remaining elements of rightArray in array
        while (r < rightSize) {
            array[i] = rightArray[r];
            r++;
            i++;
        }

    }
}

//Metoda sortarii merge, consta in faptul de a folos recursivitatea, adica lista de elemente se inmparte, pana cand nu
//mai putem imparti, apoi se sorteaza tabelele si combina tabelele.
//Plususrile acestui alforitm este ca este un destul de rapid, timpul de executie este de O(n log n)
//dar are nevoie de memroie suplimentara.
