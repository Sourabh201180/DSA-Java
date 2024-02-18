/* 
    # Find the duplicate no. in an array:-

    i/p=>                   o/p=>  
        1, 3, 4, 2, 2           2
        1, 1, 2                 1
    
*/

class A {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(getDuplicateNumber(arr));
    }   

    static int getDuplicateNumber(int[] arr) {
        int i=0;
        while(i<arr.length) {
            if(arr[i] != i+1) {
                int correct = arr[i] - 1;
                if(arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }

        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}