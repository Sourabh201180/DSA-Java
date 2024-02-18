/* 
    46. All Possible Permutations.
*/

////////////////////////////////////
////        Approach 1          ////
////////////////////////////////////

import java.util.ArrayList;
import java.util.List;

class A {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1};

        System.out.println(permutations(nums));
    }

    public static List<List<Integer>> permutations(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> ds = new ArrayList<>();

        boolean[] freq = new boolean[nums.length];

        recurPermute(nums, ds, ans, freq);

        return ans;
    }

    public static void recurPermute(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {
        // breaking condition.
        if(ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0; i<nums.length; i++) {
            if(!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                recurPermute(nums, ds, ans, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }
}

//////////////////////////////////
////        Approach 2        ////
//////////////////////////////////

class B {
    public static void main(String[] args) {
        
    }
}