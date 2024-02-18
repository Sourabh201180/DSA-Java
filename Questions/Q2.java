// ARM STRONG number...(153, 370, 371, 407)

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Enter a no. which you want to check whether it is armstrong or not: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // for checking a particular number only...
        System.out.println(arm(n));

        // for all the 3 digit arm Strong numbers
        for(int i=100; i<1000; i++) {
            if(arm(i)) {
                System.out.println(i + " ");
            }
        }
    }

    static boolean arm(int n) {
        int x = n;
        int rem=0, sum=0;
        
        while(n>0) {
            rem = n%10;
            sum += rem*rem*rem;
            n = n/10;
        }

        if(sum == x) {
            return true;
        }

        return false;
    }
}