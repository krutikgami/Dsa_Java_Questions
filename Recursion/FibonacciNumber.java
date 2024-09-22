package Recursion;
//  The fibonacci number at a given number
public class FibonacciNumber {
    public static int fibonacci(int fib){
        if (fib<0) {
            return -1;
        }
        else if (fib==0) {
            return 0;
        }else if (fib == 1) {
            return 1;
        }
        else{
            return fibonacci(fib-1) + fibonacci(fib-2);
        }
    }
    public static void main(String[] args) {
        int fib = 10;
        System.out.println(fibonacci(fib));
    }
}
