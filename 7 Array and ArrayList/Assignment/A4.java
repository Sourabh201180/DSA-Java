// Richest Customer wealth

import java.util.ArrayList;
import java.util.Collections;

class A {
    public static void main(String[] args) {
        // int[][] arr = {{1, 2, 3}, {3, 2, 1}};
        int[][] arr = {{1, 5}, {7, 3}, {3, 5}};
        
        int[] tot = new int[arr.length];

        for(int i=0; i<arr.length; i++) {
            int sum = 0;
            for(int j=0; j<arr[i].length; j++) {
                sum += arr[i][j];
            }
            tot[i] = sum;
        }
        
        int max = tot[0];
        
        for(int i=1; i<tot.length; i++) {
            if(max < tot[i]) {
                max = tot[i];
            }
        }

        System.out.println(max);
    }
} 

// another approach using collections
class B {
    public static void main(String[] args) {
        // int[][] arr = {{1, 2, 3}, {3, 2, 1}};
        int[][] arr = {{1, 5}, {7, 3}, {3, 5}};

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<arr.length; i++) {
            int sum = 0;
            for(int j=0; j<arr[i].length; j++) {
                sum += arr[i][j];
            }
            list.add(sum);
        }

        System.out.println(Collections.max(list));     // may be this type of method, check it ones
        
        Collections.sort(list);
        System.out.println(list.get(list.size()-1)); 
    }
}