/* 
    Bitwise operators works at bit level.

    we have six types of bitwise operators
        |  Bitwise OR
        &  Bitwise AND
        ^  Bitwise XOR
        ~  Bitwise Complement
        << Bitwise left shift   (a*2^b)
        >> Bitwise right shift  (a/2^b)
*/

public class BitWise {
    public static void main(String[] args) {
        int p = 9;
        int q = 10;

        System.out.println("bitwise or: " + (p | q));           // 11
        System.out.println("bitwise and: " + (p & q));          // 8
        System.out.println("bitwise xor: " + (p ^ q));          // 3
        System.out.println("bitwise complement: " + (~p));      // -10

        System.out.println("bitwise left shift: " + (p << 1));  // 18
        System.out.println("bitwise left shift: " + (p << 2));  // 36

        System.out.println("bitwise right shift: " + (p >> 1));  // 4
        System.out.println("bitwise right shift: " + (p >> 2));  // 2

        System.out.println(~23);
    }
}