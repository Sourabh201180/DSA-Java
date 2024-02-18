/*
    30.         1
              2 1 2
            3 2 1 2 3
          4 3 2 1 2 3 4
        5 4 3 2 1 2 3 4 5 
*/

class Pattern {
    public static void main(String[] args) {
        int n = 5;

        for(int i=0; i<n; i++) {
            // spcaces
            for(int j=n-i; j>0; j--) {
                System.out.print("  ");
            }
            // first half 
            int temp = i+1;
            for(int j=0; j<i+1; j++) {
                System.out.print(temp-- + " ");
            }
            // second half
            int ttemp = 2;
            for(int j=0; j<i; j++) {
                System.out.print(ttemp++ + " ");
            }
            System.out.println();
        }
    }
}