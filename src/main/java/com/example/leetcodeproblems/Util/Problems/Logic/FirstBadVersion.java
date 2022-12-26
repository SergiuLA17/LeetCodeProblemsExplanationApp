package com.example.leetcodeproblems.Util.Problems.Logic;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int start, end, mid;
        start = 1;
        end = n;
        while (start < end){
            mid = start + (start-end)/2;
            if(!isBadVersion(n)) start = mid-1;
            else start = mid + 1;
        }
        return start;
    }
    boolean isBadVersion(int version) {
        return false;
    }

    public static void main(String[] args) {

    }
}
