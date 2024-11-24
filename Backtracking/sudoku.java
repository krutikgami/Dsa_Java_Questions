package Backtracking;

public class sudoku {

    
    public static boolean isSafe(int board[][],int row,int col,int digit){
        // column

        for(int i =0;i<=8;i++){
            if (board[i][col]==digit) {
                return false;
            }
        }

        //row
        for(int j = 0; j<=8;j++){
            if (board[row][j]==digit) {
                return false;
            }
        }

        //matrix condition
        int startrow = (row/3) * 3;
        int startcol = (col/3) * 3;

        for(int sr =startrow;sr<startrow+3;sr++){
            for(int sc = startcol;sc<startcol+3;sc++){
                if (board[sr][sc] == digit) {
                    return false;
                }
        }
        }

        return true;
    }

    public static boolean isSudoku(int board[][],int row,int col){
       //base case
        if (row==9 && col==0) {
            return true;
        }
       //recursion
        int nextRow = row,nextCol = col+1;
        if (col+1 == 9) {
            nextRow = row+1;
            nextCol = 0;
        }
        if (board[row][col]!= 0) {
            return isSudoku(board, nextRow, nextCol);
        }
       for(int digit = 1;digit<=9;digit++){
        if (isSafe(board,row,col,digit)) {
            board[row][col] = digit;
            if(isSudoku(board, nextRow, nextCol)){
                return true;
            }
            board[row][col] = 0;
        }
       }
       return false;
    }

    public static void main(String[] args) {
        int board [][]= {
           {5,3,0,0,7,0,0,0,0},
           {6,0,0,1,9,5,0,0,0},
           {0,9,8,0,0,0,0,6,0},
           {8,0,0,0,6,0,0,0,3},
           {4,0,0,8,0,3,0,0,1},
           {7,0,0,0,2,0,0,0,6},
           {0,6,0,0,0,0,2,8,0},
           {0,0,0,0,0,0,0,0,0},
           {0,0,0,0,8,0,0,7,9}
        };
        if(isSudoku(board,0,0)){

        for(int i = 0;i<board.length;i++){
            for (int j = 0; j <board.length; j++) {
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }else{
        System.out.println("Solution does not exists");
    }
    }
}