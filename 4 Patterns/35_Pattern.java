/*
    35. 1      1
        12    21
        123  321
        12344321
*/

class Pattern {
    public static void main(String[] args) {
        int n = 4;

        for(int i=0; i<n; i++) {
            // left
            for(int j=0; j<=i; j++) {
                System.out.print(j+1);
            }
            // mid
            for(int j=0; j<(n-i)*2-1; j++) {
                System.out.print(" ");
            }
            // right
            for(int j=0; j<=i; j++) {
                System.out.print(i-j+1);
            }
            System.out.println();
        }
    }
}