/* 
    Q. find the ceiling of the given no.
    sol: ceiling => smallest element which is greater than or equal to the target element.
        when condition is violated than ans will lies outside the range.
        // ans lies at start i.e ( start = end + 1)

        arr = [2, 3, 5, 9, 14, 16, 18]

        target = 14
        ceiling(arr, target=14) => 14
        target = 15
        ceiling(arr, target=15) => 16
        target = 4
        ceiling(arr, target=4)  => 5
        target = 9
        ceiling(arr, target=9)  => 9 
*/

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {-12, -5, 0, 2, 5, 9, 11, 15, 18, 33, 45, 49, 63, 99, 103};
        // int target = 45;
        // int target = 47;
        int target = 104;    // out of range condition it will return -1...    

        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    // return the index: smallest no >= target
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // but, what if the target is greater than the greatest no. in an array 
        // out of range condition it will return -1...
        if(target > arr[end]) {
            return -1;
        }

        while(start <= end) {
            // find middle element
            // int mid = (start + end) / 2;    
            // might be possible that the start and end were out of range of integer
            int mid = start + (end - start)/2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        
        // if the target is not in the array than simply returns start element i.e the greatest one
        return start;
    }    
}