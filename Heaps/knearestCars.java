package Heaps;

import java.util.PriorityQueue;

public class knearestCars {
    static class Point implements Comparable<Point>{
        int x,y,distsq,idx;

        public Point(int x,int y, int distsq,int idx){
            this.x = x;
            this.y = y;
            this.distsq = distsq;
            this.idx = idx;
        }

        @Override
        public  int compareTo(Point p){
            return this.distsq - p.distsq;
        }  
    }
    public static void main(String[] args) {
        int arr[][] = {{3,3},{2,-5},{3,6}};
        int k = 2;
        PriorityQueue<Point> p = new PriorityQueue<>();

        for(int i = 0;i<arr.length;i++){
            int distsq = arr[i][0] * arr[i][0] + arr[i][1] * arr[i][1];
            p.add(new Point(arr[i][0], arr[i][1], distsq, i));
        }

       for(int i= 0;i<k;i++) {
            System.out.println("C"+p.peek().idx);
            p.remove();
        }
    }
}
