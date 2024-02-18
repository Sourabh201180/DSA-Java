/*
    34. E D C B A
        D C B A
        C B A
        B A
        A
*/

class Pattern {
    public static void main(String[] args) {
        int n = 5;

        int last = 65 + n;
        for(int i=0; i<n; i++) {
            // left
            for(int j=0; j<n-i; j++) {
                System.out.print((char)(last-j-1) + " ");
            }
            System.out.println();
            last--;
        }
    }
}