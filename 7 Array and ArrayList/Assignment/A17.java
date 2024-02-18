/*
    867. Transpose Matrix

    Input:  [[1,2,3],        Output: [[1,4,7],
             [4,5,6],                  [2,5,8],
             [7,8,9]]                  [3,6,9]]
   
    Input:  [[1,2,3],         Output: [[1,4],
           v [4,5,6]]                  [2,5],
                                       [3,6]]
*/

class Solution {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(transpose(matrix));
    }

    public static int[][] transpose(int[][] matrix) {
        int r = matrix[0].length;
        int c = matrix.length;

        int[][] res = new int[r][c];

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if(i == j) {
                    res[i][j] = matrix[i][j];
                } else {
                    res[i][j] = matrix[j][i];
                }
            }
        }

        return res;
    }
}