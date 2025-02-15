package Heaps;

import java.util.*;
public class heap_ScratchImple {
    static class Heap {
        static ArrayList<Integer> arr = new ArrayList<>();
        
        public static void add(int data){
            arr.add(data);
            int child = arr.size()-1;
            int par =(child-1)/2;

            while (arr.get(child) < arr.get(par)) {
                int temp = arr.get(child);
                arr.set(child, arr.get(par));
                arr.set(par, temp);

                child = par;
                par = (child-1)/2;
            }
        }

        public static int peek(){
            return arr.get(0);
        }

        public static void heapify(int i){
            int left  = (2 * i) +1;
            int right = (2*i)+2;
            int minIndex  = i;
            if(left < arr.size() && arr.get(minIndex) > arr.get(left)){
                minIndex = left;
            }
            if(right < arr.size() && arr.get(minIndex) > arr.get(right)){
                minIndex = right;
            }

            if(minIndex!=i){
                int temp = arr.get(i);
                arr.set(i, arr.get(minIndex));
                arr.set(minIndex, temp);
                heapify(minIndex);
            }

        }

        public static int remove(){
            int start = arr.get(0);
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);
            arr.remove(arr.size()-1);

            heapify(0);
            return start;
        }
        public static boolean isEmpty(){
            return arr.size() == 0;
        }

    }
    public static void main(String[] args) {
        Heap p = new Heap();
        p.add(5);
        p.add(1);
        p.add(3);
        p.add(2);

        while (!p.isEmpty()) {
            System.out.println(p.peek());
            p.remove();
        }
    }
}
