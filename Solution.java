// class Solution {
//     public int search(int[] nums, int target) {
//         return searchInRotatedSortedArray(nums, target, 0, nums.length - 1);
//     }

//     private int searchInRotatedSortedArray(int[] nums, int target, int si, int ei) {
//         if (si > ei) {
//             return -1;
//         }

//         int mid = si + (ei - si) / 2;

//         if (nums[mid] == target) {
//             return mid;
//         }

//         // Left half is sorted
//         if (nums[si] <= nums[mid]) {
//             if (nums[si] <= target && target <= nums[mid]) {
//                 return searchInRotatedSortedArray(nums, target, si, mid - 1);
//             } else {
//                 return searchInRotatedSortedArray(nums, target, mid + 1, ei);
//             }
//         } 
//         // Right half is sorted
//         else {
//             if (nums[mid] <= target && target <= nums[ei]) {
//                 return searchInRotatedSortedArray(nums, target, mid + 1, ei);
//             } else {
//                 return searchInRotatedSortedArray(nums, target, si, mid - 1);
//             }
//         }
//     }
// }


// class Solution {
//     public boolean search(int[] nums, int target) {
//         return searchInRotatedSortedArray(nums, target, 0, nums.length - 1);
//     }

//     private boolean searchInRotatedSortedArray(int[] nums, int target, int si, int ei) {
//         if (si > ei) {
//             return false;
//         }

//         int mid = si + (ei - si) / 2;

//         if (nums[mid] == target) {
//             return true;
//         }

//         // Left half is sorted
//         if (nums[si] <= nums[mid]) {
//             if (nums[si] <= target && target <= nums[mid]) {
//                 return searchInRotatedSortedArray(nums, target, si, mid - 1);
//             } else {
//                 return searchInRotatedSortedArray(nums, target, mid + 1, ei);
//             }
//         } 
//         // Right half is sorted
//         else {
//             if (nums[mid] <= target && target <= nums[ei]) {
//                 return searchInRotatedSortedArray(nums, target, mid + 1, ei);
//             } else {
//                 return searchInRotatedSortedArray(nums, target, si, mid - 1);
//             }
//         }
//     }
// }


// return the majority element for the trial in leetcode medium question

import java.util.HashSet;
import java.util.List;

class Solution {
    public static  List<Integer> majorityElement(int[] nums) {

        int times = nums.length/3;

        HashSet <Integer> ans = new HashSet<>();
        if (nums.length == 1) {
            return List.of(nums[0]);
        }
            
        for (int i = 0; i < nums.length; i++) {
            int count =0;
          for(int j = 0; j < nums.length; j++){  
            if (nums[i] == nums[j]) {
                count++;
            }
          }
          if (count>times) {
            ans.add(nums[i]);
          }

        }

        if(ans.size() == 0){
            return List.of();
        }else{
            return List.of(ans.toArray(new Integer[0]));
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println(majorityElement(arr));
    }
}
