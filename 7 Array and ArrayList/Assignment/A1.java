// Build Array from permutation

class A {
    public static void main(String[] args) {
        // int[] arr = {0, 2, 1, 5, 3, 4};
        int[] arr = {5, 0, 1, 2, 3, 4};
        int size = arr.length;

        int[] res = new int[size];

        for(int i=0; i<size; i++) {
            res[i] = arr[arr[i]];

            System.out.println(res[i]);
        }
    }
}