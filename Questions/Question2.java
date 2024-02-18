public class Question2 {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,1,1,0,0,0,1,1,1,1,1,1,0};

        int max = 0;
        for(int i=0; i<arr.length; i++) {
            int temp = 0;

            while(arr[i] == 1 && i<arr.length) {
                temp++;
                i++;
            }

            if(temp > max) {
                max = temp;
            }
        }

        System.out.println(max);
    }
}