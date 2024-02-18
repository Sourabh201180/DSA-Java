import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        System.out.println(Arrays.toString(s.searchRange(nums, target)));
    }

    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};

        if(nums.length == 0) {
            return res;
        }
        
        boolean flag = false;

        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                flag = true;
                if(count == 0) {
                    res[0] = i;
                    res[1] = i;
                }
                if(count == 1) {
                    res[1] = i;
                    break;
                }
                count++;
            }
        }

        if(!flag) {
            return res;
        }
 
        return res;
    }
}