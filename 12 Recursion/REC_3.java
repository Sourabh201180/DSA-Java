/* 
    Q. find nth fibonacci number?
        0, 1, 1, 2, 3, 5, 8, 13, 21, ................

        1. Break down the problem into smaller problems

        2. Recurrence relation:
            fibo(n) = fibo(n-1) + fibo(n-2)

        3. Recursive tree:(inorder travel concept)
*/

public class REC_3 {
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }

    public static int fibo(int n) {
        // base condition
        // fibo(0) = 0
        // fibo(1) = 1
        if(n < 2) {
            return n;
        } 

        return fibo(n-1) + fibo(n-2);
    }
}