// in this question print the binary string with no consecutive 1's

package Recursion;

public class Binary_String {
    public static void binaryString(int n, int lastPlace,String s){
        if(n==0){
            System.out.println(s);
            return;
        }
        binaryString(n-1,0,s+"0");
        if (lastPlace==0) {
            binaryString(n-1, 1, s+"1");
        }
    }
    public static void main(String[] args) {
        binaryString(1, 0, "");
    }
}
