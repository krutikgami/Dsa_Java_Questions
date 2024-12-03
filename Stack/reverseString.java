package Stack;

import java.util.Stack;

public class reverseString {
    public static String reverseString(String str){
        int i =0;
        Stack<Character> s = new Stack<>();
        while (i < str.length()) {
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder sb = new StringBuilder("");

        while (!s.isEmpty()) {
            char curr =  s.pop();
            sb.append(curr);
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.print(reverseString(str));
    }
}
