import java.util.Arrays;

class A {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};

        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclicSort(int[] arr) {
        int i=0;
        while(i<arr.length) {
            // System.out.println(Arrays.toString(arr));
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]) {
                // System.out.println(arr[i] +"~~~~"+ arr[correct]);
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}