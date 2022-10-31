package com.example.leetcodeproblems.Interview.Collections.C_List;

import org.springframework.stereotype.Component;

@Component
public class AbstractSequentialList {
    public void theory(){
        String theory = """
                AbstractSequentialList este clasa abstracta care extinde clasa AbstractList.
                AbstractSequentialList implementeaza interfata List.
                De la AbstractSequentialList se extind clasa LinkedList si clasa Vector.
                
                """;

        System.out.println(theory);
    }
}
