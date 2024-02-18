import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        int[] arr = {45, 576, 2893, 3};
        int size = arr.length;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<size; i++) {
            int n = arr[i];
            while(n>0) {
                int x = n%10;
                list.add(x);
                n /= 10;
            }
        }

        System.out.println(list);

        // Object[] a = list.toArray();

        // for(int i=0; i<a.length; i++) {
        //     System.out.println(a[i]);
        // }
    }
}