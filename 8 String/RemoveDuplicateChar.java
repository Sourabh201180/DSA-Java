import java.util.*;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String s = "soursrabhhso";

        // approach 1 java 8
        StringBuilder sb = new StringBuilder();
        s.chars().distinct().forEach(c -> sb.append((char)c));
        System.out.println(sb);
        
        // approach 2 indexOf()
        StringBuilder sb2 = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            int ind = s.indexOf(ch, i+1);
            if(ind == -1) {
                sb2.append(ch);
            }
        }
        System.out.println(sb2);
        
        // approach 3 charArray()
        char[] arr = s.toCharArray();
        StringBuilder sb3 = new StringBuilder();
        for(int i=0; i<arr.length; i++) {
            boolean repeated = false;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    repeated = true;
                    break;
                }
            }
            if(!repeated) {
                sb3.append(arr[i]);
            }
        }
        System.out.println(sb3);

        // approach 4 set interface
        StringBuilder sb4 = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();
        for(int i=0; i<s.length(); i++) {
            set.add(s.charAt(i));
        }
        for(Character c : set) {
            sb4.append(c);
        }
        System.out.println(sb4);
    }   
}