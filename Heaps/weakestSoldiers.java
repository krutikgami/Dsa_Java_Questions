package Heaps;

import java.util.PriorityQueue;

public class weakestSoldiers {
    static class Ropes implements Comparable<Ropes> {
        int idx,soldiers;

        public Ropes(int idx,int soldiers){
            this.soldiers = soldiers;
            this.idx = idx;
        }
        
        @Override
        public int compareTo(Ropes r){
            if(this.soldiers == r.soldiers){
                return this.idx - r.idx;
            }else{
                return this.soldiers - r.soldiers;
            }
        }
    }
    public static void main(String[] args) {
        int row [][] = {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int k = 2;
        PriorityQueue<Ropes> q = new PriorityQueue<>();

        for(int i=0;i<row.length;i++){
            int count = 0;
            for(int j=0;j<row[0].length;j++){
                count += row[i][j]==1 ? 1 : 0;
            }
            q.add(new Ropes(count, i));
        }

        for(int i=0;i<k;i++){
            System.out.println("Row: "+ q.remove().idx);
        }
    }
}
