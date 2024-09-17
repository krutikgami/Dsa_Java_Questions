package Arrays;

public class Kadanes {
     public static void maximum(int arr[]){
        int current_sum =0,max_sum =Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            
            if (max_sum<0 && arr[i]<0) {
                max_sum = Math.max(max_sum, arr[i]);
            }
            current_sum = current_sum + arr[i];
            if(current_sum<0) {
                current_sum = 0;
            }
            max_sum = Math.max(current_sum,max_sum);
        }
        
         System.out.println(max_sum); 
    }
    public static void main(String[] args) {
        int arr [] = {-1,-2,4,-2,3,-2};
       maximum(arr);
    }
}
