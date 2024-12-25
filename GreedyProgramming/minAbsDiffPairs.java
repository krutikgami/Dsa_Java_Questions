package GreedyProgramming;

import java.util.Arrays;

public class minAbsDiffPairs { // T(n) = O(n log n) 
    public static void main(String[] args) {
        int a [] = {3,2,1};
        int b [] = {3,1,2};

        int minValue = 0;
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < b.length; i++) {
            minValue+=Math.abs(a[i] - b[i]);
        }

        System.out.println("Minimum value is = "+minValue);
    }
}
