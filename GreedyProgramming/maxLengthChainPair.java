package GreedyProgramming;

import java.util.Arrays;
import java.util.Comparator;

public class maxLengthChainPair {
    public static void main(String[] args) {
        int arr[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(arr,Comparator.comparingDouble(o -> o[1]));

        // first item to select
        int lastValue = arr[0][1];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0]>=lastValue) {
                lastValue = arr[i][1];
                count++;
            }
        }

        System.out.println("Max lenght pair is = "+count);
    }
}
