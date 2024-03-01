import java.util.HashMap;
import java.util.LinkedHashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");
        if(word.length != pattern.length()) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();

        for(int i=0; i<word.length; i++) {
            char c = pattern.charAt(i);

            if(map.containsKey(c)) {
                if(!map.get(c).equals(word[i])) {
                    return false;
                }
            } else {
                if(map.containsValue(word[i])) {
                    return false;
                }
                map.put(c, word[i]);
            }
        }

        return true;
    }

    /*
    public boolean wordPattern(String pattern, String s) {
        char[] arr = pattern.toCharArray();
        String[] str = s.split(" ");
        LinkedHashMap<Character, String> hSet = new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<arr.length; i++) {
            if(!hSet.containsKey(arr[i])) {
                hSet.put(arr[i], str[i]);
                System.out.println(arr[i] + " -> " + str[i]);
            }
        }

        for(int i=0; i<arr.length; i++) {
            sb.append(hSet.get(arr[i]));
            sb.append(" ");
        }

        return s.equals(sb.toString().trim()) ? true : false;
    }
    */

    public static void main(String[] args) {
        Solution s = new Solution();

        String pattern = "abba"; 
        String str = "dog cat cat dog";

        System.out.println(s.wordPattern(pattern, str));
    }
}