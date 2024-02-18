/*
    32. E
        D E
        C D E
        B C D E
        A B C D E
*/

class Pattern {
    public static void main(String[] args) {
        int n = 5;

        int temp = n;
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print((char)(65 + temp + j - 1) + " ");
            }
            System.out.println();
            temp--;
        }
    }
}