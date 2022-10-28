package com.example.leetcodeproblems.Interview.OOP.Incapsularea;

import com.example.leetcodeproblems.Interview.OOP.Incapsularea.GetterAndSetter.Theory.GetterAndSettersTheory;
import com.example.leetcodeproblems.Interview.OOP.Incapsularea.Modificators.Modificators;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Encapsulation {
    @Autowired
    GetterAndSettersTheory getterAndSetters;
    public  void modificators(){
        Modificators.printTheory();
        Modificators.printExemple();
    }

    public void gettersAndSetters(){
        getterAndSetters.theory();
    }
}
