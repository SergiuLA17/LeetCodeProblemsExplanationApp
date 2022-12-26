package com.example.leetcodeproblems.Util.Problems.Algoritms.String.ZigzagConversion;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZigzagConversion {
    public static String convert(String s, int nRows) {
        //initializam un array din caractere pentru al introduce in resultat
        char[] c = s.toCharArray();
        int len = c.length;
        StringBuffer[] sb = new StringBuffer[nRows];
        //initializam array din buildere
        for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();

        int i = 0;
        while (i < len) {
            //prin ciclul dat noi introducem cate un caracter in fiecare builder din array,
            //apoi cand ajunge la ultimul, ciclus se sfarseste
            for (int idx = 0; idx < nRows && i < len; idx++) // vertically down
                sb[idx].append(c[i++]);
            //prin ciclul dat noi introducem cate un caracter ij fiecare builder din array,
            //dar startam de la prin ultimul
            //pana la primul builder din array
            for (int idx = nRows-2; idx >= 1 && i < len; idx--) // obliquely up
                sb[idx].append(c[i++]);
        }
        //transformam array-ul din buildere in string
        for (int idx = 1; idx < sb.length; idx++)
            sb[0].append(sb[idx]);
        return sb[0].toString();
    }

    @Test
    void test(){
        String test = convert("PAYPALISHIRING", 3);
        assertEquals("PAHNAPLSIIGYIR",test);
    }
    
}
