import java.util.Arrays;

class A {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            // find the max. element in the remaining array and swap with correct index
            int last = arr.length - i - 1;           // where we have to store
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for(int i=start; i<=end; i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }
        }

        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}