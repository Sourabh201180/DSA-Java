/* 
    1668, Maximum Repeating SubString
*/

public class Q1 {
    public static void main(String[] args) {
        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word = "aaaba";

        Q1 q = new Q1();
        System.out.println(q.maxRepeating(sequence, word));
    }

    public int maxRepeating(String sequence, String word) {
        String find = "";

        while(sequence.contains(find)) {
            find += word;
        }

        return (find.length() - word.length()) / word.length();

        // if(sequence.length() == 1 && word.length() == 1) {
        //     if(sequence.equals(word)) {
        //         return 1;
        //     } else {
        //         return 0;
        //     }
        // }

        // String[] arr = sequence.split(word);

        // return arr.length-1;
    }
}