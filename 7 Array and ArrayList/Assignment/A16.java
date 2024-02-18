/* 
    1295. Find Numbers with Even Number of Digits

    {12, 345, 2, 6, 7896}   =>  2
    {555, 901, 482, 1771}   =>  1
*/

class Solution {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};

        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;

        for(int i : nums) {
            int c = 0;
            while(i>0) {
                i /= 10;
                c++;
            }
            if(c%2 == 0) {
                count++;
            }
        }

        return count;
    }
}