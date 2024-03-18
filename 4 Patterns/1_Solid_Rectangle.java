/*
    Q. Solid Rectangle:
        Nested Loops...
        for( rows ) {
            for( columns ) {
                printing statement
            }
        }

    *   *   *   *   *
    *   *   *   *   *
    *   *   *   *   *
    *   *   *   *   *
*/

class Pattern {
    public static void main(String[] args) {
        // Outer loop
        for(int i=1; i<=4; i++) {
            // Inner loop
            for(int j=1; j<=5; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }   
    }
}