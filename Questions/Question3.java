import java.util.ArrayList;

public class Question3 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 0, 4, 9, 3, 0, 8, 5, 0, 0, 7};

        ArrayList<Integer> list = new ArrayList<>();
    
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                list.add(arr[i]);
            }
        }

        int rem = arr.length - list.size();

        for(int i=0; i<rem; i++) {
            list.add(0);
        }

        System.out.println(list);
    }
}