public class REC_4 {
    public static void main(String[] args) {
        int[] arr = {20, 23, 34, 43, 53, 543};
        int target = 53;

        System.out.println(binarySearch(arr, target, 0, arr.length-1));
    }   

    public static int binarySearch(int[] arr, int target, int s, int e) {
        if(s > e) {
            return -1;
        }

        int mid = s + (e-s)/2;
        if(target == arr[mid]) {
            return mid;
        }

        if(target < arr[mid]) {
            return binarySearch(arr, target, s, mid-1);
        }
          
        return binarySearch(arr, target, mid+1, e);
    }
}