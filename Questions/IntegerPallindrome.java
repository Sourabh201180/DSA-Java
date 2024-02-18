import java.util.ArrayList;

public class IntegerPallindrome {
    public static void main(String[] args) {
        int n = 123313321;

        IntegerPallindrome ip = new IntegerPallindrome();
        System.out.println(ip.checkPallindrome(n));
    }

    public boolean checkPallindrome(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        while(n>0) {
            list.add(n%10);
            n/=10;
        }

        for(int i=0; i<list.size()/2; i++) {
            if(list.get(i) != list.get(list.size()-i-1)) {
                return false;
            }
        }

        return true;
    }

    public boolean checkPallindromeUsingStringReverse(int n) {
        String s = String.valueOf(n);

        for(int i=0; i<s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-i-1)) {
                return false;
            }
        }

        return true;
    }
}