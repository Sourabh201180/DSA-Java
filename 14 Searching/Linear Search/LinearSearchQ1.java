/* 
    Q. find the numbers having even no. of digits count.
*/

public class LinearSearchQ1 {
    public static void main(String[] args) {
        int[] nums = {18, 127, 9, 1764, 98, 1, 45, 18, 63, 12345, 11};     // unsorted array
        // output would be 7

        int ans = findNumbers(nums);
        System.out.println(ans);

        System.out.println(digits2(45678));    // find the no. of digits
    }
    
    static int findNumbers(int[] nums) {
        int count = 0;

        for(int num : nums) {
            if(even(num)) {
                count++;
            }
        }

        return count;
    }

    // function to check whether a number having even no. of digits or not
    static boolean even(int num) {
        int numberOfdigits = digits(num);
        // if(numberOfdigits % 2 == 0) {
        //     return true;
        // }

        return numberOfdigits%2 == 0;
    }

    // optimized way of finding the number of digits
    static int digits2(int num) {
        if(num < 0) {
            num = num * -1;
        }
        
        return (int)(Math.log10(num)) + 1;
    }

    // function to check the no. of digits a no. contains
    static int digits(int num) {
        if(num < 0) {       // for negative number
            num = num * -1;
        }

        if(num == 0) {
            return 1;
        }

        int count = 0;
        while(num > 0) {
            count++;
            num = num/10;
        }

        return count;
    }
}