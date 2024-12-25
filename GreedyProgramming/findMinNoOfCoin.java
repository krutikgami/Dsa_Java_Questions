package GreedyProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class findMinNoOfCoin {
    public static void main(String[] args) {
        Integer arr[] = {1,2,5,10,20,50,100,500,1000,2000};
        int count = 0;
        Arrays.sort(arr,Comparator.reverseOrder());
        ArrayList<Integer> list = new ArrayList<>();
        int amount = 550;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<=amount) {
                while (arr[i]<=amount) {
                    count++;
                    list.add(arr[i]);
                    amount-=arr[i];
                }
            }
        }

        System.out.println("Count = "+count);
        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j)+ " ");
        }
    }
}
