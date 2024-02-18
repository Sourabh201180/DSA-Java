/* 
    Butterfly Pattern

    *                       *    
    *   *               *   *
    *   *   *       *   *   *
    *   *   *   *   *   *   *
    *   *   *       *   *   *
    *   *               *   *
    *                       *

*/

class Pattern {
    public static void main(String[] args) {
        int n = 7;

        for(int i=0; i<n/2; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            for(int j=i+1; j<n-i-1; j++) {
                System.out.print("  ");
            }
            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=0; i<n/2; i++) {
            for(int j=0; j<=n/2-i-1; j++) {
                System.out.print("* ");
            }
            for(int j=0; j<=i; j++) {
                System.out.print("   ");
            }
            for(int j=0; j<=n/2-i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
    public static void main(String[] args) {
        int r = 5;

        // Upper Half
        for(int i=1; i<=r; i++) {
            // 1st Part
            for(int j=1; j<=i; j++) {
                System.out.print("\t*");
            }

            // Spaces
            for(int j=1; j<=2*(r-i); j++) {
                System.out.print("\t");
            }

            for(int j=1; j<=i; j++) {
                System.out.print("\t*");
            }

            System.out.println();
        }

        // Lower Half
        for(int i=r-1; i>=1; i--) {
            // 1st Part
            for(int j=1; j<=i; j++) {
                System.out.print("\t*");
            }

            // Spaces
            for(int j=1; j<=2*(r-i); j++) {
                System.out.print("\t");
            }

            for(int j=1; j<=i; j++) {
                System.out.print("\t*");
            }

            System.out.println();
        }
    }
    */
}