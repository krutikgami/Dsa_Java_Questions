package Strings;
public class maximumString {
    
    public static int maxScore(String s) {
        int max =0;
        int i =1;
        
        while (i<s.length()) {
            int left = 0;
            int right = 0;
            for (int k = 0;k<=i;k++){
                if (s.charAt(k)=='0') {
                    left++;
                }

            }
            for(int k=i+1;k<s.length();k++){
                if (s.charAt(k) == '1') {
                    right ++;
                }
            }
            
            max = Math.max(max, left+right);
            i++;
        }

        return max;
    }
    public static void main(String[] args) {
        String s = "110000";
        System.out.println(maxScore(s));
    }
}
