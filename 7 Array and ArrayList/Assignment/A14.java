// 1252. Cells with Odd Values in a Matrix

/* 
     matrix                 indices
     (m x n)                
    0   0   0               0   1
    0   0   0               1   1

    0   0   0   ->    1   1   1    ->   1   2   1    ->   1   2   1   ->    1   3   1
    0   0   0         0   0   0         0   1   0         1   2   1         1   3   1

    1   3   1       total no. of odd elements = 6
    1   3   1       
*/

class A {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;

        int[][] indices = {{0,1}, {1,1}};

        System.out.println(oddCells(m, n, indices));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];
        int k = indices.length;

        for(int i=0; i<k; i++) {
            for(int j=0; j<n; j++) {
                ans[indices[i][0]][j]++;
            }
            for(int j=0; j<m; j++) {
                ans[j][indices[i][1]]++;
            }
        }

        int count = 0;

        for(int[] arr : ans) {
            for(int e : arr) {
                if(e%2 != 0) {
                    count++;
                }
            }
        }

        return count;
    }
}