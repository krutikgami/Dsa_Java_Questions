package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class interleave2Queue {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for(int i =1;i<=10;i++){
            q1.add(i);
        }

        int n = q1.size()/2;
        for(int i = 0;i<n;i++){
            q2.add( q1.remove());
        }

        while (!q2.isEmpty()) {
            q1.add(q2.remove());
            q1.add(q1.remove());
        }

        while (!q1.isEmpty()) {
            System.out.print(q1.peek()+ " ");
            q1.remove();
        }
    }
}
