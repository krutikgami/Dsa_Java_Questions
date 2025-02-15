package Heaps;

import java.util.PriorityQueue;

public class slidingWindow {
    static class Pair implements Comparable<Pair> {
        int val,idx;
        public Pair(int val,int idx){
            this.val = val;
            this.idx = idx;
        }
  
        @Override 
        public int compareTo(Pair p){
            return p.val - this.val;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        int res[] = new int[arr.length-k+1];
        PriorityQueue<Pair> q = new PriorityQueue<>();

        for(int i =0;i<k;i++){
            q.add(new Pair(arr[i], i));
        }

        res[0] = q.peek().val;

        for(int i=k;i<arr.length;i++){
            while (q.size()>0 && q.peek().idx <=(i-k)) {
                q.remove();
            }
            q.add(new Pair(arr[i], i));
            res[i-k+1] = q.peek().val;
        }

       for (int i = 0; i < res.length; i++) {
        System.out.print(res[i]+ " ");
       }
    }
}
