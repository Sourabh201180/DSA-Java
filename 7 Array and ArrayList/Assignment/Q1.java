import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        
        System.out.println(Arrays.toString(s1.nextGreaterElement(nums1, nums2)));
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];

        for(int i=0; i<nums1.length; i++) {
            for(int j=0; j<nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    int max = 0;
                    for(int ind=j; ind<nums2.length; ind++) {
                        if(nums1[i] < nums2[ind]) {
                            max = nums2[ind];
                            break;
                        }
                    }
                    if(max == 0) {
                        res[i] = -1;
                    } else {
                        res[i] = max;
                    }
                    break;
                }
            }
        }

        return res;
    }
}