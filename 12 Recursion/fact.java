class A {
    public static void main(String[] args) {
        System.out.println(factRecursive(5));
        System.out.println(factIterative(5));
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