package com.example.leetcodeproblems.Interview.OOP.Inheritance.Extends.Exemple;

public class Wizard extends Hero {

    public Wizard(String name) {
        super(name);
    }

    @Override
    public void greed(Hero hero) {
        System.out.println("Hi " + hero.getName());
    }
}
