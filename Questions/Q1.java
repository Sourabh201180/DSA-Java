// Prime Number...

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n) { // 11
        if(n <= 1) {
            return false;
        }
        
        int c = 2;
        while(c*c <= n) {          // 4 <= 11  9 <= 11 16 <= 11
            if(n%c == 0) {
                return false;
            }
            c++;
        }

        return c*c > n;

        // if(c*c > n) {
        //     return true;
        // }

        // return false;
    }
}

/*
 * public boolean checkPrime(int n) {
 *      if(n <= 1) {
 *          return false;
 *      }
 * 
 *      int c = 2;
 *      while(c*c <= n) {
 *          if(n%c == 0) {
 *              return false;
 *          }
 *          c++;
 *      }
 * 
 *      return c*c > n;
 * }
 * 
 */