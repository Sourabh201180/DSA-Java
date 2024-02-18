/* 
    replace a character with its occurence in given string
    i/p -> opentext
    o/p -> open1ex2
*/

import java.util.*;

public class ReplaceCharWithOccurence {
    public static void main(String[] args) {
        String str = "opentext";
        char replacedChar = 't';

        // check char presented in the string or not
        if(str.indexOf(replacedChar) == -1) {
            System.out.println("given char is not presented in the string!!!");
            System.exit(0);
        }

        char[] arr = str.toCharArray();
        int occ = 1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == replacedChar) {
                arr[i] = String.valueOf(occ).charAt(0);
                occ++;
            }
        }
        System.out.println(arr);
    }
}