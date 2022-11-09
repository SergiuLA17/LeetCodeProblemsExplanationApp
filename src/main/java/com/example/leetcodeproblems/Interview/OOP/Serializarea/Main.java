package com.example.leetcodeproblems.Interview.OOP.Serializarea;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<Human> children = new ArrayList<>();
        Human  child1 = new Human("Maria");
        Human  child2 = new Human("Oxana");
        children.add(child1);
        children.add(child2);


        Human human1 = new Human("Vanea",children);
        Human human2 = new Human("Ion",children);
        Human human3 = new Human("Costea",children);

        ArrayList<Human> people = new ArrayList<>();
        people.add(human1);
        people.add(human2);
        people.add(human3);

        String fileName = "file.ser";

        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(people);
        objectOutputStream.close();
        fileOutputStream.close();

        System.out.println("Object has been serialized");


        ArrayList<Human> peopleS = null;

        FileInputStream file = new FileInputStream(fileName);
        ObjectInputStream in = new ObjectInputStream(file);

        try {
            peopleS = (ArrayList<Human>) in.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Object has been deserialized ");
        System.out.println("peopleS = " + peopleS);

    }
}
