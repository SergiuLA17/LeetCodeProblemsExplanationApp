package com.example.leetcodeproblems.Util.TestRoom;

import java.util.HashMap;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        HashMap<List<Integer>, List<Integer>> map = new HashMap<>();

        List<Integer> list1 = List.of(1, 2, 3);
        map.put(list1, List.of(1, 2, 3));

        System.out.println(map.get(list1));
    }
}
