public class Factorial {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(factRecursive(n));
        System.out.println(factIterative(n));
    }

    // recursive approach
    static int factRecursive(int n) {
        if(n<=2) {
            return n;
        }

        return n * factRecursive(n-1);
    }

    // iterative approach
    static int factIterative(int n) {
        int f = 1;

        for(int j=1; j<=n; j++) {
            f *= j;
        }

        return f;
    }
}