// 1732. Find the Highest Altitude

class A {
    public static void main(String[] args) {
        // int[] gain = {-5, 1, 5, 0, -7};
        int[] gain = {-4, -3, -2, -1, 4, 3, 2};
        // int[] gain = {52, -91, 72};

        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain) {
        int greatest = gain[0];
        int l = gain.length;
        int[] arr = new int[l + 1];

        arr[0] = 0;
        arr[1] = gain[0];
        for(int i=1; i<l; i++) {
            arr[i+1] = gain[i] + arr[i];
            if(arr[i+1] > greatest) {
                greatest = arr[i+1];
            }
        }

        if(greatest >= 0) {
            return greatest;
        } else {
            return 0;
        }
    }
}