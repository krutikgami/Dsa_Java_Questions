package Arrays;

public class Single_Element {
    
        public static int singleNumber(int[] nums) {
            int j =0;
            for (int i = 0; i < nums.length; i++) {
                j = j ^ nums[i];
            }
            return j;
        }
    
        public static void main(String[] args) {
            int arr [] ={2,2,1};
            System.out.println(singleNumber(arr));
        }
}
