/*
    1678. Goal Parser Interpretation

    Input: command = "G()(al)"
    Output: "Goal"
        Explanation: The Goal Parser interprets the command as follows:
        G -> G
        () -> o
        (al) -> al
        The final concatenated result is "Goal".

    Input: command = "G()()()()(al)"
    Output: "Gooooal"

    Input: command = "(al)G(al)()()G"
    Output: "alGalooG"
*/

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        String command = "G()(al)";

        System.out.println(s.interpret(command));
    }

    public String interpret(String command) {
        command = command.replace("()", "o");
        command = command.replace("(", "");
        command = command.replace(")", "");

        return command;
    }
}