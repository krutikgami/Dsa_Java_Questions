package Arrays;

public class Sub_Array {
    public static void sub_arr(int arr []){
        int tp = 0;
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int st = i;
            for (int j = i; j < arr.length; j++) {
                int lt = j;
               sum = 0;
                for (int k = st; k <= lt; k++) {
                    sum+=arr[k];
                    System.out.print(arr[k]+" ");
                   
                }
                if (maxsum<sum) {
                    maxsum =sum;
                }
                System.out.print("\nThe sum : "+sum);
                tp++;
                System.out.println();
            }
            System.out.println();
            
        }
        System.out.print("The total sub Array is : "+tp);
        System.out.println("\nThe max sum is: "+maxsum);
    } 
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        sub_arr(arr);
    }
}
