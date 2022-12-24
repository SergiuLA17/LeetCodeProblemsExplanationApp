package com.example.leetcodeproblems.Util.HtmlGenerate.Interview.Practice.ImutableCLass;

public class EnumPractic {

    public static void helloFormGods(Gods god){
        System.out.println("Hello I'm " + god);
    }

    enum Gods{
        Mars, Mercury
    }

    public static void main(String[] args) {
        helloFormGods(Gods.Mars);

    }
}
