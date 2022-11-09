package com.example.leetcodeproblems.Interview;

import com.example.leetcodeproblems.Interview.OOP.Classes.Classes;
import com.example.leetcodeproblems.Interview.OOP.Collections.CollectionService;
import com.example.leetcodeproblems.Interview.OOP.Incapsularea.Encapsulation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudyService {
    @Autowired
    Encapsulation encapsulation;
    @Autowired
    Classes classesService;
    @Autowired
    CollectionService   collectionService;


    public void encapsulation(){
        encapsulation.modificators();
        encapsulation.gettersAndSetters();
    }

    public void classes(){
        classesService.printTheory();
        classesService.differenceBetweenAbstractAndInterface();
    }

    public void collection(){
        collectionService.interfaceList();
        collectionService.interfaceCollection();
        collectionService.interfaceIterable();
    }
}
