package com.example.leetcodeproblems.Interview.OOP.Classes.Abstract.Exemple;

public class Doctor extends Human {
    public Doctor(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I am a Doctor");
    }
}

