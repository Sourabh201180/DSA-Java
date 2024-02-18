/* 
    1. Two Sum

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]

    Input: nums = [3,2,4], target = 6
    Output: [2, 4]

    Input: nums = [3,3], target = 6
    Output: [0,1]
*/

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[]{-1, -1};

        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i]+nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }

        return arr;
    }
}