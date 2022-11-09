package com.example.leetcodeproblems.Interview.OOP.Serializarea;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;

@Data
@NoArgsConstructor
public class Human implements Serializable {
    private String name;
    private ArrayList<Human> children;

    public Human(String name) {
        this.name = name;
    }

    public Human(ArrayList<Human> children) {
        this.children = children;
    }

    public Human(String name, ArrayList<Human> children) {
        this.name = name;
        this.children = children;
    }
}
