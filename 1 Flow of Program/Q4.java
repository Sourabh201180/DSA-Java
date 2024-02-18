public class Q4 {
    public int findLcm(int a, int b) {
        int gcd = 1;

        for(int i=1; i<=a && i<=b; i++) {  
            if(a%i == 0 && b%i == 0) {
                gcd = i;
            }
        }

        return (a * b)/gcd;
    }

    public int findHcf(int a, int b) {
        return (a * b)/findLcm(a, b);
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 9;

        Q4 q = new Q4();
        int lcm = q.findLcm(a, b);
        int hcf = q.findHcf(a, b);

        System.out.println("LCM: " + lcm);
        System.out.println("HCF: " + hcf);
    }
}