/*
    Solid Rectangle: taking input from the user
    
    Nested Loops...
        for( rows ) {
            for( columns ) {

            }
        }

    *   *   *   *   *
    *   *   *   *   *
    *   *   *   *   *
    *   *   *   *   *
*/

import java.util.Scanner;

class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the no. of columns: ");
        int column = sc.nextInt();
        
        sc.close();

        for(int i=1; i<=row; i++) {
            for(int j=1; j<=column; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }   
    }
}