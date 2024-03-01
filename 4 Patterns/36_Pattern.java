/*
    36.                 1
                    3   5
                7  11  13
           17  19  23  29
       31  37  41  43  47
*/

class Pattern {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;

        for(int i=0; i<n; i++) {
            // spaces
            for(int j=n-i; j>1; j--) {
                System.out.print("\t");
            }
            // numbers
            for(int j=0; j<=i; j++) {
                num = nextPrime(num);
                System.out.print(num + "\t");
                num++;
            }
            System.out.println();
        }
    }

    public static int nextPrime(int num) {
        if(num == 1) {
            return 1;
        }

        if(checkPrime(num)) {
            num++;
        }
        
        while(!checkPrime(num)) {
            num++;
        }

        return num;
    }

    public static boolean checkPrime(int num) {
        if(num < 2) {
            return false;
        } 
        if(num == 2) {
            return true;
        }

        for(int i=2; i<=num/2; i++) {
            if(num%i == 0) {
                return false;
            }
        }

        return true;
    }
}