/*
    0-1 Triangle

    1
    0   1
    1   0   1
    0   1   0   1
    1   0   1   0   1

*/

class Pattern {
    public static void main(String[] args) {
        int r = 5;

        for(int i=1; i<=r; i++) {
            for(int j=1; j<=i; j++) {
                if((i+j)%2==0 ) {
                    System.out.print("1\t");
                } else {
                    System.out.print("0\t");
                }
            }
            System.out.println();
        }
    }
}