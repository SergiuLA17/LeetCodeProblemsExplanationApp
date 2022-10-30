package com.example.leetcodeproblems.Interview.Classes.Abstract.Exemple;

public class Policman extends Human {
    public Policman(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I am a Policman");
    }
}
