public class Sum {
    public int sum(int a, int b) {
        return a+b;
    }

    public int sum(int... a) {
        int res = 0;

        for(int i=0; i<a.length; i++) {
            res += a[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 23;
        int c = 25;
        int d = 12;
        int e = 5;

        Sum q = new Sum();
        System.out.println(q.sum(a, b));
        System.out.println(q.sum(a, b, c, d, e));
    }
}