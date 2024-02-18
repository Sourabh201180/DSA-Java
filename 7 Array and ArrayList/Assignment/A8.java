// How many numbers are smaller than current number

import java.util.LinkedHashMap;
import java.util.Map;

class A {
    public static void main(String[] args) {
        // int[] arr = {8, 1, 2, 2, 3};
        int[] arr = {6, 5, 4, 8};

        int[] res = new int[arr.length];

        for(int i=0; i<arr.length; i++) {
            int max = arr[i];

            int count = 0;
            for(int j=0; j<arr.length; j++) {
                if(max > arr[j]) {
                    count++;
                }
            }
            
            res[i] = count;
            System.out.println(arr[i] +" -> "+ res[i]);
        }
    }
}

class B {
    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 2, 3};

        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int i : arr) {
            map.put(i, 0);
        }

        for(int i=0; i<map.size(); i++) {
            int val = map.get(i);
            //////////////////////////
            //////////////////////////
            //////////////////////////
            //////////////////////////
            //////////////////////////
            //////////////////////////
            //////////////////////////
            //////////////////////////
            //////////////////////////
            //////////////////////////
            //////////////////////////
        }
    }
}