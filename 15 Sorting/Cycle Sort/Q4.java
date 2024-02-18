/* 
    # Find all the duplicate no. in an array:-

    i/p=>                       o/p=>  
        4, 3, 2, 7, 2, 3, 1           2, 3
    
*/

import java.util.*;

class A {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(getDuplicateNumber(arr));
    }   

    static List<Integer> getDuplicateNumber(int[] arr) {
        int i=0;
        while(i<arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ls = new ArrayList<>();
        for(int ind=0; ind<arr.length; ind++) {
            if(arr[ind] != ind+1) {
                ls.add(arr[ind]);
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