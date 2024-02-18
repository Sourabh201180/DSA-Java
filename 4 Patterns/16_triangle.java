/* 
    16.    
        10
        12      13
        15      16      17
        19      20      21      22
        24      25      26      27      28
*/

class A {
    public static void main(String[] args) {
        int n = 5;
        int fix = 10;
        
        for(int i=1; i<n+1; i++) {
            int col = fix;
            for(int j=1; j<=i; j++) {
                System.out.print(col + "\t");
                col++;
            }
            fix = fix + i + 1;
            System.out.println();
        }
    }
}