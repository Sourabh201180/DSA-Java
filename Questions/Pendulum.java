import java.util.Arrays;

class A {
    public static void main(String[] args) {
        // int[] arr = {3, 4, 1, 2, 5};
        int[] arr = {278, 44, 562, 729, 35, 89, 65, 23, 12};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(pendulum(arr)));
    }

    public static int[] pendulum(int[] arr) {
        int[] res = new int[arr.length];

        int mid = arr.length/2;
        res[mid] = arr[0];
        
        int s = 0;
        int e = arr.length-1;
        int temp = arr.length-1;

        while(s<=e) {
            System.out.println(" ~~~ " + Arrays.toString(res));
            if(temp%2 == 0) {
                res[e] = arr[temp];
                e--;
            } else {
                res[s] = arr[temp];
                s++;
            }
            temp--;
        }

        return res;
    }
}