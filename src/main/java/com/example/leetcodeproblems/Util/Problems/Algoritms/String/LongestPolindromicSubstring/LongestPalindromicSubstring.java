package com.example.leetcodeproblems.Util.Problems.Algoritms.String.LongestPolindromicSubstring;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        //string unde se stocheaza resultatul final
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            //cautarea polindromului in cazul cand lungimea s este impara
            String tmp1 = extend(s, i, i);
            //cautarea polindromului in cazul cand lungimea s este para
            String tmp2 = extend(s, i, i + 1);
            //controleaza daca polindromul dat este mai mare ca resultatul
            if (tmp1.length() > res.length())
                res = tmp1;
            //controleaza daca polindromul dat este mai mare ca resultatul
            if (tmp2.length() > res.length())
                res = tmp2;
        }
        return res;
    }

    //in functia data se transmite subtring,care gaseste polindrim
    //left si right, este centrul polindromului

    //ex
    //se transmite (abba,0,0)
    public static String extend(String s, int left, int right) {

        //in cazul dat conditia while e true
        // deoarece, left(0) = 0, right(0) < s.length(3) , s.charAt(0)(a) == s.charAt(0)(a)
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            //se decrementeaza/incrementeaza left si right
            left--;
            right++;
        }
        //acum avem (abba,-1,1)
        //in cazul dat conditia while e false
        // si se va intoarce, ab, ce este un polindrom
        return s.substring(left + 1, right);
    }

    @Test
    void test(){
        String testStr = longestPalindrome("addffdds");
        assertEquals("ddffdd", testStr);
    }
}
