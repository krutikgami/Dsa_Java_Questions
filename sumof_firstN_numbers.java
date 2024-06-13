import java.util.Scanner;
public class sumof_firstN_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val =1,n,sum=0;
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        for(val=1;val<=n;val++){
            sum  = sum + val;
        }
        System.out.println("The sum of First N natural number is: "+sum);
        sc.close();
        }
}
