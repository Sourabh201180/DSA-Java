public class E6 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.reverseWords("Let's take LeetCode contest"));
    }
}

class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        String[] arr = s.split(" ");

        for(int i=0; i<arr.length; i++) {
            StringBuilder sbr = new StringBuilder(arr[i]);
            sbr.reverse();
            arr[i] = sbr.toString();
            if(i+1 != arr.length) {
                sb.append(arr[i] + " ");
            } else {
                sb.append(arr[i]);
            }
        }

        return sb.toString();
    }
}