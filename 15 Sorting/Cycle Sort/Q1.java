/* 
    # Missing number:-

    nos. from 0 till N => total there will be N+1 nos

    i/p=>           o/p=>  
        3               2
        3, 0, 1
    
*/

class A {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(getMissingNumber(arr));
    }   

    static int getMissingNumber(int[] arr) {
        int i=0;
        while(i<arr.length) {
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // search for first missing no.
        for(int ind=0; ind<arr.length; ind++) {
            if(arr[ind] != ind) {
                return ind;
            }
        }

        // case 2:
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}