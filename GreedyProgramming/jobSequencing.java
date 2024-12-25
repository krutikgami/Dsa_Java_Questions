package GreedyProgramming;

import java.util.ArrayList;
import java.util.Collections;

public class jobSequencing {

    public static class  Job {
        int id;
        int profit;
        int deadline;

        public Job(int i,int p, int d){
            id = i;
            profit = p;
            deadline = d;
        }
        
    }
    public static void main(String[] args) {
        Integer arr[][] = {{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> job = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            job.add(new Job(i, arr[i][1], arr[i][0]));
        }
        Collections.sort(job, (a,b) -> b.profit - a.profit);

        int time = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            Job curr = job.get(i);
            if (curr.deadline > time) {
                time++;
                list.add(curr.id);
            }
        }

        System.out.println("Time = "+ time);

        for (int i = 0; i<list.size();i++) {
            System.out.print(list.get(i)+ " ");
        }

    }
}
