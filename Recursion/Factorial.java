package Recursion;
// Factorial of a given number.
public class Factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int f = n * fact(n-1);
        return f;
    }
   public static void main(String[] args) {
      int n = 6;
      System.out.println(fact(n));
   } 
}
