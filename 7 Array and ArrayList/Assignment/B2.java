// 374. Guess Number Higher or Lower

class A {
    public static void main(String[] args) {
        
    }

    public int guessNumber(int n) {
        int low = 1;
        int high = n;

        int mid = 0;

        while(low <= high) {
            mid = low + (high - low)/2;

            if(guess(mid) == 0) {
                return mid;
            } else if(guess(mid) == -1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return mid;
    }
}