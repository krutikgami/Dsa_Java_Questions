package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class stackUsingDeque {
   static Deque<Integer> d = new LinkedList<>();

    public static void push(int x){
        d.addLast(x);
    }
    public static int pop(){
        return d.removeLast();
    }
    public static int peek(){
        return d.getLast();
    }
    public static void print(){
        while (!d.isEmpty()) {
            System.out.print(pop()+ " ");
        }
    }
    public static void main(String[] args) {
        stackUsingDeque s = new stackUsingDeque();
        s.push(1);
        s.push(2);
        s.push(3);

        s.print();
    }
}
