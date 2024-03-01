public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {20, 23, 34, 43, 53, 543};
        int target = 34;

        System.out.println(binarySearchRecursive(arr, target, 0, arr.length-1));
        System.out.println(binarySearchIterative(arr, target, 0, arr.length-1));
    }   

    public static int binarySearchRecursive(int[] arr, int target, int s, int e) {
        if(s > e) {
            return -1;
        }

        int mid = s + (e-s)/2;
        if(target == arr[mid]) {
            return mid;
        }

        if(target < arr[mid]) {
            return binarySearchRecursive(arr, target, s, mid-1);
        }
          
        return binarySearchRecursive(arr, target, mid+1, e);
    }

    public static int binarySearchIterative(int[] arr, int target, int s, int e) {
        while(s <= e) {
            int mid = s + (e-s)/2;
            if(target < arr[mid]) {
                e = mid - 1;
            } else if(target > arr[mid]) {
                s = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}