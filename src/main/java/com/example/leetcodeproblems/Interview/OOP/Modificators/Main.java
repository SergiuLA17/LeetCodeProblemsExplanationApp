package com.example.leetcodeproblems.Interview.OOP.Modificators;

public class Main {
    public static void main(String[] args) {
        Modificators modificators = new Modificators();
        modificators.printInfoAboutModificators();
        modificators.printInfoAboutSetterAndGetter();

        String explanation = """
                ---------------------------------------------
                Avem 2 clase in 2 pachete diferite
                Clasa Class1 este in pachetul Pack1
                Clasa Class2 este in pachetul Pack2
                Clasa Class3 este in pachetul Pack1
                Clasa Clasa4 este in pachetul Pack2                                
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
