/*
    Q. find peak index in a mountain/bitonic array?
    ans: mountain/bitonic array -> first increasing and then decreasing the array. 
        ex-
            arr = {1, 2, 3, 5, 7, 6, 3, 2};
*/

public class Q6 {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 5, 7, 8, 6, 3, 2};
        int[] arr = {1, 7, 5, 3, 2};
        
        int ans = peakIndexInMountainArray(arr);
        System.out.println("element " + arr[ans] + " at index "+ ans);
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
                // you are in asscending part of array
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
}