package Backtracking;
public class gridWays {

    public static int countWays(int i,int j,int n,int m){

        // base case
        if (i==n-1 && j==m-1) {
            return 1;
        }
        else if (i==n || j==n) {
            return 0;
        }
        int w1 = countWays(i, j+1, n, m);
        int w2 = countWays(i+1, j, n, m);

        return w1 + w2;
    }

    public static void main(String[] args) {
        int n =3 , m = 3;
        System.out.print(countWays(0,0,n, m));
    }
}