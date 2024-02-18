// varArgs parameter can't be empty...
// 0 or more values allowded
// varArgs must be the last parameter in the method formal parameter.

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        func(2, 3, 4, 5, 6);
        mult(2, 3, "rahul", "ataga", "agsd");
        mult(2, 3);

        // overloading
        demo(1, 2, 3, 4, 5);
        demo("abc", "pqr", "xyz", "mno");
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    // variable length argument must be at the end of the parameter list
    static void mult(int a, int b, String ...v) {
        System.out.println(a + " - " + b + " - "+ Arrays.toString(v));
    }

    // we can add multiple arguments in single variable 
    static void func(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}