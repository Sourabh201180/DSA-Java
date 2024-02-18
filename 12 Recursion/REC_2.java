/*
    write a function that takes in a no. and prints it
    print first 5 numbers: 1 2 3 4 5

    recursive call
        if you are calling a function again and again, you can treat it as a seperate call in the stack

        if their is no base condition it will execute infinitely,
        so, it will generate StackOverflowError.

    Recursion:-
        a function calling itself.
        * we use it to solve bigger/complex problems in a single way.
        * you can convert the recursion solutions into iterations or vice versa.
        * space complexity is not constant because of recursive calls.
        * helps to break down the bigger problems into smaller problems.

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

    static void recursivePrint(int n) {
        // base condition
        if(n > 1) {
            recursivePrint(n-1);
        }

        System.out.println(n);
    }

    static void print1(int n) {
        System.out.println(n);
    }
}