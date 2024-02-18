public class demo {
    public static void main(String[] args) {
        // int[] arr = {12, 9};
        int[] arr = {10, 1};
        int ind = 0;
        int k = 1;

        System.out.println(func(ind, arr, k));
    }

    static long func(int ind, int[] arr, int k) {
        for(int i=0; i<k; i++) {
            arr[ind] = arr[ind]*2;
        }

        return (long)arr[0]|arr[1];
    }
}