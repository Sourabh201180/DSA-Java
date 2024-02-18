/*
    28.       *
             * *
            * * *
           * * * *
          * * * * *
           * * * *
            * * *
             * *
              * 
*/

class Pattern {
    public static void main(String[] args) {
        int n = 5;

        // upper half
        for(int i=0; i<n; i++) {
            // spaces 
            for(int j=n-i+1; j>0; j--) {
                System.out.print(" ");
            }
            // first half
            for(int j=0; j<i+1; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        // lower half
        for(int i=0; i<n-1; i++) {
            System.out.print("  ");
            // spaces
            for(int j=0; j<i+1; j++) {
                System.out.print(" ");
            }
            // first half
            for(int j=n-i-1; j>0; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}