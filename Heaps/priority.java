package Heaps;
import java.util.*;

public class priority {
    public  static class  Student implements Comparable<Student> {
        String name;
        int rank;
        public Student(String name,int rank){
            this.rank = rank;
            this.name = name;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    
    public static void main(String[] args) {
        PriorityQueue<Student> q = new PriorityQueue<>();
        q.add(new Student("Krutik", 1));
        q.add(new Student("Ali", 4));
        q.add(new Student("Jeet", 2));
        q.add(new Student("Harsh", 5));

        while (!q.isEmpty()) {
            System.out.println(q.peek().name+"->" + q.peek().rank);
            q.remove();
        }
    }
}
