import java.io.Console;
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        int fix = 10;
        
        for(int i=1; i<n+1; i++) {
            int col = fix;
            for(int j=1; j<=i; j++) {
                System.out.print(col + "\t");
                col++;
            }
            fix = fix + i + 1;
            System.out.println();
        }
    }
}

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String y = sc.nextLine();
        float f = sc.nextFloat();
        sc.close();
        System.out.println(n + ", " + s + ", " + y + ", " + f);
        
        Console con = System.console();
        int i = Integer.parseInt(con.readLine());
        String m = con.readLine();
        String c = con.readLine();
        con.flush();
        System.out.println(i + ", " + m + ", " + c);
    }
}