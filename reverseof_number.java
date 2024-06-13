import java.util.Scanner;
public class reverseof_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        while (n > 0) {
        int digit = n % 10;
        System.out.print(digit); 
        n = n / 10;  
        }
        sc.close();
    }
}
