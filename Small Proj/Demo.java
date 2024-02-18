/*
 * 
*/

public class Demo {
    public static void main(String[] args) {
        int n = 5;

        int size = 2*n - 1;
        int start = 0;
        int end = size - 1;
        int[][] arr = new int[size][size];

        while(n > 0) {
            for(int i=start; i<=end; i++) {
                for(int j=start; j<=end; j++) {
                    if(i==start || i==end || j==start || j==end) {
                        arr[i][j] = n;
                    }
                }
            }
            ++start;
            --end;
            --n;
        }

        for(int[] ar : arr) {
            for(int i : ar) {
                System.err.print(i + " ");
            }
            System.out.println();
        }
    }
}