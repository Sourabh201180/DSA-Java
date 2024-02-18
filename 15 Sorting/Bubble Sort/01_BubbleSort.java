import java.util.Arrays;

class A {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 5};
        
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        boolean flag;
        // run the steps n-1 times
        for(int i=0; i<arr.length; i++) {
            flag = false;
            // for each step the max. element will come at the last respective index
            for(int j=1; j<arr.length-i; j++) {
                // compare, swap if the item is smaller than its previous item
                if(arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flag = true;
                }
            }

            // if you didn't swap for a particular value of i, it means the array is sorted hence stop the program.
            if(!flag) {
                break;
            }
        }
    }
}