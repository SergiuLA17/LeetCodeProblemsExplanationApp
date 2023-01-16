package com.example.leetcodeproblems.Util.SortAlghoritmsImpl;

public class BinarSearch {

    public static int binarysearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key < arr[mid]) {
                high = mid - 1;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    //idea consta in impartirea array-ului in doua parti egale si cautarea elementului in fiecare parte
    //daca elementul cautat este mai mic decat elementul din mijloc, atunci se va cauta in prima parte
    
}
