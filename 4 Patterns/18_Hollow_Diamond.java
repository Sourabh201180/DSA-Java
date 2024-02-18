/* 
        * * * * * * *
        * * *   * * *
        * *       * *
        *           *
        * *       * *
        * * *   * * *
        * * * * * * *

*/

class Solution {
    public static void main(String[] args) {
        int n = 4;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i; j++) {
                System.out.print("* ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("  ");
            }
            for(int j=0; j<n-i; j++) {
                if(i==0 && j==0) {
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<n; i++) {
            for(int j=0; j<i+1; j++) {
                System.out.print("* ");
            }
            for(int j=0; j<=n-2*i; j++) {
                System.out.print("  ");
            }
            for(int j=0; j<i+1; j++) {
                if(i==n-1 && j==n-1) {
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}