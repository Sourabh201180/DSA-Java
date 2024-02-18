/*
    Inverted Half Pyramid

    *   *   *   *   *
    *   *   *   *
    *   *   *
    *   *
    *

*/

class Pattern {
    public static void main(String[] args) {
        int r = 5;

        // using the reverse loop
        for(int i=r; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}