import java.util.Scanner;

public class primeno {

    public static boolean primeno(int n){
        if(n==1 || n==0){
            return false;
        }
        // normal method to find prime no.
        // for(int i = 2; i<=n-1;i++){
        //     if (n%i==0) {
        //         return false;
        //     }
        // }

        //optmize method to find prime no.
        for(int i = 2; i<=Math.sqrt(n);i++){
            if (n%i==0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num, div = 2;
        // boolean isPrime = true;

        // System.out.println("Enter a number: ");
        // num = sc.nextInt();

        // if (num <= 1) {
        //     isPrime = false;
        // } else {
            
        //     while (div * div <= num) {
        //         if (num % div == 0) {
        //             isPrime = false;
        //             break;
        //         }
        //         div++;
        //     }
        // }

        // sc.close();

        // System.out.println(isPrime ? num + " is a prime number" : num + " is not a prime number");


        // Another method
         System.out.println(primeno(5));
    }
}
