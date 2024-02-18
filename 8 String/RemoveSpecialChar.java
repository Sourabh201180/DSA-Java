/* 
    wap to remove all special characters from the given string
*/

public class RemoveSpecialChar {
    public static void main(String[] args) {
        String s = "so@#u$@r#$(a)bh";

        // approach 1 - replaceAll() method of string class
        String plainStr = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.print(plainStr);

        // approach 2 - 
        for(int i=0; i<s.length(); i++) {

        }
    }
}