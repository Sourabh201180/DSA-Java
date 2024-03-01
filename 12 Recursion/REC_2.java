/*
    write a function that takes in a no. and prints it
    print first 5 numbers: 1 2 3 4 5

    Visualize the recursive call- (recursive tree)
        print(1) -> print(2) -> print(3) -> print(4) -> print(5)
*/

public class REC_2 {
    public static void main(String[] args) {
        print1(1);
        print1(2);
        print1(3);
        print1(4);
        print1(5);

        recursivePrint(5);
    }   

    // recursive approach
    static void recursivePrint(int n) {
        // base condition
        if(n > 1) {
            recursivePrint(n-1);
        }

        System.out.println(n);
    }

    // iterative approach
    static void iterativePrint(int n) {
        for(int i=1; i<=n; i++) {
            System.out.println(i);
        }
    }

    // normal method call
    static void print1(int n) {
        System.out.println(n);
    }
}