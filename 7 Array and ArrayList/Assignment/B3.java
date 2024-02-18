// 4. Median of Two Sorted Arrays
/* 
    Input: nums1 = [1,3], nums2 = [2]
    Output: 2.00000
    Explanation: merged array = [1,2,3] and median is 2.


    Input: nums1 = [1,2], nums2 = [3,4]
    Output: 2.50000
    Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5
*/

import java.util.Arrays;

class A {
    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};

        int[] res = merge(arr1, arr2);

        int sum = 0;
        for(int i=0; i<res.length; i++) {
            sum += res[i];
        }

        System.out.println((float)sum/res.length);
    }

    public static int median(int[] arr) {
        int res = 0;

        // some code
        // some code
        // some code
        // some code

        return res;
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<arr1.length && j<arr2.length) {
            if(arr1[i] < arr2[j]) {
                res[k] = arr1[i];
                i++;
            } else {
                res[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i<arr1.length) {
            res[k] = arr1[i];
            i++;
            k++;
        }

        while(j<arr2.length) {
            res[k] = arr2[j];
            j++;
            k++;
        }

        return res;
    }
}