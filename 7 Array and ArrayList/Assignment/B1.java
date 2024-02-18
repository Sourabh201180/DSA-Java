// 69. Sqrt(x)

class A {
    public static void main(String[] args) {
        int x = 4;
        // int x = 8;

        System.out.println(mySqrt(x));
    }

    // O(log n)
    static int mySqrt(int x) {
        if(x < 0) {
            x = x * -1;
        }

        if(x == 0) {
            return 0;
        }

        int low = 1; 
        int high = x;
        int ans = -1;

        while(low <= high) {
            int mid = (low + high)/2;
            int sq = mid * mid;

            if(sq == x) {
                return mid;
            } else if(sq < x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    // O(n)
    static int sqrt(int x) {
        int i = 1;
        while(i*i <= x) {
            i++;
        }
        
        return i-1;
    }
}