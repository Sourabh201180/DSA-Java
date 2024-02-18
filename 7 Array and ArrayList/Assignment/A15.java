/* 
    1572. Matrix Diagonal Sum

             [[1,2,3],
              [4,5,6],
              [7,8,9]]

            sum = 1 + 5 + 9 + 7 + 3 => 25
*/

class Solution {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;

        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
                if(i==j || (i+j == mat[i].length-1)) {
                    sum += mat[i][j];
                }
            }
        }

        return sum;
    }
}