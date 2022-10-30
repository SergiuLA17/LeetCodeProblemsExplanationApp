package com.example.leetcodeproblems.Interview.OOP.Inheritance.Extends.Exemple;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void greed(Hero hero) {
        System.out.println("Hello " + hero.getName());
    }
}
