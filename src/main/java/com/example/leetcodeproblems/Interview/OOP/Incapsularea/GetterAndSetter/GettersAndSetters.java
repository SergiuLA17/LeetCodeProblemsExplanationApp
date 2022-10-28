package com.example.leetcodeproblems.Interview.OOP.Incapsularea.GetterAndSetter;

import com.example.leetcodeproblems.Interview.OOP.Incapsularea.GetterAndSetter.Theory.GetterAndSettersTheory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GettersAndSetters {
    @Autowired
    GetterAndSettersTheory getterAndSettersTheory;

    public  void gettersAndSettersTheory(){
        getterAndSettersTheory.theory();
    }
}
