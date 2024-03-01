/* 
    Q. find nth fibonacci number?
        0, 1, 1, 2, 3, 5, 8, 13, 21, ................

        1. Break down the problem into smaller problems

        2. Recurrence relation:
            fibo(n) = fibo(n-1) + fibo(n-2)

        3. Recursive tree:(inorder travel concept)
*/

public class Fibonacci {
    public static void main(String[] args) {
        int n = 1;

        System.out.println(fiboRecursive(n));
        System.out.println(fiboIterative(n));
    }

    public static int fiboRecursive(int n) {
        // base condition
        // fiboRecursive(0) = 0
        // fiboRecursive(1) = 1
        if(n < 2) {
            return n;
        }

        return fiboRecursive(n-1) + fiboRecursive(n-2);
    }

    public static int fiboIterative(int n) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        for(int i=1; i<n; i++) {
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
        }

        return n3;
    }
}