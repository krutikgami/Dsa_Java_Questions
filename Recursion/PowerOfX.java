package Recursion;
// To calculate power of x^n - O(n)
// public class PowerOfX {
//     public static int power(int x, int n){
//         if (n==0) {
//             return 1;    
//         }
//         return x * power(x, n-1);
//     }
//     public static void main(String[] args) {
//         int x = 2, n = 5;
//         System.out.println(power(x,n));
//     }
// }


// To calculate power of x^n - O(logn)
/**
 * PowerOfX
 */
public class PowerOfX {
public static int optimize(int x, int n) {
    if(n==0){
        return 1;
    }

    int  optmizePower = optimize(x,n/2);
    int answer = optmizePower * optmizePower;
    if(n%2!=0){
        return answer * x;
    }
    return answer;
}
    public static void main(String[] args) {
        int x = 2, n = 5;
        System.out.println(optimize(x, n));
    }
}
