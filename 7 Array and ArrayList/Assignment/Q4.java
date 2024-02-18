/* 
    Swapping parity

    Q. find the larget element, that can be created using the parity check
        parity -> adjacent elements are considered as same parity if both of them were even or odd.

        example:-
            input- 5791468
            output - 9751864
                5791468
                7591468
                7951468
                9751468
                9751648
                9751684
                9751864
*/

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        String s = "5791468";

        System.out.println(getLargestElement(s));
    }

    public static String getLargestElement(String s) {
        int n = Integer.parseInt(s);
        int[] arr = new int[s.length()];

        int temp = arr.length-1;
        while(n>0) {
            arr[temp] = n%10;
            n /= 10;
            temp--;
        }

        System.out.println(Arrays.toString(arr));

        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(checkParity(arr[i], arr[j])) {
                    if(arr[i] < arr[j]) {
                        swap(arr, i, j);
                        i=0; 
                        j=i+1;
                    }
                }
            }
        }

        return Arrays.toString(arr);
    }

    public static boolean checkParity(int i, int j) {
        if((i%2 == 0 && j%2 == 0) || (i%2 != 0 && j%2 != 0)) {
            return true;
        }

        return false;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}