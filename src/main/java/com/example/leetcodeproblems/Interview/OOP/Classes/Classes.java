package com.example.leetcodeproblems.Interview.OOP.Classes;

import com.example.leetcodeproblems.Interview.OOP.Classes.Abstract.Theory.AbstractClass;
import org.springframework.stereotype.Service;

@Service
public class Classes {
    public  void differenceBetweenAbstractAndInterface(){
        String differenceBetweenAbstractAndInterface = """
            1)Interface descrie un comportament. Pe cand clasa abstracta are si implementare si comportament.
            2)Clasa abstracta are comun intre clasese mostenite. Pe cand interface poate sa nu aiba nimic comun intre clasele implementate.
            3)Interfata reprezinta aceia ce poate obiectul.
            4)Clasa abstracta reprezinta ce este obiectul
            5)Interfata reprezinta un contract, care este obligatoriu indeplinit in tot proiectul de oarece are modificatorul
            public, pe cand in clasa abstracta modificatorul metodei abstracte poate sa fie nu numai publioc, si in cazul dat
            nu este garatie ca o sa putem folosi metoda data.
            """;
        System.out.println(differenceBetweenAbstractAndInterface);
    }

    public  void printTheory(){
        AbstractClass.theory();
    }


}
