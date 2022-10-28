package com.example.leetcodeproblems.Triks.String;

public class FindRepeatedCharacters {

    public static void main(String[] args) {
        String str1 = "Aa";
        int a = 0, dup = 0;
        for (char c : str1.toCharArray()) {
            dup |= a & (1 << (c - 'a'));
            a |= 1 << (c - 'a');
        }
        if(dup> 0){
            System.out.println("The string have duplicates");
        }else System.out.println("No duplicates in string");
    }
}
