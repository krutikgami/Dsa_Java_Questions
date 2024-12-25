package GreedyProgramming;

import java.util.ArrayList;

public class activitySelection {
    public static void main(String[] args) {
        int start [] = {10,12,30};
        int end [] = {20,25,30};
        int count = 0 ;
        ArrayList<Integer> list  = new ArrayList<>();

        //first activity select
        count++;
        list.add(0);
        int last  = end[0];

        for (int i = 1; i < start.length; i++) {
            if (start[i]>=last) {
                last = end[i];
                count++;
                list.add(i);
            }
        }

        System.out.println(count);
        for (int j = 0; j < list.size(); j++) {
        System.out.print("A"+ list.get(j)+" ");
        }

    }
}
