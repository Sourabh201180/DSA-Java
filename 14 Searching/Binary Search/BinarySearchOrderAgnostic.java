/* 
    BinarySearchOrderAgnostic: 
        don't know whether the list is sorted or not, or sorted in which order (i.e asccending or desccending).

    Q. you are provided with an sorted array but you don't know the order than how will you search the element?
    sol: for this u can check the start and end element for applying searchig.
        found the order first.
        then, apply searching algo.
*/

public class BinarySearchOrderAgnostic {
    public static void main(String[] args) {
        // int[] arr = {-12, -5, 0, 2, 5, 9, 11, 15, 18, 33, 45, 49, 63, 99, 103};
        int[] arr = {103, 99, 63, 49, 45, 33, 18, 15, 11, 9, 5, 2, 0, -5, -12};
        int target = 45;
        // int target = -12;
        // int target = 22;

        int ans = orderAgnosticBS(arr, target);
        System.out.println(target + " found at index " + ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // finding the order of array i.e ascending or descending
        /*
            boolean isAsc;
            if(arr[start] < arr[end]) {
                isAsc = true;
            } else {
                isAsc = false;
            }
        */
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find middle element
            // int mid = (start + end) / 2;    // might be possible that the start and end were out of range of integer
            int mid = start + (end - start)/2;

            // this is common for both the conditions
            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if(target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        
        return -1;
    }
}