package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class firstNonRepeatingStreamChar {
    public static void nonRepeating(String s){
        int freq [] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            q.add(c);
            freq[c - 'a']++;

            while (!q.isEmpty() && freq[q.peek() - 'a'] >1) {
                q.remove();
            }

            if (q.isEmpty()) {
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
           
        }
        System.out.println();

    }
    public static void main(String[] args) {
        String s = "aabccxb";
        nonRepeating(s);
    }
}
