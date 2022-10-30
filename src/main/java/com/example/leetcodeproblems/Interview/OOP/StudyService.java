package com.example.leetcodeproblems.Interview.OOP;

import com.example.leetcodeproblems.Interview.Classes.Classes;
import com.example.leetcodeproblems.Interview.OOP.Incapsularea.Encapsulation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudyService {
    @Autowired
    Encapsulation encapsulation;
    @Autowired
    Classes classesService;

    public void encapsulation(){
        encapsulation.modificators();
        encapsulation.gettersAndSetters();
    }

    public void classes(){
        classesService.printTheory();
        classesService.differenceBetweenAbstractAndInterface();
    }
}
