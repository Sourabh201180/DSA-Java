// 832 Flipping an image (flipping and then inverting)

import java.util.Arrays;

class A {
    public static void main(String[] args) {
        // int[][] arr = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] arr = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};

        int[][] rev = flipAndInvertImage(arr);

        // for(int i=0; i<rev.length; i++) {
        //     for(int j=0; j<rev[i].length; j++) {
        //         System.out.print(rev[i][j]); 
        //     }
        //     System.out.println();             
        // }
        
        // enhance for loop
        for(int[] i : rev) {
            for(int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static int[][] flipAndInvertImage(int[][] arr) {
        int l = arr.length;

        for(int i=0; i<l; i++) {
            int len = arr[i].length;
            // for flipping 1D array
            for(int j=0; j<len/2; j++) {
                int temp = 0;
                temp = arr[i][len-j-1];
                arr[i][len-j-1] = arr[i][j];
                arr[i][j] = temp;
            }
            // for inverting its values
            for(int j=0; j<len; j++) {
                if(arr[i][j] == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }

        return arr;
    }
}