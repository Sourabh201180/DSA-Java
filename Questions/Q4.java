public class Q4 {
    public static int reverse(int x) {
        // boolean flag = false;
        // if(x < 0) {
        //     flag = true;
        //     x = -x;
        // }

        long n = 0;

        while(x > 0) {
            n = n*10 + x%10; 
            x /= 10;
        }

        // if(flag) {
        //     return -n;
        // }
        
        return (n>Integer.MAX_VALUE || n<Integer.MIN_VALUE) ? 0 : (int)n;
    }

    public static void main(String[] args) {
        int n = -1463847412;
        
        System.out.println(reverse(n));
    }
}