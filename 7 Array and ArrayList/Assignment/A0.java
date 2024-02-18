import java.util.Arrays;

public class A0 {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5};
        int[] arr = {23, 44, 76, 21};
 
        A0 a = new A0();
        System.out.println(Arrays.toString(a.reverse(arr)));
    }

    public int[] reverse(int[] arr) {
        for(int i=0; i<arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        
        return arr;
    }
}