import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q5 {
    public static void main(String[] args) {
        Q5 q = new Q5();

        // int[][] nums1 = {{1,2},{2,3},{4,5}};
        // int[][] nums2 = {{1,4},{3,2},{4,1}};
        // // {{1, 6}, {2, 3}, {3, 2}, {4, 6}}

        int[][] nums1 = {{2,4}, {3,6}, {5,5}};
        int[][] nums2 = {{1,3}, {4,3}};
        // [[1,3], [2,4], [3,6], [4,3], [5,5]]

        System.out.println(q.mergeArrays(nums1, nums2));
    }

    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        int i = 0;
        int j = 0;

        while(i<nums1.length && j<nums2.length) {
            ArrayList<Integer> subList = new ArrayList<>();

            if(nums1[i][0] == nums2[j][0]) {
                subList.add(nums1[i][0]);
                subList.add(nums1[i][1] + nums2[j][1]);
                i++;
                j++;
            } else if(nums1[i][0] < nums2[j][0]) {
                subList.add(nums1[i][0]);
                subList.add(nums1[i][1]);
                i++;
            } else {
                subList.add(nums2[j][0]);
                subList.add(nums2[j][1]);
                j++;
            }

            list.add(subList);
        }
        
        while(i<nums1.length) {
            ArrayList<Integer> subList = new ArrayList<>();
            subList.add(nums1[i][0]);
            subList.add(nums1[i][1]);
            i++;
            list.add(subList);
        }
        
        while(j<nums2.length) {
            ArrayList<Integer> subList = new ArrayList<>();
            subList.add(nums2[j][0]);
            subList.add(nums2[j][1]);
            j++;
            list.add(subList);
        }


        int[][] res = new int[list.size()][2];

        for(int ind=0; ind<list.size(); ind++) {
            ArrayList<Integer> li = list.get(ind);
            res[ind][0] = li.get(0);
            res[ind][1] = li.get(1);
        }

        return res;
    }
}