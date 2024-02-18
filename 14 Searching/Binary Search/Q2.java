/* 
    Q. find the floor of the given no.
    sol: floor => greatest element which is less than or equal to the target element.
        when condition is violated than ans must lies outside the range.
        // ans lies at end i.e ( end )

        arr = [2, 3, 5, 9, 14, 16, 18]

        target = 14
        floor(arr, target=14) => 14
        target = 15
        floor(arr, target=15) => 14
        target = 4
        floor(arr, target=4)  => 3
        target = 9
        floor(arr, target=9)  => 9
*/ 

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {-12, -5, 0, 2, 5, 9, 11, 15, 18, 33, 45, 49, 63, 99, 103};
        // int target = 45;
        // int target = 47;
        // int target = -12;
        int target = -18;

        int ans = floor(arr, target);
        System.out.println(ans);
    }   

    // return the index: greatest no <= target
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
        
        // if target is not found in the array then return the end element i.e the lowest one
        return end;
    }
}