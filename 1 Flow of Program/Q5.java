import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {
    public int sum(ArrayList<Integer> list) {
        int sum = 0;

        for(int i=0; i<list.size(); i++) {
            sum += list.get(i);
        }

        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while((char)Integer.parseInt(sc.nextLine()) != 'x' || (char)Integer.parseInt(sc.nextLine()) != 'x') {
            list.add(sc.nextInt());
        }

        sc.close();

        Q5 q = new Q5();
        System.out.println("Sum: " + q.sum(list));
    }
}