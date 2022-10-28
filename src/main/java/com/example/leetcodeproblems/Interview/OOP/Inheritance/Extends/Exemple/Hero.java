package com.example.leetcodeproblems.Interview.OOP.Inheritance.Extends.Exemple;

abstract class Hero {
    private String name;
    private int lvl = 1;
    private Point point = new Point(0,0);
    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public void greed(Hero hero);
}
