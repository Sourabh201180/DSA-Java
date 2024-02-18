public class SumOfDiagonal {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        SumOfDiagonal sod = new SumOfDiagonal();

        System.out.println(sod.sumOfDiagonal(mat));
    }

    public int sumOfDiagonal(int[][] mat) {
        int sum = 0;

        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[0].length; j++) {
                if(i==j) {
                    sum += mat[i][j];
                    break;
                }
            }
        }

        return sum;
    }
}