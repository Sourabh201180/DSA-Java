/*
    31. 4 4 4 4 4 4 4
        4 3 3 3 3 3 4
        4 3 2 2 2 3 4
        4 3 2 1 2 3 4
        4 3 2 2 2 3 4
        4 3 3 3 3 3 4
        4 4 4 4 4 4 4 
*/

class Trial {
    public static void main(String[] args) {
        int n = 4;

        int len = 2*n - 1;
        int[][] arr = new int[len][len];

        int start = 0;
        int end = len - 1;

        while(n > 0) {
            for(int i=start; i<=end; i++) {
                for(int j=start; j<=end; j++) {
                    if(i == start || j == start || i == end || j == end) {
                        arr[i][j] = n;
                    }
                }
            }
            ++start;
            --end;
            --n;
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Pattern {
    public static void main(String[] args) {
        int n = 4;

        int len = 2*n - 1;
        for(int i=0; i<len; i++) {
            for(int j=0; j<len; j++) {
                int min = 0;
                // int min = i < j ? i : j;
                if(i<j) {
                    min = i;
                } else {
                    min = j;
                }

                // min = min < len-i ? min : len-i-1;
                if(min<len-i) {
                    min = min;
                } else {
                    min = len-i-1;
                }

                // min = min < len-j-1 ? min : len-j-1;
                if(min<len-j-1) {
                    min = min;
                } else {
                    min = len-j-1;
                }
                System.out.print(n-min + " ");
            }
            System.out.println();
        }
    }
}