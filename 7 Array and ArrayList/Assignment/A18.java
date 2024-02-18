/*  
    989. Add to Array-Form of Integer

    Input: num = [1,2,0,0], k = 34
    Output: [1,2,3,4]
    Explanation: 1200 + 34 = 1234
    

    Input: num = [2,7,4], k = 181
    Output: [4,5,5]
    Explanation: 274 + 181 = 455
    

    Input: num = [2,1,5], k = 806
    Output: [1,0,2,1]
    Explanation: 215 + 806 = 1021
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int[] num = {1, 2, 0, 0};
        int k = 34;

        System.out.println(addToArrayForm(num, k));
    }
    
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;

        for(int i : num) {
            sum = sum*10 + i;
            System.out.println(sum);
        }

        sum += k;

        while(sum > 0) {
            list.add(sum%10);
            sum /= 10;
        }

        Collections.reverse(list);

        return list;

        /* 
            // some conditions were not workin properly so for those conditions use this solution
            
            List<Integer> list = new ArrayList<>();
            int n = num.length;
            int carry = 0;

            for(int i=n-1; i>=0; i--) {
                num[i] += k%10 + carry;
                list.add(num[i]%10);
                carry = num[i]/10;
                k/=10;
            }
            k += carry;

            while(k > 0) {
                list.add(k%10);
                k /= 10;
            }

            Collections.reverse(list);

            return list;
        */
    }
}