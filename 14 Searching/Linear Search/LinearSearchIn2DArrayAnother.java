import java.util.Arrays;

public class LinearSearchIn2DArrayAnother {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 5, 45},
                {63, 18, 35, 34},
                {23, 99, 1, 55},
                {18, 12}
        };

        int target = 55;
        int[] ans = searchIn2D(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    // approach 2 iterative approach using for loop
    static int[] searchIn2D(int[][] arr, int target) {
        for(int row=0; row<arr.length; row++) {
            for(int col=0; col<arr[row].length; col++) {
                if(arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        
        return new int[]{-1, -1};
    }
}