package com.example.leetcodeproblems.Interview.OOP.Classes.Abstract.Exemple;

import java.util.Random;

public abstract class Human {
    protected String name;
    protected String age;
    //putem initializa variabilele in clasa abstracta
    protected String weight = new Random().nextInt(50, 100) + " kg";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    abstract public void sayHello();

    //putem implementa metode in clasa abstracta
    public void printWeight() {
        System.out.println("My weight is " + weight);
    }
    //metoda data este abstracta, deci nu are implementare
    //cand ea va fi mostenita, ea va fi obligatoriu implementata
}
