package Arrays;
public class Diagonal_sum {
    public static int diagonalSum(int[][] mat) {
        int sum =0;
        for (int i = 0; i < mat.length; i++) {
            //primary diagonal 
            sum += mat[i][i];
            //secondary diagonal
            if (i!= mat.length-1-i)
                sum += mat[i][mat.length-i-1];
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(matrix));
    }
}
