import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubStringWithoutRepetition {
    public static void main(String[] args) {
        String str = "abbac";           // bac
        // String str = "abcabcbb";     // abc

        String longestSubStr;
        int len = 0;

        char[] arr = str.toCharArray();
        Map<Character, Integer> hm = new LinkedHashMap<>();

        // for(int i=0; i<arr.length; i++) {
        //     char ch = arr[i];

        //     if(hm.containsKey(ch)) {
        //         i = hm.get(ch);
        //     } else {
        //         hm.put(ch, i);
        //     }
        // }
    }
}