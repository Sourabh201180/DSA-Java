import java.util.Arrays;

class A {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 12, 54, 69, 0, -12, 2, 1};
        
        System.out.println("Unsorted: " + Arrays.toString(arr));
        System.out.println("Sorted: " + Arrays.toString(mergeSort(arr)));
    }

    static int[] mergeSort(int[] arr) {
        // breaking conditions
        if(arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] res = new int[first.length + second.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<first.length && j<second.length) {
            if(first[i] < second[j]) {
                res[k] = first[i];
                i++;
            } else {
                res[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of them is not completed...
        // copy the remaining elements
        while(i<first.length) {
            res[k] = first[i];
            i++;
            k++;
        }

        while(j<second.length) {
            res[k] = second[j];
            j++;
            k++;
        }

        return res;
    }
}