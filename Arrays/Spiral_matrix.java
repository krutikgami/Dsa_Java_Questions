package Arrays;
// class Spiral_matrix {
//     public static void Sp_matrix(int matrix[][]){
//         int start = 0;
//         int right = matrix.length-1;
//         int end = matrix.length-1;
//         int left = matrix.length-1;
//         int n = matrix.length-1;
//         while (n>=start) {
            
//         for (int i = start; i <n; i++) {
//             System.out.print(matrix[start][i]+" ");
//         }
//         for (int i = start; i<right ; i++) {
//             System.out.print(matrix[i][right]+" ");
//         }
//         for (int i = end; i > start; i--) {
//             System.out.print(matrix[end][i]+" ");
//         }
//         for (int i = left; i > start ; i--) {
//             System.out.print(matrix[i][start]+" ");
//         }
//         start++;
//         end--;
//         left--;
//         right--;
//         n--;
//     }

//     }
//     public static void main(String[] args) {
//         int matrix [] [] ={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
//         Sp_matrix(matrix);
//     }
// }

class Spiral_matrix {
    public static void Sp_matrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
    int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12} };
        Sp_matrix(matrix);
    }
}

