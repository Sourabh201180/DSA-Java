/*
    Inverted Half Pyramid
    (180 deg)

                    *
                *   *
            *   *   *
        *   *   *   *
    *   *   *   *   *

*/

class Pattern {
    public static void main(String[] args) {
        int r = 5;

        for(int i=1; i<=r; i++) {
            // for spaces
            for(int j=1; j<=r-i; j++) {
                System.out.print("    ");
            }
            // for stars
            for(int j=1; j<=i; j++) {
                System.out.print("   *");
            }
            System.out.println();
        }
    }
}