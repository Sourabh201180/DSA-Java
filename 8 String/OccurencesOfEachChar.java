import java.util.HashMap;

public class OccurencesOfEachChar {
    public static void main(String[] args) {
        String str = "Hello";

        HashMap<Character, Integer> hm = new HashMap<>();
        char[] arr = str.toCharArray();

        for(int i=0; i<arr.length; i++) {
            if(hm.containsKey(arr[i])) {
                int count = hm.get(arr[i]);
                hm.put(arr[i], ++count);
            } else {
                hm.put(arr[i], 1);
            }
        }

        System.out.println(hm);
    }
}