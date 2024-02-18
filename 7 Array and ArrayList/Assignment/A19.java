/*
    1854. Maximum Population Year

    Example 1:
        Input: logs = [[1993,1999],[2000,2010]]
        Output: 1993
        Explanation: The maximum population is 1, and 1993 is the earliest year with this population.

    Example 2:
        Input: logs = [[1950,1961],[1960,1971],[1970,1981]]
        Output: 1960
        Explanation:
        The maximum population is 2, and it had happened in years 1960 and 1970.
        The earlier year between them is 1960.
*/

class Solution {
    public static void main(String[] args) {
        int[][] logs = {{1993, 1999}, {2000, 2010}};

        System.out.println(maximumPopulation(logs));
    }

    public static int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];

        for(int i=0; i<logs.length; i++) {
            for(int j=logs[i][0]; j<logs[i][1]; j++) {
                arr[j - 1950]++;
            }
        }

        int max = 0;
        int maxYear = 1950;

        for(int i=1; i<101; i++) {
            if(max < arr[i]) {
                max = arr[i];
                maxYear = i + 1950;
            }
        }

        return maxYear;
    }
}