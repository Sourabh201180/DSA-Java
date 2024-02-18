/*
    1528. Shuffle String

    Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
    Output: "leetcode"
    Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.

    Input: s = "abc", indices = [0,1,2]
    Output: "abc"
    Explanation: After shuffling, each character remains in its position.
*/

class Solution {
    public static void main(String[] args) {
        Solution s1 = new Solution();

        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};

        System.out.println(s1.restoreString(s, indices));
    }

    public String restoreString(String s, int[] indices) {
        StringBuilder str = new StringBuilder(s);

        for(int i=0; i<s.length(); i++) {
            str.setCharAt(indices[i], s.charAt(i));
        }

        return String.valueOf(str);
    }
}