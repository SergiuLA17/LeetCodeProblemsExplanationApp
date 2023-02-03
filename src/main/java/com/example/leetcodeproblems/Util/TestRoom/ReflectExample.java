package com.example.leetcodeproblems.Util.TestRoom;

import java.util.HashMap;
import java.util.List;

import java.lang.reflect.Field;

public class ReflectExample {
    private String exampleField;

    public static void main(String[] args) {
        ReflectExample example = new ReflectExample();
        Class<?> cls = example.getClass();

        // Get all fields of the class
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field name: " + field.getName());
            System.out.println("Field type: " + field.getType().getName());
        }
    }
}
