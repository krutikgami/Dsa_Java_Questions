package Stack;

import java.util.Stack;

public class validParenthesis {

    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            int curr = str.charAt(i);

            if (curr == '(' || curr == '{' || curr == '[') {
               s.push((char)curr);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
              if ((s.peek() == '(' && curr == ')')
              || (s.peek() == '[' && curr == ']')
              || (s.peek() == '{' && curr == '}')) {
                  s.pop();
              }else {
                  return false;
              }

            }
        }

        if (s.isEmpty()) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = ")(";
        System.out.print(isValid(str));
    }
}
