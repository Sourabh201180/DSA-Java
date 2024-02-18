public class LinearSearchIn2DArrayMin {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 5, 45},
                {63, 18, 35, 34},
                {23, 99, 1, 55},
                {18, 12}
        };

        int ans = MaxIn2D(arr);
        System.out.println(ans);
    }

    static int MaxIn2D(int[][] arr) {
        int min = arr[0][0];
        
        for(int row=0; row<arr.length; row++) {
            for(int col=0; col<arr[row].length; col++) {
                if(min >= arr[row][col]) {
                    min = arr[row][col];
                }
            }
        }
        
        return min;
    }
}