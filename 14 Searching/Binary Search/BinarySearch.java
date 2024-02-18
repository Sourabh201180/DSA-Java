public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-12, -5, 0, 2, 5, 9, 11, 15, 18, 33, 45, 49, 63, 99, 103};
        int target = 45;
        // int target = -12;
        // int target = 22;

        System.out.println(target + " found at index " + binarySearch(arr, target));
    }

    // return the index of searched element, if doesn't exist then return -1
    static int binarySearch(int[] arr, int target) {
        int start = 0;              // start index
        int end = arr.length - 1;   // last index

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