import java.util.Arrays;

class A {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};

        System.out.println(Arrays.toString(arr));
        
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j>0; j--) {
                if(arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                    // System.out.println(Arrays.toString(arr) + " +");
                } else {
                    // System.out.println(Arrays.toString(arr) + " -");
                    break;
                }
            }
            // System.out.println();
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}