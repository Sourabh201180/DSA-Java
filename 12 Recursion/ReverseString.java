/* 
    Input: s = ["h","e","l","l","o"]
    Output: ["o","l","l","e","h"]
*/

public class ReverseString {
    public static void main(String[] args) {
        char[] str = {'h', 'e', 'l', 'l', 'o'};
        int index = 0;

        stringRevRec(str, index);
    }

    public static void stringRevRec(char[] str, int ind) {
        if(ind == str.length) {
            return;
        }

        char temp = str[ind];
        stringRevRec(str, ind+1);
        
        System.out.print(temp);
    }
}