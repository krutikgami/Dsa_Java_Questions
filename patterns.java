
public class patterns {

// 5.hollow rectangle pattern code

    // public static void hollow_rect(int totrows,int totcols){
    //     for(int i =1;i<=totrows;i++){
    //         for(int j = 1;j<=totcols;j++){
    //             if (i==1 || i==totrows || j==1 || j==totcols) {
    //                 System.out.print("*"+" ");
    //             }else{
    //                 System.out.print("  ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    //6. inverted and rotated half pyramid -> uses matrix to solve

        // public static void inverted_pyramid(int n){
        //     for(int i=1;i<=n;i++){
        //         for(int j=1;j<=n-i;j++){
        //             System.out.print(" ");
        //         }
        //         for(int j=1;j<=i;j++){
        //             System.out.print("*");
        //         } 

        //         System.out.println();
        //     }
            
        // }

    //7. inverted half pyramid with numers

    // public static void inverted_numbers(int n){
    //     for (int i = 1; i <=n; i++) {
    //         for(int j=1;j<=n-i+1;j++){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }

    //8. Flyod's Triangle
    
    //  public static void floyd_triangle(int n){
    //     int count =1;
    //     for (int i = 1; i <=n; i++) {
    //         for(int j=1;j<=i;j++){
    //             System.out.print(count+" ");
    //             count++;
    //         }
    //         System.out.println();
    //     }
    // }
    // 9. Triangle pattern(0-1)
          // public static void traingle(int n){
          //   for (int i=1;i<=n;i++){
          //     for(int j=1;j<=i;j++){
          //       if((i+j)%2==0){
          //         System.out.print("1");
          //       }else{
          //         System.out.print("0");
          //       }
          //     }
          //     System.out.println();
          //   }
          // }

        // 10. butterfly pattern
         
        public static void butterfly(int n) {
            for (int i=1;i<=n; i++) {
              for(int j=1;j<=i;j++){
                System.out.print("*");
              }
              for(int j=1;j<=(n-i)*2;j++){
                System.out.print(" ");
              }
              for(int j=1;j<=i;j++){
                System.out.print("*");
              }
              System.out.println("");
            }
        }
      
    public static void main(String[] args) {
        /*1.
           *
           **
           ***
           ****
         */
        // for(int line =1;line<=4;line++){
        //     for(int star =1;star<=line;star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /*2.
            ****
            ***
            **
            *
         */
        // for(int line=1;line<=4;line++)
        // {
        //     for(int star=1;star<=4-line+1;star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
         /*3.
           1
           12
           123
           1234
         */
        // for(int line =1;line<=4;line++){
        //     for(int number =1;number<=line;number++){
        //         System.out.print(number);
        //     }
        //     System.out.println();
        // }

        /*4.
           A
           BB
           CCC
           DDDD
         */
        // char ch = 'A';
        // for(int i =1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(ch);   
        //     }
        //     ch++;
        //     System.out.println("");
        // }

        /*5. hollow rectangle -> visualize like a matrix to solve the problem
         *****
         *   *
         *   *
         *****
         */
        // hollow_rect(4, 5);

        /*6. inverted and rotated half pyramid -> uses matrix to solve
             *
            ** 
           *** 
          **** 
         */
            // inverted_pyramid(7);

        /*7. inverted half pyramid with numers
         12345
         1234
         123
         12
         1
         */
            // inverted_numbers(5);

        /*8. Flyod's Triangle
         1
         2 3
         4 5 6
         7 8 9 10
         */
        // floyd_triangle(5);

        /*9. Triangle pattern(0-1)
         1
         0 1
         1 0 1
         0 1 0 1
         */
        // traingle(4);

        /*10. butterfly pattern
         *      *
         **    **
         ***  ***
         ********
         */

         butterfly(4);
    }
}
