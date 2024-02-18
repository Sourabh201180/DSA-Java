// in same class, with same method name, same return type, but with different parameters(argument body)
// i.e. having the same method signature
// at compile time it will check which function to execute...

public class Overloading {
    public static void main(String[] args) {
        func(45);
        func("rohit");
        func(45, 18);
        func(45, "rohit");
    }

    static void func(int a) {
        System.out.println(a);
    } 

    static void func(int a, int b) {
        System.out.println(a+b);
    }

    static void func(String b) {
        System.out.println(b);
    }

    static void func(int a, String b) {
        System.out.println(a + " " + b);
    }
}