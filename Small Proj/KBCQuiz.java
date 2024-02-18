import java.util.Random;
import java.util.Scanner;
import java.io.*;

class KBC {

    static {
        System.out.println("Welcome to kaun banega cororepati...");
        System.out.println("You have 14 questions to answer and for each question you have 60 sec to answer");

        System.out.println("\n*****************************");
        System.out.println("Prize Pool");
        System.out.println("\n1 <> Rs. 1000");
        System.out.println("2 <> Rs. 5000");
        System.out.println("3 <> Rs. 10000");
        System.out.println("4 <> Rs. 20000");
        System.out.println("5 <> Rs. 40000");
        System.out.println("6 <> Rs. 80000");
        System.out.println("7 <> Rs. 160000");
        System.out.println("8 <> Rs. 320000");
        System.out.println("10 <> Rs. 640000");
        System.out.println("11 <> Rs. 1280000");
        System.out.println("12 <> Rs. 2560000");
        System.out.println("13 <> Rs. 5000000");
        System.out.println("14 <> Rs. 10000000");
        System.out.println("\n*****************************");
    }

    {
        System.out.println("First you have to provide the Question and its options each time and then you can play the game");
        
        System.out.println("\n***  Enter the questions, its four options and the correct answer  ***");
        System.out.println("\nEnter the question no. 1, its four options and the correct answer");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        KBC k = new KBC();
        Question[] questions = new Question[13];

        for(int i=0; i<15; i++) {
            System.out.println("Enter Question no. " + i+1);
            String ques = sc.nextLine();
            System.out.println("Enter option 1 for question no. " + i+1);
            String op1 = sc.nextLine();
            System.out.println("Enter option 2 for question no. " + i+1);
            String op2 = sc.nextLine();
            System.out.println("Enter option 3 for question no. " + i+1);
            String op3 = sc.nextLine();
            System.out.println("Enter option 4 for question no. " + i+1);
            String op4 = sc.nextLine();
            System.out.println("Enter the correct result for question no. " + i+1);
            String correct = sc.nextLine();

            questions[i] = new Question(ques, op1, op2, op3, op4, correct);
        }
    }
}