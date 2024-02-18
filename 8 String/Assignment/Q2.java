import java.util.TreeMap;

class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");

        TreeMap<Integer, String> map = new TreeMap<>();
        StringBuilder res = new StringBuilder();

        for(int i=0; i<arr.length; i++) {
            StringBuilder sb = new StringBuilder();
            String word = arr[i];
            int lastIndex = word.length();

            for(int j=0; j<lastIndex-1; j++) {
                sb.append(word.charAt(j));
            }
            sb.append(" ");

            int num = (int)word.charAt(lastIndex-1) - 48;
            map.put(num, sb.toString());
        }

        for(int i=1; i<arr.length+1; i++) {
            res.append(map.get(i));
        }

        return res.toString().trim();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "Myself2 Me1 I4 and3";
        System.out.println(s.sortSentence(str));
    }
}