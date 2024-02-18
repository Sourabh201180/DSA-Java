// Number of good pairs

class A {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 3};
        // int[] arr = {1, 1, 1, 1};
        int goodPair = 0;

        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    goodPair++;
                    System.out.println(arr[i] + "," + arr[j]);
                }
            }
        }

        System.out.println("\nNo of good Pairs: " + goodPair);
    }
}