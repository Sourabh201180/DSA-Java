/*
    33. a
        B c
        D e F
        g H i J
        k L m N o
*/

class Pattern {
    public static void main(String[] args) {
        int n = 5;

        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                if(count%2 != 0) {
                    System.out.print((char)(65+count) + " ");
                } else {
                    System.out.print((char)(97+count) + " ");
                }
                count++;
            }
            System.out.println();
        }
    }
}