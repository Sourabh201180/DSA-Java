/* 
    # Find All the numbers disappeared in an array:-

    i/p=>                   o/p=>  
        3                       [5, 6]
        4,3,2,7,8,2,3,1
    
    tips:
        if range => [0, N]
            every element will be at index = value
        if range => [1, N] 
            every element will be at index = value - 1
*/

import java.util.*;
  
class A {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(getMissingNumber(arr));
    }   

    static List<Integer> getMissingNumber(int[] arr) {
        int i=0;
        while(i<arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // find missing nos.
        List<Integer> ls = new ArrayList<>();
        for(int ind=0; ind<arr.length; ind++) {
            if(arr[ind] != ind+1) {
                ls.add(ind+1);
            }
        }

        return ls;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}