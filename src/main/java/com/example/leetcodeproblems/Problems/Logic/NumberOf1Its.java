package com.example.leetcodeproblems.Problems.Logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOf1Its {
    public int hammingWeight(int n){
        //pentru a afla cati biti sunt in n
        //folosim o variabila
        //in care se va stoca
        //de cate ori operatia n & 1
        //va returna 1
        //exemplu
        int ones = 0;
        while(n!=0) {
            ones = ones + (n & 1);
            //0 +
            n = n>>>1;
        }
        return ones;
    }
    
    @Test
    public void test(){
        int test = hammingWeight(8);
        assertEquals(1, test);
    }
}
