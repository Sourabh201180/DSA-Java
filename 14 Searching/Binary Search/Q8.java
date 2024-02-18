/*
    Q. Search in Rotated Sorted Array?
    sol: rotation of array:
        [2, 4, 5, 7, 8, 9, 10, 12]  ->  0th rotation
        [12, 2, 4, 5, 7, 8, 9, 10]  ->  1st rotation
        [10, 12, 2, 4, 5, 7, 8, 9]  ->  2nd rotation
*/


public class Q8 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 9, 0, 1, 2};
        int target = 1;

        System.out.println(search(arr, target));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        
        // if you did not find a pivot, it means the array is not rotated
        if(pivot == -1) {
            // just do normal binary Search
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // if pivot found, you have found 2 asc sorted arrays
        // 3 cases
        if(nums[pivot] == target) {
            return pivot;
        }
        if(target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

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
                return mid;     // ans found
            }
        }
        return -1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            // 4 cases over here,
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            if(arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}