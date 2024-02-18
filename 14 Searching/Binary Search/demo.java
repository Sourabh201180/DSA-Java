import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        intersection(nums1, nums2);
    }

    public static void intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i : nums1) {
            for(int j : nums2) {
                if(i==j) {
                    list.add(i);
                    break;
                }
            }
        }

        System.out.println(String.valueOf(list));

        // int[] res = (int[])Arrays.toArray(list);
    }
}