// Linear Search - Sequential Searching
// comparing each and every element of the list with the target element sequentially
/*
    Time Complexity:
        Best  - O(1)          element found at the very first index...
        Worst - O(n)          you don't found the element after traversing the whole array
*/

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 34, 45, 455};
        int search = 45;
        // int search = 18;

        int element = ls(arr, search);
        System.out.println("Element " + search + " found at index " + element);
    }

    // Searching linearly(Sequentially) in the array
    static int ls(int[] arr, int search) {
        if(arr.length == 0) {
            return -1;
        }

        // traversing the whole array
        for(int index=0; index<arr.length; index++) {
            // comparing the array element with searched element
            if(search == arr[index]) {
                return index;
            }
        }

        // this line will execute when none of the conditions were satisfied...
        return -1;
    }
}