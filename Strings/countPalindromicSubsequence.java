package Strings;

import java.util.HashSet;

public class countPalindromicSubsequence {
    public static void countPalindromicSubsequenc(String s) {
        int sum = 0;

        for (char c = 'a'; c <= 'z'; c++) {
            int firstIndex = s.indexOf(c);
            int lastIndex = s.lastIndexOf(c);

            if (firstIndex != -1 && lastIndex != -1 && firstIndex < lastIndex) {
                HashSet<Character> set = new HashSet<>();

                for (int i = firstIndex + 1; i < lastIndex; i++) {
                    set.add(s.charAt(i));
                }
                
                sum += set.size();
            }
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        String s = "adc";
        countPalindromicSubsequenc(s); // Should print 4
    }
}
