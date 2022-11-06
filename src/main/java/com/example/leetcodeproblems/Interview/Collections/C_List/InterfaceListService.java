package com.example.leetcodeproblems.Interview.Collections.C_List;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class InterfaceListService {
    @Autowired
    private List list;
    @Autowired
    private ArrayList arrayList;
    @Autowired
    private AbstractList abstractList;
    @Autowired
    private AbstractSequentialList abstractSequentialList;
    @Autowired
    private LinkedList linkedList;


    public void interfaceList() {
        list.theory();
    }

    public void arrayList() {
        arrayList.theory();
        arrayList.practice();
    }

    public void linkedList() {
        linkedList.theory();
        linkedList.practice();
    }

    public void abstractList() {
        abstractList.theory();
        abstractList.practice();
    }

    public void abstractSequentialList() {
        abstractSequentialList.theory();
    }




}
