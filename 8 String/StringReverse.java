/* 
    4 ways of String reverse

    1. using toCharArray() method
    2. using charAt(int ind) method iterative approach
    3. StringBuffer reverse() method
    4. StringBuilder reverse() method
*/

import java.util.Arrays;

public class StringReverse {
    public static void main(String[] args) {
        String s = "reverse this string";

        // approach 1
        /*
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length/2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        System.out.println(String.valueOf(arr));
        System.out.println(Arrays.toString(arr));
        */

        // approach 2
        /*
        for(int i=0; i<s.length(); i++) {
            System.out.print(s.charAt(s.length()-i-1));
        }
        */

        // approach 3
        /*
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.reverse());
        */

        // approach 3
        /*
        StringBuilder sbd = new StringBuilder(s);
        System.out.println(sbd.reverse());
        */

        // approach 5
        // this is not working check this out once
        StringBuilder sbbd = new StringBuilder(s);
        for(int i=0; i<sbbd.length()/2; i++) {
            char temp = sbbd.charAt(i);
            sbbd.setCharAt(i, sbbd.charAt(sbbd.length()-i-1));
            sbbd.setCharAt(sbbd.charAt(sbbd.length()-i-1), temp);
        }
        System.out.println(sbbd);
    }
}