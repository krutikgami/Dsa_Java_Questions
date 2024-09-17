class Search_insert_position {
    public static int searchInsert(int[] nums, int target) {
        int i = 0;
     for( i = 0;i<nums.length;i++){
        if (target==nums[i]) {
            return i;
        }
        else{
           if(target<nums[i]){
            return --i;
           }
           
        }
    }
    return i++;
     
    }
    public static void main(String[] args) {
        int nums [] = {1,2,3,4,5};
        int target = 5;
        searchInsert(nums, target);
    }
}