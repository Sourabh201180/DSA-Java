import java.util.*;

public class Question {
    // approach 1
    public static void main(String[] args) {
        String s = "hello";

        LinkedHashMap<Character, Integer> hp = new LinkedHashMap<>();

        for(int i=0; i<s.length(); i++) {
            if(hp.containsKey(s.charAt(i))) {  // already 
                hp.put(s.charAt(i), hp.get(s.charAt(i)) + 1);
            } else {                           // first occurence
                hp.put(s.charAt(i), 1);
            }
        }

        System.out.println(hp);
    }


    // approach 2
    /*
    public static void main(String[] args) {
        String s = "hello";
        
        // unique records
        LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
        for(int i=0; i<s.length(); i++) {
            hs.add(s.charAt(i));
        }
        
        Character[] uniqElm = new Character[hs.size()];
        Integer[] count = new Integer[hs.size()];

        int i = 0;
        Iterator<Character> itr = hs.iterator();
        while(itr.hasNext()) {
            uniqElm[i] = itr.next();

            int con = 0;
            for(int j=0; j<s.length(); j++) {
                if(uniqElm[i] == s.charAt(j)) {
                    con++;
                }
            }

            count[i] = con;
            i++;
        }

        for(int j=0; j<uniqElm.length; j++) {
            System.out.println(uniqElm[j] + " - " + count[j]);
        }

    }
    */
}