/*
    Diamond Pattern
 
                *
            *   *   *
        *   *   *   *   *
    *   *   *   *   *   *   *
        *   *   *   *   *
            *   *   *   
                *

*/

class Pattern {
    public static void main(String[] args) {
        int r = 10;

        // Upper half
        for(int i=1; i<=r/2; i++) {
            // spaces
            for(int j=1; j<=r-i; j++) {
                System.out.print("\t");
            }

            // stars
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("\t*");
            }
            
            System.out.println();
        } 

        // Lowwer half
        for(int i=(r-1)/2; i>=1; i--) {
            // spaces
            for(int j=1; j<=r-i; j++) {
                System.out.print("\t");
            }

            // stars
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("\t*");
            }
            
            System.out.println();
        } 
    }
}