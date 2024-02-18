/* 
    # 41. First Missing Positive

    i/p=>                       o/p=>  
        1, 2, 0                      3
        -1, 1, 3, 4                  2
        7, 8, 9, 11, 12              10
*/

class A {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(setMismatch(arr));
    }   

    static int setMismatch(int[] arr) {
        int i=0;
        while(i<arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // search for first positive missing no.
        for(int ind=0; ind<arr.length; ind++) {
            if(arr[ind] != ind+1) {
                return ind+1;
            }
        }

        // case 2:
        return arr.length+1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}