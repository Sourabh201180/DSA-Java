// 169. majority element

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

class Solution {
    public int majorityElement(int[] nums) {
        LinkedHashMap<Integer, Integer> hmap = new LinkedHashMap<>();

        for(int i=0; i<nums.length; i++) {
            if(hmap.containsKey(nums[i])) {
                int count = hmap.get(nums[i]);
                hmap.put(nums[i], count+1);
            } else {
                hmap.put(nums[i], 1);
            }
        }

        Set<Integer> set = hmap.keySet();

        int maxValue = Collections.max(hmap.values());

        for(Integer elem : set) {
            if(hmap.get(elem) == maxValue) {
                return elem;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = {2, 2, 1, 1, 3, 2};
        
        System.out.println(s.majorityElement(nums));
    }
}