public class Question {
    String question;
    String op1;   
    String op2;   
    String op3;   
    String op4;  
    String correct;
    
    static int count = 1;

    {
        System.out.println("\nEnter the question no. " + (1+count) + ", its four options and the correct answer");
        count++;
    }

    public Question(String question, String op1, String op2, String op3, String op4, String correct) {
        this.question = question;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.op4 = op4;
        this.correct = correct;
    }

    public void displayQuestion() {
        for(int i=0; i<15; i++) {
            System.out.println(question);
            System.out.println("A." + op1 +"\tB." + op2);
            System.out.println("B." + op3 +"\tD." + op4);
        }
    }
}