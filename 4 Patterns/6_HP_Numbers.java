/*
    Half Pyramid Using Numbers

    1
    1   2
    1   2   3
    1   2   3   4
    1   2   3   4   5

*/

class Pattern {
    public static void main(String[] args) {
        int r = 5;
        
        for(int i=1; i<=r; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j+"    ");
            }
            System.out.println();
        }
    }
}