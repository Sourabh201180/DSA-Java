// Kids with the greatest number of candies

class A {
    public static void main(String[] args) {
        // int[] arr = {2, 3, 5, 1, 3};
        // int extra = 3;
        
        int[] arr = {4, 2, 1, 1, 3};
        int extra = 1;

        int max = findmax(arr);

        boolean[] res = new boolean[arr.length];

        for(int i=0; i<arr.length; i++) {
            if((arr[i] + extra) >= max) {
                res[i] = true;
            } else {
                res[i] = false;
            }
            System.out.println(res[i]);
        }
    }

    static int findmax(int[] arr) {
        int max = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }
}