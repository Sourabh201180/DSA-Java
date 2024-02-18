/*
    Inverted Half Pyramid with Numbers

    1   2   3   4   5
    1   2   3   4
    1   2   3
    1   2
    1

*/

class Pattern {
    public static void main(String[] args) {
        int r = 5;

        for(int i=r; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(j+"    ");
            }
            System.out.println();
        }

        // or
        // for(int i=1; i<=r; i++) {
        //     for(int j=1; j<=r-i+1; j++) {
        //         System.out.print(j+"    ");
        //     }
        //     System.out.println();
        // }
    }
}