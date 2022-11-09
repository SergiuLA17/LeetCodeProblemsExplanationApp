package com.example.leetcodeproblems.Interview.OOP.Classes.Abstract.Exemple;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("John", "30");
        Policman policman = new Policman("Jack", "40");

        doctor.sayHello();
        doctor.printWeight();
        policman.sayHello();
        policman.printWeight();
    }
}
