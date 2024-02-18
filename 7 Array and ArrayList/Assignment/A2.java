// Array Concatenation

import java.util.Arrays;

class A {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 1};
        int[] arr = {1, 3, 2, 1};

        int[] res = new int[2*arr.length];

        for(int i=0; i<arr.length; i++) {
            res[i] = arr[i];
            res[i+arr.length] = arr[i];
        }

        // for(int i : res) {
        //     System.out.println(i);
        // }

        System.out.println("Array " + Arrays.toString(arr));
        System.out.println("Concated Array " + Arrays.toString(res));
    }
}