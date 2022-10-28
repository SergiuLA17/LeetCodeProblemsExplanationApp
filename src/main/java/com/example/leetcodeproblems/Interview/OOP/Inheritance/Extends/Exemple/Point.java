package com.example.leetcodeproblems.Interview.OOP.Inheritance.Extends.Exemple;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int distance(Point point){
        return (int) Math.sqrt(Math.pow(point.x-this.x, 2)+Math.pow(point.y-this.y,2));
    }


}