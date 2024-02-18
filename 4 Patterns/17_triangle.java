/*
    17.     
        11 12 13 14 15 
        12 13 14 15 11 
        13 14 15 11 12 
        14 15 11 12 13 
        15 11 12 13 14 
*/

class A {
    public static void main(String[] args) {
        int n = 5;

        int fix = 11;
        for(int i=0; i<n; i++) {
            int c = fix;
            for(int j=0; j<n; j++) {
                if(c>15) {
                    c = 11;
                    System.out.print(c++ + " ");
                } else {
                    System.out.print(c++ + " ");
                }
            }
            System.out.println();
            fix++;
        }
    }
}