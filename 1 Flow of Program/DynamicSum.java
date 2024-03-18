import java.util.ArrayList;
import java.util.Scanner;

public class DynamicSum {
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

        while(true) {
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("X")) {
                break;
            }

            try {
                int num = Integer.parseInt(input);
                list.add(num);
            } catch(NumberFormatException e) {
                System.out.println("Invalid Input!!!!");
                // e.printStackTrace();
                break;
            }
        }

        sc.close();

        DynamicSum q = new DynamicSum();
        System.out.println("Sum: " + q.sum(list));
    }
}