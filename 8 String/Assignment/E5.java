import java.util.Arrays;

public class E5 {
    public static void main(String[] args) {
        String[] arr = {"flower","flow","flight"};

        System.out.println(logestCommonPrefix(arr));
    }

    public static String logestCommonPrefix(String[] arr) {
        StringBuilder sb = new StringBuilder();

        // sort the array
        Arrays.sort(arr);

        // get the first and last strings
        char[] first = arr[0].toCharArray();
        char[] last = arr[arr.length-1].toCharArray();

        for(int i=0; i<first.length; i++) {
            if(first[i] != last[i]) {
                break;
            }
            sb.append(first[i]);
        }

        return sb.toString();
    }
}