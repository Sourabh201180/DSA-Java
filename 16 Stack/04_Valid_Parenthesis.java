import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        // String s = "{[()]}";
        // String s = "{[((])]}";
        String s = "()[]{}";

        System.out.println(isValidParenthesis(s));
    }
    public static boolean isValidParenthesis(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {    // if none of them executes just return false
                return false;
            }
        }

        return stack.isEmpty();
    }
}