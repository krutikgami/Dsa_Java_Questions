package Arrays;

class remove_element {
    public static int removeElement(int[] nums, int val) {
        int j =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int nums [] = {3,3,3,3,3};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }
}
