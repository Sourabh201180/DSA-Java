/* 
    what would be the possible possibility of the target element in the particular given array?
*/

public class Q3 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 4;
        // int target = 7;

        System.out.println(searchInsert(arr, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;

        while(s <= e) {
            int mid = s + (e-s)/2;
            
            if(target < nums[mid]) {
                e = mid - 1;
            } else if(target > nums[mid]) {
                s = mid + 1;
            } else {
                return mid;
            }
        }

        for(int i=0; i<nums.length; i++) {
            if(nums[i] > target) {
                return i;  
            }
        }

        return nums.length;
    }
}