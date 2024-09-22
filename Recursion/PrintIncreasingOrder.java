package Recursion;
// print number in increasing order
public class PrintIncreasingOrder {
// normal method to print number in increasing order

public static void printInc(int n){
    if (n==1) {
        System.out.print(n+" ");
        return;
    }
    printInc(n-1);
    System.out.print(n+" ");
}


// second method to print the number in increasing order
    // public static void printInc(int n,int range){
    //     if (n==range) {
    //         System.out.print(range);
    //         return;
    //     }
    //     System.out.print(n+" ");
    //     printInc(n+1,range);
    // }
    
    public static void main(String[] args) {
        int n = 10,range=15;
        printInc(n);
    }
}
