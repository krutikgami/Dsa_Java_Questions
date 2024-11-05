package Backtracking;
public class NQueens {

    public static void chessBoard(String board[] [],int row){
        //base case
        if (row == board.length) {
            printBoard(board);
            return;
        }
        //recursion
        for (int j = 0; j < board.length; j++) {
            if(isSafe(board, row, j)){
            board[row] [j] = "Q";
            chessBoard(board, row+1);
            board[row][j] = "X";
            }
        }
    }
    public static void printBoard(String board[][]){
        System.out.println("-----------Chess Board-------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(String board[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if (board[i][col]== "Q") {
                return false;
            }
        }
        //diagonal left
        for(int i = row-1, j=col-1; i>=0 && j>=0;i--,j-- ){
            if (board[i][j]== "Q") {
                return false;
            }
        }
        //diagonal right
        for(int i=row-1,j=col+1; i>=0 && j<board.length ; i--,j++){
            if (board[i][j]== "Q") {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int n = 4;
        String board [] [] = new String[n][n];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
               board[i] [j] = "X";
            }
            System.out.println();
        }

        chessBoard(board,0);
    }
}
