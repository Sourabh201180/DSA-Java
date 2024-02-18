import java.util.Arrays;

public class QuickMergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 4, 9, 1};
        System.out.println(Arrays.toString(arr));

        // quickSort(arr, 0, arr.length-1);
        arr = mergeSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergeSort(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];
        
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                res[k] = arr1[i];
                i++;
            } else {
                res[k] = arr2[j];
                j++;
            } 
            k++;
        }

        while(i < arr1.length) {
            res[k] = arr1[i];
            i++;
            k++; 
        }

        while(j < arr2.length) {
            res[k] = arr2[j];
            j++;
            k++; 
        }

        return res;
    }

    public static void quickSort(int[] arr, int start, int end) {
        if(start >= end) {  
            return;
        }

        int s = start;
        int e = end;
        int mid = s + (e-s)/2;
        int pivot = arr[mid];

        while(s<=e) {
            while(arr[s] < pivot) {
                s++;
            }
            while(arr[e] > pivot) {
                e--;
            }
            if(s<=e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        quickSort(arr, start, e);
        quickSort(arr, s, end);
    }
}