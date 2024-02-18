public class E7 {
    
}

class Solution {
    public int countPrimes(int n) {
        if(n < 1) {
            return 0;
        }

        int count = 0;
        for(int i=2; i<n; i++) {
            if(checkPrime(i)) {
                count++;
            }
        }


        return count;
    }

    public boolean checkPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       } 
        
       return true; 
    }
}