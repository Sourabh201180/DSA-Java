public class LinearSearchInRange {
    public static void main(String[] args) {
        int[] arr = {23, 35, 32, 16, 356, 45, 18, 63};
        int target = 18;
        
        System.out.println(searchInRange(arr, target, 5, 9));
    }

    static boolean searchInRange(int[] arr, int target, int start, int end) {
        if(arr.length == 0) {
            return false;
        }

        for(int i=start; i<=end; i++) {
            if(target == arr[i]) {
                return true;
            }
        }

        return false;
    }
}