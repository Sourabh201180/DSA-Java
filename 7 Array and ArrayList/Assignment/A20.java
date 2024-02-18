/* 
    1886. Determine whether matrix can be obtained by rotation

    Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
    Output: true
    Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.

    Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
    Output: false
    Explanation: It is impossible to make mat equal to target by rotating mat.

    Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
    Output: true
    Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.
*/

class Solution {
    public static void main(String[] args) {
        int[][] mat = {{0, 1}, {1, 0}};
        int[][] target = {{1, 0}, {0, 1}};

        System.out.println(findRotation(mat, target));
    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        boolean flag = true;

        int rotCount = mat.length - 1;

        for(int i=0; i<rotCount; i++) {
            mat = rotate(mat);
        }

        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
                if(mat[i][j] != target[i][j]) {
                    flag = false;
                    break;
                }
            }
        }

        return flag;
    }

    public static int[][] rotate(int[][] mat) {

    }
}