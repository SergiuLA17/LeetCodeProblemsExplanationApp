package com.example.leetcodeproblems.Util.TestRoom;

public interface Moviment {
   void move();
}


class auto implements Moviment{

    @Override
    public void move() {
        System.out.printf("fast");
    }
}


class human implements Moviment{

    @Override
    public void move() {
        System.out.printf("slow");
    }
}

class main{
    public static void main(String[] args) {
        Moviment moviment = new auto();
        moviment.move();
    }
}