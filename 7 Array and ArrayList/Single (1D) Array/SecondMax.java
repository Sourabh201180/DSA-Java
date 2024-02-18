public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {23, 12, 43, 54, 11, 69, 74};

        SecondMax sm = new SecondMax();

        System.out.println(sm.secondMax(arr));
    }  
    
    public int secondMax(int[] arr) {
        int max1 = arr[0];
        int max2 = max1;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if(arr[i] > max2) {
                max2 = arr[i];
            }
        }

        return max2;
    }
}