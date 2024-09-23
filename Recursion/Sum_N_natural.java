package Recursion;
//Sum of N natural number
public class Sum_N_natural {
    public static int sum(int n){

        if (n==1) {
            return 1;
        }else if (n<0) {
            return -1;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.print(sum(n));
    }}
