package com.example.leetcodeproblems.Interview.OOP;

import com.example.leetcodeproblems.Interview.OOP.Incapsularea.Encapsulation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudyService {
    @Autowired
    Encapsulation encapsulation;

    public void encapsulation(){
        encapsulation.modificators();
        encapsulation.gettersAndSetters();
    }
}
