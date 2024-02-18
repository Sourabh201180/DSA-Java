/*
    *                       *
    *   *               *   *
    *   *   *       *   *   *
    *   *   *   *   *   *   *
    *   *   *       *   *   *
    *   *               *   *
    *                       *
*/

import java.util.Scanner;

// approach 2
class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows you want: ");
        int row = sc.nextInt();
        sc.close();

        // upper half
        for(int i=1; i<=row; i++) {
            // first half
            for(int j=1; j<=i; j++) {
                System.out.print(" *");
            }

            // blank spaces
            for(int j=1; j<=2*(row-i); j++) {
                System.out.print("  ");
            }

            // second half
            for(int j=1; j<=i; j++) {
                System.out.print(" *");
            }

            System.out.println();
        }


        // lower half
        for(int i=row-1; i>=1; i--) {
            // first half
            for(int j=1; j<=i; j++) {
                System.out.print(" *");
            }

            // blank spaces
            for(int j=1; j<=2*(row-i); j++) {
                System.out.print("  ");
            }

            // second half
            for(int j=1; j<=i; j++) {
                System.out.print(" *");
            }

            System.out.println();
        }
    }
}

// approach 1
// their is a problem in printing the middle row
class B {
    public static void main(String[] args) {
        int n = 7;
        for(int i=1; i<n/2+1; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            } 
            for(int j=n-2*i; j>=1; j--) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        for(int i=1; i<=n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        for(int i=n/2; i>0; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            } 
            for(int j=n-2*i; j>=1; j--) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}