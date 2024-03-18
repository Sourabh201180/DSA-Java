import java.util.Scanner;

public class VoteCheck {
    private boolean checkAge(int age) {
        // if(age > 17) {
        //     return true;
        // } else {
        //     return false;
        // }

        return age > 17;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        sc.close();
        
        VoteCheck vC = new VoteCheck();
        boolean flag = vC.checkAge(age);

        // if(flag) {
        //     System.out.println("you are eligible to vote");
        // } else {
        //     System.out.println("you are not eligible to vote");
        // }

        System.out.println((flag ? "Eligible" : "Not eligible") + " to vote"); 
   }
}