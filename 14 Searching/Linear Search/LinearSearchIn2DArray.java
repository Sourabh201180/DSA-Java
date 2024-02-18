public class LinearSearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 5, 45},
                {63, 18, 35, 34},
                {23, 99, 1, 55},
                {18, 12}
        };

        int target = 99;
        System.out.println(searchIn2D(arr, target));
    }

    // approach 1 using enhance for loop
    static int searchIn2D(int[][] arr, int target) {
        for(int[] row : arr) {
            for(int elem : row) {
                if(elem == target) {
                    return target;
                }
            }
        }
        
        return -1;
    }
}