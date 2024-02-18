public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String s = " so ur a b h";

        System.out.println(s.trim());

        // approach 1
        String plainStr = s.replaceAll(" ", "");
        System.out.println(plainStr);
    }   
}