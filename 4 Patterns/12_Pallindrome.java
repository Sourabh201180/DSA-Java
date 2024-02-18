/*
    Pallindrome Pattern

                        1
                    2   1   2
                3   2   1   2   3
            4   3   2   1   2   3   4
        5   4   3   2   1   2   3   4   5
*/

class Pattern {
    public static void main(String[] args) {
        int row = 5;
        
        for(int i=1; i<=row; i++) {
            // spaces
            for(int j=0; j<row-i; j++) {
                System.out.print("\t");
            }
            // numbers(first half)
            for(int j=i; j>0; j--) {
                System.out.print("\t" + j);
            }
            // numbers(second half)
            for(int j=2; j<=i; j++) {
                System.out.print("\t" + j);
            }
            System.out.println();
        }
    }
}