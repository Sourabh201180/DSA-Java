import java.util.Scanner;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Output
        int res = minSwaps(arr);
        System.out.print(res);

        sc.close();
    }

    public static int minSwaps(int[] arr) {
        int n = arr.length;

        // Create copies and sort in ascending and descending order
        int[] arrAsc = arr.clone();
        int[] arrDesc = arr.clone();

        Arrays.sort(arrAsc);
        Arrays.sort(arrDesc);

        // Calculate swaps needed for ascending order
        int swapsAsc = 0;
        for(int i=0; i<n; i++) {
            if(arr[i] != arrAsc[i]) {
                swapsAsc++;
            }
        }

        // Calculate swaps needed for descending order
        int swapsDesc = 0;
        for(int i=0; i<n; i++) {
            if(arr[i] != arrDesc[n - 1 - i]) {
                swapsDesc++;
            }
        }

        // Output the minimum number of swaps
        return Math.min(swapsAsc, swapsDesc);
    }
}