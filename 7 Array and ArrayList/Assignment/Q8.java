/* 
    Leetcode 57. Insert Interval

    Example 1:
        Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
        Output: [[1,5],[6,9]]
        Explanation: Because the new interval [2, 5] overlaps with [1, 3].

    Example 2:
        Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
        Output: [[1,2],[3,10],[12,16]]
        Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q7 {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0; i<intervals.length; i++) {
            for(int j=0; j<2; j++) {
                ArrayList<Integer> al = new ArrayList<>();
                if(newInterval[0][1]) {
                    
                } else {
                    list.add(al);
                }
            }
        }

        int[][] res = new int[list.size()][2];
        for(List<Integer> al : list) {
            for(Integer i : al) {
                //
                //
                //
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {4, 8};

        System.out.println(Arrays.toString(insert(intervals, newInterval)));
    }
}