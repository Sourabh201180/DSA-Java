import java.util.Arrays;

class A {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length - 1);      // here we are passing the start and the end index, as we have to perform inplace sorting
        System.out.println(Arrays.toString(arr));

        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int hig) {
        if(low >= hig) {       // 0 >= 4
            return;
        }

        int s = low;             // 0            // these are the pointers, 
        int e = hig;             // 4            // used for refrencing that which parts of the arrays is modifying
        int m = s + (e - s) / 2; // 2
        int pivot = arr[m];      // 3

        while(s <= e) {
            while(arr[s] < pivot) {
                s++;
            }
            while(arr[e] > pivot) {
                e--;
            }

            if(s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;        // 1  // 2  // 3
                e--;        // 3  // 2  // 1
            }
        }

        // now pivot is at correct index, now solve the two halfes
        quickSort(arr, low, e);
        quickSort(arr, s, hig);
    }
}