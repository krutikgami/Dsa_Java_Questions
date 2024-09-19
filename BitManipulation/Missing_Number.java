package BitManipulation;

public class Missing_Number {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i=1;i<=n;i++){
            ans = ans ^ i;
        }
        for(int j=0;j<nums.length;j++){
            ans = ans ^ nums[j];
        }

        return ans;
    }
    public static void main(String[] args) {
        int nums [] = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
}
