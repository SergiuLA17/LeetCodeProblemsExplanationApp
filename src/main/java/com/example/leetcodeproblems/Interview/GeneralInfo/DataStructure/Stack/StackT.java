package com.example.leetcodeproblems.Interview.GeneralInfo.DataStructure.Stack;

import java.util.Arrays;

public class StackT {
    public void info() {
        String info = """
                Stack este o structura de datae cu principiul de lucru, ultimul a venit - ultimul a iesit(LIFO)
                Pentru manipularea cu stack sunt 2 metode:
                1)Pop - scoaterea datelor
                2)Push - introducrea datelor. Cand se foloseste metoda pop() se face controlul daca marimea stackului
                nu depaseste dcat cea curenta, daca depaseste, atunci se mareste lungimea.             
                """;
    }


    public static int[] pop(int[] arr) {
        int[] newArr = new int[arr.length - 1];
        System.arraycopy(arr, 1, newArr, 0, newArr.length);
        return newArr;
    }

    public static int[] push(int[] arr, int element) {

        int[] newArr = new int[arr.length + 1];
        newArr[0] = element;
        System.arraycopy(arr, 0, newArr, 1, newArr.length - 1);
        return newArr;

    }

    public static void main(String[] args) {
        int[] stack = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(stack));

        pop(stack);

        int[] newStack = pop(stack);
        System.out.println(Arrays.toString(newStack));

        int[] newStack0 = push(newStack, 2);
        System.out.println(Arrays.toString(newStack0));

    }
}
