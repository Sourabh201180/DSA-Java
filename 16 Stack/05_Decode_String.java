// 394. Decode String

// Input: s = "3[a]2[bc]"
// Output: "aaabcbc"

import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        Stack<StringBuilder> st1 = new Stack<>();
        int n = 0;

        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                n = n*10 + (c - '0');
            } else if(c == '[') {
                st.push(n);
                n = 0;
                st1.push(sb);
                sb = new StringBuilder();
            } else if(c == ']') {
                int k = st.pop();
                StringBuilder temp = sb;
                sb = st1.pop();
                while(k-- > 0) {
                    sb.append(temp);
                }
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        
        System.out.println(s.decodeString("3[a]2[bc]"));
    }
}