/*
    Q. Search in mountain array?
*/

public class Q7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 8, 6, 3, 2};
        int target = 5;

        int ans = search(arr, target);
        System.out.println(ans);
    }   

    public static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);

        if(firstTry != -1) {
            return firstTry;
        }
        
        // try to search in second array
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]) {
                // you are in decreasing part of array
                // this may be the answer, but see on left 
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in ascending part of array
                start = mid + 1;        // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end always trying to check the maximum element in the 2 checks
        // hence, when they are pointing to just one element, that the maximum one of 2 checks
        // more elaboration: at every point of time for start and end they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence because of above line that is the best possible answer

        return start;  // or return end; as both returns the same value
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

        // find the order of array i.e ascending or descending
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