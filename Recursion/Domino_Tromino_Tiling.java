package Recursion;
import java.util.Arrays;

public class Domino_Tromino_Tiling {
    private static final int MOD = 1000000007;
    private static int[] dp;

    public static void main(String[] args) {
        int n = 60; 
        System.out.println(numTilings(n));  
    }

    
    public static int numTilings(int n) {
        dp = new int[n + 1]; 
        Arrays.fill(dp, -1); 
        return countWays(n);
    }

   
    public static int countWays(int n) {
        if (n == 0) return 1; 
        if (n == 1) return 1; 
        if (n == 2) return 2; 
       
        if (dp[n] != -1) return dp[n];

        dp[n] = 0;
        dp[n] = (2 * countWays(n - 1)) % MOD;
        dp[n] = (dp[n] + countWays(n - 3)) % MOD;

        return dp[n];
    }
}
