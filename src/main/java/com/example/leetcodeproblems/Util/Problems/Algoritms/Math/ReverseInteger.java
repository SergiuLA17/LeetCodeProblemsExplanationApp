package com.example.leetcodeproblems.Util.Problems.Algoritms.Math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseInteger {
    public static int reverse(int x) {
        int result = 0;

        //logica algoritmului consta
        //inpartirea nr si adunarea restului in variabila tmp
        //astefl in tmp se inmulteste resulatatul la 10 si se aduna restul
        //ex avem nr 12
        //* - iteratia 1 -*
        //restul = 2
        //tmp =  0*10+2 = 2
        //result = 2 si x = 1
        //* - iteratia 2 -*
        //restul = 1
        //tmp = 2*10+1=21
        //result = 21 si x = 0
        //return 21
        while (x != 0) {
            int remainder = x % 10;
            int tmp = result * 10 + remainder;
            if((tmp-remainder)/10 != result){
                //o sa returneze 0
                //in cazul cand in linia 13. in variabila dupa inmultine
                //o sa avem numar mai mare ca 2 147 483 647
                //si din cauza ca int nu poate stoca mai mare numar
                //si in variabila va fi alt numar care nu este egal cu result
                return 0;
            }
            result = tmp;
            x = x / 10;

        }
        return result;
    }
    @Test
    void test() {
        int test = reverse(1534236468);
        assertEquals(0, test);

        int test2 = reverse(123);
        assertEquals(321, test2);

        int test3 = reverse(1534236469);
        assertEquals(0, test3);
    }

    public static void main(String[] args) {
    }
}
