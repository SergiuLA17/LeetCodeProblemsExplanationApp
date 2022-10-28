package com.example.leetcodeproblems.Interview.OOP.Incapsularea.Modificators.Exemples;
//incapsularea in java
//este izolarea unor date de la user de care el nu are nevoie

import org.springframework.stereotype.Service;

@Service
public class ModificatorExemple {
    protected int x;

    public ModificatorExemple() {
    }

    public static void explanation(){
        String explanation = """
                ---------------------------------------------
                Explanation:
                Clasa Class1 este in pachetul Pack1
                Clasa Class2 este in pachetul Pack2
                Clasa Class3 este in pachetul Pack1, Classa2 mosteneste clasa Class1
                Clasa Clasa4 este in pachetul Pack1                                
                ---------------------------------------------
                Vizibilitatea variabilelor din Clasa Class1 in alte clase:
                                   
                                | Clasa2 | Clasa3 | Clasa4 |              
                x_is_public     |true    |true    | true   |
                x_is_protected  |false   |true    | true   |
                x_is_defaul     |false   |true    | true   |   
                x_is_private    |false   |false   | false  |               
                ---------------------------------------------   
                """;


        System.out.println(explanation);
    }
}
