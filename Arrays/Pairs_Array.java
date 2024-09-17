package Arrays;

public class Pairs_Array {
    public static void pairs(int [] nums){
        int total = 0 ;
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                System.out.print("("+curr+","+nums[j]+")");
                total++;
            }
            System.out.println();
            
        }
        System.out.print("The total pair is: "+total);
    }
    public static void main(String[] args) {
        int nums [] = {2,3,4,5,6};
        pairs(nums);       
    }
}
