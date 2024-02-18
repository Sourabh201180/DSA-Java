public class LinearSearchQ2 {
    public static void main(String[] args) {
        int[][] accounts = {
                {2, 8, 7},  // 17       p1
                {7, 1, 3},  // 11       p2
                {1, 9, 5}   // 15       p3
        };

        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }   

    static int maximumWealth(int[][] accounts) {
        // person = row
        // account = col

        int ans = Integer.MIN_VALUE;    // -2147483648

        for(int[] ints : accounts) {
            // when starting new col, take a new sum for that row
            int sum = 0;
            
            for(int anInt : ints) {
                sum += anInt;
            }

            // now we have sum of accounts of person
            if(sum > ans) {
                ans = sum;
            }
        }

        return ans;
    }
}