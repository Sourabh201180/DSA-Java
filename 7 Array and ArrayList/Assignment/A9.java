// Create Target Array in the given order

import java.util.Arrays;

class A {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] ind = {0, 1, 2, 2, 1};

        int[] res = createTargetArray(nums, ind);

        // for(int i=0; i<res.length; i++) {
        //     System.out.println(res[i]);
        // }

        System.out.println(Arrays.toString(res));
    }

    public static int[] createTargetArray(int[] nums, int[] ind) {
        int n = nums.length;
        int[] res = new int[n];

        // initialised every value with -1
        for(int i=0; i<n; i++) {
            res[i] = -1;
        }

        // inserting the values
        for(int i=0; i<ind.length; i++) {
            if(res[ind[i]] != -1) {
                int j = n - 1;  // 4                // 4

                // by this we are reaching to the last inserted value
                while(j>=0 && res[j] == -1) {
                    j--;   // 3 // 2                // 3
                } 

                // shifting
                while(j>=ind[i]) {  // 2>=2         // 3>=1
                    res[j+1] = res[j];
                    j--; // 1                       // 2 // 1 // 0
                }

                res[j+1] = nums[i];
            } else {
                res[ind[i]] = nums[i];
            }
        }

        return res;
    } 
}

// class A {
//     public static void main(String[] args) {
//         int[] nums = {0,1,2,3,4};
//         int[] ind = {0,1,2,2,1};

//         int[] res = createTargetArray(nums, ind);

//         for(int i=0; i<res.length; i++) {
//             System.out.println(res[i]);
//         }
//     }

//     public static int[] createTargetArray(int[] nums, int[] ind) {
//         int n = nums.length;
//         int[] res = new int[n];

//         for(int i=0; i<n; i++) {
//             res[i] = -1;
//         }

//         for(int i=0; i<n; i++) {
//             if(res[ind[i]] != -1) {
//                 int j = n-1;
//                 while(j>=0 && res[j] == -1) {
//                     j--;
//                 }
//                 while(j>=ind[i]) {
//                     res[j+1] = res[j];
//                     j--;
//                 }
//                 res[j+1] = nums[i];
//             } else {
//                 res[ind[i]] = nums[i];
//             }
//         }
//     }
// }