import java.util.Scanner;

public class A {
    private boolean checkAge(int age) {
        if(age > 17) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.close();
        
        A a = new A();
        boolean flag = a.checkAge(age);

        if(flag) {
            System.out.println("you are eligible to vote");
        } else {
            System.out.println("you are not eligible to vote");
        }
    }
}