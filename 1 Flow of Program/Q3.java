public class Q3 {
    public static void printTable(int num) {
        for(int i=1; i<=num; i++) {
            System.out.println(num + " X " + i + " = " + num*i);
        }
    }

    public static void main(String[] args) {
        int num = 11;
        printTable(num);
    }
}