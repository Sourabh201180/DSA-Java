/* 
    LXXX -> 80
    DVI  -> 506
*/

import java.util.LinkedHashMap;

public class RomanToInt {
    public static void main(String[] args) {
        // String rom = "LXXX";
        // String rom = "DVI";
        // String rom = "XVI";
        // String rom = "CMXCIX";
        // String rom = "MMIVI";
        String rom = "VVV";
        // String rom = "IIIV";
        // String rom = "";

        // int num = romanToInt(rom);
        int num = convertRomanToInt(rom);
        System.out.println(num);
    }

    static int value(char r) {   
      if (r == 'I')   
        return 1;   
      if (r == 'V')   
        return 5;   
      if (r == 'X')   
        return 10;   
      if (r == 'L')   
        return 50;   
      if (r == 'C')   
        return 100;   
      if (r == 'D')   
        return 500;   
      if (r == 'M')   
        return 1000;   
      return -1;   
    }   

    // function to convert roman to integer
    static int convertRomanToInt(String s) {
        // variable to store the sum
        int total = 0;
        // loop iterate over the string (given roman numeral)
        // getting value from symbol s1[i]
        for (int i = 0; i < s.length(); i++) {
            int s1 = value(s.charAt(i));
            // getting value of symbol s2[i+1]
            if (i + 1 < s.length()) {
                int s2 = value(s.charAt(i + 1));
                // comparing the current character from its right character
                if (s1 >= s2) {
                    // if the value of current character is greater or equal to the next symbol
                    total = total + s1;
                } else {
                    // if the value of the current character is less than the next symbol
                    total = total - s1;
                }
            } else {
                total = total + s1;
            }
        }
        // returns corresponding integer value
        return total;
    }

    public static int romanToInt(String s) {
        int res = 0;

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'I') {
                count++;
            }
        }
        if(count >= 3 && s.length() > count) {
            return res;
        } 
        // if(map.get(s.charAt(0)) == 1 && s.length() <= 2 ) {
        //     return res;
        // }

        for(int i=0; i<s.length(); i++) {
            // System.out.println(s.charAt(i));
            if(i==0) {
                res += map.get(s.charAt(i));
            } else if(map.get(s.charAt(i)) > map.get(s.charAt(i-1))) {
                res += map.get(s.charAt(i)) - 2*map.get(s.charAt(i-1));
            } else {
                res += map.get(s.charAt(i));
            }
        }
        
        return res;
    }
}