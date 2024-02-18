/* 
    i/p -> {1, 2, 3, 1, 2, 5}
    o/p -> {1, 2, 3, 5}
*/


/*
import java.util.LinkedHashSet;
import java.util.Set;

class A {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 3, 5};

        System.out.println(removeDuplicate(arr));
    }

    public static Set<Integer> removeDuplicate(int[] arr) {
        Set<Integer> set = new LinkedHashSet<Integer>();

        for(int i : arr) {
            set.add(i);
        }

        return set;
    }
}
*/

class A {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 3, 2, 3, 1, 2, 5};

        for(int i=0; i<arr.length; i++) {
            count(arr, i, arr.length);
        }
    }

    public static void count(int[] arr, int i, int n) {
        int count = 0;
        // if(i == 0) {    
        //     count = 0;
        // }             

        for(int j=0; j<i; j++) {
            if(arr[i] == arr[j]) {
                count++;
            }
        }

        if(count == 0) {
            System.out.println(arr[i]);
        }
    }
}