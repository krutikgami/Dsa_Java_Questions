package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class queueUsingDeque {
   static Deque<Integer> d = new LinkedList<>();

    public static void add(int x){
        d.addLast(x);
    }
    public static int remove(){
        return d.removeFirst();
    }
    public static int peek(){
        return d.getFirst();
    }
    public static void print(){
        while (!d.isEmpty()) {
            System.out.print(peek() + " ");
            remove();
        }
    }
    public static void main(String[] args) {
        queueUsingDeque q = new queueUsingDeque();
        q.add(1);
        q.add(2);
        q.add(3);

        q.print();
    }
}
