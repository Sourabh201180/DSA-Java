// Returning sum of 1D array

class A {
    public static void main(String[] args) {
        // int[] arr = {1, 3, 2, 1};
        int[] arr = {1, 3, 2, 34, 54, 34};
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        // enhance for loop
        // for(int i : arr) {
        //     sum += i;
        // }

        System.out.println(sum);
    }
}