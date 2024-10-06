package Recursion;

public class Friend_Pairing {
    public static int friendPairing(int n){
        if(n==0 || n==1 || n==2){
            return n;
        }

        return friendPairing(n-1) + friendPairing(n-1) * friendPairing(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.print(friendPairing(n));
    }
}
