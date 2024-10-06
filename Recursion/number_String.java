// in this question print the number in string ex : 1234 print in string "one two three four"
package Recursion;

public class number_String {
    public static void numberString(int n, String[] arr, String str,int i){
        String num = String.valueOf(n);
        if (i == num.length()) {
            System.out.println(str);
            return;
        }
        String st  = arr[Integer.parseInt(num.charAt(i)+"")];
        numberString(n, arr, str+st+" ", i+1);
        
    }    public static void main(String[] args) {
        int n = 1234;
        String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String str = "";
        numberString(n,arr, str,0);
    }
}
