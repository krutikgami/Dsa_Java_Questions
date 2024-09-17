public class Two_sum {
    public static int[] two_sum(int [] arr,int target){
        for(int i =0;i<arr.length;i++){
            for(int j =1;j<=arr.length;j++){
             int sum = arr[i] + arr[j];
             if (target == sum) {
               return new int[]{i,j};
             }

            }
        } 
        return new int[]{};
    }
    public static void main(String[] args) {
        int arr [] = {1,2,4,5,6};
        int target = 6;
        int [] ar=  two_sum(arr,target);
        System.out.println("["+ar[0]+","+ar[1]+"]");
        
    }
}