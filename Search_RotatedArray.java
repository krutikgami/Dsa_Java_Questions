class Search_RotatedArray {
    public static int search(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            }
        return -1;
    }
    public static void main(String[] args) {
        int [] nums  = {2,2,5,7,8};
        int target = 1;
        System.out.println(search(nums, target));
    }

}