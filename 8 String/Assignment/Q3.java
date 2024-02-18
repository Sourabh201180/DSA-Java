/* 1047. Remove All Adjacent Duplicates In String */

class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();

        for(final char c : s.toCharArray()) {
            final int n = sb.length();

            if(n>0 && sb.charAt(n - 1) == c) {
                sb.deleteCharAt(n - 1);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        String str = "abbaca";
        System.out.println(s.removeDuplicates(str));
    }
}