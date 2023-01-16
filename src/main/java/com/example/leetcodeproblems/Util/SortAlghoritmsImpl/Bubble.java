package com.example.leetcodeproblems.Util.SortAlghoritmsImpl;

public class Bubble {



    public static void bubbleSortOptimized(int[] arr) {
        boolean swapped;            //aceasta variabila va fi folosita pentru a verifica daca s-a facut o interschimbare
        int n = arr.length;         //lungimea array-ului
        do {
            swapped = false;        //s-a presupus
            for (int i = 0; i < n - 1; i++) {  //parcurgem array-ul
                if (arr[i] > arr[i + 1]) {     //daca elementul curent este mai mare decat urmatorul
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;            //s-a facut o interschimbare
                }
            }
            n--;
        } while (swapped);
    }

    //idea consta in parcurgerea array-ului de la inceput pana la sfarsit si interschimbarea elementelor,
    //se va  parcurge pana cand nu va fi nici o interschimbare
}

