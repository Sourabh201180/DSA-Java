/* 
    i/p => flower, florida, flemish
    o/p => fl
*/

import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        String[] str = {"flowerz", "florida", "flemish"};
        int size = str.length;

        ArrayList list = new ArrayList();
        
        for(int i=0; i<size-1; i++) {
            // System.out.println(str[i]);
            // System.out.println(str[i+1]);
            char[] ch1 = str[i].toCharArray();
            char[] ch2 = str[i+1].toCharArray();
            
            int maxSize = 0;
            if(ch1.length > ch2.length) {
                maxSize = ch1.length;
            } else {
                maxSize = ch2.length;
            }

            for(int j=0; j<maxSize; j++) {
                if(ch1[j] == ch2[j]) {
                    list.add(ch1[j]);
                } else {
                    break;
                    // list.add(-1);
                }
                System.out.println(ch1[j] + "~~" + ch2[j]);
            }
        }

        System.out.println(list);
    }
}