public class LinearSearchFindMin {
    public static void main(String[] args) {
        int[] arr = {45, 18, 63, 21, -21, -50, 9, 1, 99, 101};
        System.out.println(findMin(arr));
    }   

    static int findMin(int[] arr) {
        int min = arr[0];
        
        for(int elem : arr) {
            if(min >= elem) {
                min = elem;
            }
        }

        return min;
    }
}