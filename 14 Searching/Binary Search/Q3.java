/* 
    Q. find the smallest letter greater than target?
    Note: letters were wrap around, i.e return the smallest character in the array that is larger than target.

    sol:    1. exact same approach as the ceiling of a no.
            2. ignore the target, i.e what we are looking for char.
            3. arr = ['c', 'd', 'f', 'j']
                target = 'j' or target = 'k'
                    return 'c'

            condition violated: start = end + 1;  => length of array => N
*/

public class Q3 {
    public static void main(String[] args) {
        char[] letters = {'c', 'd', 'g', 'i', 'j'};
        // char target = 'd';
        // char target = 'j';
        char target = 's';

        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
    }   

    // return the index: smallest no >= target
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            // find middle element
            // int mid = (start + end) / 2;    // might be possible that the start and end were out of range of integer
            int mid = start + (end - start)/2;

            // System.out.println(start +" ~~ " + end);     // just to know how it works
            if(target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // just to know how it works
        // System.out.println(start + " % " + letters.length + " = " + start % letters.length);
        return letters[start % letters.length];
    }    
}