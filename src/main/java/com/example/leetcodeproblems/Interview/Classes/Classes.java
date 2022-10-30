package com.example.leetcodeproblems.Interview.Classes;

import com.example.leetcodeproblems.Interview.Classes.Abstract.Theory.AbstractClass;
import org.springframework.stereotype.Service;

@Service
public class Classes {
    public  void differenceBetweenAbstractAndInterface(){
        String differenceBetweenAbstractAndInterface = """
            Interface descrie un comportament. El nu are nici o implementare. Pe cand clasa abstracta are si implementare si comportament.
            Interface nu poate avea variabile. Pe cand clasa abstracta poate avea variabile.
            Clasa abstracta are comun intre clasese mostenite. Pe cand interface poate sa nu aiba nimic comun intre clasele implementate.
            Interfata reprezinta aceia ce poate obiectul.
            Clasa abstracta reprezinta ce este obiectul
            """;
        System.out.println(differenceBetweenAbstractAndInterface);
    }

    public  void printTheory(){
        AbstractClass.theory();
    }


}
