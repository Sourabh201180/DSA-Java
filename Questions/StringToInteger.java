/*
    8. String to Integer
*/

public class StringToInteger {
    public static void main(String[] args) {
        String s = "words and 987";
        System.out.println(myAtoi(s));
    }
        
    public static int myAtoi(String s) {
        StringBuilder sb = new StringBuilder();

        boolean neg = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 32 || (s.charAt(i) >= 65 && s.charAt(i) <= 91)
                    || (s.charAt(i) >= 97 && s.charAt(i) <= 124)) {
                continue;
            }
            if (s.charAt(i) == '-') {
                neg = true;
            } else if (s.charAt(i) == '+') {
                neg = false;
            } else {
                sb.append(s.charAt(i));
            }
        }

        s = String.valueOf(sb);
        int res = Integer.parseInt(s);

        if(neg) {
            return -res;
        }

        return res;
    }
}