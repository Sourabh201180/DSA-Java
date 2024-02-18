import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1,2,3,4};

        System.out.println(Arrays.toString(s.productExceptSelf(nums)));
    }
    
    public int[] productExceptSelf(int[] nums) {     
        if(nums.length == 0) {
            return nums;
        }
        
        int[] ans = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            int res = 1;
            for(int j=0; j<nums.length; j++) {
                if(i == j) {
                    
                } else {
                    res = res * nums[j];
                    System.out.print(res + " ");
                }
            }
            System.out.println();
            ans[i] = res;
        }

        return ans;
    }
}