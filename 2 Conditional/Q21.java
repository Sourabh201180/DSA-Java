// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

public class Q21 {
    static int n1 = 1;
    static int n2 = 1;
    static int n3 = 0;

    public static void printFibonacci(int max) {
        int a = 0;
        int b = 1;
        int c = 0;

        for(int i=0; i<max; i++) {
            System.out.print(c + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
    
    public static void printFibonacciRecursive(int max) {
        if(max > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + " ");
            printFibonacciRecursive(max-1);
        }
    }

    public static void main(String[] args) {
        int max = 10;

        Q21 q = new Q21();
        q.printFibonacci(max);

        System.out.println();

        System.out.print("0 1 ");
        q.printFibonacciRecursive(max-2);
    }
}