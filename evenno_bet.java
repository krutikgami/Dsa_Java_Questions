import java.util.Scanner;
public class evenno_bet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,count=0;
        System.out.println("Print even no between given two number.");
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();
        System.out.print("The even no are: ");

        if (a%2==0){
            a=a;
        }
        else{
            a=a+1;
            System.out.print(a);
            System.out.print(" ");
            count++;
        }
        while(a<b){
           a = a+2;
           if(a!=b){
           System.out.print(a);
           System.out.print(" ");
           count++;
           }
           else{

           }
        }
        System.out.println("\nThe total even no are: "+count);
    sc.close();
    }
}