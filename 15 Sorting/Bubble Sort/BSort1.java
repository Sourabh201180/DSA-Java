import java.util.Arrays;

// Bubble Sort
// Shinking Sort
// Exchange Sort
// Stable Sorting algorithm
// inplace sorting algorithm

// time complexity:
// Best Case : O(N) => Sorted
// Worst Case : O(N^2) => Sorted in opposite order

// as the size of array is growing, the no. of comparations also growing...
// for a particular pass if j doesn't swaps then, it means array is already sorted

/*
    j<=len-1-i

    first pass:, i = 0; j = 4; 
    3, 1, 5, 4, 2, 
    1, 3, 5, 4, 2
    1, 3, 4, 5, 2
    1, 3, 4, 2, 5

    second pass:, i = 1; j = 3
    1, 3, 4, 2, 5
    1, 3, 2, 4, 5
    
    third pass:, i = 2; j = 2
    1, 3, 2, 4, 5
    1, 2, 3, 4, 5
*/

class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped = false;

        // run steps n-1 times
        for(int i=0; i<arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for(int j=1; j<=arr.length-1-i; j++) {
                // swap if the item is smaller thean the previous item
                if(arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if(!swapped) {  // !false = true
                break;
            }
        }
    }
}