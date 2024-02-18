import java.util.*;

public class SortString {
    public static void main(String[] args) {
        String s = "sourabh";

        // approach 1
        char[] arr = s.toCharArray();
        char temp;
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr);

        // approach 2 using sort method
        char[] arr2 = s.toCharArray();
        Arrays.sort(arr2);
        System.out.println(arr2);
    }   
}