/* 
    Q. Next Permutation

    arr[] = {3, 1, 2}

    possible permutation:-  
            1, 2, 3
            1, 3, 2
            2, 1, 3
            2, 3, 1
           [3, 1, 2]
         => 3, 2, 1

    Approach 1   
        =>  complexity (n! * n)
        step 1: generate all possible permutation in sorted order(Recursion)
        step 2: linear search
        step 3: next Index

    Appoach 2
        => using the inbuild library methods

    Approach 3
        =>  
        step 1: longer prefix match, find the break point
                -> find the dip in the array
        step 2: find >1, but the smallest one, so that you stay close
        step 3: try to place numbers in sorted array
*/

/* 
    Approach Third
*/

import java.util.Arrays;

class A {
    public static void main(String[] args) {
        // int[] arr = {2, 1, 5, 4, 3, 0, 0};
        // int[] arr = {0, 0, 1, 2, 3, 4, 5};
        // int[] arr = {5, 4, 3, 2, 1, 0, 0};
        int[] arr = {5, 4, 0, 2, 1, 4, 0};
        
        System.out.println(Arrays.toString(arr));

        int ind = -1;
        int n = arr.length-1;

        for(int i=n-1; i>=0; i--) {
            if(arr[i] < arr[i+1]) {
                ind = i;
                break;
            }
        }

        if(ind == -1) {
            rev(arr, 0, n);
            System.out.println(Arrays.toString(arr));
            return;
        }

        for(int i=n; i>ind; i--) {
            if(arr[i] > arr[ind]) {
                swap(arr, i, ind);
                break;
            }
        }

        rev(arr, ind+1, n);

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void rev(int[] arr, int s, int e) {
        while(s < e) {
            swap(arr, s++, e--);
        }
    }
}