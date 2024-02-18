// Shuffle the array

import java.util.Arrays;

class A {
    public static void main(String[] args) {
        // int[] arr = {2, 5, 1, 3, 4, 7};
        int[] arr = {1, 2, 3, 4, 4, 3, 2, 1};

        int[] res = new int[arr.length];

        for(int i=0,j=0; i<arr.length; i+=2,j++) {
            res[i] = arr[j];
            res[i+1] = arr[j+arr.length/2];
        }

        for(int i=0; i<res.length; i++) {
            System.out.print(res[i] + "  ");
        }

        // enhance for loop
        // for(int i : res) {
        //     System.out.print(i+ " ");
        // }

        System.out.println(Arrays.toString(res));
    }
}