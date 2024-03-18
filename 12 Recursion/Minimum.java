public class Minimum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, -50, 10, 2}; 
        int n = arr.length; 
           
        System.out.println(findMinRec(arr, n));
    }

    public static int findMinRec(int[] arr, int n) {
        if(n == 1) {
            return arr[0];
        }

        return Math.min(arr[n-1], findMinRec(arr, n-1));
    }
}