package com.example.leetcodeproblems.Problems.Other.BackupProblem.Point;

import lombok.Data;

@Data
public class Point {
    BackupPoint backupPoint;
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        backupPoint = new BackupPoint(x, y);
    }

    public void reset() {
        System.out.println("Point[ " + x + ", " + y + " ] was reseted");
        this.x = backupPoint.x;
        this.y = backupPoint.y;
    }

    public void printCurrentPoint() {
        System.out.println("Curent Point: " + " x = " + x + ", y= " + y);
    }

    public void printBackup() {
        System.out.println("Backup Point: " + " x = " + backupPoint.x + ", y= " + backupPoint.y);
    }

    static private class BackupPoint {
        int x;
        int y;

        public BackupPoint(int x, int y) {
            this.x = x;
            this.y = y;
        }


        @Override
        public String toString() {
            return "{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}


