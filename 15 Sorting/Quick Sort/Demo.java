import java.util.Arrays;

class A {
    public static void main(String[] args) {
        int[] arr = {12, -1, 3, 5, 4, 2, 9, 7, 1};

        System.out.println("Unsorted : " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);    // (arr, 0, 9-1)
        
        System.out.println("Sorted : " + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if(low >= high) {   // 0>=8 false  // 1>=7 false
            return;
        }

        int s = low;                // 0    // 1
        int e = high;               // 8    // 7
        int m = s + (e - s) / 2;    // 4    // 4
        int pivot = arr[m];         // 4    // 4

        while(s <= e) {             // 0<=8 true    // 1<=7 true    
            while(arr[s] < pivot) { // 12<4 false   // -1<4 true    // 3<4 true     // 5<4 false
                s++;                // 2  // 3
            }
            while(arr[e] > pivot) { // 1>4 false    // 7>4 true    // 9>4 true      // 2>4 false
                e--;                // 6  // 5
            }

            if(s <= e) {            // 0<=8 true    // 3<=5 true
                int temp = arr[s];  // 12     // 5 
                arr[s] = arr[e];    // 1      // 2
                arr[e] = temp;      // 12     // 5
                s++;                // 1            // 4 
                e--;                // 7            // 4
            }
        }
        // {1, -1, 3, 2, 4, 5, 9, 7, 12}, 0, 4 
        // {1, -1, 3, 2, 4, 5, 9, 7, 12}, 4, 8 

        quickSort(arr, low, e);  // {arr, 0, 7}
        quickSort(arr, s, high); // {arr, 1, 8}
    }
}