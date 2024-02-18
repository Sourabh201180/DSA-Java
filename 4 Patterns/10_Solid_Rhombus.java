/*
    Solid Rhombus   

                    *   *   *   *   *
                *   *   *   *   *
            *   *   *   *   *
        *   *   *   *   *
    *   *   *   *   *

*/

class Pattern {
    public static void main(String[] args) {
        int r = 5;

        // static approach
        for(int i=r; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t*\t*\t*\t*");
            System.out.println();
        }

        // OR
        // for(int i=1; i<=r; i++) {
        //     // spaces
        //     for(int j=1; j<=r-i+1; j++) {
        //         System.out.print("\t");
        //     }
        //     // stars 
        //     for(int j=1; j<=r; j++) {
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        // }
    }    
}