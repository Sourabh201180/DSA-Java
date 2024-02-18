/* 
    Q. find position of an element in a sorted array of infinite numbers.
*/

public class Q5 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 10, 90, 100, 120, 145, 180, 199};
        int target = 10;

        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        // first find the range

        // start with the box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while(target > arr[end]) {
            int newStart = end + 1;     // this is my new start
            // double the box value
            // end = prev end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    // return the index of searched element, if doesn't exist then return -1
    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find middle element
            // int mid = (start + end) / 2;    // might be possible that the start and end were out of range of integer
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
        
        return -1;
    }
}