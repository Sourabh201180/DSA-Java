import java.util.ArrayList;

public class Q5 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2, 3, 3, 3, 5, 5, 5, 6};
        // [1, 1, 2, 3, 3, 5, 5, 6]

        ArrayList<Integer> list = new ArrayList<>();
        int count = 1;

        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] == arr[i+1]) {
                count++;
            } else {
                list.add(arr[i]);
                if(count > 1) {
                    list.add(arr[i]);
                }
                count = 1;
            }
        }

        list.add(arr[arr.length-1]);
        if(count > 1) {
            list.add(arr[arr.length-1]);
        }

        System.out.println(list);
    }
}