package Stack;

import java.util.*;

public class pushBottomStackArray {

    public static void pushBottomStack(Stack<Integer> s,int data){
        int arr [] = new int [s.size()+1]; 
        int i = 0;
        while (!s.isEmpty()) {
            int val = s.pop();
            arr[i] = val;
            i++;
        }
        arr[arr.length-1] = data;
        for(int j = arr.length-1;j>=0;j--){
            s.push(arr[j]);
        }
           
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushBottomStack(s,4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
