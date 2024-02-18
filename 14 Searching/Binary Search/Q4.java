/* 
    Q. find first and last position of element in sorted array.
    ex- [5, 7, 7, 8, 8, 10]     target =  8
            => [3, 4]
        [5, 7, 7, 8, 8, 10]     target =  6
            =>  [-1, -1]
*/

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 9, 10};
        int target = 8;
        // int target = 9;
        // int target = 6;

        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    // return the index of searched element, if doesn't exist then return -1
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        // check for first occurence if target first
        ans[0] = search(nums, target, true);
        if(ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }

        return ans;
    }

    // this function just returns the index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            // find middle element
            // int mid = (start + end) / 2;    // might be possible that the start and end were out of range of integer
            int mid = start + (end - start)/2;

            if(target < nums[mid]) {
                end = mid - 1;
            } else if(target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                // it might be possible that more target elements were their before and after the middle element so, if for first occurence perform binary search in the left sub array
                ans = mid;
                if(findStartIndex == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}