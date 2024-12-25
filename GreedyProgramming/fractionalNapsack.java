package GreedyProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class fractionalNapsack {
    public static void main(String[] args) {
        int value[] = {60,100,120};
        int weight[] = {10,20,30};
        int profit = 0;
        int totalWeight = 50;
        int currWeight =totalWeight;
        double arr[][] = new double[value.length][2];
        for(int i =0;i<value.length;i++){
            arr[i][0] = i;
            arr[i][1] = value[i]/weight[i]; 
        }

        Arrays.sort(arr,Comparator.comparingDouble(o -> o[1]));

        for (int i = arr.length -1 ; i >= 0; i--) {
            int idx = (int)arr[i][0];
            if (currWeight>=weight[idx]) {// for full items;
                currWeight-= weight[idx];
                profit+= value[idx];
            }else{ // for half items to be stored
                profit+= currWeight*arr[i][1];
                currWeight = 0;
                break;
            }
        }

        System.out.println("Profit = "+ profit);
    }
}
