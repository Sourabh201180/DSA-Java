public class Q2 {
    public int sum(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 23;

        Q2 q = new Q2();
        System.out.println(q.sum(a, b));
    }
}