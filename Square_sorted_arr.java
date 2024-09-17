public class Square_sorted_arr {
        public static int[] sortedSquares(int[] nums) {
            int sq;
            for(int i=0;i<nums.length;i++){
                sq = nums[i] * nums[i];
                return new int[]{sq};
            }
            return new int[]{};
        }
        public static void main(String [] args){
            int nums [] = {-4,-1,0,3,10};
            int arr [] = sortedSquares(nums);
            System.out.println(arr);
        }
}
