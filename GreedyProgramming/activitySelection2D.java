package GreedyProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class activitySelection2D {
    public static void main(String[] args) {
        int start [] = {10,20,12};
        int end [] = {20,30,25};
        int arr[] [] = new int[start.length][3];
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <start.length; i++) {
            arr[i][0] = i;
            arr[i][1] = start[i];
            arr[i][2] = end[i];
        }

        Arrays.sort(arr,Comparator.comparingDouble(o -> o[2]));


        //first activity selection 
        count++;
        int last  = arr[0][2];
        list.add(arr[0][0]);
        for(int i = 1;i<end.length;i++){
            if (arr[i][1]>=last) {
                count++;
                last = arr[i][2];
                list.add(arr[i][0]);
            }
        }

        System.out.println(count);

        for (int i = 0; i < list.size(); i++) {
            System.out.print("A"+ list.get(i)+ " ");
        }

    }
}
