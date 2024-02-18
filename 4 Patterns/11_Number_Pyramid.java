/*
    Number Pyramid

            1
          2   2
        3   3   3
      4   4   4   4
    5   5   5   5   5

*/

class Pattern {
    public static void main(String[] args) {
        int r = 5;

        for(int i=1; i<=r; i++) {
            // Spaces
            for(int j=1; j<=r-i; j++) {
                System.out.print("   ");
            }
            // Numbers -> print row no, row no. times...
            for(int j=1; j<=i; j++) {
                System.out.print("   " + i + "   ");
            }
            System.out.println();
        }

        // OR
        // for(int i=1; i<=r; i++) {
        //     // spaces
        //     for(int j=1; j<=r-i; j++) {
        //         System.out.print("   ");
        //     }
        //     // Numbers
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("   " + i + "   ");
        //     }
        //     System.out.println();
        // }
    }
}