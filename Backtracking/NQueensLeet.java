package Backtracking;

public class NQueensLeet {


    public  static int totalNQueens(int n) {
        String[][] board = new String[n][n];
        
       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = "X";
            }
        }
        
       
        return solve(board, 0);
    }

    private static int solve(String[][] board, int row) {
 
        if (row == board.length) {
            return 1;
        }
        
        int count = 0;
        

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = "Q"; 
                count += solve(board, row + 1); 
                board[row][col] = "X"; 
            }
        }
        
        return count;
    }

    private static  boolean isSafe(String[][] board, int row, int col) {
        
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col].equals("Q")) {
                return false;
            }
        }
        

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j].equals("Q")) {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j].equals("Q")) {
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        int n= 1;
       
        System.out.println(totalNQueens(n));
    }
}
